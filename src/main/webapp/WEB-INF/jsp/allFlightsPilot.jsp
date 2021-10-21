<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8"/>
    <title>FullData</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<h2>All pilot flights</h2>
<div>
    <h1></h1>
    <h3>Pilot info</h3>
    <table border="1">
        <tr class="cell-1">
            <th>idPilot</th>
            <th>firstName</th>
            <th>lastName</th>
        </tr>
        <tr>
            <td align="center">${allFlights.id}</td>
            <td align="center">${allFlights.firstName}</td>
            <td align="center">${allFlights.lastName}</td>
        </tr>
    </table>

    <h1></h1>
    <h3>Flights info</h3>
    <table border="1">
        <tr class="cell-1">
            <th>date</th>
            <th>time</th>
            <th>number</th>
        </tr>
        <c:forEach items="${allFlights.flights}" var="flights">
        <tr>
            <td align="center">${flights.date}</td>
            <td align="center">${flights.time}</td>
            <td align="center">${flights.number}</td>
        </tr>
            </c:forEach>

    </table>
    <h1></h1>
    <td>
        <h3><a href="/">Home</a></h3>
    </td>
</div>
</body>
</html>
