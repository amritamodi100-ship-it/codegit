public class Library {
    public static void main(String[] args) {
        Book b1 = new Book("The Hobbit", "J.R.R. Tolkien");
        Book b2 = new Book("1984", "George Orwell");

        System.out.println("Library Collection:");
        b1.display();
        b2.display();
    }
}