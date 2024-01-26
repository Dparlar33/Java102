package Account;

import Address.Address;
import Address.AddressManager;
import Address.BusinessAddress;
import Authentication.Authentication;
import Insurance.Insurance;
import Insurance.InsuranceManagement;
import User.Users;
import Operations.Operations;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class AccountManager {
    ArrayList<Accounts> accounts = new ArrayList<>();

    public Authentication.AuthenticationStatus login() {

        Authentication authentication = new Authentication();

        for (Accounts account : accounts) {
            System.out.println("döngü");
            System.out.println(account.users.getUserMail());
            System.out.println(authentication.getUserMail());
            if (account.users.getUserMail().equals(authentication.getUserMail()) && account.users.getUserPassword().equals(authentication.getUserPassword())) {
                System.out.println("kullanici dogrulandi");
                return Authentication.AuthenticationStatus.SUCCESS;
            }
        }
        return Authentication.AuthenticationStatus.FAIL;
    }

    public void createAccount(){
        Users users = new Users();
        Scanner input = new Scanner(System.in);

        System.out.println("Isminiz: ");
        String name = input.next();
        users.setUserName(name);

        System.out.println("Soyadiniz: ");
        String lastName = input.next();
        users.setUserSurName(lastName);

        System.out.println("Mail adresinizi giriniz: ");
        String mail = input.next();
        users.setUserMail(mail);

        System.out.println("Sifrenizi giriniz: ");
        String password = input.next();
        users.setUserPassword(password);
        input.nextLine();

        System.out.println("Mesleginizi giriniz: ");
        String vocation = input.nextLine();
        users.setUserVocation(vocation);

        System.out.println("Yasinizi giriniz: ");
        int age = input.nextInt();
        users.setUserAge(age);

        input.nextLine();
        users.setLastOnlineDate(LocalDate.now());

        ArrayList<Address> addresses = new ArrayList<>();
        users.setAddressList(AddressManager.addressInsert(addresses));


        Accounts individual = new Individual();
        individual.setUsers(users);
        accounts.add(individual);
        for (Accounts accounts1:accounts){
            System.out.println(accounts1.users.getUserMail());
        }
    }

    public void printUserInsurance(){
        int counter= 1;
        Authentication authentication  = new Authentication();
        for (Accounts account:accounts){
            if(account.users.getUserMail().equals(authentication.getUserMail()) && account.users.getUserPassword().equals(authentication.getUserPassword())){
                for(Insurance insurance:account.insurances){
                    System.out.println(counter+ ". Sigortanız: ");
                    System.out.println("Sigorta poAdi: " + insurance.insuranceName);
                    System.out.println("Sigorta Ucreti: "+ insurance.insurancePrice);
                    System.out.println("Baslangic Tarihi: " + insurance.startDate);
                    System.out.println("Bitis Tarihi: " + insurance.finishDate);
                    counter++;
                }
                break;
            }
        }
    }
    public void printUserInformation(){
        int counter= 1;
        Authentication authentication  = new Authentication();
        for (Accounts account:accounts){
            if(account.users.getUserMail().equals(authentication.getUserMail()) && account.users.getUserPassword().equals(authentication.getUserPassword())){
                System.out.println("Isim: " + account.users.getUserName());
                System.out.println("Soyisim: " + account.users.getUserSurName());
                System.out.println("Mail: " + account.users.getUserMail());
                System.out.println("Sifre: "+ account.users.getUserPassword());
                System.out.println("Meslek: " + account.users.getUserVocation());
                System.out.println("Yas: "+account.users.getUserAge());
                System.out.println("En son giris: "+account.users.getLastOnlineDate());
                System.out.println("Kayıtlı adresler: ");
                for (Address address:account.users.getAddressList()){
                    System.out.println(counter + ". Adresiniz.");
                    System.out.println("Ulke: " + address.getCountry());
                    System.out.println("Sehir: "+address.getCity());
                    System.out.println("Mahalle: " +address.getNeighbourhood());
                    System.out.println("Sokak: "+address.getStreet());
                    System.out.println("Bina: "+address.getBuilding());
                    counter++;
                }
                break;
            }
        }
    }

    public void createInsurance(){
        Authentication authentication  = new Authentication();
        Scanner input = new Scanner(System.in);
        System.out.println("Hangi sigortayı yaptırmak istiyorusunuz?");
        System.out.println("1- Arac sigortası\n"+
                "2- Saglik sigortasi\n"+
                "3- Seyahat sigortasi\n"+
                "4- Konut sigortasi\n"+
                "0- Ust menu");
        int choice = input.nextInt();
        InsuranceManagement insuranceManagement = new InsuranceManagement();
        switch (choice){
            case 0:
                new Operations().userMenu();
                break;
            case 1:
                for (Accounts account : accounts) {
                    if (account.users.getUserMail().equals(authentication.getUserMail()) && account.users.getUserPassword().equals(authentication.getUserPassword())) {
                        account.insurances.add(insuranceManagement.carInsuranceCreate());
                    }
                }
                break;
            case 2:
                for (Accounts account : accounts) {
                    if (account.users.getUserMail().equals(authentication.getUserMail()) && account.users.getUserPassword().equals(authentication.getUserPassword())) {
                        account.insurances.add(insuranceManagement.healthInsuranceCreate());
                    }
                }
                break;
            case 3:
                for (Accounts account : accounts) {
                    if (account.users.getUserMail().equals(authentication.getUserMail()) && account.users.getUserPassword().equals(authentication.getUserPassword())) {
                        account.insurances.add(insuranceManagement.travelInsuranceCreate());
                    }
                }
                break;
            case 4:
                for (Accounts account : accounts) {
                    if (account.users.getUserMail().equals(authentication.getUserMail()) && account.users.getUserPassword().equals(authentication.getUserPassword())) {
                        account.insurances.add(insuranceManagement.residenceInsuranceCreate());
                    }
                }
                break;
            default:
                System.out.println("Yanlıs secim!");
                createInsurance();
        }
    }
}
