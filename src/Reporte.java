
import javax.print.attribute.standard.DateTimeAtCompleted;

public class Reporte {
    //Atributos de la clase Reporte
    private String numReporte;
    private String codCliente;
    private String codCentro;
    private String codTecnico;
    private String codEquipo;
    private String codRepuesto;
    private String idEstadomantenimiento;
    private String idTipomantenimiento;
    private String codAnalista;
    private DateTimeAtCompleted fechaInicio;
    private DateTimeAtCompleted fechaFin;
    private String duracionHora;

    // Constructor sin parámetros de la clase Reporte
    public Reporte() {

    }

    // Constructor con parámetros de la clase Reporte
    public Reporte (String numReporte, String codCliente, String codCentro, String codTecnico, String codEquipo, String codRepuesto, String idEstadomantenimiento, String idTipomantenimiento, String codAnalista, DateTimeAtCompleted fechaInicio, DateTimeAtCompleted fechaFin, String duracionHora){
        this.numReporte = numReporte;
        this.codCliente = codCliente;
        this.codCentro = codCentro;
        this.codTecnico = codTecnico;
        this.codEquipo = codEquipo;
        this.codRepuesto = codRepuesto;
        this.idEstadomantenimiento = idEstadomantenimiento;
        this.idTipomantenimiento = idTipomantenimiento;
        this.codAnalista = codAnalista;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.duracionHora = duracionHora;

    }

        // Métodos getter y setter para cada atributo de la clase Reporte
    public String getnumReporte(){
        return numReporte;
    }

    public String getcodCliente(){
        return codCliente;
    }
    
    public String getcodCentro(){
        return codCentro;
    }

    public String getcodTecnico(){
        return codTecnico;
    }

    public String getcodEquipo(){
        return codEquipo;
    }

    public String getcodRepuesto(){
        return codRepuesto;
    }

    public String getidEstadomantenimiento(){
        return idEstadomantenimiento;
    }

    public String getidTipomantenimmiento(){
        return idTipomantenimiento;
    }

    public String getcodAnalista(){
        return codAnalista;
    }

    public DateTimeAtCompleted getfechaInicio(){
        return fechaInicio;
    }

    public DateTimeAtCompleted getfechaFin(){
        return fechaFin;
    }

    public String getduracionHora(){
        return duracionHora;
    }

    public void setnumReporte(String numReporte){
        this.numReporte = numReporte;
    }

    public void setcodCliente(String codCliente){
        this.codCliente = codCliente;
    }

    public void setcodCentro(String codCentro){
        this.codCentro = codCentro;
    }

    public void setcodTecnico(String codTecnico){
        this.codTecnico = codTecnico;
    }

    public void setcodEquipo(String codEquipo){
        this.codEquipo = codEquipo;
    }

    public void setcodRepuesto(String codRepuesto){
        this.codRepuesto = codRepuesto;
    }

    public void setidEstadomantenimiento(String idEstadomantenimiento){
        this.idEstadomantenimiento = idEstadomantenimiento;
    }

    public void setidTipomantenimiento(String idTipomantenimiento){
        this.idTipomantenimiento = idTipomantenimiento;
    }

    public void setcodAnalista(String codAnalista){
        this.codAnalista = codAnalista;
    }

    public void setfechaInicio(DateTimeAtCompleted fechaInicio){
        this.fechaInicio = fechaInicio;
    }

    public void setfechaFin(DateTimeAtCompleted fechaFin){
        this.fechaFin = fechaFin;
    }

    public void setduracionHora(String duracionHora){
        this.duracionHora = duracionHora;
    }

}
