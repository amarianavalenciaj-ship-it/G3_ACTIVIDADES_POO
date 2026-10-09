public class Persona {

    private String nombre;
    private String apellido;
    private String numeroDocumentoIdentidad;
    private int añoNacimiento;
    private String paisNacimiento;
    private char genero;

    public Persona(String nombre, String apellido, String numeroDocumentoIdentidad, int añoNacimiento, String paisNacimiento, char genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.añoNacimiento = añoNacimiento;
        this.paisNacimiento = paisNacimiento;
        this.genero = genero;
    }

    public void imprimir() {
        System.out.println("Nombre = " + nombre);
        System.out.println("Apellido = " + apellido);
        System.out.println("Número de documento de identidad = " + numeroDocumentoIdentidad);
        System.out.println("Año de nacimiento = " + añoNacimiento);
        System.out.println("Páis de Nacimiento = " + paisNacimiento);
        System.out.println("Género = " + (genero == 'H' ? "Hombre" : (genero == 'M' ? "Mujer" : genero)));
        System.out.println("----------------------------------------");
    }
}