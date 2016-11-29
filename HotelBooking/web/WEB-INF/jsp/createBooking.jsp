<%-- 
    Document   : createBooking
    Created on : 17-Nov-2016, 5:23:39 PM
    Author     : Katie
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="5star.css" type="text/css">
       

        <title>Create Booking</title>
    </head>
    <body class="BodyBackground">
        <h1>Create a booking</h1>
        ${errorMessage}
        ${errorMsg}
        ${user.firstName}
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
<td class="FunctionButtons" id="ButtonReservation"><a href="Availability_Inq.asp"><img width="140" height="23" border="0" src="images/ReservationButton_On.gif"></a><a href="Change_Inq.asp"><img width="140" height="23" border="0" src="images/ChangeButton_Off.gif"></a><a href="Cancellation_Inq.asp"><img width="140" height="23" border="0" src="images/CancelButton_Off.gif"></a></td>
</tr>

<form:form name="LoginForm" method="post" action="http://localhost:8080/HotelBooking/populateUser.htm" modelAttribute="user">
<tr>
<td class="SignInSectionHeader" colspan="3">Sign in to access your stay's name and address information.</td>
</tr>
<tr>
<td colspan="1" class="SignInSectionDetails" align="left">Email: <form:input  path="email" id="emailInput"></form:input>  
                        PIN: <form:input  path="pin" id="pinNameInput" ></form:input>
                        <input type="submit" class="SelectButton" name="ButtonSubmit" Value="Sign In" onClick=""></td>
</tr>
<tr>
<td colspan="2">
<hr color="#6699FF" size="1">
</td>
</tr>
</form:form>
<tr>
<td class="HeaderText1">Please enter your information, read the Reservation Policy, click Agree then click on Submit Reservation to continue. </td>
</tr>
<tr>
<td colspan="2">
<hr color="#6699FF" size="1">
</td>
</tr>
</table>
<form:form name="thisForm" method="post" action="http://localhost:8080/HotelBooking/addbooking.htm" modelAttribute="user">
<table width="100%" border="0" cellpadding="0" cellspacing="1">
<tr>
<td width="25%"></td>
<td width="10%"></td>
<td width="60%"></td>
<td width="5%"></td>
</tr>
<tr>
<td align="right">Last Name
                      :
                    </td>
<td colspan="2">
     <form:input  path="lastName" id="lastNameInput"></form:input>
           
    <form:errors class="error" path="lastName"></form:errors>
    <!--<input type="text" name="LastName" size="20" maxlength="20" value=""> --></td>
</tr>
<tr>
<td align="right">First Name
                      :
                    </td>
<td colspan="2"><form:input  path="firstName" id="firstNameInput"></form:input>
           
    <form:errors class="error" path="firstName"></form:errors></td>
</tr>
<tr>
<td align="right">Street#/Name/Apt#
                      :
                    </td>
<td colspan="2"><form:input  path="address" id="addressInput"></form:input>
           
    <form:errors class="error" path="address"></form:errors></td>
</tr>
<tr>
<td align="right">City, Prov/State
                      :
                    </td>
<td colspan="2"><form:input  path="city" id="cityInput"></form:input>
           
    <form:errors class="error" path="city"></form:errors></td>
</tr>
<tr>
<td align="right">Country
                      :
                    </td>
<td colspan="2"><form:input  path="country" id="countryInput"></form:input>
           
    <form:errors class="error" path="country"></form:errors></td>
</tr>
<tr>
<td align="right">Postal / Zip
                      :
                    </td>
<td colspan="2"><form:input  path="postalCode" id="postalCodeInput"></form:input>
           
    <form:errors class="error" path="postalCode"></form:errors></td>
</tr>
<tr>
<td align="right">Phone Number
                      :
                    </td>
<td colspan="2"><form:input  path="phoneNumber" id="phoneNumber"></form:input>
           
    <form:errors class="error" path="phoneNumber"></form:errors></td>
</tr>
<tr>
<td align="right">Email Address
                      :
                    </td>
<td colspan="2"><form:input  path="email" id="emailInput"></form:input>
           
    <form:errors class="error" path="email"></form:errors></td>
</tr>
<tr>
<td align="right">PIN
                      :
                    </td>
<td><form:input  path="pin" id="pinInput"></form:input>
           
    <form:errors class="error" path="pin"></form:errors></td>
<td>Optional: Fill in PIN number only if you want to be remembered for the next time you book on-line with us.</td>
</tr>
<tr>
<td align="right">Credit Card Type
                      :
                    </td>
                    <td colspan="2"><form:select path="creditCardType">
<form:option value="American Express">American Express</form:option>
<form:option value="Diners Card">Diners Card</form:option>
<form:option value="Discover Card">Discover Card</form:option>
<form:option value="Master Card">Master Card</form:option>
<form:option value="Visa">VISA</form:option>
    </form:select>
 <form:errors class="error" path="creditCardType"></form:errors></td>
</tr>
<tr>
<td align="right">Credit Card Number
                      :
                    </td>
<td colspan="2"><form:input  path="creditCardNumber" id="creditCardNumberInput"></form:input>
           
    <form:errors class="error" path="creditCardNumber"></form:errors></td>
