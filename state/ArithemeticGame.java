package state;

import java.util.Scanner;
/**
 * The arithemetic game class
 * @author Christian Lee
 */
public class ArithemeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;
    public Scanner keyboard;
    /**
     * This is the constructor for the arithemetic game
     */
    public ArithemeticGame(){
        easyState = new Easy(this);
        mediumState = new Medium(this);
        hardState = new Hard(this);
        this.score = 0;
        keyboard = new Scanner(System.in);
        this.state = easyState;
        if (state.equals(mediumState)){
            state = mediumState;
        }
        else if (state.equals(hardState)){
            state = hardState;
        }
    }
    /**
     * This class gets the two numbers and the operation and checks if it is right or wrong
     */
    public void pressQuestionButton(){
        int num1 = state.getNum();
        int num2 = state.getNum();
        String operation = state.getOperation();
        System.out.println(num1+" "+operation+" "+num2+":");
        int userInput = keyboard.nextInt();
        int answer = 1;
        if(operation == "+"){
            answer = num1 + num2;
        }
        else if(operation == "-"){
            answer = num1 - num2;
        }
        else if(operation == "*"){
            answer = num1 * num2;
        }
        else if(operation == "/"){
            answer = num1 / num2;
        }
        if(answer == userInput){
            score += 1;
            System.out.println("Correct");
        }
        else{
            score -= 1;
            System.out.println("Incorrect");
        }
        if(score >= 3){
            score = 0;
            state.levelUp();
        }
        else if(score <= -3){
            score = 0;
            state.levelDown();
        }
    }
    /**
     * This returns the state the game is in
     * @param state The level the user is in
     */
    public void setState(State state){
        this.state = state;
    }
    /**
     * This gets the easy state
     * @return Returns the easy state
     */
    public State getEasyState(){
        return easyState;
    }
    /**
     * This gets the medium state
     * @return Returns the medium state
     */
    public State getMediumState(){
        return mediumState;
    }
    /**
     * This gets the hard state
     * @return Returns the hard state
     */
    public State getHardState(){
        return hardState;
    }
}
