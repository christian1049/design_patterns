package observer;

import java.util.Queue;
import java.util.LinkedList;

public class Store implements Observer{
    private Subject subject;
    private String title;
    private Queue<Book> bestSellers = new LinkedList<>();

    public Store(Subject subject){
        subject.registerObserver(this);
    }
    public void update(Book book){
        if(bestSellers.size() <= 4){
            bestSellers.add(book);
        }
        else{
            bestSellers.remove();
            bestSellers.add(book);
        }
    }
    public void display(){
        System.out.println("Top 5 Best Sellers:");
        for (Book s: bestSellers){
            System.out.println(s);
        }
    }
}
