class ENoElemento extends Exception{
  ENoElemento(){
    super("No se encuentra el elemento buscado");
  }
}

public class Administracion{
  
  Cliente[] clientes;
  
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
}

  
