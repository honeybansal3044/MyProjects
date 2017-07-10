<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AngularJS Module and Controller</title>
<script type="text/javascript" src="../js/ext/angular/angular.js"></script>

<script type="text/javascript">
	//module
	var app = angular.module("myModule", []);
	//controller
	app.controller("myController1", function($rootScope, $scope) {
		$rootScope.message1 = "Employee";
		$scope.emp = {id:10, name:"Honey", city:"Memphis"};
	});
	
	app.controller("myController2", ["$rootScope", "$scope",  function(r, s) {
		r.message2 = "Student";
		s.student = {id:10, name:"Honey", city:"Memphis"};
	}]);
</script>

</head>
<body>
	<div ng-app="myModule">
		<span ng-bind="message1"></span>
		<div ng-controller="myController1">
			<p>
				Emp id: 
				<input type="text" ng-model="emp.id"/>
			</p>
			<p>
				Emp Name: 
				<input type="text" ng-model="emp.name"/>
			</p>
			<p>
				Emp City: 
				<span ng-bind="emp.city"></span>
			</p>
		</div>
		<span ng-bind="message2"></span>
		<div ng-controller="myController2">
			<p>
				Emp id: 
				<input type="text" ng-model="student.id"/>
			</p>
			<p>
				Emp Name: 
				<input type="text" ng-model="student.name"/>
			</p>
			<p>
				Emp City: 
				<span ng-bind="student.city"></span>
			</p>
		</div>
	</div>
</body>
</html>