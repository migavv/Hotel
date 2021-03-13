private String codigoReserva;
    private String cedulaCliente;
    private Date fechaInicio;
    private Date fechaFinal;
    private String plan;
    String codigoEmpleado;
    private String codigoHabitaciones[];

    public reserva(String cedula, String codigo, Date fechaInicio, Date fechaFinal, Stirng plan) {
        this.cedula = cedula;
        this.codigo = codigo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.plan = plan;
    }

    public String getCodigoReserva() {
        return codigoReserva;
    }

    public void setCodigoReserva(String codigoReserva) {
        this.codigoReserva = codigoReserva;
    }
}
    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
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

    public void setCodigoHabitaciones(String[] codigoHabitaciones) {
        this.codigoHabitaciones = codigoHabitaciones;
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

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }
