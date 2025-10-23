package PatronesDiseno.src.PatronesCreacional;

public class conexionBD {
    private static conexionBD instancia;

    private String conexion;

    private conexionBD() {
        conexion = "Conexion establecida con la base de datos";
        System.out.println("Conexion creada");
    }    

    public static conexionBD getInstancia() {
        if (instancia == null) {
            instancia = new conexionBD();
        }
        return instancia;
    }

    public void usarConexion() {
        System.out.println("Usando: " + conexion);
    }
}
