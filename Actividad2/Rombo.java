public class Rombo {
    private double diagonalMayor;
    private double diagonalMenor;
    private double lado;

    public Rombo(double diagonalMayor, double diagonalMenor, double lado) {
        this.diagonalMayor = diagonalMayor;
        this.diagonalMenor = diagonalMenor;
        this.lado = lado;
    }

    public double calcularArea() {
        return (diagonalMayor * diagonalMenor) / 2.0;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}
