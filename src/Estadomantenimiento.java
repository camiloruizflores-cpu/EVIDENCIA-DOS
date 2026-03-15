public class Estadomantenimiento {
    private String codEstadoMantenimiento;
    private String nombreEstadoMantenimiento;

    // Constructor sin parámetros de la clase Estadomantenimiento
    public Estadomantenimiento() {
    }

    // Constructor con parámetros de la clase Estadomantenimiento
    public Estadomantenimiento(String codEstadoMantenimiento, String nombreEstadoMantenimiento) {
        this.codEstadoMantenimiento = codEstadoMantenimiento;
        this.nombreEstadoMantenimiento = nombreEstadoMantenimiento;
    }

    // Métodos getter y setter para cada atributo de la clase Estadomantenimiento

    public String getCodEstadoMantenimiento() {
        return codEstadoMantenimiento;
    }

    public String getnombreEstadoMantenimiento(){
        return nombreEstadoMantenimiento;
    }

    public void setCodEstadoMantenimiento(String codEstadoMantenimiento) {
        this.codEstadoMantenimiento = codEstadoMantenimiento;
    }

    public void setNombreEstadoMantenimiento(String nombreEstadoMantenimiento) {
        this.nombreEstadoMantenimiento = nombreEstadoMantenimiento;
    }
}
