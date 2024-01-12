import java.util.List;
import java.util.Scanner;

public class ProductOperations {
    public Notebook addNotebook(){
        Scanner input = new Scanner(System.in);
        Notebook nb = new Notebook();

        System.out.println("Imei numrasını giriniz: ");
        int Imei = input.nextInt();
        nb.setImei(Imei);

        System.out.println("Ürünün adını giriniz: ");
        String prName = input.next();
        nb.setProductName(prName);

        System.out.println("Fiyatını giriniz: ");
        int price = input.nextInt();
        nb.setPrice(price);

        System.out.println("Ürünün markasını giriniz: ");
        String brName = input.next();
        nb.setBrandName(brName);

        System.out.println("Hafızayı giriniz: ");
        int memory = input.nextInt();
        nb.setMemory(memory);

        System.out.println("Ürünün Ekran boyutunu giriniz: ");
        float screenSize = input.nextFloat();
        nb.setScreenSize(screenSize);

        System.out.println("Ürünün Ram'ını giriniz: ");
        int ram = input.nextInt();
        nb.setRam(ram);

        return nb;
    }
    public void deleteNotebook(List<Notebook> notebooks){
        Scanner input = new Scanner(System.in);
        System.out.println("Silmek istediğiniz ürünün Imei numarasını giriniz: ");
        int Imei = input.nextInt();

        for (Notebook notebook:notebooks){
            if (notebook.getImei() == Imei){
                notebooks.remove(notebook);
            }
        }
    }
    public void filterNotebook(List<Notebook> notebooks){
        Scanner input = new Scanner(System.in);
        System.out.println("Filtrelemek için\n" +
                "1 - IMEI girin\n" +
                "2 - Marka girin\n");
        int choice = input.nextInt();
        try {
            if (choice != 1 && choice!=2 && choice !=3 && choice!=0) {
                throw new Exception();
            }
        }catch (Exception e){
            System.out.println("Yanlıs bir secim yaptınız ! Tekrar bir secim yapınız. ");
            filterNotebook(notebooks);
        }

        if (choice==1){
            System.out.println("Imei girin: ");
            int Imei = input.nextInt();
            for (Notebook notebook:notebooks){
                if (notebook.getImei() == Imei){
                    System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s\n", notebook.getImei(), notebook.getProductName(), notebook.getPrice(), notebook.getBrandName(), notebook.getMemory(), notebook.getScreenSize(), notebook.getRam());
                }
            }
        }else {
            System.out.println("Marka girin: ");
            String str = input.next();
            for (Notebook notebook:notebooks){
                if (notebook.getBrandName().equals(str)){
                    System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s\n", notebook.getImei(), notebook.getProductName(), notebook.getPrice(), notebook.getBrandName(), notebook.getMemory(), notebook.getScreenSize(),  notebook.getRam());
                }
            }
        }
    }
    public Phone addPhone(){
        Scanner input = new Scanner(System.in);
        Phone phone = new Phone();

        System.out.println("Imei numrasını giriniz: ");
        int Imei = input.nextInt();
        phone.setImei(Imei);

        System.out.println("Ürünün adını giriniz: ");
        String prName = input.next();
        phone.setProductName(prName);

        System.out.println("Fiyatını giriniz: ");
        int price = input.nextInt();
        phone.setPrice(price);

        System.out.println("Ürünün markasını giriniz: ");
        String brName = input.next();
        phone.setBrandName(brName);

        System.out.println("Ürünün depolama alanını giriniz: ");
        int memory = input.nextInt();
        phone.setMemory(memory);

        System.out.println("Ürünün Ekran boyutunu giriniz: ");
        float screenSize = input.nextFloat();
        phone.setScreenSize(screenSize);

        System.out.println("Ürünün bataryasını giriniz: ");
        int battery = input.nextInt();
        phone.setBattery(battery);

        System.out.println("Ürünün Ram'ını giriniz: ");
        int ram = input.nextInt();
        phone.setRam(ram);

        System.out.println("Ürünün rengini giriniz: ");
        String color = input.next();
        phone.setColor(color);

        return phone;
    }
    public void deletePhone(List<Phone> phones){
        Scanner input = new Scanner(System.in);
        System.out.println("Silmek istediğiniz ürünün Imei numarasını giriniz: ");
        int Imei = input.nextInt();

        for (Phone phone:phones){
            if (phone.getImei() == Imei){
                phones.remove(phone);
                Operations op = new Operations();
                op.NotebookOperation();
            }
        }
        System.out.println("Geçersiz bir Imei girdiniz! Tekrar giriniz.");
        deletePhone(phones);
    }
    public void filterPhone(List<Phone> phones){
        Scanner input = new Scanner(System.in);
        System.out.println("Filtrelemek için\n" +
                "1 - IMEI girin\n" +
                "2 - Marka girin\n");
        int choice = input.nextInt();

        try {
            if (choice != 1 && choice!=2 && choice !=3 && choice!=0) {
                throw new Exception();
            }
        }catch (Exception e){
            System.out.println("Yanlıs bir secim yaptınız ! Tekrar bir secim yapınız. ");
            filterPhone(phones);
        }


        if (choice==1){
            System.out.println("Imei girin: ");
            int Imei = input.nextInt();
            for (Phone phone:phones){
                if (phone.getImei() == Imei){
                    System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s\n", phone.getImei(), phone.getProductName(), phone.getPrice(), phone.getBrandName(), phone.getMemory(), phone.getScreenSize(), phone.getBattery(), phone.getRam(), phone.getColor());
                }
            }
        }else {
            System.out.println("Marka girin: ");
            String str = input.next();
            for (Phone phone:phones){
                if (phone.getBrandName().equals(str)){
                    System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s\n", phone.getImei(), phone.getProductName(), phone.getPrice(), phone.getBrandName(), phone.getMemory(), phone.getScreenSize(), phone.getBattery(), phone.getRam(), phone.getColor());
                }
            }
        }

    }

}
