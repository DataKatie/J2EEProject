<%-- 
    Document   : thankYou
    Created on : 27-Nov-2016, 7:19:52 PM
    Author     : Katie
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thank You</title>
    </head>
    <body>
        <h1>Thank you for your booking</h1>
        <p>
        Your credit card has been successfully charged! </br>
        Please print this page for your reference </br>
        <h4> Important: Write down your reservation Id, as you will need this to update or 
        cancel your online reservation</h4>
        Reservation Id: ${resId} </br>
        Name: ${user.firstName} ${user.lastName} </br>
        Check In: ${booking.checkIn} </br>
        Check Out: ${booking.checkOut} </br>
        Number of Adults: ${booking.noAdults} </br>
        Number of Children:${booking.noChildren} </br>
        Number of Rooms: ${booking.noRooms} </br> 
        Total Amount Charged to Your Card: ${booking.priceTotal}
        </p>
    </body>
</html>
