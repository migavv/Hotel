# Hotel
EDA2021

public class Aseo extends Empleado{
    Habitacion[] habitaciones;

    public Aseo(String horario, double salario, int diasTrabajados, Habitacion[] habitaciones) {
        super(horario, salario, diasTrabajados);
        this.habitaciones = habitaciones;
    }

    @Override
    public double calcularSalario() {
        return salario * (1.25);
    }

    public void limpieza(int numero){
        habitaciones[numero].setLimpia(true);
    }

    public Habitacion[] getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Habitacion[] habitaciones) {
        this.habitaciones = habitaciones;
    }
}

