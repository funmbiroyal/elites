package elitesHotel;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class Hotel {
    private final String [] rooms;

    public Hotel(int roomLength){
        this.rooms = new String[roomLength];
    }
    public String bookRoom(String user) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                rooms[i] = user;
                break;
            }
        }
        return "Room successfully booked!!!";
    }

    public boolean checkOut(int roomNumber) {
        boolean hasCheckedOut = false;
        if (rooms[roomNumber-1]!= null){
            rooms[roomNumber-1] = null;
            hasCheckedOut = true;
        }
        return hasCheckedOut;
    }
    public int getRooms(){
        return rooms.length;
    }














    //    public int getAvailableRooms() {
//        int availableRooms = -1;
//        for (int i = 0; i < rooms.length ; i++) {
//            if (rooms[i] == null) {
//              availableRooms = rooms.length - i;
//            }
//        }
//      return availableRooms;
//    }
}
