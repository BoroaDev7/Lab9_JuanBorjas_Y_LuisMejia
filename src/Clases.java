
public class Clases {
    private String nombreclase;
    private int idclase,idMaestro,idExamen1,idExamen2;

    public Clases() {
    }

    public Clases(String nombreclase, int idclase, int idMaestro, int idExamen1, int idExamen2) {
        this.nombreclase = nombreclase;
        this.idclase = idclase;
        this.idMaestro = idMaestro;
        this.idExamen1 = idExamen1;
        this.idExamen2 = idExamen2;
    }

    public String getNombreclase() {
        return nombreclase;
    }

    public void setNombreclase(String nombreclase) {
        this.nombreclase = nombreclase;
    }

    public int getIdclase() {
        return idclase;
    }

    public void setIdclase(int idclase) {
        this.idclase = idclase;
    }

    public int getIdMaestro() {
        return idMaestro;
    }

    public void setIdMaestro(int idMaestro) {
        this.idMaestro = idMaestro;
    }

    public int getIdExamen1() {
        return idExamen1;
    }

    public void setIdExamen1(int idExamen1) {
        this.idExamen1 = idExamen1;
    }

    public int getIdExamen2() {
        return idExamen2;
    }

    public void setIdExamen2(int idExamen2) {
        this.idExamen2 = idExamen2;
    }

    @Override
    public String toString() {
        return "Clases{" + "nombreclase=" + nombreclase + ", idclase=" + idclase + ", idMaestro=" + idMaestro + ", idExamen1=" + idExamen1 + ", idExamen2=" + idExamen2 + '}';
    }
    
    
    
}
