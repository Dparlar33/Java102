import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for(int i =0;i<3;i++){
            System.out.println(i+1 + ".Kitap adını giriniz: ");
            String name = input.nextLine();


            System.out.println(i+1 + ".Kitabın kac sayfa oldugunu giriniz: ");
            int page = input.nextInt();
            input.nextLine();

            System.out.println(i+1 + ".Yazarin adini giriniz: ");
            String outName = input.nextLine();


            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            System.out.println(i+1 + ".Kitabin yayin tarihini giriniz (yyyy-MM-dd formatında): ");
            String lDate = input.next();
            input.nextLine();

            LocalDate date = LocalDate.parse(lDate,dateFormat);
            books.add(new Book(name,page,outName,date));
        }

        Map<String,String> outerAndBookMap = books.stream().collect(Collectors.toMap(Book::getOuterName ,Book::getBookName));
        outerAndBookMap.forEach((author,kitap)->System.out.println("Yazar : "+ author + " Kitap ismi: " + kitap) );

        System.out.println("Filtreleme yapmak icin sayfa sayısını giriniz: ");
        int filterNumber = input.nextInt();
        makeFilter(books,filterNumber);
    }

    public static void makeFilter(List<Book> books , int number){
        List<Book> newBooks = books.stream().filter(i -> i.getPageCount() > number ).toList();
        System.out.println("Sayfa sayisi +"+number+"olan kitaplar: ");
        newBooks.stream().forEach(book -> System.out.println("Adi: " + book.getBookName() + " Sayfa sayisi: " + book.getPageCount()));

    }
}
