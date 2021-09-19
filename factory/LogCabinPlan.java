package factory;

/**
 * This class was the Log cabin house plan. It set the materials and features to the appropriate array list. It also passed through the number of rooms, windows, and square feet.
 * @author Christian Lee
 */
public class LogCabinPlan extends HousePlan{
    public LogCabinPlan(){
        super(2, 10, 1800);
    }
    protected void setMaterials(){
        materials.add("- Log Siding");
        materials.add("- Board and Batten Siding");
        materials.add("- White Pine");
    }

    protected void setFeatures(){
        features.add("- Timbered Roof");
        features.add("- High Insulation");
        features.add("- Rustic Effect");
    }
    /**
     * Returned the appropriate strings to be printed.
     */
    public String toString(){
        return "Log Cabin"+super.toString();
    }
}
