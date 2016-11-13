/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

/**
 *
 * @author Katie
 */
public class Booking {
long reservationId;
long guestId;
int numberOfAdults;
int numberOfChildren;
int numberOfRooms;
String promotion;
Date checkin;
Date checkout;
long hotelId;
String RoomType ;
double pricepernight;
double pricetotal;
String dinnerReservations;
String specialRequests;

    public long getReservationId() {
        return reservationId;
    }

    public void setReservationId(long reservationId) {
        this.reservationId = reservationId;
    }

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
    }

    public int getNumberOfAdults() {
        return numberOfAdults;
    }

    public void setNumberOfAdults(int numberOfAdults) {
        this.numberOfAdults = numberOfAdults;
    }

    public int getNumberOfChildren() {
        return numberOfChildren;
    }

    public void setNumberOfChildren(int numberOfChildren) {
        this.numberOfChildren = numberOfChildren;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = checkin;
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = checkout;
    }

    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String RoomType) {
        this.RoomType = RoomType;
    }

    public double getPricepernight() {
        if (RoomType.equals("Standard"))
                this.pricepernight = 127;
        else if (RoomType.equals("Deluxe"))
                this.pricepernight = 157;
        else if (RoomType.equals("Superior"))
                this.pricepernight = 187;
        else if (RoomType.equals("Premium"))
                this.pricepernight = 197;
        else if (RoomType.equals("Suite") || RoomType.equals("Hot Tub Premimum"))
                this.pricepernight = 267;
        else if (RoomType.equals("Vineyard View Cottage"))
                this.pricepernight = 287;
        
                
       
        return pricepernight;
    }

   
    public double getPricetotal() {
        
        //Code in here to take the dates and add extra for weekend days/summer season and subtract for promotions
        //Code to add up all dates and multiply by number of rooms 
        
        return pricetotal;
    }

  

    public String getDinnerReservations() {
        return dinnerReservations;
    }

    public void setDinnerReservations(String dinnerReservations) {
        this.dinnerReservations = dinnerReservations;
    }

    public String getSpecialRequests() {
        return specialRequests;
    }

    public void setSpecialRequests(String specialRequests) {
        this.specialRequests = specialRequests;
    }


}
