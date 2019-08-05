<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dominik
  Date: 8/3/19
  Time: 6:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fraction cards</title>
</head>
<body>

    <h1>Fraction - ${fraction.fractionName}</h1>
    <h2>Available cards</h2>

    <c:forEach items="${cards}" var="card">
        <table>
            <tr>
                <td>${card.cardName}</td>
                <td><img src="${card.cardPath}" alt="card"></td>
            </tr>
        </table>

    </c:forEach>

</body>
</html>
