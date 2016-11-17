/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Database;
import Model.Room;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Katie
 */
@Controller
@RequestMapping("/submitCheck.htm")
public class Search {
    
    
    
   
    private ArrayList<Room> roomList;
    private Database db = Database.getInstance();
    /*none of these methods are implemented*/
    
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView processSearchRequest(@Valid Booking booking,Binding Result bindingResult, ModelMap modelMap){
        //pass the list to the searchResults controller
        return new ModelAndView();
    }
    
    
    private int availableRooomType(String roomType, Date checkin, Date checkout ){
        //search in the booking table by date
        //count how many rooms of the type are taken each night
        //find how many rooms of this type are in the hotel
        //subtract the number of rooms in use from the number of rooms in the hotel
        //Do this calculation in a loop for each date in the range and return the lowest number
        return 0;
    }
    
   
    
    private boolean isEnoughSpace(String roomType, int roomsRequested){
     //for specified room type subtract the number of available rooms from the number of rooms requested
     //return true if this calculation is greater than 0, else
        return false;
    }
    
    private ArrayList<Room> availableRoomList(){
       //for each room type find isEnoughspace and if true, add a room object of that type to the list
    return roomList;
    }
}
