package User;

import Address.Address;
import java.time.LocalDate;
import java.util.ArrayList;
public class Users {

    private String userName;
    private String userSurName;
    private String userMail;
    private String userPassword;
    private String userVocation;
    private int userAge;
    private ArrayList<Address> AddressList;
    private LocalDate lastOnlineDate;

    public void setAddressList(ArrayList<Address> addressList) {
        AddressList = addressList;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurName() {
        return userSurName;
    }

    public void setUserSurName(String userSurName) {
        this.userSurName = userSurName;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserVocation() {
        return userVocation;
    }

    public void setUserVocation(String userVocation) {
        this.userVocation = userVocation;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public ArrayList<Address> getAddressList() {
        return AddressList;
    }

    public LocalDate getLastOnlineDate() {
        return lastOnlineDate;
    }

    public void setLastOnlineDate(LocalDate lastOnlineDate) {
        this.lastOnlineDate = lastOnlineDate;
    }
}
