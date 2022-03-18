
public class Usuarios {
    private String tipo,usuario,contrasena;

    public Usuarios() {
    }

    public Usuarios(String tipo,String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.tipo=tipo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "tipo=" + tipo + ", usuario=" + usuario + ", contrasena=" + contrasena + '}';
    }
    
    
 
    
}
