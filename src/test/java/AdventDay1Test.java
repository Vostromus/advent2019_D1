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
}