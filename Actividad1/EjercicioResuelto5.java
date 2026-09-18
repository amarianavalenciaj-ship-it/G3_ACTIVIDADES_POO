public class EjercicioResuelto5 {

    private double suma;
    private double x;
    private double y;

    public EjercicioResuelto5(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void ejecutarPrueba() {
        this.suma = 0;
        this.suma = this.suma + this.x;
        this.x = this.x + Math.pow(this.y, 2);
        this.suma = this.suma + (this.x / this.y);
    }

    public void mostrarResultado() {
        System.out.println("EL VALOR DE LA SUMA ES: " + this.suma);
    }
}