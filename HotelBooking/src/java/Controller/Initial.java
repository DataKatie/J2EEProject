/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

//import Model.Lists;
//import Model.Student;
import Model.Database;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


//import javax.enterprise.inject.Model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author Julia
 */


@Controller  
@RequestMapping("/first.htm") 
public class Initial {

@Autowired
private WebApplicationContext context;    


    
    
    User user = new User();
    String errorLog = "";
    @RequestMapping(method = RequestMethod.GET)
   public String root(ModelMap model){
      model.addAttribute("user", new User()); 
     // model.addAttribute("lists", Lists.getList());
    Database database = new Database(); 
    try{
        
    DataSource ds =(DataSource) context.getBean("dataSource");
    database.setDataSource(ds); 
    
       }
     
     catch (Exception e){
         errorLog = e.toString();
     }
    //if(database.getUserFirstName() == null)
    user.setFirstName("this has failed horribly");
    //else
     //user.setFirstName(database.getUserFirstName());
     
    model.addAttribute("firstName", user.getFirstName());
    model.addAttribute("test", errorLog);
     return "index";
     
   }
 
  

}
