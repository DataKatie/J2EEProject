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
import org.springframework.beans.propertyeditors.CustomNumberEditor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
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
@RequestMapping(value="/editBooking")
public class EditController {

   // @Autowired
//private WebApplicationContext context;  

    Database db = new Database();
  
 
    
     
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView showForm(@ModelAttribute User user, @ModelAttribute Booking booking,  HttpServletRequest request, HttpServletResponse response, ModelMap model){
        //retrieve the user from the database, and populate the form
        //create a session variable for the user
       if(user == null)
        model.addAttribute("user", new User());
       if(booking == null){
           booking = new Booking();
          
        model.addAttribute("booking", booking);
       }
       else {
           
          
            model.addAttribute (user);
            model.addAttribute (booking);
       }
      
        return new ModelAndView("editBooking");
        
    }
    
  
        
    @Autowired
    private WebApplicationContext context;
    
    @RequestMapping( method=RequestMethod.POST)
       public ModelAndView processBookingRequest(@ModelAttribute Booking booking, BindingResult resultBooking, @ModelAttribute User user,BindingResult resultUser, HttpServletRequest request, HttpServletResponse response, ModelMap map){
          String errorMsg = "";
           map.addAttribute(user);
           map.addAttribute(booking);
           DataSource ds = (DataSource)context.getBean("dataSource");
           db.setDataSource(ds);
           Booking retrievedBooking = db.retrieveBookingForUpdate(booking.getReservationId(), user.getCreditCardNumber());
           if(retrievedBooking.getReservationId() == 0)
                errorMsg = "No booking matching your information was found in the database. Please try again, or call us.";
           
          else 
            map.addAttribute(retrievedBooking);
           map.addAttribute("errorMsg", errorMsg);
          
         if(resultBooking.hasErrors()|| resultUser.hasErrors()|| retrievedBooking.getReservationId() == 0 ){
             return new ModelAndView("editBooking");
         }  
         else{
        return new ModelAndView("thankYou"); 
         }
    }

   
}
