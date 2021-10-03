package singleton;
/**
 * This class checks if the user got the correct answer.
 * @author Christian Lee
 */
public class Question {
    private String question;
    private String[] answers;
    private int correctAnswer;
    /**
     * The constructor initializes the question and correct answer and puts the answers into the answers array. 
     * @param question The question that is being asked
     * @param ans1 The first answer choice
     * @param ans2 The second answer choice
     * @param ans3 The third answer choice
     * @param ans4 The fourth answer choice
     * @param correctAnswer The correct answer
     */
    public Question(String question, String ans1, String ans2, String ans3, String ans4, int correctAnswer){
        this.question = question;
        answers = new String[]{ans1, ans2, ans3, ans4};
        this.correctAnswer = correctAnswer;
    }
    /**
     * This method returns the question and the answer choices.
     */
    public String toString(){
        String trivia = question+"\n";
        trivia += "1. "+answers[0]+"\n2. "+answers[1]+"\n3. "+answers[2]+"\n4. "+answers[3];
        return trivia;
    }
    /**
     * This method checks to see if the user got the correct answer. 1 is added to the correct answer because it is zero based. 
     * @param userAnswer This is the answer the user submitted.
     * @return This returns a boolean if they got the answer right or not.
     */
    public boolean isCorrect(int userAnswer){
        if(userAnswer == correctAnswer+1)
            return true;
        return false;
    }
    /**
     * @return This method returns the correct answer in string form.
     */
    public String getCorrectAnswer(){
        return "The correct answer is "+answers[correctAnswer];
    }
}
