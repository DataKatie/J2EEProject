/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

//import Model.Lists;
//import Model.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

//import javax.enterprise.inject.Model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author Julia
 */
@Controller  
@RequestMapping("/first.htm") 
public class Initial {
    @RequestMapping(method = RequestMethod.GET)
   public String root(ModelMap model){
      //model.addAttribute("student", new Student()); 
     // model.addAttribute("lists", Lists.getList());
     return "index";
   }
 
  

}
