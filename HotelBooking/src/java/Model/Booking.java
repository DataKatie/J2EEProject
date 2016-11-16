/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;
import javax.validation.constraints.Min;
import javax.validation.constraints.Future;
/**
 *
 * @author Katie
 */
public class Booking {
long reservationId;
long guestId;

@Min(value = 1, message = "At least one adult must be included in the booking")
int numberOfAdults;

int numberOfChildren;

int numberOfRooms;
String promotion;

@Future (message = "Reservation date must be in the future")
Date checkin;

@Future (message = "Reservation date must be in the future")
Date checkout;
long hotelId;

private Room room;

double pricetotal;

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

    public Room getRoom() {
        return room;
    }

    public void setRoomType(Room room) {
        this.room = room;
    }

    

   
    public double getPricetotal() {
        
        //Code in here to take the dates and add extra for weekend days/summer season and subtract for promotions
        //Code to add up all dates and multiply by number of rooms 
        
        return pricetotal;
    }

  

 

    public String getSpecialRequests() {
        return specialRequests;
    }

    public void setSpecialRequests(String specialRequests) {
        this.specialRequests = specialRequests;
    }


}
