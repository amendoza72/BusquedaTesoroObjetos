import Juego.Partida;
import Personas.Usuario;

public class App {
    public static void main(String[] args) throws Exception {
      
       Usuario usuario = new Usuario();
       Partida partida = new Partida(usuario);
       do{
            partida.jugar();
       } while (usuario.seguir());
    }
}
