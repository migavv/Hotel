

public class Aseo extends Empleado{
    private Habitacion[] habitaciones;
    private int habitacionLimpiadas;

    public Aseo(String nombre, String apellido, String identificacion, int edad, String horario, double salario, int diasTrabajados, Habitacion[] habitaciones) {
        super(nombre, apellido, identificacion, edad, horario, salario, diasTrabajados);
        this.habitaciones = habitaciones;
    }

    @Override
    public double calcularSalario() {
        return salario * (1.25);
    }

    //public void limpieza(int numero){
        //habitaciones[numero].setLimpia(true);
    //}

    public Habitacion[] getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Habitacion[] habitaciones) {
        this.habitaciones = habitaciones;
    }
}
