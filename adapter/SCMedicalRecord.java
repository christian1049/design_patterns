package adapter;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class SCMedicalRecord implements MedicalRecord {
    private String firstName;
    private String lastName;
    private Date birthday;
    private Gender gender;
    private ArrayList<Visit> visits;
    
    public SCMedicalRecord(String firstName, String lastName, Date birthday, Gender gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.gender = gender;
        this.visits = new ArrayList<Visit>();
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public Date getBirthday(){
        return birthday;
    }
    public Gender getGender(){
        return gender;
    }

    public void addVisit(Date date, boolean well, String description){
        visits.add(new Visit(date, well, description));
    }

    public ArrayList<Visit> getVisitHistory(){
        return visits;
    }

    private String getFormattedBirthday(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return simpleDateFormat.format(birthday);
    }

    private String getFormattedGender(){
        String genderText = gender.toString();
        return genderText.substring(0,1).toUpperCase() + genderText.substring(1).toLowerCase();
    }

    public String toString(){
        String result = "***** " + firstName + " " + lastName + " *****\n";
        result += "Birthday: " + getFormattedBirthday() + "\n";
        result += "Gender: " + getFormattedGender() + "\n";
        result += "Medical Visit History: \n";

        if(visits.size() == 0){
            result += "No visits yet";
        } else {
            for(Visit visit : visits){
                result += visit.toString() + "\n";
            }
        }

        return result;
    }
}
