/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Booking;
import Model.Database;
import Model.Room;
import Model.User;
import java.sql.Date;
import java.util.Calendar;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Katie
 */


@Controller
@RequestMapping(value="/addbooking")
public class AddBooking {

   // @Autowired
//private WebApplicationContext context;  

    Database db = new Database();
  
    
     
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView showForm(@ModelAttribute User user, HttpServletRequest request, HttpServletResponse response, ModelMap model){
        //retrieve the user from the database, and populate the form
        //create a session variable for the user
       if(user == null)
        model.addAttribute("user", new User());
       else 
           model.addAttribute ( user);
        return new ModelAndView("createBooking");
        
    }
    
   /*@RequestMapping(value="/populateuser", method=RequestMethod.POST)
    public ModelAndView populateForm(@ModelAttribute User user, HttpServletRequest request, HttpServletResponse response, ModelMap model){
        DataSource ds = (DataSource)context.getBean("dataSource");
        db.setDataSource(ds);
        String userEmail = user.getEmail();
        String userPin = user.getPin();
        User populatedUser = db.retrieveUser(userPin, userEmail);
        String error = "";
        //retrieve the user from the database, and populate the form
        //create a session variable for the user
       if(populatedUser == null){
           error = "Pin and email combination was not located in the database. Please try again.";
           
       }
        model.addAttribute(error);
        model.addAttribute(populatedUser);
        return new ModelAndView("createBooking");
        
    } */
        
    @Autowired
    private WebApplicationContext context;
    
    @RequestMapping( method=RequestMethod.POST)
       public ModelAndView processBookingRequest(@Valid @ModelAttribute User user,BindingResult bindingResult, HttpServletRequest request, HttpServletResponse response, ModelMap map){
           boolean noUser = false;
           DataSource ds = (DataSource)context.getBean("dataSource");
           db.setDataSource(ds);
           
           HttpSession session = request.getSession(true);
            Booking booking = (Booking)session.getAttribute("booking");
            //delete this later
            if (booking == null){
                booking = new Booking();
                Calendar cal = Calendar.getInstance();
                Date date = new Date(cal.getTimeInMillis());
                booking.setCheckin(date);
                booking.setCheckout(date);
                booking.setHotelId(1234);
                booking.setNumberOfAdults(2);
                booking.setNumberOfChildren(0);
                booking.setNumberOfRooms(1);
                Room room = new Room();
                room.setRoomId(1);
                booking.setRoomType(room);
            }
            
           /*else{
                Long guestId = Long.parseLong((session.getAttribute("guestId").toString()));
                booking.setGuestId(guestId);
                user.setId(guestId);
            } */
            
        //validate the userinfo and add the booking to the database
        //charge the user's credit card number
        //create a success message telling the user what they registered and what they were charged
         if (bindingResult.hasErrors()) {
             map.addAttribute("errorMessage", "Registration errors. Please try again");
            return new ModelAndView("createBooking");
        }
         else{
        map.addAttribute(booking);
        map.addAttribute(user);
        if(user.getId()==0){
                noUser = true;
                Long guestId = new Random().nextLong();
                user.setId(guestId);
                booking.setGuestId(guestId);
            }
        else {
            booking.setGuestId(user.getId());
        }
        booking.setSpecialRequests(user.getRequests());
        if (noUser){
        db.addUser(user);
        }
        db.createBooking(booking);
        
         }
        return new ModelAndView("thankYou"); 
    }

   
}
