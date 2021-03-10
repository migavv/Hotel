public abstract class Empleado {
    String horario;
    double salario;
    int diasTrabajados;

    public abstract double calcularSalario();

    public Empleado(String horario, double salario, int diasTrabajados) {
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
