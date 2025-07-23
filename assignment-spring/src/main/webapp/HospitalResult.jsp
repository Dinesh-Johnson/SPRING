<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Hospital Result</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="p-4">
<div class="container">
    <h2>Hospital Result</h2>
    <p><strong>Name:</strong> ${param.name}</p>
    <p><strong>Location:</strong> ${param.location}</p>
    <p><strong>Type:</strong> ${param.type}</p>
    <p><strong>Doctors:</strong> ${param.doctors}</p>
    <p><strong>Beds:</strong> ${param.beds}</p>
    <p><strong>Contact:</strong> ${param.contact}</p>
</div>
</body>
</html>
