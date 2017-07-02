<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Exception Handling</title>
      <%
      	String msg = request.getParameter("message");
      	System.out.println(msg);
      	String exception = request.getParameter("exceptionMsg");
      %>
   </head>

   <body>
      <h2>Spring MVC Exception Handling</h2>
      <h3>${exception.exceptionMsg}</h3>
   </body>
</html>