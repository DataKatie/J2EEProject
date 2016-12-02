<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib  uri="http://www.springframework.org/tags" prefix="spring"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd"><html>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link rel="stylesheet" href="5star.css" type="text/css">
<link rel="stylesheet" href="user_images/5star.css" type="text/css">
<head>
    
     <style>BODY {
	FONT-FAMILY: Arial, Verdana, sans-serif;
	FONT-SIZE: 11px;
}

A {
	FONT-FAMILY: Arial, Verdana, sans-serif;
	FONT-SIZE: 11px;
}

TD {
	FONT-FAMILY: Arial, Verdana, sans-serif;
	FONT-SIZE: 11px;
}

UL {
	FONT-FAMILY: Arial, Verdana, sans-serif;
	FONT-SIZE: 11px;
}

OL {
	FONT-FAMILY: Arial, Verdana, sans-serif;
	FONT-SIZE: 11px;
}

INPUT {
	FONT-FAMILY: Arial, Verdana, sans-serif;
	FONT-SIZE: 11px;
}

SELECT {
	FONT-FAMILY: Arial, Verdana, sans-serif;
	FONT-SIZE: 11px;
}

.BodyBackgroundOld {
	BACKGROUND-COLOR: #ffffff;
	MARGIN-LEFT: 0px;
	MARGIN-TOP: 1px;
	PADDING-BOTTOM: 20px;
	PADDING-LEFT: 3px;
	PADDING-RIGHT: 3px;
	PADDING-TOP: 0px;
	POSITION: static;
	WIDTH: 995px;
}

.BodyBackground {
	BACKGROUND-COLOR: #FFFFFF;
	MARGIN-LEFT: 0px;
	MARGIN-TOP: 1px;
	PADDING-BOTTOM: 20px;
	PADDING-LEFT: 3px;
	PADDING-RIGHT: 3px;
	PADDING-TOP: 0px;
	POSITION: static;
}

.HeaderGraphics {
	PADDING-LEFT: 33px;
	PADDING-TOP: 70px;
	Z-INDEX: 1;
}

.FunctionButtons {
	BACKGROUND-COLOR: transparent;
	COLOR: #000000;
	FONT-SIZE: 11px;
	FONT-WEIGHT: bold;
	HEIGHT: 26px;
	PADDING-BOTTOM: 0px;
	PADDING-LEFT: 0px;
	PADDING-RIGHT: 0px;
	PADDING-TOP: 0px;
}

.HeaderText1 {
	COLOR: #1A0000;
	FONT-SIZE: 15px;
	FONT-WEIGHT: bold;
	LINE-HEIGHT: 20px;
	PADDING-LEFT: 5px;
	PADDING-TOP: 3px;
	PADDING-BOTTOM: 3px;
}

.HeaderText2 {
	BACKGROUND-COLOR: #dfddcc;
	FONT-SIZE: 12px;
	FONT-WEIGHT: bold;
	LINE-HEIGHT: 20px;
	PADDING-LEFT: 5px;
	PADDING-TOP: 2px;
	PADDING-BOTTOM: 2px;
}

.BodyText {
	FONT-FAMILY: Arial, Verdana, sans-serif;
	FONT-SIZE: 11px;
}

.RateLine {
	FONT-FAMILY: Arial, Verdana, sans-serif;
	FONT-SIZE: 11px;
}

.FooterText {
	FONT-FAMILY: Arial, Verdana, sans-serif;
	FONT-SIZE: 11px;
	TEXT-ALIGN: center;
}

.StayInformationHeader {
	BACKGROUND-COLOR: #dfddcc;
	COLOR: #000000;
	FONT-SIZE: 11px;
	FONT-WEIGHT: bold;
	HEIGHT: 26px;
	PADDING-BOTTOM: 0px;
	PADDING-LEFT: 8px;
	PADDING-RIGHT: 0px;
	PADDING-TOP: 0px;
}

.StayInformationDetails {
	background-color: #f2f2e2;
	COLOR: #000000;
	FONT-SIZE: 8pt;
	PADDING-BOTTOM: 0px;
	PADDING-LEFT: 5px;
	PADDING-RIGHT: 0px;
	PADDING-TOP: 0px;
}

