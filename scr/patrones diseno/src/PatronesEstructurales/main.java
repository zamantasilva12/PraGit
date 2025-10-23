package PatronesdisenoB.PatronesCreacional;

public class main {
    public static void main(String[] args) {
        ServicoExistente servicio = new ServicoExistente();
        Cliente cliente = new Adapter(servicio);
        cliente.usar();
    }
}
