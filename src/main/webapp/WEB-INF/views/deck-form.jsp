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

    <form action="" method="post">
        Please enter deck name: <br>
        <input type="text" name="deckName" placeholder="Deck name"> <br> <br>

        <c:forEach items="${heroes}" var="hero" varStatus="heroStatus">
            <input type="radio" name="hero" value="${hero.id}" id="hero${heroStatus.count}" />
            <label for="hero${heroStatus.count}"><img src="${hero.heroPath}" alt="" /></label>
        </c:forEach> <br>

        <h1>There are all available fraction cards</h1>
        <h2>Please choose cards</h2>

        <c:forEach items="${cards}" var="card" varStatus="cardStatus">
            <input type="checkbox" name="cards" value="${card.id}" id="card${cardStatus.count}">
            <label for="card${cardStatus.count}"><img src="${card.cardPath}" alt="" /></label>
        </c:forEach> <br>


        <input type="submit" value="Submit">

    </form>

</body>
</html>
