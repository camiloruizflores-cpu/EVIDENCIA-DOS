import javax.print.attribute.standard.DateTimeAtCompleted;

public class sgm {
    public static void main(String[] args, DateTimeAtCompleted fechaInicio, String duracionHora) throws Exception {
        System.out.println("Hello, World!");
   
    // Crear el objeto de la clase Cliente

    Cliente objCliente = new Cliente();

    //Asignar valores a los atributos del objeto Cliente utilizando los métodos setter
    objCliente.setcodCliente("01");
    objCliente.setnombreCliente("Newrest Services Colombia");
    objCliente.setemailCliente("newrest@hotmail.com");
    objCliente.settelCliente("12345");
    objCliente.setdireCliente("av 1 20 30");

    //Imprimir los valores de los atributos del objeto Cliente utilizando los metodos getter
    System.out.println("Codigo del Cliente: " + objCliente.getcodCliente());
    System.out.println("Nombre del Cliente: " + objCliente.getnombreCliente());
    System.out.println("Email del Cliente: " + objCliente.getemailCliente());
    System.out.println("Telefono del Cliente: " + objCliente.gettelCliente());
    System.out.println("Direccion del Cliente: " + objCliente.getdireCliente());

    //Cargar datos del cliente utilizando el constructor con parámetros
    Cliente objCliente2 = new Cliente("02", "Casino Services", "casino@hotmail.com", "56789", "cl 2 40 50");

    //Imprimir los valores de los atributos del objeto Cliente2 utilizando los métodos getter
    System.out.println("Codigo del Cliente 2: " + objCliente2.getcodCliente());
    System.out.println("Nombre del Cliente 2: " + objCliente2.getnombreCliente());
    System.out.println("Email del Cliente 2: " + objCliente2.getemailCliente());
    System.out.println("Telefono del Cliente 2: " + objCliente2.gettelCliente());
    System.out.println("Direccion del Cliente 2: " + objCliente2.getdireCliente());


    // Crear el objeto de la clase Centro
    Centro objCentro = new Centro();

    //Asignar valores a los atributos del objeto Centro utilizando los métodos setter

    objCentro.setcodCentro("01");
    objCentro.setnombreCentro("Planta de Producción");
    objCentro.setemailCentro("plantaproduccion@hotmail.com");
    objCentro.settelCentro("23456");
    objCentro.setdireCentro("cl 4 60 70");

    //Imprimir los valores de los atributos del objeto Centro utilizando los metodos getter

    System.out.println("Codigo del Centro: " + objCentro.getcodCentro());
    System.out.println("Nombre del Centro: " + objCentro.getnombreCentro());
    System.out.println("Email del Centro: " + objCentro.getemailCentro());
    System.out.println("Telefono del Centro: " + objCentro.gettelCentro());
    System.out.println("Direccion del Centro: " + objCentro.getdireCentro());

    //Cargar datos del Centro utilizando el constructor con parámetros
    Centro objCentro2 = new Centro("02", "Clinica Prado","clinicaprado@hotmail.com", "56789", "cl 2 40 50");

    //Imprimir los valores de los atributos del objeto Centro2 utilizando los métodos getter
    System.out.println("Codigo del Centro 2: " + objCentro2.getcodCentro());
    System.out.println("Nombre del Centro 2: " + objCentro2.getnombreCentro());
    System.out.println("Email del Centro 2: " + objCentro2.getemailCentro());
    System.out.println("Telefono del Centro 2: " + objCentro2.gettelCentro());
    System.out.println("Direccion del Centro 2: " + objCentro2.getdireCentro());

    //Crear el objeto de la clase Tecnico
    Tecnico objTecnico = new Tecnico();
    //Asignar valores a los atributos del objeto Tecnico utilizando los métodos setter
    objTecnico.setCodTecnico("01");
    objTecnico.setNombreTecnico("Fernando Estrada");
    //Imprimir los valores de los atributos del objeto Tecnico utilizando los métodos getter
    System.out.println("Codigo del Tecnico: " + objTecnico.getCodTecnico());
    System.out.println("Nombre del Tecnico: " + objTecnico.getnombreTecnico());
    //Cargar datos del Tecnico utilizando el constructor con parámetros
    Tecnico objTecnico2 = new Tecnico("02", "Rafael Chiquillo");
    //Imprimir los valores de los atributos del objeto Tecnico2 utilizando los métodos getter
    System.out.println("Codigo del Tecnico 2: " + objTecnico2.getCodTecnico());
    System.out.println("Nombre del Tecnico 2: " + objTecnico2.getnombreTecnico());

    //Crear el objeto de la clase Equipo
    Equipo objEquipo = new Equipo();
    //Asignar valores a los atributos del objeto Equipo utilizando los métodos setter
    objEquipo.setCodEquipo("01");
    objEquipo.setNombreEquipo("Autoservicio");
    //Imprimir los valores de los atributos del objeto Equipo utilizando los métodos getter
    System.out.println("Codigo del Equipo: " + objEquipo.getCodEquipo());
    System.out.println("Nombre del Equipo: " + objEquipo.getnombreEquipo());
    //Cargar datos del Equipo utilizando el constructor con parámetros
    Equipo objEquipo2 = new Equipo("02", "Marmita");
    //Imprimir los valores de los atributos del objeto Equipo2 utilizando los métodos getter
    System.out.println("Codigo del Equipo 2: " + objEquipo2.getCodEquipo());
    System.out.println("Nombre del Equipo 2: " + objEquipo2.getnombreEquipo());

    //Crear el objeto de la clase Analista
    Analista objAnalista = new Analista();
    //Asignar valores a los atributos del objeto Analista utilizando los métodos setter
    objAnalista.setCodAnalista("01");
    objAnalista.setNombreAnalista("Andrea Alvarez");
    //Imprimir los valores de los atributos del objeto Analista utilizando los métodos getter
    System.out.println("Codigo del Analista: " + objAnalista.getCodAnalista());
    System.out.println("Nombre del Analista: " + objAnalista.getnombreAnalista());
    //Cargar datos del Analista utilizando el constructor con parámetros
    Analista objAnalista2 = new Analista("02", "Alejandra Estrada");
    //Imprimir los valores de los atributos del objeto Analista2 utilizando los métodos getter
    System.out.println("Codigo del Analista 2: " + objAnalista2.getCodAnalista());
    System.out.println("Nombre del Analista 2: " + objAnalista2.getnombreAnalista());

    //Crear el objeto de la clase Repuesto
    Repuesto objRepuesto = new Repuesto();
    //Asignar valores a los atributos del objeto Repuesto utilizando los métodos setter
    objRepuesto.setCodRepuesto("01");
    objRepuesto.setNombreRepuesto("Resistencia");
    //Imprimir los valores de los atributos del objeto Repuesto utilizando los métodos getter
    System.out.println("Codigo del Repuesto: " + objRepuesto.getCodRepuesto());
    System.out.println("Nombre del Repuesto: " + objRepuesto.getnombreRepuesto());
    //Cargar datos del Repuesto utilizando el constructor con parámetros
    Repuesto objRepuesto2 = new Repuesto("02", "Suiche");       
    //Imprimir los valores de los atributos del objeto Repuesto2 utilizando los métodos getter
    System.out.println("Codigo del Repuesto 2: " + objRepuesto2.getCodRepuesto());
    System.out.println("Nombre del Repuesto 2: " + objRepuesto2.getnombreRepuesto());

    //Crear el objeto de la clase Reporte
        Reporte objReporte = new Reporte();
    //Asignar valores a los atributos del objeto Reporte utilizando los métodos setter
    objReporte.setnumReporte("01");
    objReporte.setcodCliente("01");
    objReporte.setcodCentro("01");
    objReporte.setcodTecnico("01");
    objReporte.setcodEquipo("01");
    objReporte.setcodAnalista("01");
    objReporte.setcodRepuesto("01");
    objReporte.setidEstadomantenimiento("01");
    objReporte.setidTipomantenimiento("01");
    objReporte.setfechaInicio(fechaInicio);
    objReporte.setfechaFin(fechaInicio);
    objReporte.setduracionHora(duracionHora);
    //Imprimir los valores de los atributos del objeto Reporte utilizando los métodos getter
    System.out.println("Codigo del Reporte: " + objReporte.getnumReporte());
    System.out.println("Codigo del Cliente en el Reporte: " + objReporte.getcodCliente());
    System.out.println("Codigo del Centro en el Reporte: " + objReporte.getcodCentro());
    System.out.println("Codigo del Tecnico en el Reporte: " + objReporte.getcodTecnico());
    System.out.println("Codigo del Equipo en el Reporte: " + objReporte.getcodEquipo());
    System.out.println("Codigo del Analista en el Reporte: " + objReporte.getcodAnalista());
    System.out.println("Codigo del Repuesto en el Reporte: " + objReporte.getcodRepuesto());
    System.out.println("Codigo del Estado de Mantenimiento en el Reporte: " + objReporte.getidEstadomantenimiento());
    System.out.println("Codigo del Tipo de Mantenimiento en el Reporte: " + objReporte.getidTipomantenimmiento());
    System.out.println("Fecha de Inicio del Reporte: " + objReporte.getfechaInicio());
    System.out.println("Fecha de Fin del Reporte: " + objReporte.getfechaFin());
    System.out.println("Duracion en Horas del Reporte: " + objReporte.getduracionHora());
    //Cargar datos del Reporte utilizando el constructor con parámetros
    Reporte objReporte2 = new Reporte("02", "02", "02", "02", "02", "02", "02", "02", "02", fechaInicio, fechaInicio, duracionHora);
    //Imprimir los valores de los atributos del objeto Reporte2 utilizando los métodos gette
    System.out.println("Codigo del Reporte 2: " + objReporte2.getnumReporte());
    System.out.println("Codigo del Cliente en el Reporte 2: " + objReporte2.getcodCliente());
    System.out.println("Codigo del Centro en el Reporte 2: " + objReporte2.getcodCentro());
    System.out.println("Codigo del Tecnico en el Reporte 2: " + objReporte2.getcodTecnico());
    System.out.println("Codigo del Equipo en el Reporte 2: " + objReporte2.getcodEquipo());
    System.out.println("Codigo del Analista en el Reporte 2: " + objReporte2.getcodAnalista());
    System.out.println("Codigo del Repuesto en el Reporte 2: " + objReporte2.getcodRepuesto());
    System.out.println("Codigo del Estado de Mantenimiento en el Reporte 2: " + objReporte2.getidEstadomantenimiento());
    System.out.println("Codigo del Tipo de Mantenimiento en el Reporte 2: " + objReporte2.getidTipomantenimmiento());
    System.out.println("Fecha de Inicio del Reporte 2: " + objReporte2.getfechaInicio());
    System.out.println("Fecha de Fin del Reporte 2: " + objReporte2.getfechaFin());
    System.out.println("Duracion en Horas del Reporte 2: " + objReporte2.getduracionHora());

    //Crear el objeto de la clase EstadoMantenimiento
    EstadoMantenimiento objEstadoMantenimiento = new EstadoMantenimiento();
    //Asignar valores a los atributos del objeto EstadoMantenimiento utilizando los métodos setter
    objEstadoMantenimiento.setIdEstadoMantenimiento("01");
    objEstadoMantenimiento.setNombreEstadoMantenimiento("En Proceso");
    //Imprimir los valores de los atributos del objeto EstadoMantenimiento utilizando los métodos getter
    System.out.println("Codigo del Estado de Mantenimiento: " + objEstadoMantenimiento.getIdEstadoMantenimiento());
    System.out.println("Nombre del Estado de Mantenimiento: " + objEstadoMantenimiento.getNombreEstadoMantenimiento());
    //Cargar datos del EstadoMantenimiento utilizando el constructor con parámetros
    EstadoMantenimiento objEstadoMantenimiento2 = new EstadoMantenimiento("02", "Finalizado");
    //Imprimir los valores de los atributos del objeto EstadoMantenimiento2 utilizando los métodos getter
    System.out.println("Codigo del Estado de Mantenimiento 2: " + objEstadoMantenimiento2.getIdEstadoMantenimiento());
    System.out.println("Nombre del Estado de Mantenimiento 2: " + objEstadoMantenimiento2.getNombreEstadoMantenimiento());

    //Crear el objeto de la clase TipoMantenimiento
    TipoMantenimiento objTipoMantenimiento = new TipoMantenimiento();
    //Asignar valores a los atributos del objeto TipoMantenimiento utilizando los métodos setter
    objTipoMantenimiento.setIdTipoMantenimiento("01");
    objTipoMantenimiento.setNombreTipoMantenimiento("Correctivo");
    //Imprimir los valores de los atributos del objeto TipoMantenimiento utilizando los métodos getter
    System.out.println("Codigo del Tipo de Mantenimiento: " + objTipoMantenimiento.getIdTipoMantenimiento());
    System.out.println("Nombre del Tipo de Mantenimiento: " + objTipoMantenimiento.getNombreTipoMantenimiento());
    //Cargar datos del TipoMantenimiento utilizando el constructor con parámetros
    TipoMantenimiento objTipoMantenimiento2 = new TipoMantenimiento("02", "Preventivo");
    //Imprimir los valores de los atributos del objeto TipoMantenimiento2 utilizando los métodos getter
    System.out.println("Codigo del Tipo de Mantenimiento 2: " + objTipoMantenimiento2.getIdTipoMantenimiento());
    System.out.println("Nombre del Tipo de Mantenimiento 2: " + objTipoMantenimiento2.getNombreTipoMantenimiento());

    





}


}

