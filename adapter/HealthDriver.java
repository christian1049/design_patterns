package adapter;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Gathers Patient data, in medical records, and displays them.
 */
public class HealthDriver {
    public HealthDriver() {
    }

    /**
     * Creates a new Date
     * 
     * @param year  The Year of the date
     * @param month The month of the date
     * @param day   The day of the date
     */
    private Date makeDate(int year, int month, int day) {
        Calendar myCalendar = new GregorianCalendar(year, month - 1, day);
        return myCalendar.getTime();
    }

    /**
     * Creates patient medical records, and history
     */
    public void run() {
        MedicalRecord medRecord = new SCMedicalRecord("Amy", "Smith", makeDate(2010, 3, 21), Gender.FEMALE);
        medRecord.addVisit(makeDate(2015, 3, 24), true, "Yearly Checkup, everthing looks good");
        medRecord.addVisit(makeDate(2015, 7, 03), false, "Sufferring from a strawberry allergy");
        medRecord.addVisit(makeDate(2016, 3, 26), true, "Seems very tired, but healthy");
        medRecord.addVisit(makeDate(2017, 1, 10), true, "Has the flu, gave medecine");
        medRecord.addVisit(makeDate(2017, 3, 22), false, "Having trouble with seasonal allergies");
        medRecord.addVisit(makeDate(2017, 3, 25), true, "Growing Strong");

        System.out.println(medRecord);

        HealthRecord record = new CarolinaHealthRecord("Bob", "White", makeDate(2008, 8, 10), "Male");
        MedicalRecord myRecord = new MedicalRecordAdapter(record);
        record.addHistory(makeDate(2008, 8, 12), true, "Entering the world wonderfully");
        record.addHistory(makeDate(2008, 9, 12), true, "1 Month Checkup, everything is strong.");
        record.addHistory(makeDate(2008, 11, 28), false, "Suffering from the croup, gave sterroids");
        record.addHistory(makeDate(2009, 2, 12), true, "6 Month Checkup, everything is strong.");
        myRecord.addVisit(makeDate(2009, 4, 19), true, "Allergies are causing a cold");
        myRecord.addVisit(makeDate(2009, 8, 9), true, "1 year, and growing strong");
        myRecord.addVisit(makeDate(2010, 8, 11), true, "2 year, and growing strong");
        myRecord.addVisit(makeDate(2011, 8, 10), true, "3 year, and growing strong");
        System.out.println(myRecord);

        System.out.println("Previous display prior to adapting the new system.");
        System.out.print(record);

    }

    public static void main(String[] args) {
        HealthDriver driver = new HealthDriver();
        driver.run();
    }
}
