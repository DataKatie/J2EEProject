/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Database;
import Model.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.jdbc.core.JdbcTemplate;
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

public class AddBooking {
    
    private Database db = Database.getInstance();
    
   @RequestMapping(value="/populateuser", method=RequestMethod.POST)
    public ModelAndView populateForm(HttpServletRequest request, HttpServletResponse response, ModelMap model){
        //retrieve the user from the database, and populate the form
        return new ModelAndView();
    }
}
    
    @RequestMapping(value="/addbooking", method=RequestMethod.POST)
   
    public ModelAndView processBookingRequest(@Valid User user,Binding Result bindingResult, ModelMap modelMap){
        //validate the userinfo and add the booking to the database
        //charge the user's credit card number
        //create a success message telling the user what they registered and what they were charged
        return new ModelAndView();
    }

   
}
