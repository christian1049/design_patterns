package observer;

/**
 * This is the subject interface. 
 * @author Christian Lee
 */
public interface Subject{
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers(Book book);
}