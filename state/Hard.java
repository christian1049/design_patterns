package state;
import java.util.Random; 
/**
 * This is the hard level class
 * @author Christian Lee
 */
public class Hard implements State{
    private ArithemeticGame game;
    private Random rando;
    /**
     * This is the hard level constructor
     * @param game This is the arithemetic game being initialized
     */
    public Hard(ArithemeticGame game){
        this.game = game;
        rando = new Random();
    }
    /**
     * This get a random integer
     * @return Returns a random integer
     */
    public int getNum(){
        int num = rando.nextInt(100);
        return num += 1;
    }
    /**
     * This get a random operation
     * @return Returns a random operation
     */
    public String getOperation(){
        int operation = rando.nextInt(4);
        if(operation == 0){
            return "+";
        }
        else if(operation == 1){
            return "-"; 
        }
        else if(operation == 2){
            return "*"; 
        }
        return "/";
    }
    /**
     * This sends a message to the user that they are doing well
     */
    public void levelUp(){
        System.out.println("You are doing sooo well!");
    }
    /**
     * This levels the user down from hard difficulty to medium difficulty
     */
    public void levelDown(){
        game.setState(game.getMediumState());
        System.out.println("You are struggling. let's go to medium mode");
    }
}