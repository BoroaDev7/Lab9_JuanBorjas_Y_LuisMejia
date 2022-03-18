
public class Preguntas {
    private String preguntas;
    private boolean respuesta;

    public Preguntas() {
    }

    public Preguntas(String preguntas, boolean respuesta) {
        this.preguntas = preguntas;
        this.respuesta = respuesta;
    }

    public String getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(String preguntas) {
        this.preguntas = preguntas;
    }

    public boolean isRespuesta() {
        return respuesta;
    }

    public void setRespuesta(boolean respuesta) {
        this.respuesta = respuesta;
    }

    @Override
    public String toString() {
        return "Preguntas{" + "preguntas=" + preguntas + ", respuesta=" + respuesta + '}';
    }
    
    
}
