
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

class NoExisteReseña extends Exception {
	public NoExisteReseña() {
		super(" No Existe la reseña");
	}
}

class NoSeEncuentraReseña extends Exception {
	public NoSeEncuentraReseña() {
		super(" No se encuentra la reseña");
	}
}

class NoExisteReseña extends Exception {
	public NoExisteReseña() {
		super(" Ya existe la reserva");
	}
}

class ENoElemento extends Exception{
  ENoElemento(){
    super("No se encuentra el elemento buscado");
  }
}

class NoExisteEmpleadoException extends Exception{
    public NoExisteEmpleadoException(){
        super("No se encontró el empleado");
    }
}

class NoExisteReserva extends Exception {
	public noExisteReserva() {
		super(" No Existe la reserva");
	}
}

class NoSeEncuentraReserva extends Exception {
	public noSeEncuentraReserva() {
		super(" No se encuentra la reserva");
	}
}

class YaExisteReserva extends Exception {
	public yaExisteReserva() {
		super(" Ya existe la reserva");
	}
}

public class Administracion{
  
  private Cliente[] clientes;
  private Empleado[] empleados;
  private Reserva reservas[];
	private Habitacion[] habitaciones;
	private double cuenta;
  
  public buscarHabitacion(String codigoHabitacion) throws ENoElemento{
    int n=0;
    boolean b=false;
    while(n<habitaciones.length&&!b){
      if(habitaciones[n].getCodigo.equals(codigoHabitacion))
        return habitaciones[n];}
	  n++;
    }
    throw new ENoElemento();
  }
  
  public boolean existeHabitacion(String codigoHabitacion) throws ENoElemento{
    if(buscarHabitacion(codigoHabitacion)==null)
      return false;
    else
      return true;
  }
	
	public void escribirObjetoC(String direccion) throws IOException {
		for (int i = 0; i < clientes.length; i++) {
			clientes[i].escribirObjeto(direccion+"\\" + personas[i].getNombre+".clt");
		}
	}
	
	public void leerObjetosC(File f) throws ClassNotFoundException, IOException {
		File[] listF=f.listFiles(new Filtro(".clt"));
		for (int i = 0; i < listF.length; i++) {
			clientes=Arrays.copyOf(clientes, clientes.lenght+1);
			clientes[clientes.length-1].leerObjeto(listF[i]);
		}
	}
	
	public boolean existeEmpleado(String cedula){
        	boolean existe = false;
        	int i = 0;
        	while(i < empleados.length - 1){
            		if (empleados[i].getCedula.equals(cedula)){
                		existe = true;
                		break;
            		}
            		i++;
        	}
        	return existe;
    	}
	
	public Empleado buscarEmpleado(String cedula) throws NoExisteEmpleadoException{
        	if(!existeEmpleado(cedula)){
            		throw new NoExisteEmpleadoException();
        	}
        	Empleado empleado = null;
        	int i = 0;
        	while(i < empleados.length - 1){
            		if (empleados[i].getCedula.equals(cedula)){
                		empleado = empleados[i];
                		break;
            		}
        	}
        	return empleado;
    	}
	//
	public void eliminarEmpleado(String cedula) throws NoExisteEmpleadoException{
        	if(!existeEmpleado(cedula))   {
            		throw new NoExisteEmpleadoException();
        	}
        	Empleado[] restantes = Arrays.copyOf(empleados, empleados.length - 1);
        	for(int i = 0, j = 0; i < empleados.length; i++){
            		if(empleados[i].getCedula != cedula){
                	restantes[j] = empleados[i];
                	j++;
            		}
        	}
        	empleados = restantes;
    	}
	
	public boolean existeReserva(String codigoReserva) throws NoExisteReserva {
		int i = 0;
		boolean b=false;
		while (i < reservas.length && !b) {
			if(reservas.getCodigo.equals(codigoReserva))
				return true;
			i++;
		}
		throw new NoExisteRerserva();
		
	}

	public Reserva buscarReserva(String codigoReserva) throws NoSeEncuentraReserva, NoExisteReserva {
		int i = 0;
		if (existeReserva(codigoReserva)) {
			while (i < reservas.length && !codigoReserva.equals(reservas[i].getCodigoReserva())) {
				return reservas[i];
				i++;	
			}	
		} else {
			throw new NoSeEncuentraReserva();
		}
	}
