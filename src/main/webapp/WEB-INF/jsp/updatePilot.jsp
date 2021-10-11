<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Update pilot</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<div align="center">
    <h2>Update pilot</h2>
    <%--@elvariable id="pilot" type="java"--%>
    <form:form action="updatePilotById" method="post" modelAttribute="pilot">
        <table border="0" cellpadding="5">
            <tr>
                <td>Id</td>
                <td><form:input path="Id" readonly="true"/></td>
            </tr>
            <tr>
                <td>firstName</td>
                <td><form:input path="firstName"/></td>
            </tr>
            <tr>
                <td>lastName</td>
                <td><form:input path="lastName"/></td>
            </tr>
            <tr>
                <td>code</td>
                <td><form:input path="code"/></td>
            </tr>

            <tr>
                <td>rang</td>
                <td>
                    <form:select path="rang">
                        <form:options/>
            <tr>
                </form:select>
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