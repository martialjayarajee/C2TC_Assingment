package Assignment_3;
import java.util.*;

public class Library {
	private List<Item> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void showAllItems() {
        System.out.println("\nLibrary contains:");
        for (Item item : items) {
            if (item instanceof Book) {
                Book b = (Book) item;
                System.out.println("- " + b.getDetails());
            } else if (item instanceof Magazine) {
                Magazine m = (Magazine) item;
                System.out.println("- " + m.getDetails());
            }
        }
    }
}