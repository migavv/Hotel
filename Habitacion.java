class ENumeroNegativo extends Exception{
    ENumeroNegativo(){
        super("El numero ingresado es negativo");
    }
}
class ENumeroNoPermitido extends Exception{
    ENumeroNoPermitido(){
        super("El numero no esta permitido");
    }
}

public class Habitacion {
    private String codigo;
    private int numeroMaxCliente;
    private boolean disponible;
    private boolean limpia;
    private double precioNoche;


    public Habitacion(String codigo, int numeroMaxCliente, boolean disponible, boolean limpia) throws ENumeroNegativo, ENumeroNoPermitido{
        super();
        if(numeroMaxCliente>0&&numeroMaxCliente<7) {
            this.codigo = codigo;
            this.numeroMaxCliente = numeroMaxCliente;
            this.disponible = disponible;
            this.limpia = limpia;
            precioNoche=400+numeroMaxCliente*20;
        }else if(numeroMaxCliente<3||numeroMaxCliente>6)
            throw new ENumeroNoPermitido();
        else
            throw new ENumeroNegativo();
    }


    public boolean isDisponible() {
        return disponible;
    }


    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


    public boolean isLimpia() {
        return limpia;
    }


    public void setLimpia(boolean limpia) {
        this.limpia = limpia;
    }


    public String getCodigo() {
        return codigo;
    }


    public int getNumeroMaxCliente() {
        return numeroMaxCliente;
    }


    public double getPrecioNoche() {
        return precioNoche;
    }






}
