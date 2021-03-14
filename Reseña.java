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
    
    public void escribirObjeto(String direccion) throws IOException{
		FileOutputStream f=new FileOutputStream(direccion);
		ObjectOutputStream o =new ObjectOutputStream(f);
		o.writeObject(this);
		o.close();
		f.close();
		
	}
    
    public Reseña leerObjeto(File listF) throws OptionalDataException,ClassNotFoundException,IOException{
		FileInputStream f= new FileInputStream(listF);
		ObjectInputStream o=new ObjectInputStream(f);
		return (Estudiantes) o.readObject();
		
		
	}

}
