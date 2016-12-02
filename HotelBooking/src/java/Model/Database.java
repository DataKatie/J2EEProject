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
import java.util.List;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.web.context.WebApplicationContext;

/**
 *
 * @author Katie
 */
public class Database {

  
  public static ArrayList<Room> availableRooms = new ArrayList<Room>();   
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
 
/* public String getUserFirstName(){ 
     String firstName;   
     if(jdbcTemplate == null)
                firstName = "this failed horribly";
     else{
        firstName = jdbcTemplate.queryForObject(
        "select first_name from user where user_id = ?",
        new Object[]{1}, String.class);
          
          }
        return firstName;
        
             }*/
 public static Database getInstance(){
 //THIS IS NOT THE CORRECT IMPLEMENTATION!!!!! MAKE INTO A SINGLETON
     return new Database();
 }
 
public List<Booking> findBooking(long id){

    List<Booking> result = jdbcTemplate.query(
        "select * from Booking where ReservationId = ?",
        new Object[]{id},
        new BeanPropertyRowMapper(Booking.class));
    
    return result;
  }
  
 
  public List<Booking> findBooking(String phoneNumber) {
     Long id = jdbcTemplate.queryForObject("Select user_id from user where phone_number = ?", 
             new Object[]{phoneNumber}, Long.class);
     
     List<Booking> result = jdbcTemplate.query(
        "select * from Booking where GuestId = ?",
        new Object[]{id},
        new BeanPropertyRowMapper(Booking.class));
    
    return result;
  }
 
 public static boolean updateBooking(int reservationId){
     
 return true;
 }
 
 public Booking retrieveBookingForUpdate(long reservationId, String creditCardNumber){
 Booking myBooking;
    try{
     myBooking = this.jdbcTemplate.queryForObject(
        "select reservationId, guestId, NoAdults, NoChildren, NoRooms, Promotion, CheckIn, CheckOut, "
                + "hotelId, roomId, RoomType, PricePerNight, PriceTotal from booking "
                + "join user on (GuestId = user_id) where reservationId = ? and credit_card_number = ? ",
        new Object[]{reservationId,  creditCardNumber},
        new RowMapper<Booking>() {
            public Booking mapRow(ResultSet rs, int rowNum) throws SQLException {
                Booking booking = new Booking();
                booking.setReservationId(rs.getLong("reservationId"));
                booking.setGuestId(rs.getLong("guestId"));
                booking.setNoAdults(rs.getInt("NoAdults"));   
                booking.setNoChildren(rs.getInt("NoChildren"));
                booking.setNoRooms(rs.getInt("NoRooms"));
                booking.setPromotion(rs.getString("Promotion"));
                booking.setCheckIn(rs.getDate("CheckIn"));
                booking.setCheckOut(rs.getDate("CheckOut"));
                booking.setHotelId(rs.getInt("hotelId"));
                booking.setRoomId(rs.getInt("roomId"));
                booking.setRoomType(rs.getString("roomType"));
                booking.setPricePerNight(rs.getDouble("PricePerNight"));
                booking.setPriceTotal(rs.getDouble("PriceTotal"));
                                    
               
                return booking;
            }
            });
        
        }
     
    
   catch (Exception e){
    myBooking = new Booking();
    }
    
    return myBooking;
 }

 
 public  boolean createBooking(Booking booking){
  
     //Timestamp checkIn = new Timestamp(booking.getCheckin().getTime());
     //Timestamp checkout = new Timestamp(booking.getCheckout().getTime());
     
     String query = "insert into booking (GuestId, hotelId, NoAdults, NoChildren, NoRooms, Promotion, CheckIn, CheckOut, roomType, roomId, PriceTotal, SpecialRequests) "
         + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
     Object[] params={
        booking.getGuestId(), 
        booking.getHotelId(),
        booking.getNoAdults(),
        booking.getNoChildren(), 
         booking.getNoRooms(),
         booking.getPromotion(),
         booking.getCheckIn(),
         booking.getCheckOut(),
         booking.getRoomType(),
         booking.getRoomId(),
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
 int updated = jdbcTemplate.update("insert into user ( last_name, first_name, address, city, country, postal, phone_number, email_address, pin, "
         + "credit_card_type, credit_card_number, cvv_code, exp_month, exp_year,offers_notification) "
         + "values ( \""+ user.getLastName() +"\",\""+user.getFirstName() +"\",\""+ user.getAddress() +"\",\""+
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
                user.setCreditCardNumber(rs.getString("credit_card_number"));
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
 
 public User retrieveUserId(String email){
    User myUser;
    try{
     myUser = this.jdbcTemplate.queryForObject(
        "select user_id from user where email_address = ?",
        new Object[]{email},
        new RowMapper<User>() {
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                User user = new User();
                user.setId(rs.getLong("user_id"));
                
               
                return user;
            }
        });
     
    }
    catch (Exception e){
    myUser = new User();
    }
    return myUser;
 } 
  public Booking retrieveReservationId(long guestId, Date checkIn, Date checkOut){
    Booking myBooking;
    try{
     myBooking = this.jdbcTemplate.queryForObject(
        "select ReservationId from booking where guestId = ? and CheckIn = ? and CheckOut = ?",
        new Object[]{guestId, checkIn, checkOut},
        new RowMapper<Booking>() {
            public Booking mapRow(ResultSet rs, int rowNum) throws SQLException {
                Booking booking = new Booking();
                booking.setReservationId(rs.getLong("ReservationId"));
                
               
                return booking;
            }
        });
     
    }
    catch (Exception e){
    myBooking = new Booking();
    }   
    
    return myBooking;
 } 
 
 public  boolean deleteBooking(long reservationId){
     int updated = jdbcTemplate.update("delete from booking where reservationId = ?", 
             new Object[]{reservationId});
 if (updated == 1)
     return true;
 else
    return false;  
 }
 
 public static boolean validateAdmin(String username, String password){
     return true;
 }
 public List<Room> findAvailableRoom (Date checkin, Date checkout, int numberOfRooms, String roomType){
 String sql="select * from booking b " +
"join waringhouse.rooms r where b.roomType=? and (b.CheckOut<=? or b.CheckIn>=?);";
   List<Booking> Bookingrows = jdbcTemplate.query(sql,  new Object[]{roomType, checkin, checkout},new BeanPropertyRowMapper(Booking.class));
if (!Bookingrows.isEmpty()){
   sql=
"select sum(NoRooms) from booking b " +
" where b.roomType=? and (b.CheckOut<=? or b.CheckIn>=?)";
    int numberOfOccupiedRooms = jdbcTemplate.queryForObject(sql,  new Object[]{roomType,  checkin, checkout}, Integer.class);
   sql= "select (?-?) from hotels ";
    int numberOfAvailableRooms = jdbcTemplate.queryForObject(sql,  new Object[]{roomType,  numberOfOccupiedRooms}, Integer.class);
    if (numberOfAvailableRooms<numberOfRooms){
        sql="select r.id, r.hotelid, r.roomType, r.price, r.description, r.image, r.roomName from rooms r where r.roomType=?";
    List<Room> rows = jdbcTemplate.query(sql,  new Object[]{roomType},new BeanPropertyRowMapper(Room.class));
    
    for (Room row : rows) {
availableRooms.add(row);
 }}
    
  } 
         return availableRooms;

}
 

 
 
 
 
 
}
