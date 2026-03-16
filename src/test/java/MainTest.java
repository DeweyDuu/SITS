import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
	@Test
    public void testMainConstructor() {
        new Main(); 
    }
    @Test
    public void testMain() {
        try {
            String[] args = {};
            Main.main(args);
        } catch (Exception e) {
        	fail("Crash XD ");
        }
    }
}