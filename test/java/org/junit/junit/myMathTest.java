
package org.junit.junit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class myMathTest {

    private final myMath obj = new myMath();

    @Test
    void testSumWithValues() {
        assertEquals(6, obj.calculateSum(new int[]{1, 2, 3}));
    }

    @Test
    void testSumWithEmptyArray() {
        assertEquals(0, obj.calculateSum(new int[]{}));
    }
}
