<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Fruit Form</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="bg-light p-4">
<div class="container">
    <h2 class="mb-4">Fruit Form</h2>
    <form action="fruit" method="get" class="row g-3">
        <div class="col-md-4"><label>Name</label><input type="text" name="name" class="form-control"></div>
        <div class="col-md-4"><label>Color</label><input type="text" name="color" class="form-control"></div>
        <div class="col-md-4"><label>Weight</label><input type="text" name="weight" class="form-control"></div>
        <div class="col-md-6"><label>Season</label><input type="text" name="season" class="form-control"></div>
        <div class="col-md-6"><label>Taste</label><input type="text" name="taste" class="form-control"></div>
        <div class="col-md-6"><label>Country</label><input type="text" name="country" class="form-control"></div>
        <div class="col-md-6"><label>Vitamin</label><input type="text" name="vitamin" class="form-control"></div>
        <div class="col-md-6"><label>Price</label><input type="text" name="price" class="form-control"></div>
        <div class="col-md-6"><label>Tropical</label><input type="text" name="tropical" class="form-control"></div>
        <div class="col-md-6"><label>Ripe</label><input type="text" name="ripe" class="form-control"></div>
        <div class="col-12"><button type="submit" class="btn btn-info">Submit</button></div>
    </form>
</div>
</body>
</html>
