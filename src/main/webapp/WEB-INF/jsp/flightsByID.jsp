<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8"/>
    <title>FlightsById</title>
</head>
<body>
<h1>Result search by id flights</h1>
<div>
    <table border="1">
        <tr>
            <th>id</th>
            <th>date</th>
            <th>time</th>
            <th>number</th>
        </tr>
        <tr>
            <td>${flight.id}</td>
            <td>${flight.date}</td>
            <td>${flight.time}</td>
            <td>${flight.number}</td>
        </tr>
    </table>
    <td>
        <h3><a href="/">Home</a></h3>
    </td>
</div>
</body>
</html>