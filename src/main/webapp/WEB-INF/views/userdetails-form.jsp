<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: dominik
  Date: 8/1/19
  Time: 6:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Profile</title>
</head>
<body>

    <h1>User details</h1>
    <form:form modelAttribute="userDetails" method="post">
        <form:errors path="*"/>
        Name: <br>
        <form:input path="name" placeholder="Give a name"/> <br>
        Surname: <br>
        <form:input path="surname" placeholder="Give a surname"/> <br>
        <input type="submit" value="Save">
    </form:form>

</body>
</html>
