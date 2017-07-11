<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Login Form</title>
   </head>

   <body>
      <h2>User Information</h2>
      <form:form method = "POST" action = "/SpringMVCTutorialPoint/loginSubmit.do" modelAttribute="loginForm">
         <table>
            <tr>
               <td><form:label path = "username">Username</form:label></td>
               <td><form:input path = "username" /></td>
            </tr>
            <tr>
               <td><form:label path = "password">Password</form:label></td>
               <td><form:input path = "password" /></td>
            </tr>
            <tr>
               <td colspan = "2">
                  <input type = "submit" value = "Submit"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
   
</html>