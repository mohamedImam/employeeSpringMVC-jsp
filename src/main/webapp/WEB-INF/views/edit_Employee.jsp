
<section class="top-inner">
    <div class="container">
 
        <form action="${pageContext.request.contextPath}/editsave" method="post" modelAttribute="employee">
            <table border="0" cellpadding="5">
                <tr>
                    <td>ID: </td>
                    <td>${employee.id}
                        <form:hidden path="id"/>
                    </td>
                </tr>        
                <tr>
                    <td>firstname: </td>
                    <td><input path="firstname" value="${employee.firstname}"/></td>
                </tr>
                <tr>
                    <td>lastname: </td>
                    <td><input path="lastname" value="${employee.lastname}"/></td>
                </tr>
                <tr>
                    <td>dob: </td>
                    <td><input path="dob" value="${employee.dob}"/></td>
                </tr>  
                
                
                <tr>
                    <td>Department: </td>
                    <td><input path="dept" value="${employee.dept}"/></td>
                </tr>   
                
                
                <tr>
                    <td>salary: </td>
                    <td><input path="salary" value="${employee.salary}"/></td>
                </tr>   
                
                
                <tr>
                    <td>manager: </td>
                    <td><input path=manager value="${employee.manager}"/></td>
                </tr>   
                
                  
                <tr>
                    <td colspan="2"><input type="submit" value="Save"></td>
                </tr>                    
            </table>
        </form>
    
  </div><!-- /.container -->
    
</section>