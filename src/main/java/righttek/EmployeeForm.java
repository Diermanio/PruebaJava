package righttek;
import righttek.model.Employee;
import righttek.utils.*;
import java.util.Scanner;
/**
 * @author Diego Yance
 */
public class EmployeeForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculatorSalary cs = new CalculatorSalary();
        Employee emp = RegisterEmployee.register();
        float percentage = 0;
        if(emp.getSalary()>400){
            System.out.println("Ingrese el porcentaje de cumplimiento del empleado: ");
            percentage = Float.parseFloat(sc.nextLine());
        }
        float salary = cs.calculate(emp, percentage);
        System.out.printf("El salario total de %s es de: %.2f %n", emp.getName(), salary);

    }
}
