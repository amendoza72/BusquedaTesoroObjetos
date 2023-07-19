package Juego;
import java.util.Random;

import Global.Constantes;

public class Tablero {
    private Casilla[][] casillas;


    public Tablero(){

        casillas = new Casilla[Constantes.NUMERO_CASILLAS][Constantes.NUMERO_CASILLAS];

        for (int f=0; f<Constantes.NUMERO_CASILLAS; f++){
            for (int c=0; c<Constantes.NUMERO_CASILLAS; c++){
                casillas[f][c] = new Casilla();
            }
        }

        colocar(Constantes.MINA);
        colocar(Constantes.TESORO);
    }

    private void colocar(char elemento){
        Random random = new Random();
        int fila, columna;

        boolean colocado = false;
        do{
            fila = random.nextInt(Constantes.NUMERO_CASILLAS);
            columna = random.nextInt(Constantes.NUMERO_CASILLAS);
            if (casillas[fila][columna].igual(Constantes.VACIO)){
                casillas[fila][columna].setValor(elemento);
                colocado = true;
            }
        } while (!colocado);
    }

    public char getValorCasilla(int fila, int columna){
        return casillas[fila][columna].getValor();
    }

    public void setValorCasilla(int fila, int columna, char valor){
        casillas[fila][columna].setValor(valor);
    }


    public void dibujar(){
         for (int f=0; f < Constantes.NUMERO_CASILLAS; f++){
            dibujarFila(f);
        }
    }

    private void dibujarFila(int f){
        dibujaBorde();
        System.out.println("");
        for (int c = 0; c < Constantes.NUMERO_CASILLAS; c++) {
            casillas[f][c].dibujar();
        }
        System.out.println("");
        dibujaBorde();
        System.out.println("");
    }

    private void dibujaBorde (){
        for (int c = 0; c < Constantes.NUMERO_CASILLAS; c++) {
            System.out.print("|----|");
        }
    }
}