.StayInformationThumbNail {
	background-color: #f2f2e2;
	COLOR: #000000;
	FONT-SIZE: 8pt;
	PADDING-BOTTOM: 0px;
	PADDING-LEFT: 5px;
	PADDING-RIGHT: 0px;
	PADDING-TOP: 0px;
}

.EnhanceYourStay {
	COLOR: #000000;
	FONT-SIZE: 11px;
	FONT-WEIGHT: bold;
	HEIGHT: 26px;
}

.SignInSectionHeader {
	COLOR: #000000;
	FONT-SIZE: 11px;
	FONT-WEIGHT: bold;
	HEIGHT: 26px;
	PADDING-BOTTOM: 0px;
	PADDING-LEFT: 8px;
	PADDING-RIGHT: 0px;
	PADDING-TOP: 0px;
}

.SignInSectionDetails {
	COLOR: #000000;
	FONT-SIZE: 11px;
	FONT-WEIGHT: normal;
	HEIGHT: 26px;
	PADDING-BOTTOM: 0px;
	PADDING-LEFT: 8px;
	PADDING-RIGHT: 0px;
	PADDING-TOP: 0px;
}

.DetailsText {
	FONT-SIZE: 12px;
	FONT-WEIGHT: normal;
	LINE-HEIGHT: 20px;
	PADDING-BOTTOM: 3px;
}

.AvgRateText {
	FONT-FAMILY: Arial, Verdana, sans-serif;
	FONT-SIZE: 11px;
	FONT-WEIGHT: bold;
}

.ErrorText {
	COLOR: #d5813b;
	FONT-SIZE: 15px;
	FONT-WEIGHT: bold;
	LINE-HEIGHT: 20px;
	PADDING-BOTTOM: 3px;
}

.RoomTypeText {
	FONT-SIZE: 12px;
	FONT-WEIGHT: normal;
	LINE-HEIGHT: 20px;
	PADDING-BOTTOM: 3px;
}

.PopupHeader1 {
	COLOR: #d5813b;
	FONT-SIZE: 15px;
	FONT-WEIGHT: bold;
	LINE-HEIGHT: 20px;
	PADDING-BOTTOM: 3px;
}

.PopupHeader2 {
	COLOR: #d5813b;
	FONT-SIZE: 15px;
	FONT-WEIGHT: bold;
	LINE-HEIGHT: 20px;
	PADDING-BOTTOM: 3px;
}

.PopupText1 {
	FONT-SIZE: 12px;
	FONT-WEIGHT: normal;
	LINE-HEIGHT: 20px;
	PADDING-BOTTOM: 3px;
}

.PopupText2 {
	FONT-SIZE: 12px;
	FONT-WEIGHT: normal;
	LINE-HEIGHT: 20px;
	PADDING-BOTTOM: 3px;
}

.CorpInfo {
	FONT-SIZE: 12px;
	FONT-WEIGHT: bold;
	LINE-HEIGHT: 20px;
	PADDING-BOTTOM: 3px;
}

.GroupInfo {
	FONT-SIZE: 12px;
	FONT-WEIGHT: bold;
	LINE-HEIGHT: 20px;
	PADDING-BOTTOM: 3px;
}

.InstructionText {
	COLOR: black;
	FONT-SIZE: 13px;
	FONT-WEIGHT: bold;
	LINE-HEIGHT: 20px;
	PADDING-BOTTOM: 3px;
}

.DateLabelText {
	FONT-FAMILY: Arial, Verdana, sans-serif;
	FONT-SIZE: 9px;
}

.SurveyText1 {
	FONT-SIZE: 15px;
	FONT-WEIGHT: bold;
	LINE-HEIGHT: 20px;
	PADDING-BOTTOM: 15px;
}

.SurveyText2 {
	FONT-SIZE: 15px;
	FONT-WEIGHT: bold;
	LINE-HEIGHT: 20px;
	PADDING-BOTTOM: 10px;
}

