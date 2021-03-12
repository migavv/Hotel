import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;

public abstract class Persona implements Serializable {
    protected String nombre;
    protected String apellido;
    protected String identificacion;
    protected int edad;


    public String getNombre() {
        return nombre;
    }


    public String getApellido() {
        return apellido;
    }


    public String getIdentificacion() {
        return identificacion;
    }


    public int getEdad() {
        return edad;
    }


    public Persona(String nombre, String apellido, String identificacion, int edad) throws ENumeroNegativo {
        super();
        if(edad>0) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.identificacion = identificacion;
            this.edad = edad;
        }else
            throw new ENumeroNegativo();
    }
    
    public void escribirObjeto(String direccion) throws IOException  {
		FileOutputStream f=new FileOutputStream(direccion);
		ObjectOutputStream o= new ObjectOutputStream(f);
		o.writeObject(this);
		o.close();
		f.close();
	}
    public Persona leerObjeto(File listF) throws IOException, ClassNotFoundException{
		FileInputStream f= new FileInputStream(listF);
		ObjectInputStream o=new ObjectInputStream(f);
		return (Persona) o.readObject();
	}



}

class Filtro implements FilenameFilter{
	private String extension;
	
	public Filtro(String extension) {
		super();
		this.extension=extension;
	}
	
	public boolean accept(File ruta, String file) {
		return file.endsWith(extension);
		
	}
}
