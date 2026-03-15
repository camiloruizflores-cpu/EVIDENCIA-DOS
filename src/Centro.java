public class Centro {
    //Atributos de la clase Centro
    private String codCentro;
    private String nombreCentro;
    private String emailCentro;
    private String telCentro;
    private String direCentro;
    
    //Constructor sin parámetros de la clase Centro
    public Centro() {

    }

    //Constructor con parámetros de la clase Centro
    public Centro (String codCentro, String nombreCentro, String emailCentro, String telCentro, String direCentro){
        this.codCentro = codCentro;
        this.nombreCentro = nombreCentro;
        this.emailCentro = emailCentro;
        this.telCentro = telCentro;
        this.direCentro = direCentro;
    }

    // Métodos getter y setter para cada atributo de la clase Centro
    public String getcodCentro(){
        return codCentro;
    }

    public String getnombreCentro(){
        return nombreCentro;
    }
    
    public String getemailCentro(){
        return emailCentro;
    }

    public String gettelCentro(){
        return telCentro;
    }

    public String getdireCentro(){
        return direCentro;
    }

    public void setcodCentro(String codCentro){
        this.codCentro = codCentro;
    }

    public void setnombreCentro(String nombreCentro){
        this.nombreCentro = nombreCentro;
    }

    public void setemailCentro(String emailCentro){
        this.emailCentro = emailCentro;
    }

    public void settelCentro(String telCentro){
        this.telCentro = telCentro;
    }

    public void setdireCentro(String direCentro){
        this.direCentro = direCentro;
    }


}
