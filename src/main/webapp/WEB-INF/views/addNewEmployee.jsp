
 
<section class="top-inner">
    <div class="container">
 
<form method="post" action="${pageContext.request.contextPath}/saveEmployee">   
     
<table>    
    <tr>    
        <td><form:label path="firstname">First Name</form:label></td>    
        <td><input path="firstname" /></td>     
    </tr>    
    <tr>    
        <td><form:label path="lastname">Last Name</form:label></td>    
        <td><input path="lastname" /></td>    
    </tr>    
    <tr>    
        <td><form:label path="dob">DOB</form:label></td>    
        <td><input path="dob" /></td>    
    </tr>    
    <tr>    
   
      <td><form:label path="dept">Department</form:label></td>    
     <td><select path="dept">
        <option value="HR" label="HUMAN RECOURCE"></option>
        <option value="IT" label="INFORMATAION TECHNOLOGY"></option>
        <option value="MRK" label="MARKTING"></option>
        <option value="ME" label="Mechanical Engineering"></option>
    </select></td>  
    </tr>    
    
     <tr>    
        <td><form:label path="salary">Salary</form:label></td>    
        <td><input path="salary" /></td>    
    </tr>    
     <tr>    
        <td><form:label path="manager">Manager</form:label></td>    
        <td><input path="manager" /></td>    
    </tr> 
    
    <tr>    
        <td colspan="2">    
            <input type="submit" value="Add Employee"/>    
        </td>    
    </tr>    
</table>      
</form>
    </div><!-- /.container -->
    
</section>