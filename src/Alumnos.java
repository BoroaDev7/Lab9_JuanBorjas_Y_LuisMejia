
import java.util.ArrayList;


public class Alumnos {
    private String nombrealumno,numCuenta,carrera;
    private ArrayList<Clases>listaclases;

    public Alumnos() {
    }

    public Alumnos(String nombrealumno, String numCuenta, String carrera, ArrayList<Clases> listaclases) {
        this.nombrealumno = nombrealumno;
        this.numCuenta = numCuenta;
        this.carrera = carrera;
        this.listaclases = listaclases;
    }

    public String getNombrealumno() {
        return nombrealumno;
    }

    public void setNombrealumno(String nombrealumno) {
        this.nombrealumno = nombrealumno;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public ArrayList<Clases> getListaclases() {
        return listaclases;
    }

    public void setListaclases(ArrayList<Clases> listaclases) {
        this.listaclases = listaclases;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombrealumno=" + nombrealumno + ", numCuenta=" + numCuenta + ", carrera=" + carrera + ", listaclases=" + listaclases + '}';
    }
    
    
    
    
}
