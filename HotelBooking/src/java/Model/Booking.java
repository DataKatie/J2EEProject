/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Date;
import java.util.concurrent.TimeUnit;
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
int noAdults;

int noChildren;

int noRooms;
String promotion;

@Future (message = "Reservation date must be in the future")
Date checkIn;

@Future (message = "Reservation date must be in the future")
Date checkOut;
int hotelId;

int roomId;

String roomType;

double pricePerNight;

double priceTotal;

String specialRequests;

private Room room;

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

    public int getNoAdults() {
        return noAdults;
    }

    public void setNoAdults(int noAdults) {
        this.noAdults = noAdults;
    }

    public int getNoChildren() {
        return noChildren;
    }

    public void setNoChildren(int noChildren) {
        this.noChildren = noChildren;
    }

    public int getNoRooms() {
        return noRooms;
    }

    public void setNoRooms(int noRooms) {
        this.noRooms = noRooms;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public double getPriceTotal() {
        return priceTotal;
    }

    public void setPriceTotal(double priceTotal) {
        this.priceTotal = priceTotal;
    }

    public String getSpecialRequests() {
        return specialRequests;
    }

    public void setSpecialRequests(String specialRequests) {
        this.specialRequests = specialRequests;
    }



    public double getPricetotal() {
        
        //Code in here to take the dates and add extra for weekend days/summer season and subtract for promotions
        //Code to add up all dates and multiply by number of rooms 
        //this.priceTotal = room.calculateRoomRate(checkIn, checkOut);
        this.priceTotal = getDifferenceDays(checkIn, checkOut)*pricePerNight;
        return priceTotal;
    }
    
    public static long getDifferenceDays(Date d1, Date d2) {
    long diff = d2.getTime() - d1.getTime();
    return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
}

}
