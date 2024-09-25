package piedraPapelTijeras;

import java.util.Scanner;

public class Jugador {

	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		String Input = "NO";
		String Salida = "";
		String resultadoGanador = "";
		dificultad Dificil = new dificultad();
		Maquina M = new Maquina();
		String resultadoMaquina = null;
		String resultadoMaquinaD = null;

		System.out.println("Elija la dificultad: 1 normal, 2 dificil");
		int Dificult = S.nextInt();

		do {
			System.out.println("Elije: piedra, papel o tijeras");
			String Jugador = S.next();
			if (Dificult == 1) {
				resultadoMaquina = M.ResultadoMaq(resultadoMaquina);

			} else {
				resultadoMaquina = Dificil.Dificil(Jugador);
			}

			System.out.println("La máquina eligió: " + resultadoMaquina);

			if (Jugador.equals("piedra") && resultadoMaquina.equals("tijeras")) {
				resultadoGanador = M.ResultadoMaq(resultadoMaquina);
				System.out.println("Has ganado");
				
			} else if (Jugador.equals("papel") && resultadoMaquina.equals("piedra")) {
				resultadoGanador = M.ResultadoMaq(resultadoMaquina);
				System.out.println("Has ganado");
				
			} else if (Jugador.equals("tijeras") && resultadoMaquina.equals("papel")) {
				resultadoGanador = M.ResultadoMaq(resultadoMaquina);
				System.out.println("Has ganado");
				
			} else {
				System.out.println("Has perdido");
			}
			System.out.println("¿Quieres jugar otra vez? SI/NO");
			Salida = S.next();

		} while (!Input.equals(Salida));

		System.out.println("Vuelva pronto");
	}
}
