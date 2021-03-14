public abstract class Cliente {
    public String codigoHabitacion;

    public Cliente(String codigoHabitacion, String nombre, String apellido, String identificacion, int edad) {
        super(String nombre, String apellido, String identificacion, int edad);
        this.codigoHabitacion = codigoHabitacion;
    }

    public String getCodigoHabitacion() {
        return codigoHabitacion;
    }

    public void setCodigoHabitacion(String codigoHabitacion) {
        this.codigoHabitacion = codigoHabitacion;
    }

}
