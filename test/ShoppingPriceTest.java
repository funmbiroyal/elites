import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practices.ShoppingPrice;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShoppingPriceTest {
    ShoppingPrice shoppingPrice;
    @BeforeEach
    void setUp(){
        shoppingPrice = new ShoppingPrice();
    }
    @Test
    void displayMainMenu_test(){
        assertEquals("""
                To Check book price, press 1
                To Check bag price, press 2
                To Check Shoe price, press 3
                """, shoppingPrice.displayOption());
    }
    @Test
    void getBookPrice_test(){
        assertEquals(200,shoppingPrice.getBookPrice());
    }
    @Test
    void getBagPrice_test(){
        assertEquals(100,shoppingPrice.getBagPrice());
    }
    @Test
    void getShoePrice_test(){
        assertEquals(300,shoppingPrice.getShoePrice());
    }
    @Test
    void calculateBookQuantityPrice_test(){
       int priceOfBooks = shoppingPrice.calculateBookQuantityPrice(2);
        assertEquals(400,priceOfBooks);
    }
    @Test
    void calculateBagQuantityPrice_test(){
        int priceOfBags = shoppingPrice.calculateBagQuantityPrice(3);
        assertEquals(300,priceOfBags);
    }
    @Test
    void calculateShoeQuantityPrice_test(){
        int priceOfShoes = shoppingPrice.calculateShoeQuantityPrice(4);
        assertEquals(1200,priceOfShoes);
    }
}
