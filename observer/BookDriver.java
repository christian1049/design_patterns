package observer;

/**
 * Runs our Best Seller Book Program
 */
public class BookDriver {
    
    /**
     * Creates the Best Seller, and the Store and Client
     * Then displays the top 5 best sellers, and the 
     * Clients wishlist
     */
    public void run() {
        BestSellers bestSellers = new BestSellers();
        Observer myStore = new Store(bestSellers);
        Observer myCustomer = new Customer(bestSellers, "Amy", "Smith");

        bestSellers.addBook(new Book("The Bust", "Ashely", "Audrain"));
        bestSellers.addBook(new Book("A Crooked Tree", "Una", "Mannion"));
        bestSellers.addBook(new Book("Let Me Tell You What I Mean", "Joan", "Didion"));
        bestSellers.addBook(new Book("The Wife Upstairs", "Racheal", "Hawkins"));
        bestSellers.addBook(new Book("Summerwater", "Sarah", "Moss"));
        bestSellers.addBook(new Book("Life Among the Terranauts", "Caitlin", "Horrocks"));
        bestSellers.addBook(new Book("The Removed", "Brandon", "Hobson"));
        bestSellers.addBook(new Book("Girl A", "Abigail", "Dean"));
        bestSellers.addBook(new Book("The Kindest Lie", "Nancy", "Johnson"));
        bestSellers.addBook(new Book("My Year Abroad", "Chang", "Rae-Lee"));

        myStore.display();
        myCustomer.display();
    }

    public static void main(String[] args){
        BookDriver driver = new BookDriver();
        driver.run();
    }
}
