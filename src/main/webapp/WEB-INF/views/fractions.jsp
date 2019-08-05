<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dominik
  Date: 8/2/19
  Time: 5:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Fractions</title>
</head>
<body>

    <h1>All fractions</h1>
    <h3>Choose one fraction</h3>

    <c:forEach items="${fractions}" var="fraction" varStatus="fractionStatus">
        <table>
        <tr>
            <td><a href="/deck/hero/${hero_id}/fraction/${fractionStatus.count}">${fraction.fractionName}</a></td>
        </tr>
        </table>
    </c:forEach>


</body>
</html>
