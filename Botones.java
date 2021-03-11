package proyecto1;

public class Botones extends Empleado{
    public Botones(String nombre, String apellido, String identificacion, int edad, String horario, double salario, int diasTrabajados) {
        super(nombre, apellido, identificacion, edad, horario, salario, diasTrabajados);
    }

    @Override
    public double calcularSalario() {
        return salario *(1.10);
    }
}
