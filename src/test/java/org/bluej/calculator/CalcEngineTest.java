package org.bluej.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalcEngineTest {

    @Test
    public void testNumberInput() {
        CalcEngine calcEngine = new CalcEngine();

        calcEngine.numberPressed(1);
        calcEngine.numberPressed(2);
        calcEngine.numberPressed(3);

        assertEquals(123, calcEngine.getDisplayValue());
    }

    @Test
    public void testAddition() {
        CalcEngine calcEngine = new CalcEngine();
        calcEngine.numberPressed(1);
        calcEngine.plus();
        calcEngine.numberPressed(2);
        calcEngine.equals();
        assertEquals(3, calcEngine.getDisplayValue());
    }

    @Test
    public void testSubtraction() {
        CalcEngine calcEngine = new CalcEngine();
        calcEngine.numberPressed(3);
        calcEngine.minus();
        calcEngine.numberPressed(1);
        calcEngine.equals();
        assertEquals(2, calcEngine.getDisplayValue());
    }
}
