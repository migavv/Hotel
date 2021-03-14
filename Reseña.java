import java.util.Date;

public class Reseña {

    private String descripcion;
    private Date fecha ;
    private int calificacion;
    private String codigoCliente;

        public String getDescripcion() {
        return descripcion;
        }
        
        public Date getFecha() {
            return fecha;
        }
       
        public int getCalificacion() {
            return calificacion;
        }
        
        public String getCodigoCliente() {
            return codigoCliente;
        }
        
                public Reseña(String descripcion,Date fecha,int calificacion,String codigoCliente) {
                    this.descripcion=descripcion;
                    this.fecha=fecha;
                    this.calificacion=calificacion;
                    this.codigoCliente=codigoCliente;

    }

}
