<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Planes list</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<h2>Planes list</h2>
<div>
    <table border="1">
        <tr>
            <th>id</th>
            <th>brand</th>
            <th>model</th>
            <th>capacity</th>
            <th>tale number</th>
            <th>delete</th>
        </tr>
        <c:forEach items="${plane}" var="plane">
            <tr>
                <td>${plane.id}</td>
                <td>${plane.brand}</td>
                <td>${plane.model}</td>
                <td>${plane.capacity}</td>
                <td>${plane.taleNumber}</td>
                <td>
                    <form method="get" action="deletePlaneById">
                        <input type="submit" value="   ${plane.id}  " name="id"/>
                    </form>
                </td>
            </tr>
        </c:forEach>
    </table>
    <h1></h1>
    <form method="get" action="addPlane">
        <input type="submit" value="Create new plane"/>
    </form>
    <td>
        <h3><a href="/">Home</a></h3>
    </td>
</div>
</body>
</html>