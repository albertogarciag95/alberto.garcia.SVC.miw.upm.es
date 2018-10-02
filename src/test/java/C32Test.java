import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C32Test {

    private C32 c32;

    @BeforeEach
    public void before() {
        c32 = new C32();
    }
    @Test
    public void testMA() {
        assertEquals(this.c32.mA(), "mA");
    }
}
