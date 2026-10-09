public class Planeta {

    public enum TipoPlaneta {
        GASEOSO, TERRESTRE, ENANO
    }

    private String nombre = null;
    private int cantidadSatelites = 0;
    private double masa = 0.0; // en kilogramos
    private double volumen = 0.0; // en kilómetros cúbicos
    private int diametro = 0; // en kilómetros
    private int distanciaMediaAlSol = 0; // en millones de kilómetros
    private TipoPlaneta tipoPlaneta;
    private boolean ObservableSimpleVista = false;
    private double periodOrbital = 0.0; // en años
    private double periodRotacion = 0.0; // en días

    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaMediaAlSol, TipoPlaneta tipoPlaneta, boolean ObservableSimpleVista, double periodOrbital, double periodRotacion) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaMediaAlSol = distanciaMediaAlSol;
        this.tipoPlaneta = tipoPlaneta;
        this.ObservableSimpleVista = ObservableSimpleVista;
        this.periodOrbital = periodOrbital;
        this.periodRotacion = periodRotacion;
    }

    public double calcularDensidad() {
        return masa / volumen;
    }

    public boolean esPlanetaExterior() {
        double distanciaKm = distanciaMediaAlSol * 1_000_000.0;
        double distanciaUA = distanciaKm / 149597870.0;
        return distanciaUA > 3.4;
    }

    public void imprimir() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Cantidad de satélites: " + cantidadSatelites);
        System.out.println("Masa (kg): " + masa);
        System.out.println("Volumen (km³): " + volumen);
        System.out.println("Diámetro (km): " + diametro);
        System.out.println("Distancia media al Sol (millones de km): " + distanciaMediaAlSol);
        System.out.println("Tipo de planeta: " + tipoPlaneta);
        System.out.println("Observable a simple vista: " + (ObservableSimpleVista ? "Sí" : "No"));
        System.out.println("Periodo orbital (años): " + periodOrbital);
        System.out.println("Periodo de rotación (días): " + periodRotacion);
        System.out.println("Densidad: " + calcularDensidad() + " kg/km³");
        System.out.println("Es planeta exterior: " + (esPlanetaExterior() ? "Sí" : "No"));
        System.out.println("----------------------------------------");
    }
}