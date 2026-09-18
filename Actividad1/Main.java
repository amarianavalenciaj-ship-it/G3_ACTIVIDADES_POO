import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("--- Ejercicio 4 ---");
        System.out.println("Ingresa la edad de Juan: ");
        double edadJuanInput = entrada.nextDouble();

        EjercicioResuelto4 ej4 = new EjercicioResuelto4(edadJuanInput); 
        ej4.calcularEdades();
        ej4.mostrarEdades();

        System.out.println("\n--- Ejercicio 5 ---");
        System.out.println("ingresa el valor incial de X: ");
        double valorX = entrada.nextDouble();
        System.out.println("Ingresa el valor inicial de Y: ");
        double valorY = entrada.nextDouble();

        EjercicioResuelto5 ej5 = new EjercicioResuelto5(valorX, valorY);
        ej5.ejecutarPrueba();
        ej5.mostrarResultado();

        System.out.println("\n--- Ejercicio 12 ---");
        EjercicioPropuesto12 ej12 = new EjercicioPropuesto12();
        ej12.calcularSalario();
        ej12.mostrarInformacionSalarial();

        System.out.println("\n--- Ejercicio 14 ---");
        System.out.println("Ingresa un número para calcular su cuadrado y su cubo ");
        double numeroInput = entrada.nextDouble();
        
        EjercicioPropuesto14 ej14 = new EjercicioPropuesto14(numeroInput); 
        ej14.calcularPotencias();
        ej14.mostrarResultados();

        System.out.println("\n--- Ejercicio 17 ---");
        System.out.println("Ingresa el radio del círculo: ");
        double radioInput = entrada.nextDouble();
        
        EjercicioPropuesto17 ej17 = new EjercicioPropuesto17(radioInput); 
        ej17.calcularMetricas();
        ej17.mostrarCirculo();

        entrada.close();
        
    }
}