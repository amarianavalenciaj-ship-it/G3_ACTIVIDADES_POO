public class EjercicioPropuesto17 {

    private double radio;
    private double area;
    private double longitudCircunferencia;

    public EjercicioPropuesto17(double radio) {
        this.radio = radio;
    }

    public void calcularMetricas() {
        this.area = Math.PI * Math.pow(this.radio, 2);
        this.longitudCircunferencia = 2 * Math.PI * this.radio;
    }

    public void mostrarCirculo() {
        System.out.println("Área del círculo: " + this.area);
        System.out.println("Longitud de la circunferencia: " + this.longitudCircunferencia);
    }
}