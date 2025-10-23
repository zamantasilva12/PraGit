package PatronesDiseno.src.PatronesEstructurales;

public class adapter implements cliente {

    private servicioExistente servicio;

    public adapter(servicioExistente servicio) {
        this.servicio = servicio;
    }

    @Override
    public void usar() {
        servicio.metodoExistente();
    }
}
