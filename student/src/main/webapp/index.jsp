<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Student Profile Form</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <meta charset="UTF-8">
</head>
<body>
<h2>Student Profile Form</h2>

<form id="studentForm" method="post" action="profile" enctype="multipart/form-data">
    <p style="color:red;">${message}</p>
    <table>
        <tr>
            <td>Name:</td>
            <td><input type="text" name="name" value="${dto.name}"/></td>
        </tr>
        <tr>
            <td>Email:</td>
            <td><input type="text" name="email" value="${dto.email}"/></td>
        </tr>
        <tr>
            <td>Date of Birth:</td>
            <td><input type="date" name="dob" value="${dto.dob}"/></td>
        </tr>
        <tr>
            <td>Profile Picture:</td>
            <td><input type="file" name="profilePicture" value="${dto.profilePicture}"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form>

<script>
    document.addEventListener("DOMContentLoaded", function () {
        const form = document.getElementById("studentForm");

        form.addEventListener("submit", function (event) {
            const name = form.elements["name"].value.trim();
            const email = form.elements["email"].value.trim();
            const dob = form.elements["dob"].value.trim();

            let errorMessages = [];

            if (name === "") {
                errorMessages.push("Name is required.");
            }

            if (email === "") {
                errorMessages.push("Email is required.");
            }

            if (dob === "") {
                errorMessages.push("Date of Birth is required.");
            }

            if (errorMessages.length > 0) {
                event.preventDefault();
                alert(errorMessages.join("\n"));
            }
        });
    });
</script>

</body>
</html>
