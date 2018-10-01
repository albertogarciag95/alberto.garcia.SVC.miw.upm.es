
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C22Test {

    private C22 c22;

    @BeforeEach
    public void before() {
        c22 = new C22();
    }
    @Test
    public void testMA() {
        assertEquals(c22.mA(), "mA");
    }

}
