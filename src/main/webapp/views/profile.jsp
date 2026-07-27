<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">Profile</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>


         
         <div class="body_div">
         <br><br> <span class="body_text_title " style="color :blue">Welcome to ${session_name} </span> <br><br><br><br><br><br>
          <b>Email  :  ${session_email}  </b> <br>
          <b>Gender :${session_gender} <br><br>
          <br>City : ${session_city} <br><br>
          <br>Password : ${session_password }<br><br>
         </div>

</body>
</html>