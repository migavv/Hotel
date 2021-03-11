import java.util.Date;

public class Responsable extends Cliente {

    public String metodoPago;
    public Acompañante[] acompañantes;
    public boolean socio;

    public Responsable(String codigoHabitacion, String metodoPago, Acompañante[] acompañantes, boolean socio) {
        super(codigoHabitacion);
        this.metodoPago = metodoPago;
        this.acompañantes = acompañantes;
        this.socio = socio;

    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public boolean isSocio() {
        return socio;
    }

    public void setSocio(boolean socio) {
        this.socio = socio;
    }

    public Reseña crearReseña(String op, Date fecha, int calificacion) {
        Reseña re = new Reseña(op, fecha, calificacion);
        return re;
    }

}
