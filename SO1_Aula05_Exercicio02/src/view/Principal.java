package view;

import java.util.concurrent.Semaphore;

import controller.CozinhaController;

public class Principal {

	public static void main(String[] args) {

		Semaphore semaforo1 = new Semaphore(1); 			// QNTD CRITICA -> UMA ENTREGA
		Semaphore semaforo2 = new Semaphore(1);
		

		//QTD DE PRATOS COZINHADOS
		for (int IDPratos = 1; IDPratos < 22; IDPratos++) {

			Thread controller = new CozinhaController(IDPratos, semaforo1, semaforo2);
			controller.start();

		}
	}
}
