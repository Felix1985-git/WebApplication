<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Add pilot</title>
</head>
<body>
<div align="center">
    <h2>Add pilot</h2>
    <%--    &lt;%&ndash;@elvariable id="pilot" type="java"&ndash;%&gt;--%>
    <%--    <form:form action="saveNewPilot" method="post" modelAttribute="pilot">--%>
    <%--        <table border="0" cellpadding="5">--%>
    <%--            <tr>--%>
    <%--                <td>firstName</td>--%>
    <%--                <td><form:input path="firstName" /></td>--%>
    <%--            </tr>--%>
    <%--            <tr>--%>
    <%--                <td>lastName</td>--%>
    <%--                <td><form:input path="lastName" /></td>--%>
    <%--            </tr>--%>
    <%--            <tr>--%>
    <%--                <td>code</td>--%>
    <%--                <td><form:input path="code" /></td>--%>
    <%--            </tr>--%>
    <%--            <tr>--%>
    <%--                <td>rang</td>--%>
    <%--                <td><form:input path="rang" /></td>--%>
    <%--            </tr>--%>
    <%--            <tr>--%>
    <%--                <td colspan="2"><input type="submit" value="Save"></td>--%>
    <%--            </tr>--%>
    <%--        </table>--%>
    <%--    </form:form>--%>

    <%--@elvariable id="pilot" type="java"--%>
    <form:form modelAttribute="pilot" enctype="multipart/form-data"
               action="${pageContext.request.contextPath}/saveNewPilot" method="post"
               acceptCharset="UTF-8">

        <table border="0" cellpadding="5">
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
                <td><input type="submit" value="Save"></td>
            </tr>
        </table>
    </form:form>
    <td>
        <h3><a href="/">Home</a></h3>
    </td>
</div>
</body>
</html>
