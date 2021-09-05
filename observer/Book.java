package observer;

/**
 * This class gets the title, author first and last name.
 * @author Christian Lee
 */
public class Book {
    private String title;
    private String authorFirstName;
    private String authorLastName;
    /**
     * These three variables were initialized.
     * @param title This is the book title
     * @param authorFirstName This is the author's first name
     * @param authorLastName This is the author's last name
     */
    public Book(String title, String authorFirstName, String authorLastName){
        this.title = title;
        this.authorFirstName = authorFirstName;
        this.authorLastName = authorLastName;
    }
    /**
     * The next three methods get the title and author's first and last name and returns them. The toString method returns the book title and the author's name in a new format.
     * @return
     */
    public String getTitle(){
        return title;
    }
    public String getAuthorFirstName(){
        return authorFirstName;
    }
    public String getAuthorLastName(){
        return authorLastName;
    }
    public String toString(){
        return "- "+title+" by: "+authorFirstName+" "+authorLastName;
    }
}
