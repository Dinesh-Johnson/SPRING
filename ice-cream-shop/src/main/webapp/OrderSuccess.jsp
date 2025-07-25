<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order Success</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-5">
    <h2>Order Placed Successfully!</h2>
    <p>Thank you, <b>${name}</b>.</p>
    <p>Your total is: ₹<b>${total}</b></p>



    <a class="btn btn-success btn-lg mt-3" href="Order.jsp">Place Another Order</a>
</div>
<div class="container mt-4">
    <a href="index.jsp" class="btn btn-secondary">Home</a>
</div>
</body>
</html>
