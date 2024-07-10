package dominio;


import java.util.ArrayList;
import java.util.Iterator;

public class Buzon {
   private ArrayList<Mensaje> mensajes = new ArrayList();

   public Buzon() {
   }

   public void mensajeRecibidos(Remitente remitente, Mensaje mensaje) {
      this.mensajes.add(mensaje);
   }

   public void entregarMensajes(Destinatario destinatario, Mensaje mensaje) {
      this.mensajes.remove(mensaje);
      destinatario.tomarMensaje(mensaje);
   }

   public String toString() {
      String str = "Mensajes en el buz\u00f3n:\n";

      Mensaje mensaje;
      for(Iterator var3 = this.mensajes.iterator(); var3.hasNext(); str = str + mensaje.toString() + "\n") {
         mensaje = (Mensaje)var3.next();
      }

      return str;
   }
}
