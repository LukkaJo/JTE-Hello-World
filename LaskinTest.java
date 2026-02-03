import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class LaskinTest {

    @Test
    public void testPlus() {
        // Testataan, että 1 + 1 on 2
        assertEquals(2, Laskin.plus(1, 1));
    }
}
