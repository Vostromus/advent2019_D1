import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class AdventDay1Test {
    @Test
    @DisplayName("Advent Day 1 Test")
    void returnsAdventDayOneTest(){
        AdventDay1 adventDay1 = new AdventDay1();
        assertEquals("Day 1 Test", adventDay1.dayOneTest(),"Should return 'Day 1 Test'");
    }

    @Test
    @DisplayName("Find Required Fuel")
    void testRequiredFuel(){
        AdventDay1 adventDay1 = new AdventDay1();
        assertEquals(2,adventDay1.findReqFuel(12));
        assertEquals(2,adventDay1.findReqFuel(14));
        assertEquals(654,adventDay1.findReqFuel(1969));
        assertEquals(33583,adventDay1.findReqFuel(100756));
    }

    @Test
    @DisplayName("Find Total Required Fuel")
    void testTotalRequiredFuel(){
        AdventDay1 adventDay1 = new AdventDay1();
        int[] massValues = {12,14,1969,100756};
        assertEquals(34241,adventDay1.findTotalReqFuel(massValues));
    }
}