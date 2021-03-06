import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C31Test {

    private C31 c31;

    @BeforeEach
    public void before() {
        c31 = new C31();
    }
    @Test
    public void testM1() {
        assertEquals(this.c31.m1(), "m1");
    }

    @Test
    public void testM2() {
        assertEquals(c31.m2(), "m2");
    }
}
