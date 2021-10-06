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
<h2>FullData</h2>
<div>
    <table border="1">
        <tr class="cell-1">
            <th>flightNumber</th>
            <th>flightDate</th>
            <th>flightTime</th>
            <th>planeTaleNumber</th>
            <th>planeBrand_Model</th>
            <th>planeCapacity</th>
            <th>pilotFullName</th>
            <th>pilotCode_Rang</th>
        </tr>
        <c:forEach items="${fullData}" var="fullData">
            <tr>
                <td align="center">${fullData.flightNumber}</td>
                <td align="center">${fullData.flightDate}</td>
                <td align="center">${fullData.flightTime}</td>
                <td align="center">${fullData.planeTaleNumber}</td>
                <td align="center">${fullData.planeBrandModel}</td>
                <td align="center">${fullData.planeCapacity}</td>
                <td align="center">${fullData.pilotFullName}</td>
                <td align="center">${fullData.pilotCodeRang}</td>
        </c:forEach>
    </table>
    <h1></h1>
    <td>
        <h3><a href="/">Home</a></h3>
    </td>
</div>
</body>
</html>
