package factory;
/**
 * Runs the housing plans program
 */
public class HousePlanDriver {

    /**
     * Creates house plans and display stheir details.
     */
    public void run() {
        HousePlan logCabin = HousePlanFactory.createHousePlan("log cabin");
        HousePlan tinyHouse = HousePlanFactory.createHousePlan("Tiny Home");
        HousePlan contemporaryHouse = HousePlanFactory.createHousePlan("contemporary home");

        System.out.println(logCabin);
        System.out.println(tinyHouse);
        System.out.println(contemporaryHouse);
    }

    public static void main(String[] args) {
        HousePlanDriver driver = new HousePlanDriver();
        driver.run();
    }
}
