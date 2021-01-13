/**
 * Created: January 13, 2021
 * Instructions: Create a class named Year that contains a data field that holds the number of days in a year.
 * Include a get method that displays the number of days and a constructor that sets the number of days to 365.
 *
 * Create a subclass named LeapYear. LeapYear’s constructor overrides Year’s constructor and
 * sets the number of days to 366.
 *
 * Write an application (Main class) that instantiates one object of each class and displays their data.
 */
public class Year {
    public static void main(String args[]) {
        Years year = new Years();
        System.out.println("Number of Days in a year: " + year.getNumberOfDays());
        LeapYear leap = new LeapYear();
        System.out.println("Number of days in leap year: " + leap.getNumberOfDays());
    }
}

class Years{
    protected int numberOfDays;

    public Years(){
        this.numberOfDays = 365;
    }

    public int getNumberOfDays(){
        return numberOfDays;
    }

    public void setNumberOfDays(int numberOfDays){
        this.numberOfDays =  numberOfDays;
    }
}

class LeapYear extends Years{
    public LeapYear(){
        super.numberOfDays = 366;
    }
}
