<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Login Page</title>
</head>
<body onload="document.loginForm.username.focus();">
	<h1>Spring Security Custom Login Form (Annotation)</h1>

	<div>
		<h2>Login with Username and Password</h2>

		<c:if test="${param.error != null}">
			<p>${param.error}</p>
			<p>Invalid username and password.</p>
		</c:if>

		<c:if test="${param.logout != null}">
			<p>${param.logout}</p>
			<p>You have been logged out.</p>
		</c:if>

		<c:url value="/loginAction.do" var="loginUrl" />

		<form name="loginForm" action="${loginUrl}" method="POST">
			<p>
				<label for="username">Username</label> <input type="text" id="username" name="username" />
			</p>
			<p>
				<label for="password">Password</label> <input type="password" id="password" name="password" />
			</p>
			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
			<button type="submit" class="btn">Log in</button>
		</form>
	</div>
</body>
</html>