package factory;
/**
 * This class was the Contemporary house plan. It set the materials and features to the appropriate array list. It also passed through the number of rooms, windows, and square feet.
 * @author Christian Lee
 */
public class ContemporaryPlan extends HousePlan{
    public ContemporaryPlan(){
        super(5, 40, 3000);
    }
    protected void setMaterials(){
        materials.add("- Ceramics");
        materials.add("- High-Strength Alloys");
        materials.add("- Composites");
    }

    protected void setFeatures(){
        features.add("- Oversized Windows");
        features.add("- Unconventional Roofs");
        features.add("- Minimalism");
        features.add("- Open Floor Plan");
    }
    /**
     * Returned the appropriate strings to be printed.
     */
    public String toString(){
        return "Contemporary"+super.toString();
    }
}
