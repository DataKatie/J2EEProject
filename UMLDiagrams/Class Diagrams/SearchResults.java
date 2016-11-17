/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Katie
 */
public class SearchResults {
     @RequestMapping(method=RequestMethod.POST)
    public ModelAndView processSearchResultRequest(HttpServletRequest requeset, HttpServletResponse response, ModelMap modelMap){
        //Display the list generated in the search.java
    //Post the room that the user picks to the addBooking controller
        return new ModelAndView();
    }
    
}
