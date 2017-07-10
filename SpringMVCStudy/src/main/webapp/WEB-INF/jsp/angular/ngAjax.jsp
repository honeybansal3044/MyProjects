<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/ext/angular/angular.js"></script>
<script type="text/javascript" src="resources/js/ext/angular/angular-animate.js"></script>

<script type="text/javascript">

	var app = angular.module("myModule", []);
	app.controller("myController", ["$scope", "$http", "myService", "myFactory", function(s, h, service, factory) {
		h.post("getCustomer").then(function(response) {
			s.data = response.data;
		});
		s.x = 1;
		s.y = 2;
		s.result = 0;
		s.addition = function(x,y) {
			s.result = s.result + service.add(s.x,s.y);
			factory.createAlert(s.result);
		}
	}]);
	
	app.service("myService", function() {
		this.add = function(x,y) {
			return x+y;
		}
	});
	
	app.factory("myFactory", function() {
		var fac = {};
		fac.createAlert = function(message) {
			console.log(message);
		};
		return fac;
	});

	angular.element(document).ready(function() {
		angular.bootstrap(document.getElementById("ngApp2"), ["myModule"]);
	});

</script>
</head>
<body>
	<div ng-app="myModule">
		<div ng-controller="myController">
			<table border="1" cellspacing="0" cellpadding="5">
				<tr>
					<td>Id:</td>
					<td>Name:</td>
					<td>City:</td>
				</tr>
				<tr ng-repeat="row in data">
					<td ng-bind="row.id"></td>
					<td ng-bind="row.name"></td>
					<td ng-bind="row.city"></td>
				</tr>
				<tr>
					<td><input type="button" value="Sum" ng-click="addition()"/></td>
					<td><input type="text" ng-model="result" readonly="readonly"/></td>
				</tr>
			</table>
		</div>
	</div>
	<br/>
	<div id="ngApp2">
		<div ng-controller="myController">
			<table border="1" cellspacing="0" cellpadding="5">
				<tr>
					<td>Id:</td>
					<td>Name:</td>
					<td>City:</td>
				</tr>
				<tr ng-repeat="row in data">
					<td ng-bind="row.id"></td>
					<td ng-bind="row.name"></td>
					<td ng-bind="row.city"></td>
				</tr>
			</table>
		</div>
	</div>
</body>
</html>