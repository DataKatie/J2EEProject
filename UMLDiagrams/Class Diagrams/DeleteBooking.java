/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Database;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Katie
 */
public class DeleteBooking {
    
    private Database db = Database.getInstance();
    
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView processDeleteRequest(HttpServletRequest request, HttpServletResponse response){
        //check the datebase
        //ask the user if their sure
        //delete the booking
        return new ModelAndView();
    }
}
