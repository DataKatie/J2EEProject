/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Katie
 */
public class AdminSearch {
     @RequestMapping(method=RequestMethod.POST)
    public ModelAndView processSearchRequest(HttpServletRequest request, HttpServletResponse response){
        //implement this later
        return new ModelAndView();
    }
}
