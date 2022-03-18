
import java.util.ArrayList;


public class Examenes {
    private int idClase;
    ArrayList<Preguntas> preguntas=new ArrayList();

    public Examenes() {
    }

    public Examenes(int idClase) {
        this.idClase = idClase;
    }

    public int getIdClase() {
        return idClase;
    }

    public void setIdClase(int idClase) {
        this.idClase = idClase;
    }

    public ArrayList<Preguntas> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(ArrayList<Preguntas> preguntas) {
        this.preguntas = preguntas;
    }

    @Override
    public String toString() {
        return "Examenes{" + "idClase=" + idClase + ", preguntas=" + preguntas + '}';
    }
    
    
}
