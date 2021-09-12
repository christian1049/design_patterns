package decorator;
/**
 * This class changes the nose of the potato head.
 * @author Christian Lee
 */
public class Nose extends CharacterDecorator{
    /**
     * This allows the character to be edited.
     * @param character The character that is being edited
     */
    public Nose(Character character){
        super(character);
    }
    /**
     * This changes the potato head.
     */
    public void customize(){
        sections.set(4, " |    <   |");
    }
}
