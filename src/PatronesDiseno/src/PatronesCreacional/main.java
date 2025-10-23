package PatronesDiseno.src.PatronesCreacional;

public class main {
    public static void main(String[] args) {
        conexionBD c1 = conexionBD.getInstancia();
        c1.usarConexion();

        conexionBD c2 = conexionBD.getInstancia();
        c2.usarConexion();

        System.out.println("¿Son la misma instancia?" + (c1 == c2));
    }
}