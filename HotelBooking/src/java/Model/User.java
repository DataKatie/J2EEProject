package Model;

import java.util.Date;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

/**
 *
 * @author Julia
 */
public class User {
    
    
    long id;
    
    @Pattern(regexp = "[A-Za-z]+", message="A last name should contain only letters and cannot be empty")
    String lastName;
    
    @Pattern(regexp = "[A-Za-z]+", message="A first name should contain only letters and cannot be empty")
    String firstName;
    
    @NotEmpty (message="Enter an address")
    String address;
    
    @NotEmpty (message="Enter a city")
    String city;
    
    @NotEmpty (message="Enter a country")
    String country;
    
    @Pattern(regexp = "^[A-Za-z]\\d[A-Za-z][ -]?\\d[A-Za-z]\\d$", message="Enter a valid zip code")
    String postalCode;
    
    @Pattern(regexp = "[0-9]{9,}",  message="Enter a valid phone number")
    String phoneNumber;
    
    @NotEmpty (message="Enter a valid email")
    @Email (message="Enter a valid email")
    String email;
    
    String pin;
    
    @Pattern (regexp="^(American Express|Diners Card|Discover Card|Master Card|Visa)$", message="Choose a credit card type")
    String creditCardType;
    
    //the length validation should be done depending on how a controller will validate this field
    @NotNull (message="Enter a credit card number")
    String creditCardNumber;
    
     @NotNull (message="Enter a cvv code")
    int cvv;
    
     
    @NotEmpty (message="Choose an expiry date (month)") 
    String expMonth;
    
    @NotNull (message="Choose an expiry date (year)") 
    int expYear;
    
    boolean notification;
    
    String requests;
    
    Date dateCreated;
    
    public long getId() {
            return id;
        }
    public void setId(long id){
        this.id = id;
        
    }
    public String getLastName() {
            return lastName;
        }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
     public String getFirstName() {
            return firstName;
        }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    
    
     public String getAddress() {
            return address;
        }
    
    public void setAddress(String address){
        this.address = address;
    }
    
     public String getCity() {
            return city;
        }
    
    public void setCity(String city){
        this.city = city;
    }
    
     public String getCountry() {
            return country;
        }
    
    public void setCountry(String country){
        this.country = country;
    }
    
     public String getPostalCode() {
            return postalCode;
        }
    
    public void setPostalCode(String code){
        this.postalCode = code;
    }
    
     public String getPhoneNumber() {
            return phoneNumber;
        }
    
    public void setPhoneNumber(String phone){
        this.phoneNumber = phone;
    }
    
    
     public String getEmail() {
            return email;
        }
    
    public void setEmail(String email){
        this.email = email;
    }
    
     public String getPin() {
            return pin;
        }
    
    public void setPin(String pin){
        this.pin = pin;
    }
    
     public String getCreditCardType() {
            return creditCardType;
        }
    
    public void setCreditCardType(String creditCardType){
        this.creditCardType = creditCardType;
    }
    
    public String getCreditCardNumber() {
            return creditCardNumber;
        }
    
    public void setCreditCardNumber(String creditCardNumber){
        this.creditCardNumber = creditCardNumber;
    }
    
    public int getCvv() {
            return cvv;
        }
    
    public void setCvv(int cvv){
        this.cvv = cvv;
    }
    
    public String getExpMonth() {
            return expMonth;
        }
    
    public void setExpMonth(String expMonth){
        this.expMonth = expMonth;
    }
    
    
    public int getExpYear() {
            return expYear;
        }
    
    public void setExpYear(int expYear){
        this.expYear = expYear;
    }
    
    public boolean getNotification() {
            return notification;
        }
    
    public void setNotification(boolean notification){
        this.notification = notification;
    }
    
    
     public String getRequests() {
            return requests;
        }
    
    public void setRequests(String requests){
        this.requests = requests;
    }
    
    
    /* public Date getDateCreated() {
            return dateCreated;
        }
    
     
     //sets the dateCreated as current time
     //one of the options - to format it
    public void setDateCreated(){
        this.dateCreated = new Date();
    } */
}