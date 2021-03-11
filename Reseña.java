import java.util.Date;

public class Reseña {

    private String descripcion;
    private Date fecha ;
    private int calificacion;
    private String codigoCliente;

        public String getDescripcion() {
        return descripcion;
        }
        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }
        public Date getFecha() {
            return fecha;
        }
        public void setFecha(Date fecha) {
            this.fecha = fecha;
        }
        public int getCalificacion() {
            return calificacion;
        }
        public void setCalificacion(int calificacion) {
            this.calificacion = calificacion;
        }
        public String getCodigoCliente() {
            return codigoCliente;
        }
        public void setCodigoCliente(String codigoCliente) {
            this.codigoCliente = codigoCliente;
        }

                public Reseña(String descripcion,Date fecha,int calificacion,String codigoCliente) {
                    this.descripcion=descripcion;
                    this.fecha=fecha;
                    this.calificacion=calificacion;
                    this.codigoCliente=codigoCliente;

    }

}
