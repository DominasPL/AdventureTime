<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dominik
  Date: 8/1/19
  Time: 5:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

    <h1>This is login form!</h1>

    <form method="post" action="/login">
        <c:if test="${param.error!=null}">
            <span>Incorrect data!</span> <br>
        </c:if>
        <c:if test="${param.logout != null}">
            <span>You have been logged out!</span> <br>
        </c:if>

        <div class="form-group">
            <label>Username</label>
            <input type="text" class="form-control" name="username" required min="3" max="50" placeholder="Give a username">
        </div>
        <div class="form-group">
            <label>Password</label>
            <input type="password" class="form-control" name="password" required min="3" max="20" placeholder="Give a password">
            <%--<a href="/password-reset" class="btn btn--small btn--without-border reset-password">Przypomnij hasło</a>--%>
        </div>

        <div class="form-group form-group--buttons">
            <%--<a href="/register" class="btn btn--without-border">Załóż konto</a>--%>
            <button class="btn" type="submit">Login</button>
        </div>

    </form>


</body>
</html>
