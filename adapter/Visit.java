package adapter;

import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Creates a log of a patients visit
 */
public class Visit {
    private Date date;
    private boolean well;
    private String description;

    /**
     * A visit to the medical facility
     * 
     * @param date        of the visit
     * @param well        true if it is a well-check and false otherwise
     * @param description details of the visit
     */
    public Visit(Date date, boolean well, String description) {
        this.date = date;
        this.well = well;
        this.description = description;
    }

    /**
     * Returns the date of the medical visit
     * 
     * @return the date of the visit
     */
    public Date getDate() {
        return date;
    }

    /**
     * Weather it is a well check or a sick visit
     * 
     * @return true if it is a well visit and false otherwise
     */
    public boolean isWell() {
        return well;
    }

    /**
     * String representation of the visits details
     * 
     * @return the details fo the visit
     */
    public String getDescription() {
        return description;
    }

    /**
     * A string reperestation of the medical visit
     * 
     * @return a string representation of the medial visit.
     */
    public String toString() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        String formattedDate = simpleDateFormat.format(date);
        String wellText = "Well Visit";

        if (!isWell()) {
            wellText = "Sick Visit";
        }

        return formattedDate + ": " + wellText + ", " + description;
    }
}
