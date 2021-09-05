package observer;

/**
 * Lists books by best sellers and wish lists for stores and customers.
 * @author by Christian Lee
 */
import java.util.ArrayList;

public class BestSellers implements Subject{
    private  ArrayList<Observer> observers;
    private  ArrayList<Book> bestSellers;
    /**
     * This constructor created two new array lists called observers and best sellers.
     */
    public BestSellers(){
        this.observers = new ArrayList<>();
        this.bestSellers = new ArrayList<>();
    }
    /**
     * The register observer method added an observer to the observers array list.
     */
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    /**
     * The register observer method removed an observer to the observers array list.
     */
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    /**
     * The notify observer method notified the observers if a book was added to the best sellers.
     */
    public void notifyObservers(Book book){
        for(Observer observer: observers){
            observer.update(book);
        }
    }
    /**
     * The add book method adds books to the best sellers list and then called the notifyObservers method.
     */
    public void addBook(Book book){
        bestSellers.add(book);
        notifyObservers(book);
    }
}

