public class TrianguloRectangulo {
    private int base;
    private int altura;

    public TrianguloRectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return (base * altura) / 2.0;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }

    public double calcularPerimetro() {
        return base + altura + calcularHipotenusa();
    }

    public String determinarTipoTriangulo() {
        double hipotenusa = calcularHipotenusa();

        if ((base == altura) && (base == hipotenusa)) {
            return "Equilátero";
        } else if ((base != altura) && (base != hipotenusa) && (altura != hipotenusa)) {
            return "Escaleno";
        } else {
            return "Isósceles";
        }
    }
}
