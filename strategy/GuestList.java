package strategy;
/**
 * A guest list that can add or remove guests
 * @author Christian Lee
 */
import java.util.ArrayList;
public class GuestList{
    private String title;
    ArrayList<String> people = new ArrayList<String>();
    SearchBehavior searchBehavior;
/**
 * This is the constructor for the title of the code
 */
    public GuestList(String aTitle){
        title = aTitle;       
        searchBehavior = new LinearSearch();
    }
/**
 * The code is either adding a person and returning true or if they are already added to the list, returning false.
 */
    public boolean add(String person){
        if(searchBehavior.contains(people,person) == true){
            return false;
        }
        else {
            people.add(person);
            return true;
        }
    }
    /**
     * The code is removing a person from the list. If the person is on the list, they will be removed and return true. If they are not on the list, it returns false.
     */
    public boolean remove(String person){
        if(searchBehavior.contains(people,person) == true){
            people.remove(person);
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * This gets the title of the code
     */
    public String getTitle(){
        return title;
    }
    public void setSearchBehavior(SearchBehavior searchBehavior){
       this.searchBehavior = searchBehavior;
    }
    /**
     * This returns the list of people
     */
    public ArrayList<String> getList(){
        return people;
    }
}