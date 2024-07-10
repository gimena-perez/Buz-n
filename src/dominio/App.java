package dominio;

public class App {
    public App() {
    }
 
    public static void main(String[] args) throws Exception {
       Remitente rem = new Remitente("Federico");
       Destinatario des = new Destinatario("Pablo");
       Mensaje men = new Mensaje("Hola, \u00bfc\u00f3mo est\u00e1s?", rem, des);
       Buzon buzon = new Buzon();
       buzon.mensajeRecibidos(rem, men);
       System.out.println("Mensajes recibidos:");
       System.out.println(buzon);
       buzon.entregarMensajes(des, men);
       System.out.println("Mensajes recibidos despu\u00e9s de la entrega:");
       System.out.println(des.getMensajesRecibidos());
       Remitente rem2 = new Remitente("Federico");
       System.out.println("\u00bfLos remitentes son iguales?");
       System.out.println(rem.equals(rem2));
    }
 }
 
