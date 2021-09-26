package iterator;
import java.util.Iterator;
/**
 * 
 * @author Christian Lee
 */
public class FlightIterator implements Iterator<Flight>{
    private Flight[] flights;
    private int position;
/**
 * The constructor initializes the flights array and sets the position to zero.
 * @param flights The array of flights.
 */
public FlightIterator(Flight[] flights){
    this.flights = flights;
    this.position = 0;
}
/**
 * This returns a boolean of whether there is another variable in the array.
 */
public boolean hasNext(){
    return (position < flights.length && flights[position] != null);
    }
/**
 * This method returns the next flight in the array. 
 */
public Flight next(){
    if(!hasNext()) return null;
    return flights[position++];
    }
}