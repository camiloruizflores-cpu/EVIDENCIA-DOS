public class Analista{
    private String codAnalista;
    private String nombreAnalista;

    // Constructor sin parámetros de la clase Analista
    public Analista() {
    }

    // Constructor con parámetros de la clase Analista
    public Analista(String codAnalista, String nombreAnalista) {
        this.codAnalista = codAnalista;
        this.nombreAnalista = nombreAnalista;
    }

    // Métodos getter y setter para cada atributo de la clase Cliente

    public String getCodAnalista() {
        return codAnalista;
    }

    public String getnombreAnalista(){
        return nombreAnalista;
    }

    public void setCodAnalista(String codAnalista) {
        this.codAnalista = codAnalista;
    }

    public void setNombreAnalista(String nombreAnalista) {
        this.nombreAnalista = nombreAnalista;
    }
}
