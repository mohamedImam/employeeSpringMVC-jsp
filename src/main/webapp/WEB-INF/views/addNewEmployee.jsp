
 
<section class="top-inner">
    <div class="container">

<form method="post" action="${pageContext.request.contextPath}/saveEmployee">   
           <errors path = "*" cssClass = "errorblock" element = "div" />
     
<table>    
    <tr>    
        <td><form:label path="firstname" required>First Name</form:label></td>    
        <td><input path="firstname" /></td>     
    </tr>    
    <tr>    
        <td><form:label path="lastname"required>Last Name</form:label></td>    
        <td><input path="lastname" /></td>    
    </tr>    
    <tr>    
        <td><form:label path="dob" required>DOB</form:label></td>    
        <td><input path="dob" /></td>    
    </tr>    
    <tr>    
   
      <td><form:label path="dept">Department</form:label></td>    
     <td><select path="dept">
        <option value="HR" label="HR"></option>
        <option value="IT" label="IT"></option>
        <option value="MRK" label="MARKTING"></option>
        <option value="ME" label="Mechanical"></option>
    </select></td>  
    </tr>    
    
     <tr>    
        <td><form:label path="salary" required>Salary</form:label></td>    
        <td><input path="salary" /></td>    
    </tr>    
   <td><form:label path = "manager">manager</form:label></td>
               <td>
                  <select path = "manager">
                     <option value = "NONE" label = "Select"/>
                     <options items = "${employeeList}" />
                  </select>     	
               </td>
    <br>
    <tr>    
        <td colspan="2">    
            <input type="submit" value="Add Employee"/>    
        </td>    
    </tr>    
</table>      
</form>
    </div><!-- /.container -->
    
</section>