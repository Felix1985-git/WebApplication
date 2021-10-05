<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Update flight</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<div align="center">
    <h2>Update flight</h2>
    <%--@elvariable id="flight" type="java"--%>
    <form:form action="updateFlightById" method="post" modelAttribute="flight">
        <table border="0" cellpadding="5">
            <tr>
                <td>Id</td>
                <td><form:input path="Id"/></td>
            </tr>
            <tr>
                <td>planesId</td>
                <td><form:input path="plane"/></td>
            </tr>
            <tr>
                <td>pilotsId</td>
                <td><form:input path="pilot"/></td>
            </tr>
            <tr>
                <td>date(YYYY-MM-DD)</td>
                <td><form:input path="date"/></td>
            </tr>
            <tr>
                <td>time(HH:MM:SS)</td>
                <td><form:input path="time"/></td>
            </tr>
            <tr>
                <td>number</td>
                <td><form:input path="number"/></td>
            </tr>
            <tr>
                <td colspan="2"><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form:form>
    <td>
        <h3><a href="/">Home</a></h3>
    </td>
</div>
</body>
</html>