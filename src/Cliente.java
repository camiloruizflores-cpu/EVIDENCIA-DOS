public class Cliente {
    // Atributos de la clase Cliente
    private String codCliente;
    private String nombreCliente;
    private String emailCliente;
    private String telCliente;
    private String direCliente;

    // Constructor sin parámetros de la clase Cliente
    public Cliente() {

    }

    // Constructor con parámetros de la clase Cliente
    public Cliente (String codCliente, String nombreCliente, String emailCliente, String telCliente, String direCliente){
        this.codCliente = codCliente;
        this.nombreCliente = nombreCliente;
        this.emailCliente = emailCliente;
        this.telCliente = telCliente;
        this.direCliente = direCliente;
    }

    // Métodos getter y setter para cada atributo de la clase Cliente
    public String getcodCliente(){
        return codCliente;
    }

    public String getnombreCliente(){
        return nombreCliente;
    }
    
    public String getemailCliente(){
        return emailCliente;
    }

    public String gettelCliente(){
        return telCliente;
    }

    public String getdireCliente(){
        return direCliente;
    }

    public void setcodCliente(String codCliente){
        this.codCliente = codCliente;
    }

    public void setnombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }

    public void setemailCliente(String emailCliente){
        this.emailCliente = emailCliente;
    }

    public void settelCliente(String telCliente){
        this.telCliente = telCliente;
    }

    public void setdireCliente(String direCliente){
        this.direCliente = direCliente;
    }



    
}


