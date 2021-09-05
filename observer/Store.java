package observer;

import java.util.Queue;
import java.util.LinkedList;

/**
 * This is the class for the store where it adds books to the best sellers list.
 * @author Christian Lee
 */
public class Store implements Observer{
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers = new LinkedList<>();
    /**
     * The constructor initializes the subject
     * @param subject This is the subject of the store.
     */
    public Store(Subject subject){
        subject.registerObserver(this);
    }
    /**
     * The update methods adds a book the best sellers list unless there are more than five in which case, it will remove the longest tenured book on the list.
     */
    public void update(Book book){
        if(bestSellers.size() <= 4){
            bestSellers.add(book);
        }
        else{
            bestSellers.remove();
            bestSellers.add(book);
        }
    }
    /**
     * The display method prints out the top 5 best sellers.
     */
    public void display(){
        System.out.println("Top 5 Best Sellers:");
        for (Book s: bestSellers){
            System.out.println(s);
        }
    }
}
