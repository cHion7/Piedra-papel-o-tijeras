package piedraPapelTijeras;

import java.util.Random;

public class Maquina {

    public String ResultadoMaq(String resultadoMaquina) {
        Random R = new Random();
        int numeroEnRango = R.nextInt(3);
        String resultado = null;

        if (numeroEnRango == 0) {
            resultado = "papel";
        } else if (numeroEnRango == 1) {
            resultado = "piedra";
        } else {
            resultado = "tijeras";
        }

        return resultado;
    }


}