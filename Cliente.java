public abstract class Cliente {
    public String codigoHabitacion;

    public Cliente(String codigoHabitacion) {
        super();
        this.codigoHabitacion = codigoHabitacion;
    }

    public String getCodigoHabitacion() {
        return codigoHabitacion;
    }

    public void setCodigoHabitacion(String codigoHabitacion) {
        this.codigoHabitacion = codigoHabitacion;
    }

}
