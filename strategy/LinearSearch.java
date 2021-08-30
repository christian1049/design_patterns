package strategy;

/**
 * A search class to check if the guest name is on the list.
 * @author Christian Lee
 */
import java.util.ArrayList;
public class LinearSearch implements SearchBehavior{
    public boolean contains(ArrayList<String> data, String item){
        for(int i = 0;i<data.size();i++){
            if(data.get(i).toLowerCase().compareTo(item.toLowerCase()) == 0) {
                return true;
            }
        }
        return false;
    }
    /**
     * This uses a for loop to look at each person's name on the list and it returns true if it does, otherwise, it returns false.
     */
}