//.
	public void addReserva(String codigo, String cedulaCliente, String plan, Date fechaInicio, Date fechaFinal,
			String codigoEmpleado) throws YaExisteReserva {
		if (existeReserva(codigo)) {
			throw new YaExisteReserva();
		} else {
			reservas=Arrays.copyOf(reservas, reservas.length+1);
			reservas[reservas.length-1]=new Reserva(cedulaCliente, codigoEmpleado, fechaInicio, fechaFinal, plan);
		}
	}
	public void eliminarReserva(String codigoReserva) throws NoExisteReserva {
		int i = 0;
		if(!existeReserva(codigoReserva))
			throw new NoExisteReserva();
		while (i < reservas.length && !codigoReserva.equalsIgnoreCase(reservas[i].getCodigoReserva())) {
			i++;
		}
		if(codigoReserva.equalsIgnoreCase(reservas[i].getCodigoReserva())){
				System.arraycopy(reservas,i+1,reservas,i,reservas.length-1-i);
				reservas=Arrays.copyOf(reservas,reservas.length-1);
			}
	}
	

public void escribirObjetoR(String direccion) throws IOException {
		for (int i = 0; i < reservas.length; i++) {
			reservas[i].escribirObjeto(direccion+"\\" + reservas[i].getCodigoReserva+".rss");
		}
	}
	
	public void leerObjetosR(File f) throws ClassNotFoundException, IOException {
		File[] listF=f.listFiles(new Filtro(".rss"));
		for (int i = 0; i < listF.length; i++) {
			reservas=Arrays.copyOf(reservas, reservas.lenght+1);
			reservas[reservas.length-1].leerObjeto(listF[i]);
		}
	}

	public boolean existeReseña(String codigoCliente) throws NoExisteReseña {
		int i=0;
		boolean b=false;
		while(i<reseñas.lenght&&!b){
			if(reseñas[i].getCodigoCliente().equals(codigoCliente)){
				return true;
			}
		}
		return b;
	}

	public Reseña buscarReseña(String codigoCliente) throws NoSeEncuentraReseña, NoExisteReseña {
		int i = 0;
		if (existeReseña(codigoCliente)) {
			while (i < reseñas.length && !codigoCliente.equals(reseñas[i].getCodigoCliente())) {
				i++;
			}
			return reseñas[i-1];
		} else {
			throw new NoSeEncuentraReseña();
		}
	}

	public void addReseña( String descripcion,Date fecha,int calificacion,String codigoCliente) throws YaExisteReseña, NoExisteReseña {
		if (existeReseña(codigoCliente)) {
			throw new yaExisteReseña();
		} else {
			reseñas=Arrays.copyOf(reseñas,reseñas.length+1);
			reseñas[reseñas.length-1]=new Reseña(descripcion,fecha,calificacion,codigoCliente);
		}
	}

	public void eliminarReseña(String codigoCliente) throws NoExisteReseña {
		int i = 0;
		while (i < reseñas.length && !codigoCliente.equalsIgnoreCase(reseñas[i].getCodigoCliente())) {
			i++;
		}
		if (codigoCliente.equalsIgnoreCase(reseñas[i].getCodigoCliente())) {
			System.arraycopy(reseñas,i+1,reseñas,i,reseñas.length-1-i);
			reseñas=Arrays.copyOf(reseñas,reseñas.length-1);
		} else {
			throw new NoExisteReseña();
		}
	}
	
	public void escribirFicheroReseña(String dirreccion){
		for(Reseña r:reseñas){
			r.escrbirFichero(dirreccion+r.getCodigoCliente());
		}
	}
	
	





}

  
