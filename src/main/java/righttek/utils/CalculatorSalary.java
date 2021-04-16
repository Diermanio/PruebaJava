package righttek.utils;
import righttek.model.Employee;
import java.util.Scanner;

/**
 * @author Diego Yance
 */
public class CalculatorSalary {

    /** This method consists in calculate the estimated salary of an employee based on different parameters, if the
     * salary is more than 400, the employee gains a bonus based on a percentage of his accomplishment, also his
     * salary could possible have an augment based on his family charge
     *
     * @param emp Specifies the employee which is going to be calculated his salary
     * @return a float value that contains the salary of the employee passed
     */
    public float calculate(Employee emp, float percentage){

        if(emp.getSalary()<0){return -1;}
        Scanner sc = new Scanner(System.in);
        float charge = 0;
        System.out.println("Registrado exitosamente!");

        if(emp.isHasAdult()){charge+=0.09;}
        if(emp.isHasChild()){charge+=0.1;}
        if(emp.isHasCouple()){charge+=0.08;}

            /*En el ejercicio se detalla que se suma un porcentaje adicional al salario pero este esta expresado
            con el simbolo de porcentaje '%' por lo que se interpreta que las cargas seran de un 0.08%, 0.09%, 0.1%
            por lo que en la formula de divide para 100 este aumento para sacar el porcentaje
             */

        return emp.getSalary()*(1+charge/100) + percentage;
    }
}
