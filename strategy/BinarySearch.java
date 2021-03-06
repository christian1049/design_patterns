package strategy;

/**
 * The binary search class to check if the guest name is on the list.
 * @author Christian Lee
 */
import java.util.Collections;
import java.util.ArrayList;
public class BinarySearch implements SearchBehavior{
   
    /**
     * @param Used a collection to sort the list alphabetically in ascending order.
     */
    public boolean contains(ArrayList<String> data, String item){
    	Collections.sort(data, String.CASE_INSENSITIVE_ORDER);
    	int min = 0;
        int max = data.size() - 1;
        int mid;
        while (min<max){
            mid = (min+max)/2;
            if(data.get(mid).toLowerCase().compareTo(item.toLowerCase())<0){
                min = mid+1;

            }
            else if (data.get(mid).toLowerCase().compareTo(item.toLowerCase())>0){
                max = mid;
            }
            else{
                return true;
            }
        }
            return false;
        
    }
    /**
     * @param Used an online source to binary search.
     * https://www.geeksforgeeks.org/binary-search-a-string/
     */
}