package Operations;

import Account.AccountManager;
import Account.Accounts;
import Authentication.Authentication;
import User.Users;

import java.util.Scanner;

public class Operations {

    public void start(){
        Scanner input = new Scanner(System.in);
        System.out.println(" PARLAR Sigorta Yonetim Sistemine Hosgeldiniz !");
        System.out.println("Yapmak istediginiz islemi giriniz: \n" +
                "1- Giris yap\n"+
                "2- Hesap olustur\n"+
                "3- Cıkıs yap.");
        int choice = input.nextInt();

        switch (choice){
            case 1:
                logIn();
                break;
            case 2:
                createAccount();
                break;
            case 3:
                System.exit(0);
            default:
                System.out.println("Gecersiz Islem!");
        }
    }
    public void userMenu(){
        Scanner input = new Scanner(System.in);
        System.out.println("Yapmak istediginiz islem nedir ?\n" +
                "1 - Sigortalarimi goruntule\n" +
                "2 - Yeni sigorta\n" +
                "3 - Kullanici bilgilerimi goruntule\n" +
                "0 - Cikis yap.");
        int choice = input.nextInt();
        switch (choice){
            case 1:
                getUserInsurance();
            case 2:
                createNewInsurance();
            case 3:
                getUserInfo();
            case 0:
                System.exit(0);
        }
    }

    public void logIn(){
        Authentication authentication = new Authentication();
        if (authentication.login()){
            System.out.println("Hosgeldiniz!");
            userMenu();
        }else {
            System.out.println("Giris basarisiz! Yeniden deneyiniz ya da bir hesap acınız!");
            start();
        }
    }
    public void createAccount(){
        AccountManager accountManager = new AccountManager();
        accountManager.createAccount();
        System.out.println("Hesap olusturuldu! Lutfen giris yapiniz.");
        start();
    }
    public void getUserInfo(){
        AccountManager accountManager = new AccountManager();
        accountManager.printUserInformation();
        userMenu();
    }

    public void getUserInsurance(){
        AccountManager accountManager= new AccountManager();
        accountManager.printUserInsurance();
        userMenu();
    }
    public void createNewInsurance(){
        AccountManager accountManager = new AccountManager();
        accountManager.createInsurance();
        userMenu();
    }
}
