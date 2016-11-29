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
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
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
@RequestMapping(value="/populateUser")
public class PopulateUser {
    
    @Autowired
    private WebApplicationContext context;
    
@RequestMapping(method=RequestMethod.POST)
    public ModelAndView populateForm(@ModelAttribute User user, HttpServletRequest request, HttpServletResponse response, ModelMap model){
        Database db = new Database();
        DataSource ds = (DataSource)context.getBean("dataSource");
        db.setDataSource(ds);
        String userEmail = user.getEmail();
        String userPin = user.getPin();
        
        
        user = db.retrieveUser(userPin, userEmail);
       
        String firstName = user.getFirstName();
        String errorMsg = "";
        //retrieve the user from the database, and populate the form
        //create a session variable for the user
       if(firstName == null|| firstName.equals("")){
           errorMsg = "Pin and email combination was not located in the database. Please try again.";
           
       }
       else 
           errorMsg = "success!";
   //HttpSession session = request.getSession(true);
   //session.setAttribute("guestId", user.getId());
        model.addAttribute("errorMsg", errorMsg);
        model.addAttribute(user);
        return new ModelAndView("createBooking");
        
    } 
    
   
    
}
