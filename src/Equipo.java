public class Equipo {
    private String codEquipo;
    private String nombreEquipo;

    // Constructor sin parámetros de la clase Equipo
    public Equipo() {
    }

    // Constructor con parámetros de la clase Equipo
    public Equipo(String codEquipo, String nombreEquipo) {
        this.codEquipo = codEquipo;
        this.nombreEquipo = nombreEquipo;
    }

    // Métodos getter y setter para cada atributo de la clase Cliente

    public String getCodEquipo() {
        return codEquipo;
    }

    public String getnombreEquipo(){
        return nombreEquipo;
    }

    public void setCodEquipo(String codEquipo) {
        this.codEquipo = codEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

}