</tr>
<tr>
<td align="right">CVV Code
                      :
                    </td>
<td><form:input  path="cvv" id="cvvInput"></form:input>
           
    <form:errors class="error" path="cvv"></form:errors></td>
<td><a href="https://www.cvvnumber.com/cvv.html" target="_blank" style="font-size:11px">What is my CVV Code?</a></td>
</tr>
<tr>
<td align="right">Expiry Date
                      :
                    </td>
<td colspan="2">Month  
                      <form:select path="expMonth"><form:option value="01">
                          01
                        </form:option>
<form:option value="02">
                          02
                        </form:option>
<form:option value="03">
                          03
                        </form:option>
<form:option value="04">
                          04
                        </form:option>
<form:option value="05">
                          05
                        </form:option>
<form:option value="06">
                          06
                        </form:option>
<form:option value="07">
                          07
                        </form:option>
<form:option value="08">
                          08
                        </form:option>
<form:option value="09">
                          09
                        </form:option>
<form:option value="10">
                          10
                        </form:option>
<form:option value="11">
                          11
                        </form:option>
<form:option value="12">
                          12
                        </form:option></form:select>
                          <form:errors class="error" path="expMonth"></form:errors>
                       Year  
                      <form:select path="expYear">
<form:option value="2016">2016</form:option>
<form:option value="2017">2017</form:option>
<form:option value="2018">2018</form:option>
<form:option value="2019">2019</form:option>
<form:option value="2020">2020</form:option>
<form:option value="2021">2021</form:option>
<form:option value="2022">2022</form:option>
<form:option value="2023">2023</form:option>
<form:option value="2024">2024</form:option></form:select>
    <form:errors class="error" path="expYear"></form:errors></td>
</tr>

<tr>
<td align="right">Notify Me About Special Offers</td>
<td><form:checkbox path="notification"></form:checkbox></td>
</tr>
<tr>
<td align="center" colspan="3">
</td>
</tr>
<tr>
<td colspan="3">
<table width="100%" border="0" cellpadding="0">
<tr>
<td>
                             
                          </td>
</tr>
<tr>
<td width="100%" align="center">Special Requests: Please note that requests may not be read by the property until the day of the arrival. </td>
</tr>
<tr>
<td align="center"><form:textarea class="table" path="requests" cols="66" rows="5"></form:textarea></td>
</tr>
</table>
</td>
</tr>
<tr>
<td colspan="3">
<table width="100%" border="0" cellpadding="0" cellspacing="5" frame="none" rules="none">
<tr>
<td width="80%" align="center" valign="top">Reservation Policy</td>
</tr>
<tr>
<td width="80%" align="center"><textarea class="BodyText" cols="105" rows="10" readonly="1">During high season (mid May until the end of October) guests arriving on a Friday or Saturday are required to book for a minimum of 2 nights. On long weekends during high season, weekend rates apply to all nights.

If a reservation is cancelled more than 72 hours prior to expected arrival, no charge will be made to the guest. If a reservation is cancelled with less than 72 hours notice, the guest is charged the price of a 1 night stay.

The Waring House is pleased to offer a smoke-free environment. Please refrain from smoking in your room. If evidence of smoking is found, a $250 charge is applied to the guest’s credit card to offset the cost of carpet and drape cleaning.

To protect against fire, no candles or open flame are allowed in any guest room.

Front Desk of Waring House is not wheelchair accessible. Please advise at time of reservation and an alternate arrangement will be made for staff to meet you at your vehicle for the check in /check out procedure or thi</textarea></td>
</tr>
</table>
<table width="100%" border="0" cellpadding="0" cellspacing="10">
<tr>
<td width="100%" align="center"><input type="radio" name="Policy" value="agree">I Agree</td>
</tr>
</table>
</td>
</tr>
<tr>
<td colspan="4">
<hr color="#6699FF" size="1">
</td>
</tr>
<tr>
<td colspan="4">
<table width="100%" border="0" cellpadding="0" cellspacing="0">
<tr>
<td width="50%" align="right"><input type="submit" name="ButtonSubmit" value="Submit Reservation" onClick="return PolicyCheck()"></td>
<td width="50%" align="left"><input type="reset" value="Reset"></td>
</tr>
</table>
</td>
</tr>
</table>
    <form:hidden path="id"></form:hidden>
</form:form>
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
<td class="StayInformationHeader">Stay Information:</td>
</tr>
<tr>
<td colspan="2" class="StayInformationDetails">Check-InFri Nov 25, 2016<br>Check-OutSat Nov 26, 2016<br>Nights: 1<br>Rooms: 1<br>Adults: 2<br>Type Of Room: DELUXE ROOM, QUEEN BED<br>Type Of Rate: Room Rate<br>Avg. Nightly Rate plus Taxes:  169.00 <br>Total Cost Before Taxes:    169.00<br>Taxes:     21.97<br>Grand Total incl Taxes:    190.97<br></td>
</tr>
<tr>
<td class="StayInformationDetails" align="left"><a href="javascript:history.back()">Edit</a></td>
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
</body>

</html>
