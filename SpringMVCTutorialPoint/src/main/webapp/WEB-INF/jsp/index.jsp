<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring Page Redirection</title>
   </head>

   <body>
      <h2>Spring Page Redirection</h2>
      <p>Click below button to redirect the result to new page</p>
      <h1>${message}</h1>
      
      <form:form method = "GET" action = "/SpringMVCTutorialPoint/redirect.do">
         <table>
            <tr>
               <td>
                  <input type = "submit" value = "Redirect Page"/>
               </td>
            </tr>
         </table>  
      </form:form>
      <form:form method = "GET" action = "/SpringMVCTutorialPoint/forward.do">
         <table>
            <tr>
               <td>
                  <input type = "submit" value = "Redirect Page"/>
               </td>
            </tr>
         </table>  
      </form:form>
   </body>
   
</html>