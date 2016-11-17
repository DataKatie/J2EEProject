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
public class Hotel {
     private int hotelID;        
    private String hotelName;    
    private int totalRooms;   
    private int standard;     
    private int deluxe;        
    private int superior;   
     private int premium;        
    private int suiteHot;    
    private int vineyard;   

    public int getHotelID() {
        return hotelID;
    }

    public void setHotelID(int hotelID) {
        this.hotelID = hotelID;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public int getTotalRooms() {
        return totalRooms;
    }

    public void setTotalRooms(int totalRooms) {
        this.totalRooms = totalRooms;
    }

    public int getStandard() {
        return standard;
    }

    public void setStandard(int standard) {
        this.standard = standard;
    }

    public int getDeluxe() {
        return deluxe;
    }

    public void setDeluxe(int deluxe) {
        this.deluxe = deluxe;
    }

    public int getSuperior() {
        return superior;
    }

    public void setSuperior(int superior) {
        this.superior = superior;
    }

    public int getPremium() {
        return premium;
    }

    public void setPremium(int premium) {
        this.premium = premium;
    }

    public int getSuiteHot() {
        return suiteHot;
    }

    public void setSuiteHot(int suiteHot) {
        this.suiteHot = suiteHot;
    }

    public int getVineyard() {
        return vineyard;
    }

    public void setVineyard(int vineyard) {
        this.vineyard = vineyard;
    }
   
   
}
