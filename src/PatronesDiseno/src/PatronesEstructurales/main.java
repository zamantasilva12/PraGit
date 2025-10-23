package PatronesDiseno.src.PatronesEstructurales;

public class main {
    public static void main(String[] args) {
        servicioExistente servicio = new servicioExistente();
        cliente Cliente = new adapter(servicio);

        Cliente.usar();
    }
}
