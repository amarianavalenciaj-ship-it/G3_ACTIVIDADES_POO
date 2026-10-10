package Figuras;

public class Prisma extends FigurasGeometricas {
    private double base;
    private double ancho;
    private double altura;

    public Prisma(double base, double ancho, double altura) {
        this.base = base;
        this.ancho = ancho;
        this.altura = altura;
        this.setVolumen(calcularVolumen());
        this.setSuperficie(calcularSuperficie());
    }

    @Override
    public double calcularVolumen() {
        return base * ancho * altura;
    }

    @Override
    public double calcularSuperficie() {
        return 2.0 * (base * ancho + base * altura + ancho * altura);
    }
}