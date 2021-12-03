package adapter;
import java.util.ArrayList;
import java.util.Date;

public interface MedicalRecord {
    public String getFirstName();
    public String getLastName();
    public Date getBirthday();
    public Gender getGender();
    public void addVisit(Date date, boolean well, String description);
    public ArrayList<Visit> getVisitHistory();
    public String toString();
}
