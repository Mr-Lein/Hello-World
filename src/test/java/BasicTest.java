import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BasicTest {
    @Test
    public void testCodeRuns() {
        try {
            HelloWorld.main(new String[]{});
        } catch (Exception e) {
            fail("The code threw an exception: " + e.getMessage());
        }
    }
}

