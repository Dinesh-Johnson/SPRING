<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Name Form</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="bg-light p-4">
<div class="container">
    <h2 class="mb-4">Name Form</h2>
    <form action="name" method="get" class="row g-3">
        <div class="col-md-4">
            <label>First Name</label>
            <input type="text" name="fName" class="form-control">
        </div>
        <div class="col-md-4">
            <label>Middle Name</label>
            <input type="text" name="mName" class="form-control">
        </div>
        <div class="col-md-4">
            <label>Last Name</label>
            <input type="text" name="lName" class="form-control">
        </div>
        <div class="col-md-6">
            <label>Display Name</label>
            <input type="text" name="displayName" class="form-control">
        </div>
        <div class="col-12">
            <button type="submit" class="btn btn-primary">Submit</button>
        </div>
    </form>
</div>
</body>
</html>
