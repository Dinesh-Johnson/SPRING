<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Name Result</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="p-4">
<div class="container">
    <h2>Name Result</h2>
    <p><strong>Full Name:</strong> ${param.fName} ${param.mName} ${param.lName}</p>
    <p><strong>Display Name:</strong> ${param.displayName}</p>
</div>
</body>
</html>