.SurveyText3 {
	FONT-SIZE: 14px;
	FONT-WEIGHT: bold;
	LINE-HEIGHT: 20px;
	PADDING-BOTTOM: 3px;
}

.SurveyQuestions {
	FONT-SIZE: 14px;
	FONT-WEIGHT: normal;
	LINE-HEIGHT: 20px;
	PADDING-BOTTOM: 3px;
}

.SurveyRankings {
	FONT-SIZE: 12px;
	FONT-WEIGHT: bold;
	LINE-HEIGHT: 10px;
	PADDING-BOTTOM: 3px;
	TEXT-ALIGN: center;
}

.ThumbNailRoomTypeHeader {
	FONT-SIZE: 20px;
	FONT-WEIGHT: normal;
	LINE-HEIGHT: 25px;
	PADDING-BOTTOM: 3px;
}

.ThumbNailRoomTypeDescription {
	FONT-SIZE: 12px;
	FONT-WEIGHT: normal;
	LINE-HEIGHT: 20px;
	PADDING-BOTTOM: 3px;
}

.ThumbNailRateTypeSelectTitle {
	background-color: #dfddcc;
	FONT-SIZE: 12px;
	FONT-WEIGHT: normal;
	LINE-HEIGHT: 12px;
	PADDING-BOTTOM: 0px;
	}

.ThumbNailRateTypeSelect {
	background-color: #dfddcc;
	FONT-SIZE: 12px;
	FONT-WEIGHT: normal;
	LINE-HEIGHT: 12px;
	PADDING-BOTTOM: 0px;
}

.ThumbNailRateTypeTitle {
	FONT-SIZE: 12px;
	FONT-WEIGHT: normal;
	LINE-HEIGHT: 12px;
	PADDING-BOTTOM: 0px;
	}

.ThumbNailRateTypeHeader {
	FONT-SIZE: 15px;
	FONT-WEIGHT: normal;
	LINE-HEIGHT: 20px;
	PADDING-BOTTOM: 3px;
}

.ThumbNailRateTypeDescription {
	FONT-SIZE: 12px;
	FONT-WEIGHT: normal;
	LINE-HEIGHT: 20px;
	PADDING-BOTTOM: 3px;
}

.ThumbNailAverageRate {
	FONT-SIZE: 16px;
	FONT-WEIGHT: bold;
	line-height: 20px;
}
.ThumbNailBeforeDiscountRate {
	FONT-SIZE: 16px;
	FONT-WEIGHT: normal;
	line-height: 20px;
	text-decoration: line-through;
}
.SelectButton
{
	FONT-SIZE: 12px;
	FONT-WEIGHT: bold;
	background-color: #4C864C;
	border: solid 5px #4C864C;
	display: inline-block;
	color: #FFFFFF;
}
.SelectButton:hover
{
	background-color: #00E600;
	border: solid 5px #00E600;
}
/*
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
*/
/* 
    Created on : 25-Nov-2016, 2:15:23 PM
    Author     : Katie
*/

</style>
<META http-equiv="Content-Type" content="text/html; charset=UTF-16">
<title>Waring House Secure Online Reservations</title>
</head>
<body class="BodyBackground">
   
<form name="Form" method="post" action="" modelAttribute="user">
<table border="0" cellpadding="0" cellspacing="0" align="center" width="1024">
<tr>
<td width="60%"></td>
<td width="30%"></td>
</tr>
<tr>
<td colspan="2"><img width="100%" border="0" src="user_images/5 Star Banner.jpg"></td>
</tr>
<tr>
<td colspan="2">
                 
              </td>
</tr>
<tr>
<td colspan="1" valign="top">
<table width="100%" border="0" cellpadding="3" cellspacing="0" align="center">
<tr>
<td class="FunctionButtons" id="ButtonReservation"><a href="Availability_Inq.asp"><img width="140" height="23" border="0" src="images/ReservationButton_Off.gif"></a><a href="Change_Inq.asp"><img width="140" height="23" border="0" src="images/ChangeButton_On.gif"></a><a href="Cancellation_Inq.asp"><img width="140" height="23" border="0" src="images/CancelButton_Off.gif"></a></td>
</tr>
<tr>
<td class="HeaderText1">Which Reservation do you want to Change.</td>

