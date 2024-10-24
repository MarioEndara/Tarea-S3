import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Objeto con datos quemados
        Empleado empleado1 = new Empleado("Andres Beltran", 25, 2500);
        System.out.println("Datos empleado 1");
        empleado1.mostrar();
        //Objeto con datos ingresados por teclado
        System.out.println("Datos empleado 2");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        System.out.print("Salario: ");
        double salario = scanner.nextDouble();
        Empleado empleado2 = new Empleado(nombre, edad, salario);
        System.out.println("Datos empleado 1");
        empleado1.mostrar();
        System.out.println("Datos empleado 2");
        empleado2.mostrar();
        scanner.close();
    }
}

