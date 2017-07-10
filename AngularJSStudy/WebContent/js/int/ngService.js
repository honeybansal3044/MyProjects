var app = angular.module("ContactApp", []);
app.controller("ContactCtrl", function(ContactService) {
	this.contacts = [];
	var self = this;
	ContactService.getContacts().then(function(data) {
		self.contacts = data;
		self.first = self.contacts[0];
	});
	
	this.i = 1;
	this.first = this.contacts[0];
	this.selectContact = function(index) {
		this.first = this.contacts[index];
		if(index == 0) {
			this.first.picture.large = "https://randomuser.me/api/portraits/men/"+ (this.i++) + ".jpg";
		}else {
			this.first.picture.large = "https://randomuser.me/api/portraits/women/"+ (this.i++) + ".jpg";
		}
	}
});

app.service("ContactService", function($http) {
	var self = this;
	self.getContacts = function() {
		var promise1 = $http.get("http://localhost:3000/contacts");
		var promise2 = promise1.then(function(reponse) {
			return reponse.data;
		});
		return promise2;
	};
});


app.controller("HeaderCtrl", function(AppFactory) {
	this.title = AppFactory.value;
});
app.controller("FooterCtrl", function(AppFactory) {
	this.title = AppFactory.value;
});
app.value("AppService", "My Contact App")

app.factory("AppFactory", function(AppService) {
	return {value : AppService};
});