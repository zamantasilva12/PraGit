package PatronesdisenoB.PatronesCreacional;

public class main {
    public static void main(String[] args) {
        // Obtener la instancia única de la conexión a la base de datos
        conexionBD conexion1 = conexionBD.getInstancia();
        conexion1.usarConexion();

        // Intentar obtener otra instancia
        conexionBD conexion2 = conexionBD.getInstancia();
        conexion2.usarConexion();

        System.out.println("son la misma instancia: " + (conexion1 == conexion2));
    }
}
