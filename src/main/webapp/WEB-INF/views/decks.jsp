<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.ca
  User: dominik
  Date: 8/5/19
  Time: 2:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User decks</title>
</head>
<body>

    <h1>Your decks</h1>

    <table>
        <c:forEach items="${decks}" var="deck" varStatus="deckStatus">
            <tr>
                <td><a href="/deck/${deck.id}">${deck.deckName}</a></td>
            </tr>
        </c:forEach>
    </table>


    <a href="/deck/fraction">Create new deck</a>
    <a href="/">Return</a>

</body>
</html>
