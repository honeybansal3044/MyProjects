<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring Page Redirection</title>
      <%
      
      String msg = request.getParameter("message");
      System.out.println(msg);
      %>
   </head>

   <body>
      <h2>Redirected Page</h2>
      <h2>${message}</h2>
   </body>
</html>