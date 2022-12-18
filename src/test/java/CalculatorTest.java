import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    void add() {
        //TODO inser your realisation in test-method add
        assertEquals(6,calculator.add(1,5) );
    }

    @Test
    void dif() {
        //TODO inser your realisation in test-method dif
        assertEquals(5,calculator.dif(7,2) );
    }

    @Test
    void div() {
        //TODO inser your realisation in test-method div
        assertEquals(3,calculator.div(9,3) );
    }

    @Test
    void times() {
        //TODO inser your realisation in test-method times
        assertEquals(5,calculator.times(1,5) );
    }

    @Test
    void solver() {
        //TODO inser your realisation in test-method solver
        assertEquals(1,calculator.solver(1,5,3,3,1) );
    }
}