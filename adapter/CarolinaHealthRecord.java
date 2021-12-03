package adapter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * A medical record for Carolina Health Patients
 */
public class CarolinaHealthRecord implements HealthRecord {
    private String firstName;
    private String lastName;
    private Date birthdate;
    private String gender;
    private ArrayList<String> history;

    /**
     * Creates a new Health Record
     * @param firstName of the patient
     * @param lastName of the patient
     * @param birthdate of the patient
     * @param gender of the patient
     */
    public CarolinaHealthRecord(String firstName, String lastName, Date birthdate, String gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.gender = gender;
        this.history = new ArrayList<String>();
    }

    /**
     * Gets the full name of the patient
     * @return The first and last name of the patient, separated by a space
     */
    public String getName(){
        return firstName + " " + lastName;
    }

    /**
     * Gets the patients birthdate
     * @return The birthdate of the patient
     */
    public Date getBirthdate(){
        return birthdate;
    }

    /**
     * Gets the gender of the patient
     * @return the string represtation of the patients gender
     */
    public String getGender(){
        return gender;
    }

    /**
     * Adds a visit to the patients history log
     * @param visitDate The date the patient visited the medical office
     * @param well True if the visit was a well check, and false otherwise
     * @param details The description of the visit
     */
    public void addHistory(Date visitDate, boolean well, String details){
        String item = "";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E dd, MM, yyyy");

        item += "Visit: " + simpleDateFormat.format(visitDate) + "\n";
        item += "Well visit: " + well + "\n";
        item += "Comments: " + details +  "\n";

        history.add(item);
    }

    /**
     * Gets the list of all the patients mecial visits
     * @return an arraylist of patient medical visits
     */
    public ArrayList<String> getHistory(){
        return history;
    }

    /**
     * A string representation of the patients health record
     * @return A string representation of the patients health record
     */
    public String toString() {
        String output = "";
        output += firstName + " " + lastName + "\n";
        output += "Birthdate: " + birthdate.toString() + "\n";
        output += "History: \n";

        for(String visit : history){
            output += visit;
        }

        return output;
    }
}
