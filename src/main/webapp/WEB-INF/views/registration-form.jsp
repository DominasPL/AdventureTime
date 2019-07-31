<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: dominik
  Date: 7/31/19
  Time: 1:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
</head>
<body>

    <form:form modelAttribute="form" method="post">
        <form:errors path="*"/>
        Username: <br>
        <form:input path="username" placeholder="Give a username"/> <br>
        Email: <br>
        <form:input path="email" placeholder="Give an email"/> <br>
        Password: <br>
        <form:password path="password" placeholder="Give a password"/> <br>
        Confirm password: <br>
        <form:password path="confirmedPassword" placeholder="Confirm password"/> <br>
        <input type="submit" value="Submit">
    </form:form>


</body>
</html>
