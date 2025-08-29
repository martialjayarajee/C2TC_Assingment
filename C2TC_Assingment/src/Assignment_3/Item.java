package Assignment_3;
public class Item {
	 protected int id;
	    protected String title;

	    // Constructor
	    public Item(int id, String title) {
	        this.id = id;
	        this.title = title;
	    }

	    // Method to display info (to be overridden in subclasses)
	    public void displayInfo() {
	        System.out.println("Item [ID: " + id + ", Title: " + title + "]");
	    }
}