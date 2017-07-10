<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Angular JS Tutorial</title>
<script type="text/javascript" src="../js/ext/angular/angular.js"></script>
</head>

<body>
	<div ng-app ng-init="emp={id:10, name:'Honey', city:'Memphis'}">
		<p>
			Emp id: 
			<input type="text" value="{{emp.id}}"/>
		</p>
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

</body>

</html>