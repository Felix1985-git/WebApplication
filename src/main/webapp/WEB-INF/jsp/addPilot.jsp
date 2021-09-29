<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8"/>
    <title>Add pilot</title>
</head>
<body>
<h1>Add pilot</h1>
<div>
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

        <table class="table-bordered">
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

        </table>
        <tr>
            <td colspan="2"><input type="submit" value="Save"></td>
        </tr>
    </form:form>
</div>
</body>
</html>
