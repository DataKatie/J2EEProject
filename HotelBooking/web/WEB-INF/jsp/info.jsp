<%-- 
    Document   : info
    Created on : 8-Oct-2016, 5:47:07 PM
    Author     : Julia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
        <title>Submission Information</title>
        <style>
            .container{
        background-color: #e0e8eb;
         
         padding-bottom: 5%;
         border: #7D8C95 double 3px;
    }
    .jumbotron{
        background-color: #F5E6E5;}
        .header{
       color: #7D8C95;
       text-align: center;
    }
    #titleMessage{
        text-align:center;
    }
    #info{
        text-align:center;
        font-size: medium;
    }
        </style>
    </head>
    <body>
         <div class="container">
            <div class="jumbotron">      
                <h2 class="header">Spring MVC Project</h2>
                <p class="header">Created by Yuliia Shymbryk</p>    
            </div>
        <h1 id="titleMessage">Your data has been successfully entered into the system </h1>
        <div id="info">
        First Name: ${student.getFirstName()} <br>
        Last Name: ${student.getLastName()}<br>
        Email: ${student.getEmail()}<br>
        Phone: ${student.getPhoneNumber()}<br>
        Semester: ${student.getSemester()}
        </div>
    </body>
</html>
