public class Administracion{
  Cliente[] clientes;
	
	
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

  
