<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>RTO Form</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="bg-light p-4">
<div class="container">
    <h2 class="mb-4">RTO Form</h2>
    <form action="rto" method="get" class="row g-3">
        <div class="col-md-4">
            <label>Code</label>
            <input type="text" name="code" class="form-control">
        </div>
        <div class="col-md-4">
            <label>City</label>
            <input type="text" name="city" class="form-control">
        </div>
        <div class="col-md-4">
            <label>Officer</label>
            <input type="text" name="officer" class="form-control">
        </div>
        <div class="col-md-6">
            <label>Address</label>
            <input type="text" name="address" class="form-control">
        </div>
        <div class="col-md-6">
            <label>Staff</label>
            <input type="text" name="staff" class="form-control">
        </div>
        <div class="col-md-6">
            <label>Timings</label>
            <input type="text" name="timings" class="form-control">
        </div>
        <div class="col-12">
            <button type="submit" class="btn btn-warning">Submit</button>
        </div>
    </form>
</div>
</body>
</html>
