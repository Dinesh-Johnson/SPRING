<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Police Station Form</title>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css">
</head>
<body class="p-4">
<div class="container">
    <h2>Police Station Form</h2>
    <form action="PoliceStationResult.jsp" method="get">
        <input type="text" name="station" class="form-control mb-2" placeholder="Station Name">
        <input type="text" name="area" class="form-control mb-2" placeholder="Area">
        <input type="text" name="city" class="form-control mb-2" placeholder="City">
        <input type="text" name="officer" class="form-control mb-2" placeholder="Officer Name">
        <input type="text" name="contact" class="form-control mb-2" placeholder="Contact">
        <input type="email" name="email" class="form-control mb-2" placeholder="Email">
        <input type="text" name="staff" class="form-control mb-2" placeholder="Staff">
        <input type="text" name="fir" class="form-control mb-2" placeholder="FIR Count">
        <input type="text" name="jurisdiction" class="form-control mb-2" placeholder="Jurisdiction">
        <input type="text" name="timing" class="form-control mb-2" placeholder="Timing">
        <button type="submit" class="btn btn-warning">Submit</button>
    </form>
</div>
</body>
</html>
