package proyecto1;

public abstract class Empleado extends Persona{
    protected String horario;
    protected double salario;
    protected int diasTrabajados;

    public abstract double calcularSalario();

    public Empleado(String nombre, String apellido, String identificacion, int edad, String horario, double salario, int diasTrabajados) {
        super(nombre, apellido, identificacion, edad);
        this.horario = horario;
        this.salario = salario;
        this.diasTrabajados = diasTrabajados;
    }

    public String getHorario() {
        return horario;
    }

    public double getSalario() {
        return salario;
    }

    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        this.diasTrabajados = diasTrabajados;
    }
}
