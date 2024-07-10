package dominio;
public class Remitente extends Persona {
    public Remitente(String nombre) {
       super(nombre);
    }
 
    public boolean equals(Object obj) {
       if (!(obj instanceof Remitente remitente)) {
          return false;
       } else {
          return this.getNombre().equals(remitente.getNombre());
       }
    }
 }
 
