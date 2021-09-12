package decorator;
/**
 * Runs the Potoatoe Head Program
 */
public class PotatoeDriver {

    /**
     * Creates potatoe heads and adds features to them
     */
    public void run() {
        Character potatoe = new PotatoeHead();
        Character eyePotatoe = new Eyes(potatoe);
        Character eyeNosePotatoe = new Nose(eyePotatoe);
        Character mouthEyeNosePotatoe = new Mouth(eyeNosePotatoe);
        Character hatMouthEyeNosePotatoe = new Hat(mouthEyeNosePotatoe);
        hatMouthEyeNosePotatoe.draw();

        Character potatoe2 = new PotatoeHead();
        Character hatPotatoe2 = new Hat(potatoe2);
        Character eyeHatPotatoe2 = new Eyes(hatPotatoe2);

        eyeHatPotatoe2.draw();
    }

    public static void main(String[] args) {
        PotatoeDriver driver = new PotatoeDriver();
        driver.run();
    }
}
