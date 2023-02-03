<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<body>
<h2>
    Dear Employee, please enter your details
</h2>
<br>
<form:form action="/employee/showFullDetails" modelAttribute="employee">
    Name <form:input path="name"/>
    <br><br>
    SurName <form:input path="surname"/>
    <br><br>
    Salary <form:input path="salary"/>
    <br><br>
    Department <form:select path="department">
    <form:options items="${employee.departments}"/>
    </form:select>
    <br><br>
    <input type="submit" value="Ok">
</form:form>

</body>
</html>
