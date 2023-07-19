package Juego;

import Global.Constantes;
import Personas.Usuario;

public class Partida {
    Usuario usuario;
    Tablero tablero;

    public Partida(Usuario usuario){
        this.usuario = usuario;
        tablero = new Tablero();
    }

    public void jugar(){
        tablero.dibujar();
        boolean terminado = false;
        do {
            terminado = jugarRonda();
        }
        while (!terminado);
    }

    private boolean jugarRonda(){
            int fila = usuario.solicitarDato("FILA");
            int columna = usuario.solicitarDato("COLUMNA");
            return  procesarJugada(fila, columna );
    }

    private boolean procesarJugada(int fila, int columna){
        boolean fin = false;

        switch (tablero.getValorCasilla(fila, columna)){
            case Constantes.MINA:
                usuario.escribirMensaje("Has perdido!!!");
                fin = true;
                break;
            case Constantes.TESORO:
                usuario.escribirMensaje("Enhorabuena, has ganado!!!");
                fin = true;
                break;
            default:
                tablero.setValorCasilla(fila, columna, Constantes.SELECCIONADO);
                fin = false;
                tablero.dibujar();
        }

        return fin;
    }
}
