package righttek;
import righttek.model.Employee;
import righttek.utils.*;
/**
 * @author Diego Yance
 */
public class EmployeeForm {
    public static void main(String[] args) {

        CalculatorSalary cs = new CalculatorSalary();
        Employee emp = RegisterEmployee.register();
        float salary = cs.calculate(emp);
        System.out.printf("El salario total de %s es de: %.2f %n", emp.getName(), salary);

    }
}
