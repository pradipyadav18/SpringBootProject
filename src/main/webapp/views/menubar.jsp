<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
                        
                
             <%
             
             String name=(String)session.getAttribute("session_name");
             
             if(name != null){
            	  
            	 %>
            	  <div class="menubar_div">
                    
                          <a href="homePage">Home</a>
                          <a href="aboutUsPage">About Us</a>
                          <a href="contactUsPage">Contact Us</a>
                          <a href="profilePage"><img alt="" src="/images/user-profile.webp" height="20"><%=name%></a>
                          <a href="logout">logout</a>
                    
                    </div>
            	   
            	  <%    
            	  }else{
            		   
            		  %>
            		   <div class="menubar_div">
                    
                          <a href="homePage">Home</a>
                          <a href="aboutUsPage">About Us</a>
                          <a href="contactUsPage">Contact Us</a>
                          <a href="LoginPage">Login</a>
                          <a href="registerPage">Register</a>
                    
                    </div>

            		  <%
 
            	  }
             
             %>   
               
                        
                     
                    
                             
                             
                    
                    



              
                
</body>
</html>