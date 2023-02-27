import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import Chp2.Comparison;

import static org.junit.jupiter.api.Assertions.*;

public class ComparisonTest {
    Comparison comparison;

@BeforeEach
void startAllTestWith(){

    comparison = new Comparison();
}

    @Test
    void addThreeIntegers(){
    int sum = comparison.addThreeIntegers(2,3,5);
    assertEquals(10,sum);
    }

    @Test
    void findMinimumOfThreeIntegers(){
        assertEquals(3,comparison.findMinimum(3,5,10) );
    }
    @Test
    void findProductOfThreeIntegers(){
        assertEquals(8,comparison.findProduct(2,2,2) );
    }

}


