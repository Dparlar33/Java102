package Insurance;

import Account.AccountManager;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class InsuranceManagement {

    public CarInsurance carInsuranceCreate(){
        Scanner input = new Scanner(System.in);
        CarInsurance carInsurance = new CarInsurance();

        System.out.println("Baslangic tarihi seciniz: (dd/MM/yyyy formatinda)");
        String date = input.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        carInsurance.setStartDate(LocalDate.parse(date,formatter));

        System.out.println("Bitis tarihi seciniz: (dd/MM/yyyy formatinda)");
        date = input.next();
        carInsurance.setFinishDate(LocalDate.parse(date,formatter));

        System.out.println("Girilen tarihler ve vergiler eklendikten sonra sigorta ucretiniz: ");
        carInsurance.calculate();

        System.out.println("Onaylıyor musunuz ? "+
                "1- Hayır" +
                "2- Evet");
        int choice = input.nextInt();

        if (choice ==1 ){
            AccountManager accountManager = new AccountManager();
            accountManager.createInsurance();
        }

        return carInsurance;
    }

    public HealthInsurance healthInsuranceCreate(){
        Scanner input = new Scanner(System.in);
        HealthInsurance healthInsurance = new HealthInsurance();

        System.out.println("Baslangic tarihi seciniz: (dd/MM/yyyy formatinda)");
        String date = input.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        healthInsurance.setStartDate(LocalDate.parse(date,formatter));

        System.out.println("Bitis tarihi seciniz: (dd/MM/yyyy formatinda)");
        date = input.next();
        healthInsurance.setFinishDate(LocalDate.parse(date,formatter));

        System.out.println("Girilen tarihler ve vergiler eklendikten sonra sigorta ucretiniz: ");
        healthInsurance.calculate();

        System.out.println("Onaylıyor musunuz ? "+
                "1- Hayır" +
                "2- Evet");
        int choice = input.nextInt();

        if (choice ==1 ){
            AccountManager accountManager = new AccountManager();
            accountManager.createInsurance();
        }

        return healthInsurance;
    }
    public TravelInsurance travelInsuranceCreate(){
        Scanner input = new Scanner(System.in);
        TravelInsurance travelInsurance = new TravelInsurance();

        System.out.println("Baslangic tarihi seciniz: (dd/MM/yyyy formatinda)");
        String date = input.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        travelInsurance.setStartDate(LocalDate.parse(date,formatter));

        System.out.println("Bitis tarihi seciniz: (dd/MM/yyyy formatinda)");
        date = input.next();
        travelInsurance.setFinishDate(LocalDate.parse(date,formatter));

        System.out.println("Girilen tarihler ve vergiler eklendikten sonra sigorta ucretiniz: ");
        travelInsurance.calculate();

        System.out.println("Onaylıyor musunuz ? "+
                "1- Hayır" +
                "2- Evet");
        int choice = input.nextInt();

        if (choice ==1 ){
            AccountManager accountManager = new AccountManager();
            accountManager.createInsurance();
        }

        return travelInsurance;
    }
    public ResidenceInsurance residenceInsuranceCreate(){
        Scanner input = new Scanner(System.in);
        ResidenceInsurance residenceInsurance = new ResidenceInsurance();

        System.out.println("Baslangic tarihi seciniz: (dd/MM/yyyy formatinda)");
        String date = input.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        residenceInsurance.setStartDate(LocalDate.parse(date,formatter));

        System.out.println("Bitis tarihi seciniz: (dd/MM/yyyy formatinda)");
        date = input.next();
        residenceInsurance.setFinishDate(LocalDate.parse(date,formatter));

        System.out.println("Girilen tarihler ve vergiler eklendikten sonra sigorta ucretiniz: ");
        residenceInsurance.calculate();

        System.out.println("Onaylıyor musunuz ? "+
                "1- Hayır" +
                "2- Evet");
        int choice = input.nextInt();

        if (choice ==1 ){
            AccountManager accountManager = new AccountManager();
            accountManager.createInsurance();
        }

        return residenceInsurance;
    }
}
