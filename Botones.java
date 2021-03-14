

public class Botones extends Empleado{
    public Botones(String nombre, String apellido, String identificacion, int edad, String horario, int diasTrabajados) {
        super(nombre, apellido, identificacion, edad, horario, salario, diasTrabajados);
        salario=salarioMinimo*1.05;
        
    }

    

