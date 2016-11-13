/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

//import Model.Lists;
//import Model.Student;
import java.util.Map;
//import javax.enterprise.inject.Model;
import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author Julia
 */
@Controller
@RequestMapping("/submitCheck.htm")
public class SubmissionController {
    /* @RequestMapping(method=RequestMethod.POST)
   public String submitForm(@Valid Student student, BindingResult br, ModelMap m) {

      if(br.hasErrors()) {
        m.addAttribute("lists", Lists.getList());

           return "index";
        }
        else{ 
          Lists.getStudentList().add(student);
            m.addAttribute("student", student);
           
        return "info";
      }
    }
    */

}
