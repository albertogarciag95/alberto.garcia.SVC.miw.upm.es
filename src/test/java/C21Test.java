
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C21Test {

    private C21 c21;

    @BeforeEach
    public void before() {
        c21 = new C21();
    }
    @Test
    public void testM1() {
        assertEquals(this.c21.m1(), "m1");
    }

    @Test
    public void testM2() {
        assertEquals(c21.m2(), "m2");
    }
}
