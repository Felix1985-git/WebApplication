<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8"/>
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
            <td>${pilot.id}</td>
            <td>${pilot.firstName}</td>
            <td>${pilot.lastName}</td>
            <td>${pilot.rang}</td>
            <td>${pilot.code}</td>
        </tr>
    </table>
</div>

</body>

</html>