public class EjercicioPropuesto14 {

    private double numero;
    private double cuadrado;
    private double cubo;

    public EjercicioPropuesto14(double numero) {
        this.numero = numero;
    }

    public void calcularPotencias() {
        this.cuadrado = Math.pow(this.numero, 2);
        this.cubo = Math.pow(this.numero, 3);
    }

    public void mostrarResultados() {
        System.out.println("Cuadrado del número: " + this.cuadrado);
        System.out.println("Cubo del número: " + this.cubo);
    }
}