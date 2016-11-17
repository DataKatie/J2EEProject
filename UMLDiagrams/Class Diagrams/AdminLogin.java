/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Database;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Katie
 */
public class AdminLogin {
    
    private Database db = Database.getInstance();
    
     @RequestMapping(method=RequestMethod.POST)
    public ModelAndView processAdminLoginRequest(HttpServletRequest request, HttpServletResponse response){
       //validate the admin from the database
        //create a session
        //return a view with and admin object
        return new ModelAndView();
    }
}
