<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Welcome</title>
    <link rel="stylesheet" type="text/css"
          href="${pageContext.request.contextPath}/css/style.css"/>
</head>
<body>

<h1>Welcome to my first web application</h1>

<h2>${message1}</h2>

<a href="${pageContext.request.contextPath}/flightsList">Flights List</a>

<h2>${message2}</h2>
<a href="${pageContext.request.contextPath}/pilotsList">Pilots List</a>

<h2>${message3}</h2>
<a href="${pageContext.request.contextPath}/planesList">Planes List</a>

</body>

</html>