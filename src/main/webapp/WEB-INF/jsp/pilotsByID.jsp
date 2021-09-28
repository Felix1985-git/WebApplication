<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
    <title>PilotsById</title>
</head>
<body>
<h1>Result search by id pilots</h1>
<div>
    <table border="1">
        <tr>
            <th>id</th>
            <th>first name</th>
            <th>last name</th>
            <th>rang</th>
            <th>code</th>
        </tr>
            <tr>
                <td>${pilots.id}</td>
                <td>${pilots.firstName}</td>
                <td>${pilots.lastName}</td>
                <td>${pilots.rang}</td>
                <td>${pilots.code}</td>
            </tr>
    </table>
</div>

</body>

</html>