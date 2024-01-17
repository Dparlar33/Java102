import java.time.LocalDate;

public class Book {
    private String bookName;
    private int pageCount;
    private String outerName;
    private LocalDate publishedDate;

    public Book(String bookName,int pageCount,String outerName,LocalDate publishedDate){
        this.bookName =bookName;
        this.pageCount = pageCount;
        this.outerName = outerName;
        this.publishedDate = publishedDate;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getBookName() {
        return bookName;
    }

    public String getOuterName() {
        return outerName;
    }

    public LocalDate getPublishedDate() {
        return publishedDate;
    }
}
