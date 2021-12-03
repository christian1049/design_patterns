package adapter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;

/**
 * The medical record adapter
 * @author Christian Lee
 */
public class MedicalRecordAdapter implements MedicalRecord{
    private HealthRecord record;
    public ArrayList<Visit> visitHistory;

    /**
     * The medical record adapter constructor
     * @param record The instance of the Carolina Health Record
     */
    public MedicalRecordAdapter(HealthRecord record){
        this.record = record;
        this.visitHistory = new ArrayList<>();
    }
    /**
     * Gets the first name of the patient
     */
    public String getFirstName(){
        return record.getName().substring(0, record.getName().indexOf(" "));
    }
    /**
     * Gets the last name of the patient
     */
    public String getLastName(){
        int space = record.getName().indexOf(" ");
        return record.getName().substring(space);
    }
    /**
     * Gets the birthday of the patient
     */
    public Date getBirthday(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String birth2 = simpleDateFormat.format(record.getBirthdate());
        Date date = null;
        try{
             date = simpleDateFormat.parse(birth2);
        }
        catch(ParseException e){
            e.printStackTrace();
        }
        return date;
    }
    /**
     * Gets the gender of the patient
     */
    public Gender getGender(){
        Gender gender = Gender.valueOf(record.getGender().toUpperCase());
        return gender;
    }
    /**
     * Adds a visit to the visit history
     */
    public void addVisit(Date date, boolean well, String description){
        record.addHistory(date, well, description);
    }
    /**
     * Gets the visit history of the patient
     */
    public ArrayList<Visit> getVisitHistory(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        for(int i = 0; i<record.getHistory().size();i++){
            String[] meet = record.getHistory().get(i).split("\n");
            String date = record.getHistory().get(i).substring(11);
            date = date.substring(0,2) + "/" + date.substring(4,6) + "/" + date.substring(8);
            boolean well = true;
            if(meet[1].substring(12).equalsIgnoreCase("false")){
                well = false;
            }
            String description = meet[2].substring(10);
            Date dates = null;
            try{
                 dates = simpleDateFormat.parse(date);
            }
            catch(ParseException e){
                e.printStackTrace();
            }
            visitHistory.add(new Visit(dates,well,description));
        }
        return visitHistory;
    }
    /**
     * Constructs the output message
     */
    public String toString(){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String birth2 = simpleDateFormat.format(record.getBirthdate());

        String result = "***** " + getFirstName() + " " + getLastName() + " *****\n";
        result += "Birthday: " + birth2 + "\n";
        result += "Gender: " + getGender() + "\n";
        result += "Medical Visit History: \n";
        for(Visit a: getVisitHistory()){
            result = result + a + "\n";
        }
        return result;
    }
}
