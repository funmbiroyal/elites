package elitesHotelTest;

import elitesHotel.Hotel;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {
    Hotel hotel;
    @BeforeEach
    void startAllTestWith(){
        hotel = new Hotel(5);
        assertNotNull(hotel);
    }
    @Test
    void testThatRoomCanBeBooked(){
        assertEquals("Room successfully booked!!!"
                ,hotel.bookRoom("Kinzy"));
    }
    @Test
    void testUserCanCheckOut(){
        hotel.bookRoom("kinzy");
        assertTrue(hotel.checkOut(1));
    }
    @Test
    void getAllRoomsTest(){
        assertEquals(10,hotel.getRooms());
    }
    @Test
    void getAvailableRooms(){
        hotel.bookRoom("ned");
        hotel.bookRoom("legend");
        hotel.bookRoom("femi");

//        assertEquals(2, hotel.getAvailableRooms());
    }
}
