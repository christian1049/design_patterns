package state;
import java.util.Random; 
/**
 * This is the easy level class
 * @author Christian Lee
 */
public class Easy implements State{
    private ArithemeticGame game;
    public Random rando;
    /**
     * This is the easy level constructor
     * @param game This is the arithemetic game being initialized
     */
    public Easy(ArithemeticGame game){
        this.game = game;
        rando = new Random();
    }
    /**
     * This gets a random  number
     * @return This returns a random integer
     */
    public int getNum(){
        int num = rando.nextInt(10);
        return num += 1;
    }
    /**
     * This gets a random operation
     * @return Returns a random operation
     */
    public String getOperation(){
        int operation = rando.nextInt(2);
        if(operation == 1){
            return "+";
        }
        return "-";
    }
    /**
     * This levels up the easy level to the medium level
     */
    public void levelUp(){
        game.setState(game.getMediumState());
        System.out.println("You've been advanced to medium mode");
    }
    /**
     * This outputs a message to the user that they are struggling
     */
    public void levelDown(){
        System.out.println("You seem to be struggling, you may want to study.");
    }
}
