import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C51Test {

    private C51 c51;

    @BeforeEach
    public void before() {
        c51 = new C51();
    }
    @Test
    public void testM1() {
        assertEquals(this.c51.m1(), "m1");
    }

    @Test
    public void testM2() {
        assertEquals(c51.m2(), "m2");
    }
}
