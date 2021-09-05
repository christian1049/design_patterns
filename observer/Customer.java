package observer;

import java.util.ArrayList;

public class Customer implements Observer{
    private Subject subject;
    private String firstName;
    private String lastName;
    private ArrayList<Book> wishList = new ArrayList<>();
    public Customer(Subject subject, String firstName, String lastName){
        subject.registerObserver(this);
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
    }
    public void update(Book book){
        wishList.add(book);
    }
    public void display(){
        System.out.println("My Wish List:");
        for (Book s: wishList){
            System.out.println(s);
        }
    }
}
