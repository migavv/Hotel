class ECodigoInvalido extends Exception{
    ECodigoInvalido(){
        super("El codigo ingresado es erroneo");
}


private String codigoReserva;
    private String cedulaCliente;
    private Date fechaInicio;
    private Date fechaFinal;
    private String plan;
    String codigoEmpleado;
    private String codigoHabitaciones[];

    public reserva(String cedula, String codigo, Date fechaInicio, Date fechaFinal, String plan) {
        this.cedula = cedula;
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.plan = plan;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    

    public String getCedulaCliente() {
        return cedulaCliente;
    }


    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String[] getCodigoHabitaciones() {
        return codigoHabitaciones;
    }

    

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void cambiarHabitaciones(String codigoHabitacionN,String codigoHabitacionV)throws ECodigoInvalido{
        boolean b=false;
        int n=0;
        while(n<codigoHabitaciones.length&&!b){
            if(codigoHabitaciones[n].equals(codigoHabitacionV)){
                b=true;
                codigoHabitaciones[n]=codigoHabitacionN;
            }  
        }
        if(!b)
            throw new ECodigoInvalido();
    }
    public void eliminarHabitacion(String codigoHabitacion) throws ECodigoInvalido{
        boolean b=false;
        int n=0;
        while(n<codigoHabitaciones.length&&!b) {
            if(codigoHabitaciones[n].equals(codigoHabitacion)){
                b=true;
                System.arraycopy(codigoHabitaciones,n+1,codigoHabitaciones, n,codigoHabitaciones.length-n-1);
                codigoHabitaciones=Arrays.copyOf(codigoHabitaciones,codigoHabitaciones.length-1);
            }
        }
        if(b!)
            throw new ECodigoInvalido();
    }
        
