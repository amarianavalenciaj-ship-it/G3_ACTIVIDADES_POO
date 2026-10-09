public class CuentaBancaria {
    public enum TipoCuenta {
        AHORROS, CORRIENTE
    }

    private String nombresTitular;
    private String apellidosTitular;
    private int numeroCuenta;
    private TipoCuenta tipoCuenta;
    private double saldo;
    private double interesMensual;

    public CuentaBancaria(String nombresTitular, String apellidosTitular, int numeroCuenta, TipoCuenta tipoCuenta, double saldo, double interesMensual) {
        this.nombresTitular = nombresTitular;
        this.apellidosTitular = apellidosTitular;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0.0;
        this.interesMensual = interesMensual;
    }

    public void imprimir() {
        System.out.println("Nombre del titular: " + nombresTitular);
        System.out.println("Apellidos del titular: " + apellidosTitular);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo actual: " + saldo);
        System.out.println("Porcentaje de interés mensual: " + interesMensual + "%");
        System.out.println("----------------------------------------");
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void consignar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Se han consignado exitosamente: $" + valor);
            System.out.println("Nuevo saldo: $" + saldo);
        } else {
            System.out.println("El valor a consignar debe ser mayor que cero.");
        }
    }

    public void retirar(double valor) {
        if (valor <= 0) {
            System.out.println("El valor a retirar debe ser mayor que cero.");
        } else if (valor > saldo) {
            System.out.println("Fondos insuficientes. No se puede realizar el retiro de $" + valor + " (Saldo disponible: $" + saldo + "). ");
        } else {
            saldo -= valor;
            System.out.println("Se ha retirado exitosamente $" + valor);
            System.out.println("Nuevo saldo: $" + saldo);
        }
    }

    public void aplicarInteresMensual() {
        double interesGenerado = saldo * (interesMensual / 100.0);
        saldo += interesGenerado;
        System.out.println("Se ha aplicado un interés mensual de " + interesMensual + "%.");
        System.out.println("Interés generado: " + interesGenerado);
        System.out.println("Nuevo saldo con interés: $" + saldo);
    }
}
