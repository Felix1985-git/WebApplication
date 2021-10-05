<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Update plane</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>
<div align="center">
    <h2>Update plane</h2>


    <%--@elvariable id="plane" type="java"--%>
    <form:form action="updatePlaneById" method="post" modelAttribute="plane">
        <table border="0" cellpadding="5">
            <tr>
                <td>Id</td>
                <td><form:input path="Id"/></td>
            </tr>
            <tr>
                <td>brand</td>
                <td><form:input path="brand" /></td>
            </tr>
            <tr>
                <td>model</td>
                <td><form:input path="model" /></td>
            </tr>
            <tr>
                <td>capacity</td>
                <td><form:input path="capacity" /></td>
            </tr>
            <tr>
                <td>taleNumber</td>
                <td><form:input path="taleNumber" /></td>
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