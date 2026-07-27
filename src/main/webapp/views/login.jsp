<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Form</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>

    <div class="body_div">

        <br><br>
        <span class="body_text_title" style="color:red">
            About to Smart Programming
        </span>
        <br><br>

        <form action="LoginForm" method="post">

            Email id :
            <input type="email"
                   name="email1"
                   required />
            <br><br>

            Password :
            <input type="password"
                   name="pass1"
                   required
                   minlength="6"
                   maxlength="20" />
            <br><br>

            <input type="submit" value="Login"/>

        </form>

    </div>

</body>
</html>