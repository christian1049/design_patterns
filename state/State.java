package state;
/**
 * This is the state interface
 * @author Christian Lee
 */
public interface State {
    public int getNum();
    public String getOperation();
    public void levelUp();
    public void levelDown();
}
