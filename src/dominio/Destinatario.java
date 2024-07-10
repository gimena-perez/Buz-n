package dominio;

public class Destinatario extends Persona {
    private String mensajesRecibidos = "";
 
    public Destinatario(String nombre) {
       super(nombre);
    }
 
    public Destinatario(String nombre, String mensajesRecibidos) {
       super(nombre);
       this.mensajesRecibidos = mensajesRecibidos;
    }
 
    public void setMensajesRecibidos(String mensajesRecibidos) {
       this.mensajesRecibidos = mensajesRecibidos;
    }
 
    public String getMensajesRecibidos() {
       return this.mensajesRecibidos;
    }
 
    public String toString() {
       String var10000 = super.toString();
       return var10000 + " - " + this.getMensajesRecibidos();
    }
 
    public void tomarMensaje(Mensaje mensaje) {
       String var10001 = String.valueOf(this.mensajesRecibidos);
       this.mensajesRecibidos = var10001 + mensaje.toString() + "\n";
    }
 }