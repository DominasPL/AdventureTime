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
        <thead>
            <tr>
                <th scope="col">Hero</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td><a href="/adventure/deck/1"><img src="/media/images/Ash_Hero_Card.png"></a></td>
                <td><a href="/adventure/deck/2"><img src="/media/images/BMO_Hero_Card.png"></a></td>
                <td><a href="/adventure/deck/3"><img src="/media/images/Cake.jpg"></a></td>
                <td><a href="/adventure/deck/4"><img src="/media/images/Doctor_Finn_Hero_Card.jpg"></a></td>
            </tr>
            <tr>
                <td><a href="/adventure/deck/5"><img src="/media/images/Ghost_Jake.png"></a></td>
                <td><a href="/adventure/deck/6"><img src="/media/images/Gunter_Hero_Card.jpg"></a></td>
                <td><a href="/adventure/deck/7"><img src="/media/images/Ice_King_Hero_Card.jpg"></a></td>
                <td><a href="/adventure/deck/8"><img src="/media/images/Jake_Hero_Card.jpg"></a></td>
            </tr>
            <tr>
                <td><a href="/adventure/deck/9"><img src="/media/images/Marceline_Hero_Card.jpg"></a></td>
                <td><a href="/adventure/deck/10"><img src="/media/images/Pajama_Finn_Hero_Card.jpg"></a></td>
                <td><a href="/adventure/deck/11"><img src="/media/images/Princess_Bubblegum_Hero_Card.jpg"></a></td>
            </tr>
        </tbody>
    </table>

</body>
</html>
