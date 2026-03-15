public class Tecnico {
    private String codTecnico;
    private String nombreTecnico;

    // Constructor sin parámetros de la clase Tecnico
    public Tecnico() {
    }

    // Constructor con parámetros de la clase Tecnico
    public Tecnico(String codTecnico, String nombreTecnico) {
        this.codTecnico = codTecnico;
        this.nombreTecnico = nombreTecnico;
    }

    // Métodos getter y setter para cada atributo de la clase Cliente

    public String getCodTecnico() {
        return codTecnico;
    }

    public String getnombreTecnico(){
        return nombreTecnico;
    }

    public void setCodTecnico(String codTecnico) {
        this.codTecnico = codTecnico;
    }

    public void setNombreTecnico(String nombreTecnico) {
        this.nombreTecnico = nombreTecnico;
    }
}
