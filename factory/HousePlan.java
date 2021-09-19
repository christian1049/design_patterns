package factory;
/**
 * This parent class initializes the variables needed for the each house type and prints them out.
 * @author Christian Lee
 */
import java.util.ArrayList;

public abstract class HousePlan {
    protected ArrayList<String> materials;
    protected ArrayList<String> features;
    private int numRooms;
    private int numWindows;
    private int squareFeet;
    /**
     * The constructor initialized the variables and called the abstract methods setMaterials and setFeatures.
     * @param numRooms The number of rooms in each house plan
     * @param numWindows The number of windows in each house plan
     * @param squareFeet The square footage of each house plan
     */
    public HousePlan(int numRooms, int numWindows, int squareFeet){
        this.numRooms = numRooms;
        this.numWindows = numWindows;
        this.squareFeet = squareFeet;
        this.materials = new ArrayList<>();
        this.features = new ArrayList<>();
        setMaterials();
        setFeatures();
        toString();
    }
    protected abstract void setMaterials();

    protected abstract void setFeatures();
    /**
     * Returned the variables needed
     */
    public ArrayList<String> getMaterials(){
        return this.materials;
    } 
    public ArrayList<String> getFeatures(){
        return this.features;
    } 
    public int getNumRooms(){
        return numRooms;
    }
    public int getNumWindows(){
        return numWindows;
    }
    public int getSquareFeet(){
        return squareFeet;
    }
    public String toString(){
        String mats = "";
        String feats = "";
        for(String i: materials){ 
            mats += i +" \n";
        }
        for(String i: features){
            feats += i +" \n";
        }
        String details = "\nSquare Feet: "+getSquareFeet()+"\nRoom: "+getNumRooms()+"\nWindows: "+getNumWindows()+"\n\nMaterials: \n"+mats+"\nFeatures: \n"+feats;
        return details;
    }

}

