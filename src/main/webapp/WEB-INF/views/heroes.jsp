<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dominik
  Date: 8/1/19
  Time: 9:11 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Heroes</title>
</head>
<body>

    <h1>There are all available heroes in game</h1>
    <h2>Please choose one hero</h2>

    <table>
        <c:forEach items="${heroes}" var="hero">
           <tr>
               <td><a href="/deck/hero/${hero.id}"><img src="${hero.heroPath}" alt=""></a></td>
           </tr>
        </c:forEach>
    </table>

</body>
</html>
