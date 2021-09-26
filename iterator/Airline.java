package iterator;
/**
 * This is the airline class
 * @author Christian Lee
 */
import java.util.Arrays;
import java.util.Iterator;

public class Airline {
    private String title;
    private Flight[] flights;
    private int size;
/**
 * This is the constructor for the airline class. It initializes the title, size of the array, and array.
 * @param title
 */
    public Airline(String title){
        this.title = title;
        size = 2;
        flights = new Flight[size];  
    }
    /**
     * This is the method to add the flights into the array. If the array is full, it calls the growArray method. Otherwise, it adds the flight to the array.
     * @param flightNum This is the flight number
     * @param from This is the location of where the flight originated
     * @param to This is the location of where the flight is headed
     * @param duration This is the amount of time the flight lasted
     * @param transfers This is the number of transfers the flight had
     */
    public void addFlight(String flightNum, String from, String to, int duration, int transfers){
        if(flights[size-1] != null){
            growArray(flights);
        }
        for(int i = 0; i<flights.length;i++){
            if(flights[i] == null){
                flights[i] = new Flight(flightNum, from, to, duration, transfers);
                return;
            }
        }
    }
    /**
     * This gets the title of the airline.
     * @return
     */
    public String getTitle(){
        return title;
    }
    /**
     * This doubles the size of the array.
     * @param flights This is the array that contains the flights
     * @return This returns a new array that is twice the size of the old one
     */
    private Flight[] growArray(Flight[] flights){
        size *= 2;
        return this.flights = Arrays.copyOf(flights, size);
    }
    /**
     * @return This returned a new iterator.
     */
    public FlightIterator createIterator(){
        return new FlightIterator(flights);
    }
}
