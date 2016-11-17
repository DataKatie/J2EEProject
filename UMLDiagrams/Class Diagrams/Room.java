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
    private int RoomId;

    private String RoomType;
    private double basePrice;
    private String description;
     private String image;    

     
      public int getRoomId() {
        return RoomId;
    }

    public void setRoomId(int RoomId) {
        this.RoomId = RoomId;
    } 
    public String getRoomType() {
        return RoomType;
    }

    public void setRoomType(String RoomType) {
        this.RoomType = RoomType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
      
    public double getBasePrice() {
       
        
                
       
        return basePrice;
    }
    
   public double calculateRoomRate(Date checkin, Date checkout){
       //Needs to be implemented
       return 0;
   } 
}
