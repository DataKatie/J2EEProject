/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Date;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 *
 * @author Katie
 */
public class Database {
 private JdbcTemplate jdbcTemplate;
 DataSource datasource;
 
 public static ArrayList<Booking> getBookings(){
   ArrayList<Booking> mylist = new ArrayList<Booking>();
     return mylist;
 }

 private Database(){
 }
 
 public static Database getInstance(){
 //THIS IS NOT THE CORRECT IMPLEMENTATION!!!!! MAKE INTO A SINGLETON
     return new Database();
 }
 
  public static int findBooking(String email){
     return 0;
 }
  
 
  public static int findBooking(int phone, String name){
     return 0;
 }
 
 public static boolean updateBooking(int reservationId){
     
 return true;
 }
 

 
 public static boolean createBooking(Booking booking){
 return true;
 }
 
 public static boolean deleteBooking(int reservationId){
 return true;
 }
 
 public static boolean validateAdmin(String username, String password){
     return true;
 }
 
 public static int numberOfRooms(String roomType,String hotel, Date checkin, Date checkout){
     return 0;
 }
 
 
 
 
 
}
