/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Booking;
import Model.Database;
import javax.validation.Valid;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Katie
 */
public class ModifyBooking {
    
    private Database db = Database.getInstance();
    
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView processModifyRequest(@Valid Booking booking, BindingResult  bindingResult, ModelMap modelMap){
        //call method to find the booking
        //update the form fields
        //search for availability 
        //make a new booking and delete the old one????
        return new ModelAndView();
    }
}
