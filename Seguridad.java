public class Seguridad extends Empleado{

    public Seguridad(String nombre, String apellido, String identificacion, int edad, String horario,int diasTrabajados) {
        super(nombre, apellido, identificacion, edad, horario, diasTrabajados);
        salario=salarioMinimo*1.20;
    }

    
}
