package com.ymatin.education.junit_testing;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class QMathTest {

    @Rule public ExpectedException exception = ExpectedException.none();

    @Test
    public void sumWithPositiveArguments() {
        assertEquals("2 + 3 = 5",5, QMath.sum(2,3));
        assertEquals("3 + 3 = 6",6, QMath.sum(3,3));
    }

    @Test
    public void sumWithOnePositiveArgumentAndOneNegativeArgument() {
        assertEquals("2 + (-3) = -1", -1, QMath.sum(2,-3));
        assertEquals("(-2) + 3 = 1", 1, QMath.sum(-2,3));
    }

    @Test
    public void divideFailWithZeroArgument() {
        exception.expect(ArithmeticException.class);
        exception.expectMessage("/ by zero");
        QMath.divide(1, 0);
    }

    @Test
    public void difWithPositiveArguments() {
        assertEquals("5 - 3 = 2",2, QMath.diff(5, 3));
    }
}