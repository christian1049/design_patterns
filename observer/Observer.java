package observer;

/**
 * Interface for the Store and Subject class. Both classes will inherit these methods
 */
public interface Observer {
    public void update(Book book);
    public void display();
}
