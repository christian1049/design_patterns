package decorator;
/**
 * This class initializes sets the character.
 * @author Christian Lee
 */
public abstract class CharacterDecorator extends Character{
    protected Character character;
/**
 * This constructor sets the character, loops through the sections, and also calls the abstract method customize.
 * @param character
 */
    public CharacterDecorator(Character character){
        super();
        this.character = character;
        this.sections = character.sections;
        customize();
    }

    public abstract void customize();

}
