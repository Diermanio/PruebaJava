package righttek.utils;

import static org.junit.jupiter.api.Assertions.*;
import righttek.model.Employee;

class CalculatorSalaryTest {

    @org.junit.jupiter.api.Test
    void calculate() {
        Employee emp = new Employee(1000, "Diego", false, false, false);
        CalculatorSalary cs = new CalculatorSalary();
        float valorEsperado = cs.calculate(emp, 100);
        float valorReal = 1100f;
        assertEquals(valorEsperado,valorReal);
    }

    @org.junit.jupiter.api.Test
    void calculate2() {
        Employee emp = new Employee(1000, "Diego", true, true, true);
        CalculatorSalary cs = new CalculatorSalary();
        float valorEsperado = cs.calculate(emp, 100);
        float valorReal = 1102.7f;
        assertEquals(valorEsperado,valorReal);
    }

    @org.junit.jupiter.api.Test
    void calculate3() {
        Employee emp = new Employee(200, "Diego", false, false, false);
        CalculatorSalary cs = new CalculatorSalary();
        float valorEsperado = cs.calculate(emp, 0);
        float valorReal = 200f;
        assertEquals(valorEsperado,valorReal);
    }

    @org.junit.jupiter.api.Test
    void calculate4() {
        Employee emp = new Employee(400, "Diego", false, false, false);
        CalculatorSalary cs = new CalculatorSalary();
        float valorEsperado = cs.calculate(emp, 0);
        float valorReal = 400f;
        assertEquals(valorEsperado,valorReal);
    }

    @org.junit.jupiter.api.Test
    void calculate5() {
        Employee emp = new Employee(-1000, "Diego", false, false, false);
        CalculatorSalary cs = new CalculatorSalary();
        float valorEsperado = cs.calculate(emp, 0);
        float valorReal = -1;
        assertEquals(valorEsperado,valorReal);
    }
}