package Authentication;

import Account.AccountManager;
import javax.naming.AuthenticationException;
import java.util.Scanner;

public class Authentication {
    private String userMail;
    private String userPassword;

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserMail() {
        return userMail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public enum AuthenticationStatus{
        SUCCESS , FAIL
    }

    public boolean login(){
        Scanner input = new Scanner(System.in);

        System.out.println("Mail adresinizi giriniz: ");
        String mail = input.next();
        setUserMail(mail);

        System.out.println("Sifrenizi giriniz: ");
        String password = input.next();
        setUserPassword(password);
        AccountManager accountManager = new AccountManager();
            try {
                if (accountManager.login() == AuthenticationStatus.SUCCESS){
                    return true;
                }else {
                    throw new AuthenticationException("Hatali mail veya sifre.");
                }
            }catch (Exception e){
                System.out.println(e.getMessage());
                return false;
            }
    }
}
