/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Katie
 */
public class Room {
    private String RoomType;
    private double price;
    public double getPrice() {
        if (RoomType.equals("Standard"))
                this.price = 127;
        else if (RoomType.equals("Deluxe"))
                this.price = 157;
        else if (RoomType.equals("Superior"))
                this.price = 187;
        else if (RoomType.equals("Premium"))
                this.price = 197;
        else if (RoomType.equals("Suite") || RoomType.equals("Hot Tub Premimum"))
                this.price = 267;
        else if (RoomType.equals("Vineyard View Cottage"))
                this.price = 287;
        
                
       
        return price;
    }
}
