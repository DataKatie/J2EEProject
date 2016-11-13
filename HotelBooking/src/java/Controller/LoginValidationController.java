/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

//import Model.Lists;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author Julia
 */
@Controller 
@RequestMapping("/loginValidation.htm")
public class LoginValidationController {
     @RequestMapping(method = RequestMethod.GET)
    public ModelAndView loginCheck(HttpServletRequest request,HttpServletResponse res, ModelMap m) {  
        
        String password=request.getParameter("password");  
          
        if(password.equals("pass")){  
        // m.addAttribute("students",Lists.getStudentList());
        return new ModelAndView("allStudents");  
        }  
        else{  
            m.addAttribute("errorMessage", "Access denied. You do not have permissions to view this information");
           
            return new ModelAndView("login");  
        }  
    }    
}
