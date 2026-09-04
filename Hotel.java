package miscelleneous.hotelManagement;
import java.util.*;

public class Hotel {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HotelService hs = new HotelService();

        Rooms r1 = new Rooms(101,20.5,"SingleBed");
        Rooms r2 = new Rooms(102,22,"DoubleBed");
        Rooms r3 = new Rooms(103,34.5,"suite");

        Guests g1 = new Guests("Alice", 02);
        Guests g2 = new Guests("John", 03);

        System.out.println("========================================");
        System.out.println("        HOTEL MANAGEMENT SYSTEM         ");
        System.out.println("========================================");

        System.out.print("Are you Hotel staff of Guest?(1/2): ");
        int checkPerson = sc.nextInt();

        if (checkPerson == 1){
            while (true){
                System.out.println("1.Add Room");
                System.out.println("2.Display available Room");
                System.out.println("3.Add guest");
                System.out.println("4.Find guest by ID");
                System.out.println("5.Remove Guest");
                System.out.println("6.exit");
                System.out.print("Enter Choice: ");
                int choice = sc.nextInt();
                if(choice==1){
                  hs.addrRoom(r1);
                  hs.addrRoom(r2);
                  hs.addrRoom(r3);
                  System.out.println();
                }
                if(choice==2){
                    hs.displayAvailableRooms();
                    System.out.println();
                }
                if(choice == 3){
                    hs.addGuest(g1);
                    hs.addGuest(g2);
                    System.out.println("Guest added!");

                    System.out.println();
                }
                if(choice == 4){
                   hs.fingGuestbyID(02);
                   hs.fingGuestbyID(03);
                   hs.fingGuestbyID(07);

                    System.out.println();
                }
                if(choice == 5){
                  hs.removeGuest(g2);
                  System.out.println("Guest removed!");

                    System.out.println();
                }
                if(choice == 6){
                    System.out.println("Program Ends!");
                    break;
                }
            }
        }


    }
}
