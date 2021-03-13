

public class Aseo extends Empleado{
    private Habitacion[] habitaciones;
    private int habitacionLimpiadas;

    public Aseo(String nombre, String apellido, String identificacion, int edad, String horario, int diasTrabajados, Habitacion[] habitaciones) {
        super(nombre, apellido, identificacion, edad, horario, salario, diasTrabajados);
        this.habitaciones = habitaciones;
        salario=salarioMinimo*1.30 + (salarioMinimo/100)*habitacionLimpiadas;
    }



    public Habitacion[] getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Habitacion[] habitaciones) {
        this.habitaciones = habitaciones;
    }
}
