<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta charset="UTF-8"/>
    <title>PlanesById</title>
</head>
<body>
<h1>Result search by id planes</h1>
<div>
    <table border="1">
        <tr>
            <th>id</th>
            <th>brand</th>
            <th>model</th>
            <th>capacity</th>
            <th>tale number</th>
        </tr>
        <tr>
            <td>${plane.id}</td>
            <td>${plane.brand}</td>
            <td>${plane.model}</td>
            <td>${plane.capacity}</td>
            <td>${plane.taleNumber}</td>
        </tr>
    </table>
</div>

</body>

</html>