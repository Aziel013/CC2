/**
 * Created: January 13, 2021
 * Instructions: Create a class named Book that contains data fields for the title and number of pages.
 * Include get and constructor methods for these fields. Next, create a subclass named Textbook,
 * which contains an additional field that holds a grade level for the Textbook and additional methods
 * to get and set the grade level field. Write an application (Main class) that demonstrates constructors,
 * accessors and mutators using objects of each class.
 */
 
public class Book {
    public static void main(String args[]){
        Books penelope = new Books();
        penelope.setTitle("The Stars");
        penelope.setNumberOfPages(456);
        System.out.println("Book Title: "+penelope.getTitle()+
                "\nNumber of Pages: "+penelope.getNumberOfPages());
        Textbook penelope2 = new Textbook();
        penelope2.setGradeLevel(3);
        System.out.print("Grade Level: "+penelope2.getGradeLevel());
    }
}
class Books{
    protected String title;
    protected int numberOfPages;

    public Books(){

    }

    public Books(String title, int numberOfPages){
        this.title = "";
        this.numberOfPages = 0;
    }
    // accessors
    public String getTitle(){
        return title;
    }

    public int getNumberOfPages(){
        return numberOfPages;
    }

    // mutator
    public void setTitle(String t){
        title = t;
    }

    public void setNumberOfPages(int nop){
        numberOfPages = nop;
    }
}
class Textbook extends Book{
    private int gradeLevel;

    public Textbook(){
        this.gradeLevel = 0;
    }
    public int getGradeLevel(){
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel){
        this.gradeLevel = gradeLevel;
    }
}
