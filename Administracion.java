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

public class Administracion{
  
  private Cliente[] clientes;
  private Empleado[] empleados;
  
  public buscarHabitacion(String codigoHabitacion){
    int n=0;
    boolean b=false;
    while(n<habitaciones.length&&!b){
      if(habitaciones[n].getCodigo.equals(codigoHabitacion))
        return habitaciones[n];
    }
    throw new ENoElemento();
  }
  
  public boolean existeHabitacion(String codigoHabitacion){
    if(buscarHabitacion(codigoHabitacion)==null)
      return false;
    else
      return true;
  }
	
	public void escribirObjeto(String direccion) throws IOException {
		for (int i = 0; i < clientes.length; i++) {
			clientes[i].escribirObjeto(direccion+"\\" + personas[i].getNombre+".clt");
		}
	}
	
	public Persona[] leerObjetos(File f) throws ClassNotFoundException, IOException {
		File[] listF=f.listFiles(new Filtro(".clt"));
		Persona[] pers= new Persona[listF.length];
		for (int i = 0; i < pers.length; i++) {
			pers[i].leerObjeto(listF[i]);
		}
		return pers;
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
}

  
