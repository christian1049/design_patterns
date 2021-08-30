package strategy;

import java.util.ArrayList;

/**
 * Runs the Guest List Program
 */
public class ListDriver {
    private GuestList gList;

    /**
     * Creates the new Guest List
     */
    public ListDriver() {
        gList = new GuestList("Thanksgiving Celebration");
    }

    /**
     * Adds and removes guests from the list, then displays the lsit
     */
    public void run() {
        addGuest("Amy");
        addGuest("Jamie");
        addGuest("Kyle");
        addGuest("Brad");
        addGuest("Micheal");
        addGuest("brad");
        addGuest("Trevor");
        addGuest("Jamie");
        removeGuest("Kyle");
        removeGuest("Kevin");

        BinarySearch bSearch = new BinarySearch();
        gList.setSearchBehavior(bSearch);

        addGuest("Sara");
        addGuest("Kim");
        addGuest("Jamie");
        removeGuest("Amy");
        removeGuest("Ashley");

        displayList();
    }

    /**
     * Loops through and displays each member of the guest list
     */
    private void displayList() {
        System.out.println("\n" + gList.getTitle());
        ArrayList<String> guests = gList.getList();

        for (String guest : guests) {
            System.out.println("  - " + guest);
        }
    }

    /**
     * Attempts to add the guest to the guest list
     * 
     * @param guest The name to add to the list
     */
    private void addGuest(String guest) {
        if (gList.add(guest)) {
            System.out.println(guest + " was added to the list!");
        } else {
            System.out.println(guest + " is already on the list");
        }
    }

    /**
     * Attempts to remove the guest from the list
     * 
     * @param guest the name to remove from the list
     */
    private void removeGuest(String guest) {
        if (gList.remove(guest)) {
            System.out.println(guest + " was successfully remove from the list.");
        } else {
            System.out.println(guest + " was not on the list, so he/she couldn't be removed");
        }
    }

    public static void main(String[] args) {
        ListDriver driver = new ListDriver();
        driver.run();
    }
}
