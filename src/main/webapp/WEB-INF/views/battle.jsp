<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dominik
  Date: 8/6/19
  Time: 4:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Battle</title>
</head>
<body>

    <h1>BATTLE TIME!</h1>
    <h2>Your cards</h2>

    <p>Magic amount - ${deck.magicAmount}</p>
    <p>Number of cards - ${deck.numberOfCards}</p>
    <p>Hero</p>
    <img src="${deck.hero.heroPath}" alt="">
    <p>Your cards</p>
    <c:forEach items="${deck.cards}" var="card">
        <tr>
            <td><img src="${card.cardPath}" alt=""></td>
        </tr>
    </c:forEach>



</body>
</html>
