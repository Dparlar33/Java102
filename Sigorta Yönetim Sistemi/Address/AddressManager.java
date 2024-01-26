package Address;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressManager {
    public static ArrayList<Address> addressInsert(ArrayList<Address> adList){

        Scanner input = new Scanner(System.in);
        System.out.println("1 - Ev adresi:\n"+
                "2 - Is adresi: \n");
        int choice = input.nextInt();
        if (choice == 1){
            Address homeAddress = new HomeAddress();
            getInfo(homeAddress);
            adList.add(homeAddress);
            return adList;
        }else {
            Address businessAddress = new BusinessAddress();
            getInfo(businessAddress);
            adList.add(businessAddress);
            return adList;
        }
    }

    public static void getInfo(Address newAddress){

        Scanner input = new Scanner(System.in);
        System.out.println("Ulke giriniz: ");
        newAddress.setCountry(input.next());

        System.out.println("Sehir giriniz: ");
        newAddress.setCity(input.next());

        System.out.println("Mahalle giriniz: ");
        newAddress.setNeighbourhood(input.nextLine());

        input.nextLine();

        System.out.println("Sokak giriniz: ");
        newAddress.setStreet(input.nextLine());

        System.out.println("Bina giriniz: ");
        newAddress.setBuilding(input.nextLine());
    }
    public static void addressDelete(){
        // User class içindeki address listesinden address cıkarıcak.
    }
}
