package dominio;

public class Mensaje {
    private String texto = "";
    private Remitente remitente;
    private Destinatario destinatario;
 
    public Mensaje(String texto, Remitente remitente, Destinatario destinatario) {
       this.texto = texto;
       this.remitente = remitente;
       this.destinatario = destinatario;
    }
 
    public String toString() {
       String str = "";
       str = str + "Mensaje ----------------\n";
       str = str + "Texto: " + this.texto + "\n";
       str = str + "Remitente: " + this.remitente.getNombre() + "\n";
       str = str + "Destinatario: " + this.destinatario.getNombre() + "\n";
       return str;
    }
 }
 
