<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Create new student</title>
</head>
<body>
    <h2>Create student</h2>

    <form:form action="/students/create" method="post" modelAttribute="student">

        <p>Name: </p>
        <form:input type="text" path="name" />
        <p>Date of birth: </p>
        <form:input type="date" path="dateOfBirth"/>

        <input type="submit" value="Create new" />

    </form:form>
</body>
</html>
