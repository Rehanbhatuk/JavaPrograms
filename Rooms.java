package miscelleneous.hotelManagement;

public class Rooms {
    int roomNumber;
    double price;
    String type;
    public Rooms(int roomNumber, double price, String type){
       this.roomNumber = roomNumber;
       this.price = price;
       this.type = type;
    }
    public String toString() {

        String printstatement ="";
        if (roomNumber != 0 ){
            printstatement += "RoomNumber:"+ roomNumber + " ";
        }

        if (price != 0){
            printstatement += "Price:" + price + " ";
        }



        if (type != null){
            printstatement += "Type" + type;
        }

        return printstatement;
    }
}