</tr>
<tr>
<td>
<hr color="#6699FF" align="left" width="90%" size="0">
</td>
</tr>
</table>
    <h2> ${errorMsg}
        ${deleteMsg}
    </h2>
<table width="100%" border="0" cellpadding="0" cellspacing="1">
<tr>
<td width="5%"></td>
<td width="25%"></td>
<td width="65%"></td>
<td width="5%"></td>
</tr>
<tr>
<td></td>
<td align="right">Reservation Number:
                    </td>

            
<td>
    <spring:bind path="booking.reservationId">
   <input type="text" name="<c:out value= "${status.expression}"/>" value="<c:out value="${status.value}"/>"/>
        </spring:bind>
 </td>
</tr>
<tr>
<td></td>
<td align="right">Credit Card Type:
                    </td>
<td>
    <spring:bind path="user.creditCardType">
          
    <select name="<c:out value= "${status.expression}"/>">
<option value="<c:out value="${status.value}"/>">American Express</option>
<option value="<c:out value="${status.value}"/>">Diners Card</option>
<option value="<c:out value="${status.value}"/>">Discover Card</option>
<option value="<c:out value="${status.value}"/>  ">Master Card</option>
<option value="<c:out value="${status.value}"/>">VISA</option></select>
       </spring:bind></td>
</tr>
<tr>
<td></td>
<td align="right">Credit Card Number:
                    </td>
<td><spring:bind path="user.creditCardNumber">
        <input type="text" name="<c:out value= "${status.expression}"/>" value="<c:out value="${status.value}"/>"/> 
    </spring:bind></td>
</tr>
<tr>
<td></td>
<td align="right">Expiry Date:
                    </td>
<td>Month 
                      <select name="ExpiryMonth"><option value="01">01
                        </option>
<option value="02">02
                        </option>
<option value="03">03
                        </option>
<option value="04">04
                        </option>
<option value="05">05
                        </option>
<option value="06">06
                        </option>
<option value="07">07
                        </option>
<option value="08">08
                        </option>
<option value="09">09
                        </option>
<option value="10">10
                        </option>
<option value="11">11
                        </option>
<option value="12">12
                        </option></select>
                       Year 
                      <select name="ExpiryYear"><option value="2016">2016</option>
<option value="2017">2017</option>
<option value="2018">2018</option>
<option value="2019">2019</option>
<option value="2020">2020</option>
<option value="2021">2021</option>
<option value="2022">2022</option>
<option value="2023">2023</option>
<option value="2024">2024</option></select></td>
</tr>
<tr>
<td colspan="4">
<hr color="#6699FF" align="left" width="90%" size="0">
</td>
</tr>
<tr>
<td colspan="2"></td>
<td align="left"><input type="submit" value="Continue"></td>
</tr>
</table>
</td>
<td valign="top">
<table width="100%" border="0" cellpadding="0" cellspacing="0" align="center">
<tr>
<td class="StayInformationHeader">Hotel Information</td>
</tr>
<tr>
<td colspan="2" class="StayInformationDetails">Waring House Restaurant Inn &amp; Cookery<br>395 Sandy Hook Road<br>RR #8<br>Picton, ON<br>K0K 2T0<br>613-476-7492</td>
</tr>
<tr>
<td class="StayInformationDetails">
                       
                    </td>
</tr>
<tr>
<td rowspan="1" class="" align="center"><img width="100%" border="0" src="user_images/WH-Logo.jpg"></td>
</tr>
<tr>
<td colspan="1">
                       
                    </td>
</tr>
<tr>
<td colspan="1">
                       
                    </td>
</tr>
<tr>
<td colspan="1" class="FooterText">Please add 13% HST to all posted rates.</td>
</tr>
<tr>
<td colspan="1" class="FooterText"></td>
</tr>
</table>
</td>
</tr>
</table>
</form>
</body>
</html>
