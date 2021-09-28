<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
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
                <td>${flights.id}</td>
                <td>${flights.date}</td>
                <td>${flights.time}</td>
                <td>${flights.number}</td>
            </tr>
    </table>

</div>

</body>

</html>