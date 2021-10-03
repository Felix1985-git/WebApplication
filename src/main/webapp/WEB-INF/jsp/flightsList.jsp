<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Flights list</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<h2>Flights list</h2>
<div>
    <table border="1">
        <tr>
            <th>id</th>
            <th>date</th>
            <th>time</th>
            <th>number</th>
            <th>planeId</th>
            <th>pilotId</th>
            <th>delete</th>
            <th>update</th>
        </tr>
        <c:forEach items="${flight}" var="flight">
            <tr>
                <td>${flight.id}</td>
                <td>${flight.date}</td>
                <td>${flight.time}</td>
                <td>${flight.number}</td>
                <td>${flight.planesId}</td>
                <td>${flight.pilotsId}</td>
                <td>
                    <form method="get" action="deleteFlightById">
                        <input type="submit" value="   ${flight.id}  " name="id"/>
                    </form>
                </td>
                <td>
                    <form method="get" action="updateFlight">
                        <input type="submit" value="   ${flight.id}   " name="id"/>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
    <h1></h1>
    <form method="get" action="addFlight">
        <input type="submit" value="Create new flight"/>
    </form>
<%--    <h1></h1>--%>
<%--    <form method="get" action="updateFlight">--%>
<%--        <input type="submit" value="1"/>--%>
<%--    </form>--%>
    <td>
        <h3><a href="/">Home</a></h3>
    </td>
</div>
</body>
</html>