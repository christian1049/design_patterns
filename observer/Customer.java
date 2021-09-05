package observer;

import java.util.ArrayList;

public class Customer implements Observer{
    private Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishList = new ArrayList<>();
    /**
     * The constructor initialized the variables. 
     * @param subject The subject interface was created.
     * @param firstName The first name of the customer
     * @param lastName The last name of the customer
     */
    public Customer(Subject subject, String firstName, String lastName){
        subject.registerObserver(this);
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }
    /**
     * This is the update method that adds a book to the wish list.
     */
    public void update(Book book){
        wishList.add(book);
    }
    /**
     * This display method prints out the wish list of the customer.
     */
    public void display(){
        System.out.println("My Wish List:");
        for (Book s: wishList){
            System.out.println(s);
        }
    }
}
