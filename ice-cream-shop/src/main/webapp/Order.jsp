<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html xmlns:c="http://www.w3.org/1999/XSL/Transform">
<head>
    <title>Order Ice Cream</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

<div class="container mt-5">
    <h2 class="mb-4 text-center">🍨 Ice Cream Order 🍨</h2>

    <!-- ✅ Show validation message if present -->
    <c:if test="${not empty message}">
        <div class="alert alert-danger text-center">${message}</div>
    </c:if>

    <form action="submitOrder" method="post" class="border p-4 rounded shadow-sm bg-light">

        <div class="mb-3">
            <label>Name:</label>
            <input type="text" name="name" class="form-control" required minlength="2">
        </div>

        <div class="mb-3">
            <label>Flavour:</label>
            <select name="flavour" class="form-control" required>
                <option value="">-- Select Flavour --</option>
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
            <input type="number" name="quantity" class="form-control" min="1" required>
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
            <input type="text" name="coupon" class="form-control" maxlength="10">
        </div>

        <div class="text-center">
            <button type="submit" class="btn btn-primary">Place Order</button>
        </div>
    </form>

    <div class="text-center mt-3">
        <a href="index.jsp" class="btn btn-outline-dark">🏠 Home</a>
    </div>
</div>

</body>
</html>
