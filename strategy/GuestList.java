package strategy;
/**
 * A guest list that can add or remove the given guests.
 * @author Christian Lee
 */
import java.util.ArrayList;
public class GuestList{
    private String title;
    private ArrayList<String> people = new ArrayList<String>();
    private SearchBehavior searchBehavior;
/**
 * @param This is the constructor for the title of the code
 */
    public GuestList(String aTitle){
        this.title = aTitle;       
        this.people = new ArrayList<>();
        this.searchBehavior = new LinearSearch();
    }
/**
 *@param The code is either adding a person and returning true or if they are already added to the list, returning false.
 */
    public boolean add(String person){
        if(searchBehavior.contains(people,person)){
            return false;
        }
        else {
            people.add(person);
            return true;
        }
    }
    /**
     * @param The code is removing a person from the list. If the person is on the list, they will be removed and return true. If they are not on the list, it returns false.
     */
    public boolean remove(String person){
        if(searchBehavior.contains(people,person)){
            people.remove(person);
            return true;
        }
        else {
            return false;
        }
    }
    /**
     * @param This gets the title of the code.
     */
    public String getTitle(){
        return title;
    }
    public void setSearchBehavior(SearchBehavior searchBehavior){
       this.searchBehavior = searchBehavior;
    }
    /**
     * @param This returns the list of people.
     */
    public ArrayList<String> getList(){
        return people;
    }
}