package decorator;

/**
 * This project will create various potatoe heads.
 * @author Christian Lee
 */

 import java.util.ArrayList;

public abstract class Character {
    protected ArrayList<String> sections;
    
/**
     * Initialized the array list to size 7.
     */
    public Character(){
        this.sections = new ArrayList<>();
    
    }
/**
 * Loops through each string in sections and prints it out.
 */
    public void draw(){
        for(String i: sections){
            System.out.println(i);
        }
    }
 }

