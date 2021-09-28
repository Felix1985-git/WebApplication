<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
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
        <c:forEach  items="${pilots}" var ="pilots">
            <tr>
                <td>${pilots.id}</td>
                <td>${pilots.firstName}</td>
                <td>${pilots.lastName}</td>
                <td>${pilots.rang}</td>
                <td>${pilots.code}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>

</html>