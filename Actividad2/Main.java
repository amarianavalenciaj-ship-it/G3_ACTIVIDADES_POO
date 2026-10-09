public class Main {
    public static void main(String[] args) {

        // EJERCICIO 2.1: CLASE PERSONA

        System.out.println("========================================");
        System.out.println("          EJERCICIO 2.1: PERSONA        ");
        System.out.println("========================================");

        Persona persona1 = new Persona("Carlos", "Gómez", "1020304050", 1995, "Colombia", 'H');
        Persona persona2 = new Persona("Ana", "Martínez", "9876543210", 2001, "Argentina", 'M');

        System.out.println("--- Datos de la Persona 1 ---");
        persona1.imprimir();
        System.out.println("--- Datos de la Persona 2 ---");
        persona2.imprimir();

        // EJERCICIO 2.2: CLASE PLANETA

        System.out.println("\n========================================");
        System.out.println("          EJERCICIO 2.2: PLANETA        ");
        System.out.println("========================================");

        Planeta tierra = new Planeta("Tierra", 1, 5.972e24, 1.08321e12, 12742, 150, Planeta.TipoPlaneta.TERRESTRE, true, 1.0, 1.0);
        Planeta jupiter = new Planeta ("Jupiter", 79, 1.898e27, 1.43128e15, 139820, 778, Planeta.TipoPlaneta.GASEOSO, true, 11.86, 0.41);

        System.out.println("--- Datos del Planeta 1 ---");
        tierra.imprimir();
        System.out.println("--- Datos del Planeta 2 ---");
        jupiter.imprimir();

        // EJERCICIO 2.3: CLASE AUTOMÓVIL

        System.out.println("\n========================================");
        System.out.println("          EJERCICIO 2.3: AUTOMÓVIL      ");
        System.out.println("========================================");

        Automovil auto = new Automovil(
            "Mazda",
            2023,
            2.0,
            Automovil.TipoCombustible.GASOLINA,
            Automovil.TipoAutomovil.COMPACTO,
            5,
            5,
            180,
            Automovil.Color.ROJO,
            100,
            true
        );

        System.out.println("--- Datos iniciales del Automóvil ---");
        auto.imprimir();

        // 1. Aumentar su velocidad en 20 km/h (quedará en 120 km/h)
        System.out.println("Acción: Acelerando 20 km/h...");
        auto.acelerar(20);

        // 2. Decrementar su velocidad en 50 km/h (quedará en 70 km/h)
        System.out.println("\nAcción: Desacelerando 50 km/h...");
        auto.desacelerar(50);

        // 3. Estimar tiempo de llegada para un viaje de 210 km
        System.out.println("\nTiempo estimado para recorrer 210 km a la velocidad actual:");
        double tiempoEstimado = auto.calcularTiempoLlegada(210);
        System.out.println(tiempoEstimado + " horas");

        // 4. Prueba de infracción por exceso de velocidad (ejercicio propuesto)
        System.out.println("\nAcción: Intentando acelerar 150 km/h (sobrepasando vel. máxima de 180 km/h)...");
        auto.acelerar(150);

        // 5. Frenar por completo (velocidad en 0 km/h)
        System.out.println("\nAcción: Frenando vehículo...");
        auto.frenar();

        // Estado final del automóvil
        System.out.println("\n--- Estado final del Automóvil ---");
        auto.imprimir();

        // EJERCICIO 2.4: FIGURAS GEÓMETRICAS

        System.out.println("\n========================================");
        System.out.println("    EJERCICIO 2.4: FIGURAS GEOMÉTRICAS  ");
        System.out.println("========================================");

        Circulo figura1 = new Circulo(2);
        System.out.println("El área del círculo es = " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es = " + figura1.calcularPerimetro());
        System.out.println();

        Rectangulo figura2 = new Rectangulo(1, 2);
        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
        System.out.println();

        Cuadrado figura3 = new Cuadrado(3);
        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();

        TrianguloRectangulo figura4 = new TrianguloRectangulo(3, 5);
        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
        System.out.println("La hipotenusa del triángulo es = " + figura4.calcularHipotenusa());
        System.out.println("Tipo de triángulo: " + figura4.determinarTipoTriangulo());
        System.out.println();

        Rombo figura5 = new Rombo(8, 6, 5);
        System.out.println("El área del rombo es = " + figura5.calcularArea());
        System.out.println("El perímetro del rombo es = " + figura5.calcularPerimetro());
        System.out.println();

        Trapecio figura6 = new Trapecio(10, 6, 4, 5, 5);
        System.out.println("El área del trapecio es = " + figura6.calcularArea());
        System.out.println("El perímetro del trapecio es = " + figura6.calcularPerimetro());
        System.out.println("----------------------------------------");

        // EJERCICIO 2.5: CUENTA BANCARIA

        System.out.println("\n========================================");
        System.out.println("    EJERCICIO 2.5: CUENTA BANCARIA      ");
        System.out.println("========================================");

        CuentaBancaria cuenta = new CuentaBancaria("Pedro", "Pérez", 123456789, CuentaBancaria.TipoCuenta.AHORROS, 0.0, 1.5);

        System.out.println("--- Datos iniciales de la Cuenta ---");
        cuenta.imprimir();

        System.out.println("Acción: Consignando $100000...");
        cuenta.consignar(100000.0);

        System.out.println("\nAcción: Intentando retirar $150000 (excede saldo)...");
        cuenta.retirar(150000.0);

        System.out.println("\nAcción: Retirando $40000...");
        cuenta.retirar(40000.0);

        System.out.println("\nAcción: Aplicando interés mensual del periodo...");
        cuenta.aplicarInteresMensual();

        System.out.println("\n--- Estado final de la Cuenta ---");
        cuenta.imprimir();

    }
}