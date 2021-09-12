package decorator;
/**
 * This class changes the hat of the potato head.
 * @author Christian Lee
 */
public class Hat extends CharacterDecorator{
    /**
     * This allows the character to be changed
     * @param character This is the character that is being changed
     */
    public Hat(Character character){
        super(character);
    }
    /**
     * This method changes the original set of strings to the new hat.
     */
    public void customize(){
        sections.set(1, " __|____|__");
    }
}
