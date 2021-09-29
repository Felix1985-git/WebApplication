<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Welcome</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<h1>Welcome to my first web application</h1>
<div>
    <table border="1">
        <tr>
            <th>NameTable</th>
            <th>Search</th>
            <th>FullData</th>
        </tr>
        <tr>
            <td>Flights</td>
            <td>
                <form method="get" action="getFlightByIdJDBC">
                    <input type="text" name="id"/>
                    <input type="submit" value="Search by ID"/>
                </form>
            </td>
            <td>
                <a href="${pageContext.request.contextPath}/flightsList">Flights List</a>
            </td>
        </tr>
        <tr>
            <td>Pilots</td>
            <td>
                <form method="get" action="getPilotByIdJDBC">
                    <input type="text" name="id"/>
                    <input type="submit" value="Search by ID"/>
                </form>
            </td>
            <td>
                <a href="${pageContext.request.contextPath}/pilotsList">Pilots List</a>
            </td>
        </tr>
        <tr>
            <td>Planes</td>
            <td>
                <form method="get" action="getPlaneByIdJDBC">
                    <input type="text" name="id"/>
                    <input type="submit" value="Search by ID"/>
                </form>
            </td>
            <td>
                <a href="${pageContext.request.contextPath}/planesList">Planes List</a>
            </td>
        </tr>
    </table>
</div>

</body>

</html>