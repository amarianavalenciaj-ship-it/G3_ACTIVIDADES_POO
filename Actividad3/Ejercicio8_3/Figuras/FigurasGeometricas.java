package Figuras;

public abstract class FigurasGeometricas {
    private double volumen;
    private double superficie;

    public abstract double calcularVolumen();
    public abstract double calcularSuperficie();

    public double getVolumen() {
        return volumen;
    }
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public double getSuperficie() {
        return superficie;
    }
    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }
}