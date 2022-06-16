  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  <body>
<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>id</th><th>firstname</th><th>lastname</th><th>dob</th><th>dept</th><th>Salary</th><th>manager</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="emp" items="${list}">   
   <tr>  
   <td>${emp.id}</td>  
   <td>${emp.firstname}</td>  
   <td>${emp.lastname}</td>  
   <td>${emp.dob}</td>  
   <td>${emp.dept}</td>  
   <td>${emp.salary}</td>  
   <td>${emp.manager}</td>  
   <td><a href="editemp/${emp.id}">Edit</a></td>  
   <td><a href="deleteemp/${emp.id}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="${pageContext.request.contextPath}/">home</a>  
   </body>