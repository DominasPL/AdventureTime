<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dominik
  Date: 8/5/19
  Time: 3:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deck</title>
</head>
<body>

    <h1>Deck details</h1>

    <h2>${deck.deckName}</h2>
    <p><img src="${deck.heroPath}" alt=""></p>
    <table>
        <c:forEach items="${deck.cardsPath}" var="cardPath">
            <tr>
                <td><img src="${cardPath}" alt=""></td>
            </tr>
        </c:forEach>

    </table>

</body>
</html>
