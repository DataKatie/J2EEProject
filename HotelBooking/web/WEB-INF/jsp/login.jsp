<%-- 
    Document   : login
    Created on : 8-Oct-2016, 8:19:52 PM
    Author     : Julia
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<title>
		Login Page
	</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<style>
    .container{
        background-color: #e0e8eb;
         text-align: center;
         
         border: #7D8C95 double 3px;
    }
    .jumbotron{
        background-color: #F5E6E5;
        
        
    }
    .header{
       color: #7D8C95;
       text-align: center;
      
    }
    .content{
    
      text-align: right;
    }
    .inputContent{
        text-align:left; 
        
    }
    .btn{
        background-color: #708f8d;
        color: #e0e8eb;
    }
    .alert{
       margin-top:10px;
    }
</style>
	</head>
        
        <body>
        <div class="container">
            <div class="jumbotron">
                 <h2 class="header">Spring MVC Project</h2>
                <p class="header">Created by Yuliia Shymbryk and friends</p>    
            </div>
<form action="loginValidation.htm" method="get"> 
    
    <div class="row">
        <div class="col-sm-6" ><div class="content"><span >Name:</span></div></div>
        <div class="col-sm-6" ><div class="inputContent"><input type="text" name="name"/></div>
        </div>
        <br><br>
    </div>
 <div class="row">
     <div class="col-sm-6" ><div class="content"><span class="content">Password:</span></div></div>
     <div class="col-sm-6" ><div class="inputContent"><input type="password" name="password"/></div></div>
     <br><br>
 </div>
        
<input class="btn"  type="submit" value="login"/>  
</form> 
           
            <div id="alert" class="alert alert-danger">
  ${errorMessage}

           </div> </div>
            </body>
</html>
