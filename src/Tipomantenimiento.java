public class Tipomantenimiento {
    private String codTipoMantenimiento;
    private String nombreTipoMantenimiento;

    // Constructor sin parámetros de la clase Tipomantenimiento
    public Tipomantenimiento() {
    }

    // Constructor con parámetros de la clase Tipomantenimiento
    public Tipomantenimiento(String codTipoMantenimiento, String nombreTipoMantenimiento) {
        this.codTipoMantenimiento = codTipoMantenimiento;
        this.nombreTipoMantenimiento = nombreTipoMantenimiento;
    }

    // Métodos getter y setter para cada atributo de la clase Tipomantenimiento

    public String getCodTipoMantenimiento() {
        return codTipoMantenimiento;
    }

    public String getnombreTipoMantenimiento(){
        return nombreTipoMantenimiento;
    }

    public void setCodTipoMantenimiento(String codTipoMantenimiento) {
        this.codTipoMantenimiento = codTipoMantenimiento;
    }

    public void setNombreTipoMantenimiento(String nombreTipoMantenimiento) {
        this.nombreTipoMantenimiento = nombreTipoMantenimiento;
    }
}
