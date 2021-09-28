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
                <td>${planes.id}</td>
                <td>${planes.brand}</td>
                <td>${planes.model}</td>
                <td>${planes.capacity}</td>
                <td>${planes.taleNumber}</td>
            </tr>
    </table>
</div>

</body>

</html>