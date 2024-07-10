package dominio;

public class Persona {
    private String nombre = "";
 
    public Persona(String nombre) {
       this.nombre = nombre;
    }
 
    public void setNombre(String nombre) {
       this.nombre = nombre;
    }
 
    public String getNombre() {
       return this.nombre;
    }
 
    public String toString() {
       return "Nombre: " + this.nombre;
    }
 
    public boolean equals(Object obj) {
       if (!(obj instanceof Persona persona)) {
          return false;
       } else {
          return this.nombre.equals(persona.getNombre());
       }
    }
 }
 
