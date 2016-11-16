/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Room;
import java.util.ArrayList;
import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Katie
 */
@Controller
@RequestMapping("/submitCheck.htm")
public class Search {
    
    private Date checkin;
    private Date checkout;
    private int NumberOfRooms;
    private String hotel;
    private ArrayList<Room> roomList;
    /*none of these methods are implemented*/
    
    @RequestMapping(method=RequestMethod.POST)
    public String searchRooms(){

        return "implement me";
    }
    
    public int availableRooomType(String roomType){
            return 0;
    }
    
   
    
    public boolean isEnoughSpace(String roomType){
     return false;
    }
    
    public ArrayList<Room> availableRoomList(){
    
    return roomList;
    }
}
