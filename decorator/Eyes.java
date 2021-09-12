package decorator;

/**
 * This class edits the eyes of the potato head.
 * @author Christian Lee
 */

public class Eyes extends CharacterDecorator{
    /**
     * This constructor allows the character's eyes to be edited.
     * @param character This is the character that is being created 
     */
    public Eyes(Character character){
        super(character);
    }
/**
 * This changes the eyes of the potato head
 */
    public void customize(){
        sections.set(3, " |  0  0  |");
    }
}
