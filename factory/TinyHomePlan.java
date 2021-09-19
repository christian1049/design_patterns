package factory;
/**
 * This class was the tiny home house plan. It set the materials and features to the appropriate array list. It also passed through the number of rooms, windows, and square feet.
 * @author Christian Lee
 */
public class TinyHomePlan extends HousePlan{
    public TinyHomePlan(){
        super(1, 5, 200);
    }

    protected void setMaterials(){
        materials.add("- Lumber");
        materials.add("- Insulation");
        materials.add("- Metal Roofing");
        materials.add("- Hardware");
    }

    protected void setFeatures(){
        features.add("- Natural Light");
        features.add("- Creative Storage");
        features.add("- Multipurpose areas");
        features.add("- Multi-use applications");
    }   
    /**
     * Returned the appropriate strings to be printed.
     */
    public String toString(){
        return "Tiny House"+super.toString();
    }
}
