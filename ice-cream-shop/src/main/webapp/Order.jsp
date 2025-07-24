<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Order Ice Cream</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-5">
    <h2 class="mb-4">🍨 Ice Cream Order 🍨</h2>

    <form action="submitOrder" method="post">

        <div class="mb-3">
            <label>Name:</label>
            <input type="text" name="name" class="form-control">
        </div>

        <div class="mb-3">
            <label>Flavour:</label>
            <select name="flavour" class="form-control">
                <option>Vanilla</option>
                <option>Chocolate</option>
                <option>Strawberry</option>
                <option>Mint Chocolate Chip</option>
                <option>Butterscotch</option>
                <option>Pistachio</option>
                <option>Kulfi</option>
            </select>
        </div>

        <div class="mb-3">
            <label>Quantity:</label>
            <input type="number" name="quantity" class="form-control">
        </div>

        <div class="mb-3">
            <label>Take Away:</label><br>
            <input type="radio" name="takeAway" value="true"> Yes
            <input type="radio" name="takeAway" value="false" checked> No
        </div>

        <div class="mb-3">
            <label>Add Ons:</label>
            <input type="checkbox" name="addOns" value="true">
        </div>

        <div class="mb-3">
            <label>Coupon Code:</label>
            <input type="text" name="coupon" class="form-control">
        </div>

        <button type="submit" class="btn btn-primary">Place Order</button>
    </form>

    <p style="color:red">${message}</p>
</div>
<div class="text-center mt-3">
    <a href="index.jsp" class="btn btn-outline-dark">🏠 Home</a>
</div>
</body>
</html>
