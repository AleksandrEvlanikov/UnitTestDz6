import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageListTest {

    private AverageList averageList;

    @BeforeEach
    public void setUp() {
        averageList = new AverageList();
    }

    @Test
    public void testAverageListFirstGreater() {
        String textNum1 = "1 2 4 9 55";
        String textNum2 = "1 2 3 1 12";

        double actualList = averageList.averageListAfremetic(textNum1, textNum2);
        double expectedList = 14.2;

        assertEquals(expectedList, actualList);
    }

    @Test
    public void testAverageListTwoGreater() {
        String textNum1 = "1 2 3 1 12";
        String textNum2 = "1 2 4 9 55";

        double actualList = averageList.averageListAfremetic(textNum1, textNum2);
        double expectedList = 14.2;

        assertEquals(expectedList, actualList);
    }

    @Test
    public void testAverageListEqual() {
        String textNum1 = "1 2 4 9 55";
        String textNum2 = "1 2 4 9 55";

        double actualList = averageList.averageListAfremetic(textNum1, textNum2);
        double expectedList = 14.2;

        assertEquals(expectedList, actualList);
    }

    @Test
    public void testAverageListZeroString() {
        String textNum1 = "0";
        String textNum2 = "0";

        double actualList = averageList.averageListAfremetic(textNum1, textNum2);
        double expectedList = 0;

        assertEquals(expectedList, actualList);
    }
}
