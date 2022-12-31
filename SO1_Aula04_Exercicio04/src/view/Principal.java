package view;

import controller.Corrida;

public class Principal {

	public static void main(String[] args) {
		
		int distancia = 100;
		int salto = 0;
	
		for (int i = 0; i < 5; i++) {
			Thread corridaSapos = new Corrida(distancia, salto);
			corridaSapos.start();
		}
	}

}

