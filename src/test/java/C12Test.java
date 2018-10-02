import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C12Test {

    private C12 c12;

    @BeforeEach
    public void before() {
        c12 = new C12();
    }
    @Test
    public void testMA() {
        assertEquals(this.c12.mA(), "mA");
    }
}
