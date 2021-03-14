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
    
    public void escribirFichero(String direccion) throws IOException, FileNotFoundException {
		if(direccion!=null) {
			FileWriter fw=null;
			BufferedWriter b=null;
			fw= new FileWriter(direccion);
			b.write("Codigo Cliente:"+codigoCliente);
			b.write("Descripcion:"+descripcion);
			b.write("Calificacion:"+ calificacion);
			b.write("Fecha:"+fecha);
			b.close();
			fw.close();			}
		}else
			throw new FileNotFoundException();	
	}

	public void leerFichero(String direccion) throws FileNotFoundException, IOException{
		if(direccion!=null) {
			File f=new File(direccion);
			FileReader fr= null;
			BufferedReader b1=null;
			fr=new FileReader(f);
			b1=new BufferedReader(fr);
			String linea;
			while((linea=b1.readLine())!=null) {
				System.out.println(linea);
			}	
		}else
			throw new FileNotFoundException();
	}


	


}
