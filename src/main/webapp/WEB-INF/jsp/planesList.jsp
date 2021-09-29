<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Planes list</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<h1>Planes list</h1>

<br/><br/>
<div>
    <table border="1">
        <tr>
            <th>id</th>
            <th>brand</th>
            <th>model</th>
            <th>capacity</th>
            <th>tale number</th>
        </tr>
        <c:forEach  items="${plane}" var ="plane">
            <tr>
                <td>${plane.id}</td>
                <td>${plane.brand}</td>
                <td>${plane.model}</td>
                <td>${plane.capacity}</td>
                <td>${plane.taleNumber}</td>
            </tr>
        </c:forEach>
    </table>
    <td>
        <h3><a href="/addPlane">Create New Plane</a></h3>
    </td>
</div>
</body>

</html>