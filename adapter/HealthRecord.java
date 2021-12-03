package adapter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Holds the information for a Health Record
 */
public interface HealthRecord {

    /**
     * Gets the full name of the patient
     * @return The first and last name of the patient, separated by a space
     */
    public String getName();

    /**
     * Gets the patients birthdate
     * @return The birthdate of the patient
     */
    public Date getBirthdate();

    /**
     * Gets the gender of the patient
     * @return the string represtation of the patients gender
     */
    public String getGender();

    /**
     * Adds a visit to the patients history log
     * @param visitDate The date the patient visited the medical office
     * @param well True if the visit was a well check, and false otherwise
     * @param details The description of the visit
     */
    public void addHistory(Date visitDate, boolean well, String details);

    /**
     * Gets the list of all the patients mecial visits
     * @return an arraylist of patient medical visits
     */
    public ArrayList<String> getHistory(); 

    /**
     * A string representation of the patients health record
     * @return A string representation of the patients health record
     */
    public String toString();
}
