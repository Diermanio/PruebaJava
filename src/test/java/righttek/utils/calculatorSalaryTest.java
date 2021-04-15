package righttek.utils;

import static org.junit.jupiter.api.Assertions.*;
import righttek.model.employee;
import righttek.utils.*;

class calculatorSalaryTest {

    @org.junit.jupiter.api.Test
    void calculate() {
        employee emp = new employee(1000, "Diego", false, false, false);
        calculatorSalary cs = new calculatorSalary();
        float valorEsperado = cs.calculate(emp);
        float valorReal = 1100f;
        assertEquals(valorEsperado,valorReal);
    }

    @org.junit.jupiter.api.Test
    void calculate2() {
        employee emp = new employee(1000, "Diego", true, true, true);
        calculatorSalary cs = new calculatorSalary();
        float valorEsperado = cs.calculate(emp);
        float valorReal = 1102.7f;
        assertEquals(valorEsperado,valorReal);
    }

    @org.junit.jupiter.api.Test
    void calculate3() {
        employee emp = new employee(200, "Diego", false, false, false);
        calculatorSalary cs = new calculatorSalary();
        float valorEsperado = cs.calculate(emp);
        float valorReal = 200f;
        assertEquals(valorEsperado,valorReal);
    }

    @org.junit.jupiter.api.Test
    void calculate4() {
        employee emp = new employee(400, "Diego", false, false, false);
        calculatorSalary cs = new calculatorSalary();
        float valorEsperado = cs.calculate(emp);
        float valorReal = 400f;
        assertEquals(valorEsperado,valorReal);
    }

    @org.junit.jupiter.api.Test
    void calculate5() {
        employee emp = new employee(-1000, "Diego", false, false, false);
        calculatorSalary cs = new calculatorSalary();
        float valorEsperado = cs.calculate(emp);
        float valorReal = -1;
        assertEquals(valorEsperado,valorReal);
    }
}