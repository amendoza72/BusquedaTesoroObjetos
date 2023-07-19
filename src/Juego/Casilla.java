package Juego;

import Global.Constantes;

public class Casilla {
    private char valor;

    public void setValor(char valor){
        this.valor = valor;
    }
    public char getValor(){
        return valor;
    }

    public Casilla(){
        valor = Constantes.VACIO;
    }

    public boolean igual(char valor){
        return this.valor == valor;
    }

    protected void dibujar(){          
        if (valor  == Constantes.SELECCIONADO) {
            System.out.print("|  S  |");
        } else {
            System.out.print("|    |");
        }
}
}
