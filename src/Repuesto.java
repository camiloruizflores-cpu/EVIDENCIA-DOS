public class Repuesto {
    private String codRepuesto;
    private String nombreRepuesto;

    // Constructor sin parámetros de la clase Repuesto
    public Repuesto() {
    }

    // Constructor con parámetros de la clase Repuesto
    public Repuesto(String codRepuesto, String nombreRepuesto) {
        this.codRepuesto = codRepuesto;
        this.nombreRepuesto = nombreRepuesto;
    }

    // Métodos getter y setter para cada atributo de la clase Repuesto

    public String getCodRepuesto() {
        return codRepuesto;
    }

    public String getnombreRepuesto(){
        return nombreRepuesto;
    }

    public void setCodRepuesto(String codRepuesto) {
        this.codRepuesto = codRepuesto;
    }

    public void setNombreRepuesto(String nombreRepuesto) {
        this.nombreRepuesto = nombreRepuesto;
    }
}
