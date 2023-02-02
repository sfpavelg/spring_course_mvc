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

    <input type="submit" value="Ok">
</form:form>

</body>
</html>
