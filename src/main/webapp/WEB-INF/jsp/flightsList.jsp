<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Flights list</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<h1>Flights list</h1>

<br/><br/>
<div>
    <table border="1">
        <tr>
            <th>id</th>
            <th>date</th>
            <th>time</th>
            <th>number</th>
        </tr>
        <c:forEach  items="${flight}" var ="flight">
            <tr>
                <td>${flight.id}</td>
                <td>${flight.date}</td>
                <td>${flight.time}</td>
                <td>${flight.number}</td>
            </tr>
        </c:forEach>
    </table>
    <td>
        <h3><a href="/addFlight">Create New Flight</a></h3>
    </td>

</div>


</body>

</html>