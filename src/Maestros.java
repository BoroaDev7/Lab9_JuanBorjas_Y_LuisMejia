
public class Maestros {
    private String nombre;
    private int idMaestro;

    public Maestros() {
    }

    public Maestros(String nombre, int idMaestro) {
        this.nombre = nombre;
        this.idMaestro = idMaestro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdMaestro() {
        return idMaestro;
    }

    public void setIdMaestro(int idMaestro) {
        this.idMaestro = idMaestro;
    }

    @Override
    public String toString() {
        return "Maestros{" + "nombre=" + nombre + ", idMaestro=" + idMaestro + '}';
    }
    
}
