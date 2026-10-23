package Part_2;

public class Main {
    public static void main(String[] args) {
        // 2.4. Create several objects with different values
        Book book1 = new Book("Dune", "Frank Herbert", 600);
        Book book2 = new Book("1984", "George Orwell", 328);
        Book book3 = new Book("The Hobbit", "J. R. R. Tolkien", 310);

        // 2.4. Set values using setters
        book1.setPagesRead(150);
        book1.setPrice(300);

        book2.setPagesRead(328);
        book2.setPrice(180.5);

        book3.setPagesRead(50);
        book3.setPrice(220);
        book3.setAuthor("J.R.R. Tolkien");

        // 2.4. Output full description of every object
        System.out.println(book1.getFullDescription());
        System.out.println(book2.getFullDescription());
        System.out.println(book3.getFullDescription());
    }
}