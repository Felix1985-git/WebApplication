<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Pilots list</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<h1>Pilots list</h1>
<br/><br/>
<div>
    <table border="1">
        <tr>
            <th>id</th>
            <th>first name</th>
            <th>last name</th>
            <th>rang</th>
            <th>code</th>
        </tr>
        <c:forEach items="${pilot}" var="pilot">
            <tr>
                <td>${pilot.id}</td>
                <td>${pilot.firstName}</td>
                <td>${pilot.lastName}</td>
                <td>${pilot.rang}</td>
                <td>${pilot.code}</td>
            </tr>
        </c:forEach>
    </table>
    <td>
        <h3><a href="/addPilot">Create New Pilot</a></h3>
    </td>
</div>
</body>
</html>