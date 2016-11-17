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
                <p class="header">Created by Yuliia Shymbryk</p>    
            </div>
        <form:form action="submitCheck.htm" modelAttribute="student">
        <div class="row">
<div class="col-sm-2">
    <label for="firstName">First Name: </label> 
</div>
            <div class="col-sm-2">
    <form:input  path="firstName" id="fNameInput"></form:input>
            </div>
            <div class="col-sm-8">
    <form:errors class="error" path="firstName"></form:errors>
     <br><br>
    </div>
  
</div>
     <div class="row">
<div class="col-sm-2">
    <label for="lastName">Last Name: </label>
    </div>
            <div class="col-sm-2">
     <form:input  path="lastName" id="lNameInput"></form:input>
      </div>
            <div class="col-sm-8">
    <form:errors class="error" path="lastName"></form:errors>
    <br><br>
     </div>
  
</div>
     <div class="row">
<div class="col-sm-2">
    <label for="email">Email: </label>
    </div>
            <div class="col-sm-2">
      <form:input  path="email" id="emailInput"></form:input>
      </div>
            <div class="col-sm-8">
    <form:errors class="error" path="email"></form:errors>
     <br><br>
   </div>
  
</div>
     <div class="row">
<div class="col-sm-2">
    <label for="phoneNumber">Phone Number: </label>
    </div>
            <div class="col-sm-2">
      <form:input  path="phoneNumber" id="phoneNumberInput"></form:input>
       </div>
            <div class="col-sm-8">
    <form:errors class="error" path="phoneNumber"></form:errors>
     <br><br>
   </div>
  
</div>
     <div class="row">
<div class="col-sm-2">
    <label for="semester">Semester: </label>
    </div>
            <div class="col-sm-2">
    <form:select path="semester">  
        
        <form:option value="none" label="Select semester"/>  
                <c:forEach var="listValue" items="${lists}">
			  <form:option  value="${listValue.key}"  label="${listValue.value}"/>  
			</c:forEach>
               
           </form:select> 
                 </div>
            <div class="col-sm-8">
    <form:errors class="error" path="semester"></form:errors>
     <br><br>
     </div>
    </div>
      
<div class="col-sm-2">
    <input class="btn" type="submit" value="Submit Information" />   
</form:form>
</div>
          <div class="col-sm-10">
<button class="btn" onclick="location.href='login.htm'">Show the info about students</button>
          </div>
      
    </div>