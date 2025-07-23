<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Fruit Form</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<form  action="football" method="get">
    <div class="col-md-2">
        <label>Name</label>
        <input type="text" name="name" class="form-control">
    </div>
    <div class="col-md-2">
        <label>Position</label>
        <input type="text" name="position" class="form-control">
    </div>
    <div class="col-md-2">
        <label>Country</label>
        <input type="text" name="country" class="form-control">
    </div>
    <div class="col-md-2">
        <label>Right Foot</label>
        <input type="text" name="leg" class="form-control">
    </div><br>
    <div class="col-12">
        <button type="submit" class="btn btn-primary">Submit</button>
    </div>
</form>
</body>
</html>