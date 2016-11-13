<%-- 
    Document   : allStudents
    Created on : 8-Oct-2016, 8:22:32 PM
    Author     : Julia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Students</title><link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<style>
    .container{
        background-color: #e0e8eb;
         
         padding-bottom: 5%;
         border: #7D8C95 double 3px;
    }
    .jumbotron{
        background-color: #F5E6E5;
        
        
    }
    .header{
       color: #7D8C95;
       text-align: center;
    }
    .btn{
        background-color: #708f8d;
        color: #e0e8eb;
    }
    .error{
        color: #002e4d;
    }
    h1{
        text-align: center;
    }
</style>
	</head>
        
    
        <div class="container">
            <div class="jumbotron">
                
                <h2 class="header">Spring MVC Project</h2>
                <p class="header">Created by Yuliia Shymbryk</p>    
            </div>
        <h1>List Of Students</h1>
        
        <c:forEach var="listVar" items="${students}">
            <div class="row">
                <div class="col-sm-4">Name:
       <c:out value="${listVar.getFirstName()}"/> 
       <c:out value="${listVar.getLastName()}"/>
            </div>
            <div class="col-sm-3">Email: 
                <c:out value="${listVar.getEmail()}"/> 
            </div>
            <div class="col-sm-3">Phone: 
                <c:out value="${listVar.getPhoneNumber()}"/> 
            </div>
            <div class="col-sm-2">Semester: 
                <c:out value="${listVar.getSemester()}"/> 
            </div>
            </div>
    </c:forEach>
    </body>
</html>
