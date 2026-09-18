public class EjercicioResuelto4 {

    private double edadJuan;
    private double edadAlberto;
    private double edadAna;
    private double edadMama;

    public EjercicioResuelto4(double edadJuan) {
        this.edadJuan = edadJuan;
    }

    public void calcularEdades() {
        this.edadAlberto = (this.edadJuan * 2) / 3;
        this.edadAna = (this.edadJuan * 4) / 3;
        this.edadMama = this.edadJuan + this.edadAlberto + this.edadAna;
    }

    public void mostrarEdades() {
        System.out.println("Edad de Alberto: " + Math.round(edadAlberto));
        System.out.println("Edad de Ana: " + Math.round(edadAna));
        System.out.println("Edad de la mamá: " + Math.round(edadMama));
    }
}