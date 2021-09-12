package decorator;
/**
 * This class changes the mouth of the potato head.
 * @author Christian Lee
 */
public class Mouth extends CharacterDecorator{
/**
 * This allows the character to be changed.
 * @param character The character that is being changed
 */
    public Mouth(Character character){
        super(character);
    }
/**
 * This method changes the original set of strings to the new mouth.
 */
    public void customize(){
        sections.set(5, " \\  ----  /");
    }
}
