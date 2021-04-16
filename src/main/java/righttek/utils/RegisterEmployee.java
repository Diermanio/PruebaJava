package righttek.utils;
import righttek.model.Employee;
import java.util.Scanner;

/**
 * @author Diego Yance
 */
public class RegisterEmployee {

    /** Returns an Employee object filled with data provided by the user, this data consists in the name,
     * salary, if the employee has child, couple or adults at his care.
     *
     * @return an object 'employee'
     */
    public static Employee register(){
        Scanner sc = new Scanner(System.in);
        int counter = 0;
        boolean repeat = true, hasChild = false, hasCouple = false, hasAdult = false;
        System.out.println("Buenos dias ingrese sus datos: ");
        System.out.println("Ingrese su nombre : ");
        String name = sc.nextLine();
        System.out.println("Ingrese su salario : ");
        float salary = Float.parseFloat(sc.nextLine());

        /*
        Este bucle tiene la finalidad de que el usuario responda "y" o "n" para los atributos booleanos del objeto empleado
        en caso de que no responda lo solicitado, se volverá a realizar la pregunta en la que se encontraba hasta que
        responda de la manera indicada; la variable @counter sirve para recorrer las distintas preguntas que se le
        harán al usuario, una vez llegada a la última pregunta y si esta es respondida de manera correcta se escapará
        del bucle con la variable @repeat
         */
        while(repeat){

            switch(counter){

                case 0:
                    System.out.println("¿Tiene hijos? : (Ingrese 'y' o 'n' para si o no)");
                    String child = sc.nextLine();
                    if(child.equalsIgnoreCase("y")){
                        hasChild = true;
                        counter++;
                        break;
                    }
                    else if(child.equalsIgnoreCase("n")){
                        counter++;
                        break;
                    }
                    System.out.println("Respuesta inválida");
                    break;

                case 1:
                    System.out.println("¿Tiene esposo/a? : (Ingrese 'y' o 'n' para si o no)");
                    String couple = sc.nextLine();
                    if(couple.equalsIgnoreCase("y")){
                        hasCouple = true;
                        counter++;
                        break;
                    }
                    else if(couple.equalsIgnoreCase("n")){
                        counter++;
                        break;
                    }
                    System.out.println("Respuesta inválida");
                    break;

                case 2:
                    System.out.println("¿Tiene un adulto mayor a cargo? : (Ingrese 'y' o 'n' para si o no)");
                    String adult = sc.nextLine();
                    if(adult.equalsIgnoreCase("y")){
                        hasAdult = true;
                        repeat=false;
                        break;
                    }
                    else if(adult.equalsIgnoreCase("n")){
                        repeat=false;
                        break;
                    }
                    System.out.println("Respuesta inválida");
                    break;
            }
        }
        return new Employee(salary, name, hasChild, hasCouple, hasAdult);
    }
}
