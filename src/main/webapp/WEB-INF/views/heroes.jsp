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
                <td><a href="/adventure/fraction"><img src="/media/images/heroes/Ash_Hero_Card.png"></a></td>
                <td><a href="/adventure/fraction"><img src="/media/images/heroes/BMO_Hero_Card.png"></a></td>
                <td><a href="/adventure/fraction"><img src="/media/images/heroes/Cake.jpg"></a></td>
                <td><a href="/adventure/fraction"><img src="/media/images/heroes/Doctor_Finn_Hero_Card.jpg"></a></td>
            </tr>
            <tr>
                <td><a href="/adventure/fraction"><img src="/media/images/heroes/Ghost_Jake.png"></a></td>
                <td><a href="/adventure/fraction"><img src="/media/images/heroes/Gunter_Hero_Card.jpg"></a></td>
                <td><a href="/adventure/fraction"><img src="/media/images/heroes/Ice_King_Hero_Card.jpg"></a></td>
                <td><a href="/adventure/fraction"><img src="/media/images/heroes/Jake_Hero_Card.jpg"></a></td>
            </tr>
            <tr>
                <td><a href="/adventure/fraction"><img src="/media/images/heroes/Marceline_Hero_Card.jpg"></a></td>
                <td><a href="/adventure/fraction"><img src="/media/images/heroes/Pajama_Finn_Hero_Card.jpg"></a></td>
                <td><a href="/adventure/fraction"><img src="/media/images/heroes/Princess_Bubblegum_Hero_Card.jpg"></a></td>
            </tr>
        </tbody>
    </table>

</body>
</html>
