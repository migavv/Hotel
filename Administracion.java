class ENoElemento extends Exception{
  ENoElemento(){
    super("No se encuentra el elemento buscado");
  }
}

public class Administracion{
  
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

  
