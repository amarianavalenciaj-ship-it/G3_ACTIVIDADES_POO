public class EjercicioPropuesto12 {

    private double horasTrabajadas;
    private double valorHora;
    private double porcentajeRetencion;
    private double salarioBruto;
    private double retencionFuente;
    private double salarioNeto;

    public EjercicioPropuesto12() {
        this.horasTrabajadas = 48;
        this.valorHora = 5000;
        this.porcentajeRetencion = 0.125;
    }

    public void calcularSalario() {
        this.salarioBruto = this.horasTrabajadas * this.valorHora;
        this.retencionFuente = this.salarioBruto * this.porcentajeRetencion;
        this.salarioNeto = this.salarioBruto - this.retencionFuente;
    }

    public void mostrarInformacionSalarial() {
        System.out.println("Salario Bruto: $" + this.salarioBruto);
        System.out.println("Retención en la fuente: $" + this.retencionFuente);
        System.out.println("Salario Neto: $" + this.salarioNeto);
    }
}