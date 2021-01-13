/**
 * Created: January 13, 20221
 * Instructions: Create a class named HotelRoom that includes an integer field for the roomNumber and
 * a double field for the roomRate. Include get methods for these fields and a constructor that
 * requires an integer argument representing the room number. The constructor sets the room rate
 * based on the room number; rooms numbered 299 and below are $69.95 per night, and others are $89.95 per night.
 *
 * Create an extended class named Suite whose constructor requires a room number and
 * adds a $40 surcharge to the regular hotel room rate, which again is based on the room number.
 *
 * Write an application (Main class) that creates an object of each class,
 * and demonstrate that all the methods work correctly.
 */
 
public class HotelRoom {
    public static void main(String args[]){
        HotelRooms hotel = new HotelRooms(222);
        System.out.println("Hotel Number is "+hotel.getRoomNumber()+
                "\nHotel Rate is "+hotel.getRoomRate());

        HotelRooms hotel2 = new HotelRooms(333);
        System.out.println("\nHotel Number is "+hotel2.getRoomNumber()+
                "\nHotel Rate is "+hotel2.getRoomRate());

        Suite suite = new Suite(221);
        System.out.println("\nHotel Number is "+suite.getRoomNumber()+
                "\nHotel Rate is "+suite.getRoomRate());

        Suite suite2 = new Suite(334);
        System.out.println("\nHotel Number is "+suite2.getRoomNumber()+
                "\nHotel Rate is "+suite2.getRoomRate());
    }
}

class HotelRooms{
    protected int roomNumber;
    protected double roomRate;

    public HotelRooms(){

    }

    public HotelRooms(int roomNumber){
        this.roomNumber = roomNumber;
        if( roomNumber <= 299)
        {
            roomRate =  69.95;
        }
        else
        {
            roomRate = 89.95;
        }
    }

    public int getRoomNumber(){
        return roomNumber;
    }

    public double getRoomRate(){
        return roomRate;
    }

    public void setRoomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }

    public void setRoomRate(double roomRate){
        this.roomRate = roomRate;
    }
}

class Suite extends HotelRooms{
    public Suite(){

    }

    public Suite(int roomNumber){
        super(roomNumber);
        super.roomRate = getRoomRate() + 40;
    }
}
