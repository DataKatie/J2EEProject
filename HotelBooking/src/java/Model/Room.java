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
public class Room {
    private String RoomType;
    private double basePrice;
    private String description;
    private String image;       
    public double getBasePrice() {
        if (RoomType.equals("Standard"))
                this.basePrice = 127;
        else if (RoomType.equals("Deluxe"))
                this.basePrice = 157;
        else if (RoomType.equals("Superior"))
                this.basePrice = 187;
        else if (RoomType.equals("Premium"))
                this.basePrice = 197;
        else if (RoomType.equals("Suite") || RoomType.equals("Hot Tub Premimum"))
                this.basePrice = 267;
        else if (RoomType.equals("Vineyard View Cottage"))
                this.basePrice = 287;
        
                
       
        return basePrice;
    }
    
   public double calculateRoomRate(Date checkin, Date checkout){
       //Needs to be implemented
       return 0;
   } 
}
