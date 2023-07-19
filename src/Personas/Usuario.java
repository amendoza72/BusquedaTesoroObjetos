package Personas;

import Global.Constantes;

public class Usuario {
    
   
    public int solicitarDato(String dato){
        int resultado = 0;
        boolean fallo = true;
        do {
            try{
                System.out.println("Dame la "+ dato);
                String numeroLeido = Constantes.lector.nextLine();
                resultado = Integer.parseInt(numeroLeido);
                if (resultado >= 0 && resultado < Constantes.NUMERO_CASILLAS){
                    fallo = false;
                }
                else{
                    System.out.println("El valor tiene que estar entre 0 y  " + (Constantes.NUMERO_CASILLAS-1));
                }
            }
            catch (Exception e){
                fallo = true;
                System.out.println("Valor inválido");
            }
        } while(fallo);
        //lector.close();
        return resultado;
    }

    public void escribirMensaje(String mensaje){
        System.out.println(mensaje);
    }

    public boolean seguir(){
        System.out.println("Otra partida?(S/n)");
        String respuesta = Constantes.lector.nextLine();
        return respuesta.equals(("S"));
    }
}
