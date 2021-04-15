package righttek;
import righttek.model.employee;
import righttek.utils.*;
/**
 * @author Diego Yance
 */
public class employeeForm {
    public static void main(String[] args) {

        calculatorSalary cs = new calculatorSalary();
        employee emp = registerEmployee.register();
        float salary = cs.calculate(emp);
        System.out.printf("El salario total de %s es de: %.2f %n", emp.getName(), salary);

    }
}
