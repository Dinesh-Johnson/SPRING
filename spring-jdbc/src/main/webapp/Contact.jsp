<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>
    <title>Contact Form</title>
    <style>
        .error {
            color: red;
            font-size: 14px;
            margin-left: 10px;
        }
    </style>

    <script>
        function validateForm() {
            var name = document.forms["contactForm"]["name"].value;
            var email = document.forms["contactForm"]["email"].value;
            var mobile = document.forms["contactForm"]["mobile"].value;
            var comments = document.forms["contactForm"]["comments"].value;

            var isValid = true;

            document.getElementById("nameError").innerHTML = "";
            document.getElementById("emailError").innerHTML = "";
            document.getElementById("mobileError").innerHTML = "";
            document.getElementById("commentsError").innerHTML = "";

            // Name
            if (name == "") {
                document.getElementById("nameError").innerHTML = "Name is required";
                isValid = false;
            }

            // Email
            var emailPattern = /^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-z]{2,}$/;
            if (email == "") {
                document.getElementById("emailError").innerHTML = "Email is required";
                isValid = false;
            } else if (!emailPattern.test(email)) {
                document.getElementById("emailError").innerHTML = "Invalid email format";
                isValid = false;
            }

            // Mobile
            var mobilePattern = /^[0-9]{10}$/;
            if (mobile == "") {
                document.getElementById("mobileError").innerHTML = "Mobile is required";
                isValid = false;
            } else if (!mobilePattern.test(mobile)) {
                document.getElementById("mobileError").innerHTML = "Must be 10 digits";
                isValid = false;
            }

            // Comments
            if (comments == "") {
                document.getElementById("commentsError").innerHTML = "Comments are required";
                isValid = false;
            }

            return isValid;
        }
    </script>
</head>

<body>

<h2>Contact Form</h2>

<form name="contactForm" action="save" method="post" onsubmit="return validateForm()">

    Name:
    <input type="text" name="name" value="${dto.name}" />
    <span class="error" id="nameError"></span>
    <br/><br/>

    Email:
    <input type="text" name="email" value="${dto.email}" />
    <span class="error" id="emailError"></span>
    <br/><br/>

    Mobile:
    <input type="text" name="mobile" value="${dto.mobile}" />
    <span class="error" id="mobileError"></span>
    <br/><br/>

    Comments:
    <textarea name="comments">${dto.comments}</textarea>
    <span class="error" id="commentsError"></span>
    <br/><br/>

    <input type="submit" value="Submit" />
</form>

</body>
</html>
