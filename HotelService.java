package miscelleneous.hotelManagement;

import java.util.*;

public class HotelService {
    ArrayList<Guests> guestList = new ArrayList<>();
    ArrayList<Rooms> roomList = new ArrayList<>();
    ArrayList<Rooms> bookedRooms = new ArrayList<>();

    public void addrRoom(Rooms room) {
        roomList.add(room);
        System.out.println("Room added successfully!");
    }

    public void displayAllRooms() {
        System.out.println(roomList);
    }

    public void displayAvailableRooms() {
        System.out.println(roomList);
        System.out.println("Rooms not available:" + bookedRooms);
    }

    public void bookRoom(Rooms room) {
        if (bookedRooms.contains(room)) {
            System.out.println("Room already booked");
        } else {
            bookedRooms.add(room);
            roomList.remove(room);
            System.out.println("Room booked");
        }
    }

    public void addGuest(Guests guest){
        guestList.add(guest);
        System.out.println("Guest list:" + guestList);
    }
    public void removeGuest(Guests guest){
        guestList.remove(guest);
        System.out.println("Guest list:" + guestList);
    }

    public void fingGuestbyID(int guestId) {
        for (Guests guests:guestList){
            if (guests.guestId == guestId){
                guestList.remove(guestId);
            }
            else {
                System.out.println("Guest not found");
            }

        }
    }


}
