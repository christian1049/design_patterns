package observer;

import java.util.ArrayList;

public class BestSellers implements Subject{
    private  ArrayList<Observer> observers = new ArrayList<>();
    private  ArrayList<Book> bestSellers = new ArrayList<>();

    public BestSellers(){
        this.observers = new ArrayList<>();
        this.bestSellers = new ArrayList<>();
    }
    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(Book book){
        for(Observer observer: observers){
            observer.update(book);
        }
    }
    public void addBook(Book book){
        bestSellers.add(book);
        notifyObservers(book);
    }
}

