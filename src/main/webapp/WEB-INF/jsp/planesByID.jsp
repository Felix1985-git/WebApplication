<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
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