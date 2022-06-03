package ActTrenes;

public class Estacion {
    private String nombre;
    private boolean cabecera;

    public Estacion(String nombre, boolean cabecera) {
        this.nombre = nombre;
        this.cabecera = cabecera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCabecera() {
        return cabecera;
    }

    public void setCabecera(boolean cabecera) {
        this.cabecera = cabecera;
    }
}
