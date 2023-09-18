import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyMath {
    public static int add(int a, int b) {
        return a + b;
    }


    @Test
    public void testAddition() {
        int result = MyMath.add(2, 3);
        assertEquals(5, result);
    }
}

