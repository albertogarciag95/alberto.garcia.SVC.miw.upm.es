import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class C11Test {

    private C11 c11;

    @BeforeEach
    public void before() {
        c11 = new C11();
    }
    @Test
    public void testM1() {
        assertEquals(this.c11.m1(), "m1Hotfix");
    }

    @Test
    public void testM2() {
        assertEquals(c11.m2(), "m2");
    }
}