package piedraPapelTijeras;

import java.util.Random;

public class dificultad {
	public String Dificil(String Jugador) {
		Jugador J = new Jugador();
		Maquina M = new Maquina();
		int tijera = 4;
		int papel = 3;
		int piedra = 5;
		String tijeraL = "tijera";
		String papelL = "papel";
		String piedraL = "piedra";

		if (Jugador.equals("tijera")) {
			piedra += 5;
		} else if (Jugador.equals("piedra")) {
			papel += 5;
		} else {
			tijera += 5;
		}
		double porcentajeTijera = (tijera / 100) * 100;
		double porcentajePapel = (papel / 100) * 100;
		double porcentajePiedra = (piedra / 100) * 100;

		if ((porcentajeTijera >= porcentajePapel) && porcentajeTijera >= porcentajePiedra) {

			return tijeraL;
		} else if ((porcentajePapel >= porcentajeTijera) && porcentajePapel >= porcentajePiedra) {

			return papelL;
		} else {

			return piedraL;
		}

	}
}