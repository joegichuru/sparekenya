package Model;

/**
 * Created by joseph on 2/4/17.
 */

import javax.ejb.Local;
import javax.ejb.Stateful;
import java.math.BigInteger;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * creates a platform user
 * **/
@Stateful
@Local
public class UserModel {
    private String fname;
    private String lname;
    private int userId;
    private String email;
    private Map<String,String> location=new HashMap<String, String>();
    private BigInteger phoneNumber;
    private String occupation;
    private String profilePicLocation;
    private Date registrationDate;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Map<String, String> getLocation() {
        return location;
    }

    public void setLocation(Map<String, String> location) {
        this.location = location;
    }

    public BigInteger getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(BigInteger phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getProfilePicLocation() {
        return profilePicLocation;
    }

    public void setProfilePicLocation(String profilePicLocation) {
        this.profilePicLocation = profilePicLocation;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }
}
