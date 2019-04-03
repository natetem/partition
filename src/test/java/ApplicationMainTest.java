import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ApplicationMainTest {

    private static ApplicationMain api;

    @BeforeAll
    public static void beforeMain() {
        api = new ApplicationMain();
    }

    @BeforeEach
    public void beforeTest() {
        System.out.println(" Before*******************");
    }

    @AfterEach
    public void afterTest() {
        System.out.println(" After*******************");
    }


    @Test
    void partition_for_two_length() {
        int[] list = {1, 2, 3, 4, 5};
        int n = 2;
        List<int[]> listOut = api.partition(list, n);
        int[] excepted = {1, 2};
        assertArrayEquals(listOut.get(0), excepted);
    }

    @Test
    void partition_for_three_length() {
        int[] list = {1, 2, 3, 4, 5};
        int n = 3;
        List<int[]> listOut = api.partition(list, n);
        assertEquals(listOut.size(), 2);
    }

    @Test
    void partition_for_one_length() {
        int[] list = {1, 2, 3, 4, 5};
        int n = 1;
        List<int[]> listOut = api.partition(list, n);
        assertEquals(listOut.size(), 5);
    }
}