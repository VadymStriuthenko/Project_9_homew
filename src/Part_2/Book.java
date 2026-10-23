package Part_2;

// Class that represents a book from my hobby collection
public class Book {
    // 2.1. Private properties
    private String title;
    private String author;
    private int pages;
    private int pagesRead;
    private double price;

    // 2.2. Constructor with initial values for the main properties
    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.pagesRead = 0;
        this.price = 0;
    }

    // 2.1. Getters and setters
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public int getPagesRead() {
        return pagesRead;
    }
    public void setPagesRead(int pagesRead) {
        this.pagesRead = pagesRead;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // 2.3. Method with logic: reading progress in percent
    public double calculateProgress() {
        if (pages == 0) {
            return 0;
        }
        return (double) pagesRead / pages * 100;
    }

    // 2.3. Method with logic: price of one page
    public double calculatePricePerPage() {
        if (pages == 0) {
            return 0;
        }
        return price / pages;
    }

    // 2.3. Method that returns the full description of the object
    public String getFullDescription() {
        return "Book: " + title + ", Author: " + author
                + ", Pages: " + pages + ", Read: " + pagesRead
                + ", Progress: " + String.format("%.1f", calculateProgress()) + "%"
                + ", Price: " + price
                + ", Price per page: " + String.format("%.2f", calculatePricePerPage());
    }
}