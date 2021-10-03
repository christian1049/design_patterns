package singleton;
/**
 * This class creates an instance of the trivia game 
 * @author Christian Lee
 */
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class TriviaGame {
    private static TriviaGame triviaGame = new TriviaGame();
    private int score;
    private Random rand;
    private Scanner reader;
    private ArrayList<Question> questions;
    /**
     * The constructor initialized the variables and imported the trivia questions into the questions array list.
     */
    private TriviaGame(){
        questions = DataLoader.getTriviaQuestions();
        this.score = 0;
        this.rand = new Random();
        this.reader = new Scanner(System.in);
    }
    /**
     * This method creates an instance of the trivia game.
     * @return This returns an instance of the trivia game.
     */
    public static TriviaGame getInstance(){
        if(triviaGame == null){
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }
    /**
     * This method allows the user to continually play the game or quit. 
     */
    public void play(){
        boolean repeat = true;
        while(repeat){
            playRound();
            System.out.println("(P)lay or (Q)uit");
            String response = reader.next();
            if(response.equalsIgnoreCase("p")){
                playRound();
            }
            else if(response.equalsIgnoreCase("q")){
                if(score == 1){
                    System.out.println("You have won 1 game");
                }
                else{
                    System.out.println("You have won "+score+" games");
                }
                repeat = false;
            }
            else{
                System.out.println("Error! (P)lay or (Q)uit");
            }
        }
    }
    /**
     * This method prints out the question and the answer choices and checks if they got it right. It returns a boolean
     * @return
     */
    private boolean playRound(){
        int randomNumber = rand.nextInt(questions.size());
        Question question = questions.get(randomNumber);
        System.out.println(question+"\nEnter Answer: ");
        int userInput = reader.nextInt();
        if(question.isCorrect(userInput)){
            System.out.println("Yay! You got it right!");
            score++;
            return true;
        }
        else if(!question.isCorrect(userInput)){
            System.out.println("You got it wrong");
            return false;
        }
        else{
            System.out.println("Error! Invalid Number");
            return false;
        }
    }
}
