package state;
import java.util.Random; 
/**
 * This is the medium level class
 * @author Christian Lee
 */
public class Medium implements State{
    private ArithemeticGame game;
    private Random rando;
    /**
     * This is the medium level constructor
     * @param game This is the arithemetic game being initialized
     */
    public Medium(ArithemeticGame game){
        this.game = game;
        rando = new Random();
    }
    /**
     * This gets a random integer
     * @return Returns a random integer
     */
    public int getNum(){
        int num = rando.nextInt(50);
        return num += 1;
    }
    /**
     * This gets a random operation
     * @return Returns a random operation
     */
    public String getOperation(){
        int operation = rando.nextInt(3);
        if(operation == 0){
            return "+";
        }
        else if(operation == 1){
            return "-"; 
        }
        else {
            return "*";
        }
    }
    /**
     * This levels up from medium difficulty to hard difficulty
     */
    public void levelUp(){
        game.setState(game.getHardState());
        System.out.println("You've been advanced to the hardest mode.");
    }
    /**
     * This levels down from medium difficulty to easy difficulty
     */
    public void levelDown(){
        game.setState(game.getEasyState());
        System.out.println("You are struggling, let's go to easy mode.");
    }
}