package Assignment_3;
public class Main {
	public static void main(String args[]) {
		  // Part A: Inheritance
        Book book = new Book(101, "Java Basics", "James Gosling");
        Magazine magazine = new Magazine(201, "Tech Today", 45);

        // Demonstrating is-a relationship
        book.displayInfo();
        magazine.displayInfo();

        // Part B: Composition
        Library library = new Library();
        library.addItem(book);
        library.addItem(magazine);

        library.showAllItems();
	}
}