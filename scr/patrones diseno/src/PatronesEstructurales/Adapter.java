package PatronesdisenoB.PatronesCreacional;

public class Adapter implements Cliente {
    private ServicoExistente servicio;
    public Adapter(ServicoExistente servicio) {
        this.servicio = servicio;
    }
    @Override
    public void usar() {
        servicio.metodoExistente(); //traduce la llamada
    }
}
