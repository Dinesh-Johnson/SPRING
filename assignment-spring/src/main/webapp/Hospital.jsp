<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Hospital Form</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="bg-light p-4">
<div class="container">
    <h2 class="mb-4">Hospital Form</h2>
    <form action="hospital" method="get" class="row g-3">
        <div class="col-md-6">
            <label>Name</label>
            <input type="text" name="name" class="form-control">
        </div>
        <div class="col-md-6">
            <label>Location</label>
            <input type="text" name="location" class="form-control">
        </div>
        <div class="col-md-6">
            <label>Type</label>
            <input type="text" name="type" class="form-control">
        </div>
        <div class="col-md-6">
            <label>Doctors</label>
            <input type="text" name="doctors" class="form-control">
        </div>
        <div class="col-md-6">
            <label>Beds</label>
            <input type="text" name="beds" class="form-control">
        </div>
        <div class="col-md-6">
            <label>Contact</label>
            <input type="text" name="contact" class="form-control">
        </div>
        <div class="col-12">
            <button type="submit" class="btn btn-success">Submit</button>
        </div>
    </form>
</div>
</body>
</html>
