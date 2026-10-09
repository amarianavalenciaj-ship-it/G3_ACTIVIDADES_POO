public class Trapecio {
    private double baseMayor;
    private double baseMenor;
    private double altura;
    private double lado1;
    private double lado2;

    public Trapecio(double baseMayor, double baseMenor, double altura, double lado1, double lado2) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double calcularArea() {
        return ((baseMayor + baseMenor) *altura) / 2.0;
    }

    public double calcularPerimetro() {
        return baseMayor + baseMenor + altura + lado1 + lado2; 
    }
}