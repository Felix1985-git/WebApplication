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
<h2>Pilots list</h2>
<div>
    <table border="1">
        <tr>
            <th>id</th>
            <th>first name</th>
            <th>last name</th>
            <th>rang</th>
            <th>code</th>
            <th>delete</th>
            <th>update</th>
        </tr>
        <c:forEach items="${pilot}" var="pilot">
            <tr>
                <td>${pilot.id}</td>
                <td>${pilot.first_name}</td>
                <td>${pilot.last_name}</td>
                <td>${pilot.rang}</td>
                <td>${pilot.code}</td>
                <td>
                    <form method="get" action="deletePilotById">
                        <input type="submit" value="   ${pilot.id}  " name="id"/>
                    </form>
                </td>
                <td>
                    <form method="get" action="updatePilot">
                        <input type="submit" value="   ${pilot.id}   " name="id"/>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
    <h1></h1>
    <form method="get" action="addPilot">
        <input type="submit" value="Create new pilot"/>
    </form>
    <td>
        <h3><a href="/">Home</a></h3>
    </td>
</div>
</body>
</html>