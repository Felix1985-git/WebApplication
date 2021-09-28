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
                <td>${flight.id}</td>
                <td>${flight.date}</td>
                <td>${flight.time}</td>
                <td>${flight.number}</td>
            </tr>
    </table>

</div>

</body>

</html>