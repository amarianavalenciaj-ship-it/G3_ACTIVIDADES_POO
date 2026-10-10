package Figuras;

public class Cubo extends FigurasGeometricas {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }

    @Override
    public double calcularVolumen() {
        return Math.pow(lado, 3.0);
    }

    @Override
    public double calcularSuperficie() {
        return 6.0 * Math.pow(lado, 2.0);
    }
}