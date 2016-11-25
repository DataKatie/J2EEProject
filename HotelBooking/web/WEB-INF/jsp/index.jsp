<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<title>
		Main Page
	</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
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
</style>
	</head>
        
    
        <div class="container">
            <div class="jumbotron">
                
                <h2 class="header">Spring MVC Project</h2>
                <p class="header">Created by Yuliia Shymbryk and friends</p>    
            </div>
        hello world this is a test
        <c:out value="${firstName}"/> 
        <c:out value="${test}"/> 
        
</div>
          <div class="col-sm-10">
<button class="btn" onclick="location.href='login.htm'">Show the info about students</button>
          </div>
      
    </div>