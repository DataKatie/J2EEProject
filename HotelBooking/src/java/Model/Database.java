/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.context.WebApplicationContext;

/**
 *
 * @author Katie
 */
public class Database {

  
    
 private JdbcTemplate jdbcTemplate;
 DataSource dataSource;
 
    public void setDataSource(DataSource dataSource) {
         
       
      this.dataSource = dataSource;
      this.jdbcTemplate = new JdbcTemplate(dataSource);
   }
    

 public static ArrayList<Booking> getBookings(){
   ArrayList<Booking> mylist = new ArrayList<Booking>();
     return mylist;
 }

 public Database(){
 
 }

 @Autowired
private WebApplicationContext context;
 
 public void initialize(){
     
  DataSource mydatasource =(DataSource) context.getBean("dataSource");
  this.jdbcTemplate = new JdbcTemplate(mydatasource);
  
 }
 
 public String getUserFirstName(){ 
     String firstName;   
     if(jdbcTemplate == null)
                firstName = "this failed horribly";
     else{
        firstName = jdbcTemplate.queryForObject(
        "select first_name from user where user_id = ?",
        new Object[]{1}, String.class);
          
          }
        return firstName;
        
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
 

 
 public  boolean createBooking(Booking booking){
  
     Timestamp checkIn = new Timestamp(booking.getCheckin().getTime());
     Timestamp checkout = new Timestamp(booking.getCheckout().getTime());
     
     String query = "insert into booking (GuestId, hotelId, NoAdults, NoChildren, NoRooms, Promotion, CheckIn, CheckOut, roomTypeId, PriceTotal, SpecialRequests) "
         + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
     Object[] params={
        booking.getGuestId(), 
        booking.getHotelId(),
        booking.getNumberOfAdults(),
        booking.getNumberOfChildren(), 
         booking.getNumberOfRooms(),booking.getPromotion(),
         checkIn,
         checkout,
         booking.getRoom().getRoomId(),
         booking.getPricetotal(),
         booking.getSpecialRequests()
        };
     /*
 int updated = jdbcTemplate.update("insert into booking (GuestId, hotelId, NoAdults, NoChildren, NoRooms, Promotion, CheckIn, CheckOut, roomTypeId, PriceTotal, SpecialRequests) "
         + "values ("+ booking.getGuestId() +","+ booking.getHotelId() +","+booking.getNumberOfAdults() +","+ booking.getNumberOfChildren() +","+
         booking.getNumberOfRooms() +","+booking.getPromotion() +","+checkIn +","+checkout +","+ booking.getRoom().getRoomId() +","+
         booking.getPricetotal() +","+ '"'+booking.getSpecialRequests() + "\")");*/
 int updated = jdbcTemplate.update(query, params);    
 if (updated == 1)
     return true;
 else
    return false;    
 }
 
 
  public  boolean addUser(User user){
      int notifications = user.getNotification()? 1 : 0;
 int updated = jdbcTemplate.update("insert into user (user_id, last_name, first_name, address, city, country, postal, phone_number, email_address, pin, "
         + "credit_card_type, credit_card_number, cvv_code, exp_month, exp_year,offers_notification) "
         + "values ( \""+ user.getId() +"\",\""+ user.getLastName() +"\",\""+user.getFirstName() +"\",\""+ user.getAddress() +"\",\""+
         user.getCity() +"\",\"" + user.getCountry() +"\",\""+ user.getPostalCode() +"\",\""+user.getPhoneNumber() +"\",\""+ user.getEmail()+"\",\""+
         user.getPin() + "\",\""+ user.getCreditCardType() +"\",\""+ user.getCreditCardNumber() + "\",\"" + user.getCvv()+ "\",\"" +
         user.getExpMonth() + "\",\"" + user.getExpYear() + "\"," + notifications +")");
 if (updated == 1)
     return true;
 else
    return false;    
 }
 
 /* public int UserExists(long id){
 int rows = this.jdbcTemplate.queryForObject("select count(*) from user where user_id = ?", new Object[]{id}, Integer.class);
  
  return rows;
  
  }*/
  
 public User retrieveUser(String pin, String email){
    User myUser;
    try{
     myUser = this.jdbcTemplate.queryForObject(
        "select user_id, last_name, first_name, address, city, country, postal, phone_number, email_address, pin, "
         + "credit_card_type, credit_card_number, cvv_code, exp_month, exp_year,offers_notification from user where pin = ? and email_address = ?",
        new Object[]{pin, email},
        new RowMapper<User>() {
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getLong("user_id"));
                user.setFirstName(rs.getString("first_name"));
                user.setLastName(rs.getString("last_name"));
                user.setAddress(rs.getString("address"));
                user.setCity(rs.getString("city"));
                user.setCountry(rs.getString("country"));
                user.setPostalCode(rs.getString("postal"));
                user.setPhoneNumber(rs.getString("phone_number"));
                user.setEmail(rs.getString("email_address"));
                user.setPin(rs.getString("pin"));
                user.setCreditCardType(rs.getString("credit_card_type"));
                user.setCreditCardNumber(rs.getInt("credit_card_number"));
                user.setCvv(rs.getInt("cvv_code"));
                user.setExpMonth(rs.getString("exp_month"));
                user.setExpYear(rs.getInt("exp_year"));
                user.setNotification(rs.getBoolean("offers_notification"));
               
                return user;
            }
        });
     
    }
    catch (Exception e){
    myUser = new User();
    }
    
    return myUser;
 } 
 
 public static boolean deleteBooking(int reservationId){
 return true;
 }
 
 public static boolean validateAdmin(String username, String password){
     return true;
 }
 
 public int numberOfRooms(String roomType,String hotel, Date checkinDate, Date checkoutDate){
     return 0;
 }
 
 
 
 
 
}
