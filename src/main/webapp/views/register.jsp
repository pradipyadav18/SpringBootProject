<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Form</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>

<div class="body_div">
    <br><br>
    <span class="body_text_title" style="color:red">Register Form</span>
    <br><br>

    <form action="regForm" method="POST">

        Name :
        <input type="text" name="name1" required minlength="3" maxlength="30"/>
        <br><br>

        Email :
        <input type="email" name="email1" required/>
        <br><br>

        Password :
        <input type="password" name="pass1" required minlength="6" maxlength="20"/>
        <br><br>

        Gender :
        <input type="radio" name="gender1" value="Male" required/>Male
        <input type="radio" name="gender1" value="Female"/>Female
        <br><br>

        City
        <select name="city1" required>
            <option value="">Select City</option>
            <option value="Delhi">Delhi</option>
            <option value="Mumbai">Mumbai</option>
            <option value="Kolkata">Kolkata</option>
            <option value="Chennai">Chennai</option>
        </select>
        <br><br>

        <input type="submit" value="Submit"/>

    </form>

</div>

</body>
</html>