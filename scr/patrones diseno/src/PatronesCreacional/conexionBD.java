package PatronesdisenoB.PatronesCreacional;
public class conexionBD {

    private static conexionBD instancia;
    private String conexion;
  private conexionBD() {
       conexion = "Conexión a la base de datos establecida.";
         System.out.println("conexion creada: " + conexion);
    }

    public static conexionBD getInstancia() {
        if (instancia == null) {
            instancia = new conexionBD();
        }
        return instancia;
    }
    public void usarConexion() {
        System.out.println("Usando la conexión: " + conexion);
    }
}