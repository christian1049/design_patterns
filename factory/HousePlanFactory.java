package factory;
/**
 * This class decides which type of house plan will be created.
 * @author Christian Lee
 */
public class HousePlanFactory {
    /**
     * Used if statements to create a house plan according to the driver.
     * @param type The type of house plan that will be created
     * @return It returned the log cabin house plan if none of the other house plans matched.
     */
    public static HousePlan createHousePlan(String type){
        HousePlan housePlan = null;
        if(type.equals("log cabin")){
            housePlan = new LogCabinPlan();
        }
        else if(type.equals("Tiny Home")){
            housePlan = new TinyHomePlan();
        }
        else if(type.equals("contemporary home")){
            housePlan = new ContemporaryPlan();
        }
        else
            housePlan = new LogCabinPlan();
        return housePlan;
    }
}
