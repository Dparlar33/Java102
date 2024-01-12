import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Operations {
    List<Notebook> notebooks = new ArrayList<>();
    List<Phone> phones = new ArrayList<>();
    public Operations(){
        Beginning();
    }

    public void OperationCase(int choice){

        switch (choice){
            case 1:
                NotebookOperation();
                Beginning();
                break;
            case 2:
                PhoneOperation();
                Beginning();
                break;
            case 3:
                BrandList();
                Beginning();
                break;
            case 0:
                System.exit(0);
                break;
        }
    }
    public void Beginning() {
        Scanner input = new Scanner(System.in);
        System.out.println("PatikaStore Ürün Yönetim Paneli !\n" +
                "1 - Notebook İşlemleri\n" +
                "2 - Cep Telefonu İşlemleri\n" +
                "3 - Marka Listele\n" +
                "0 - Çıkış Yap");
        int choice = input.nextInt();

        try {
            if (choice != 1 && choice!=2 && choice !=3 && choice!=0) {
                throw new Exception();
            }
        }catch (Exception e){
            System.out.println("Yanlıs bir secim yaptınız ! Tekrar bir secim yapınız. ");
            Beginning();
        }
        OperationCase(choice);
    }

    public void BrandList(){
        List<Brand> br = new ArrayList<>();
        Brand samsung = new Brand(1,"Samsung");
        Brand lenovo = new Brand(2,"Lenovo");
        Brand apple = new Brand(3,"Apple");
        Brand casper = new Brand(5,"Casper");
        Brand asus = new Brand(6,"Asus");
        Brand hp = new Brand(7,"HP");
        Brand xiaomi = new Brand(8,"Xiaomi");
        Brand monster = new Brand(9,"Monster");


        br.add(samsung);
        br.add(lenovo);
        br.add(apple);
        br.add(casper);
        br.add(asus);
        br.add(hp);
        br.add(xiaomi);
        br.add(monster);

        System.out.println("Markalarımız");
        System.out.println("-------------");
        for (Brand brand:br){
            System.out.println("- " +brand.getBrandId() + " " + brand.getBrandName());
        }
    }

    public void NotebookOperation(){

        printNotebooks(notebooks);

        Scanner input = new Scanner(System.in);
        System.out.println(" 1 - Notebook ekle\n" +
                " 2 - Notebook sil\n" +
                " 3 - Ürünler arasında filtreleme yap\n" +
                " 0 - Üst menüye dön\n");
        int choice = input.nextInt();

        try {
            if (choice != 1 && choice!=2 && choice !=3 && choice!=0) {
                throw new Exception();
            }
        }catch (Exception e){
            System.out.println("Yanlıs bir secim yaptınız ! Tekrar bir secim yapınız. ");
            NotebookOperation();
        }

        ProductOperations prOp = new ProductOperations();
        switch (choice){
            case 0:
                Beginning();
                break;
            case 1:
                notebooks.add(prOp.addNotebook());
                System.out.println("Ürün Eklendi!");
                printNotebooks(notebooks);
                Beginning();
                break;
            case 2:
                prOp.deleteNotebook(notebooks);
                System.out.println("Ürün Silindi!");
                printNotebooks(notebooks);
                Beginning();
                break;
            case 3:
                prOp.filterNotebook(notebooks);
                Beginning();
                break;
        }
    }
    public void PhoneOperation(){

        printPhones(phones);

        Scanner input = new Scanner(System.in);
        System.out.println(" 1 - Telefon ekle\n" +
                " 2 - Telefon sil\n" +
                " 3 - Ürünler arasında filtreleme yap\n" +
                " 0 - Üst menüye dön\n");
        int choice = input.nextInt();

        try {
            if (choice != 1 && choice!=2 && choice !=3 && choice!=0) {
                throw new Exception();
            }
        }catch (Exception e){
            System.out.println("Yanlıs bir secim yaptınız ! Tekrar bir secim yapınız. ");
            PhoneOperation();
        }

        ProductOperations prOp = new ProductOperations();
        switch (choice){
            case 0:
                Beginning();
                break;
            case 1:
                phones.add(prOp.addPhone());
                System.out.println("Ürün eklendi!");
                printPhones(phones);
                Beginning();
                break;
            case 2:
                prOp.deletePhone(phones);
                System.out.println("Ürün silindi!");
                printPhones(phones);
                Beginning();
                break;
            case 3:
                prOp.filterPhone(phones);
                Beginning();
                break;
        }
    }

    public void printNotebooks(List<Notebook> notebooks){
        System.out.println("Notebook Ürünleri");
        System.out.println("------------------------");
        System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s \n", "Imei", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
        for (Notebook notebook:notebooks){
            System.out.format("%-15d %-10s %-15s %-15s %-15d %-15s %-15d \n", notebook.getImei(), notebook.getProductName(), notebook.getPrice(), notebook.getBrandName(), notebook.getMemory(), notebook.getScreenSize(), notebook.getRam());
        }
    }
    public void printPhones(List<Phone> phones){
        System.out.println("Telefon Ürünleri");
        System.out.println("----------------------------");
        System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s  \n", "Imei", "Ürün adı", "Fiyat", "Marka", "Depolama", "Ekran", "Pil" , "RAM", "Renk");
        for(Phone phone : phones) {
            System.out.format("%-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s %-15s\n", phone.getImei(), phone.getProductName(), phone.getPrice(), phone.getBrandName(), phone.getMemory(), phone.getScreenSize(), phone.getBattery(), phone.getRam(), phone.getColor());
        }
    }
}