public class Automovil {

    public enum TipoCombustible {
        GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL
    }

    public enum TipoAutomovil {
        CARRO_DE_CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV
    }

    public enum Color {
        BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA
    }

    private String marca;
    private int modelo; // año de fabricación
    private double motor; // volumen en litros
    private TipoCombustible tipoCombustible;
    private TipoAutomovil tipoAutomovil;
    private int numeroPuertas;
    private int cantidadAsientos;
    private int velocidadMaxima; // en km/h
    private Color color;
    private int velocidadActual; // en km/h
    private boolean esAutomatico;
    private double valorTotalMultas;
    private static final double VALOR_MULTA_FIJA = 100.00;

    public Automovil(String marca, int modelo, double motor, TipoCombustible tipoCombustible, TipoAutomovil tipoAutomovil, int numeroPuertas, int cantidadAsientos, int velocidadMaxima, Color color, int velocidadActual, boolean esAutomatico) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.velocidadActual = velocidadActual;
        this.esAutomatico = esAutomatico;
        this.valorTotalMultas = 0.0;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getMotor() {
        return motor;
    }
    public void setMotor(double motor) {
        this.motor = motor;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }
    public void setTipoCombustible(TipoCombustible tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public TipoAutomovil getTipoAutomovil() {
        return tipoAutomovil;
    }
    public void setTipoAutomovil(TipoAutomovil tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }
    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public int getCantidadAsientos() {
        return cantidadAsientos;
    }
    public void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public Color getColor() {
        return color;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }
    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public boolean getesAutomatico() {
        return esAutomatico;
    }
    public void setesAutomatico(boolean esAutomatico) {
        this.esAutomatico = esAutomatico;
    }

    // Métodos para multas
    public boolean tieneMultas(){
        return valorTotalMultas > 0;
    }

    public double getValorTotalMultas() {
        return valorTotalMultas;
    }

    // Métodos de control de velocidad
    public void acelerar(int incremento) {
        if (velocidadActual + incremento > velocidadMaxima) {
            valorTotalMultas += VALOR_MULTA_FIJA;
            System.out.println("ADVERTENCIA: Se intentó sobrepasar la velocidad máxima permitida");
            System.out.println("Se ha generado una multa de $" + VALOR_MULTA_FIJA + ". Multas acumuladas: $" + valorTotalMultas);
        } else {
            velocidadActual += incremento;
            System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        }
    }

    public void desacelerar(int decremento) {
        if (velocidadActual - decremento < 0) {
            System.out.println("No se puede desacelerar a una velocidad negativa.");
        } else {
            velocidadActual -= decremento;
            System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        }
    }

    public void frenar() {
        velocidadActual = 0;
        System.out.println("El vehículo ha frenado por completo. Velocidad actual: 0 km/h");
    }

    // Método para estimar el tiempo de llegada (en horas)
    public double calcularTiempoLlegada(double distanciaKm) {
        if (velocidadActual == 0) {
            System.out.println("El vehículo está detenido. No es posible calcular el tiempo de llegada.");
            return -1.0;
        }
        return distanciaKm / velocidadActual;
    }

    public void imprimir() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo (año): " + modelo);
        System.out.println("Motor (cilindraje en L): " + motor);
        System.out.println("Tipo de combustible: " + tipoCombustible);
        System.out.println("Tipo de automóvil: " + tipoAutomovil);
        System.out.println("Número de puertas: " + numeroPuertas);
        System.out.println("Cantidad de asientos: " + cantidadAsientos);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
        System.out.println("Color: " + color);
        System.out.println("Velocidad actual: " + velocidadActual + " km/h");
        System.out.println("Transmisión automática: " + (esAutomatico ? "Sí" : "No"));
        System.out.println("Tiene multas: " + (tieneMultas() ? "Sí ($" + valorTotalMultas + ")" : "No"));
        System.out.println("----------------------------------------");
    }
}
