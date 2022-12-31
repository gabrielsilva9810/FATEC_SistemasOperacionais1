package controller;

import java.util.concurrent.Semaphore;

public class CozinhaController extends Thread {

	// DECLARANDO VARIAVEL PRIVADA
	private int IDPratos;
	private Semaphore semaforo1;
	private Semaphore semaforo2;

	// CONSTRUTOR - RECEBENDO PARAM�TROS ACIMA
	public CozinhaController(int IDPratos, Semaphore semaforo1, Semaphore semaforo2) {
		super();
		
		this.IDPratos = IDPratos;
		this.semaforo1 = semaforo1;
		this.semaforo2 = semaforo2;
	}

	// METODO RUN -> RODANDO AS 3 THREADS
	@Override
	public void run() {

		cozinha();
		entrega();
	}

	// THREADS - COZINHA
	private void cozinha() {
		// SOPA DE CEBOLA --> LEVAM DE 0,5 a 0,8 segundos p ficar pronto;

		double tempoImpar = ((Math.random() * 0.31) + 0.5);
		double tempoPar = ((Math.random() * 0.61) + 0.6);
		double percentual1 = 0.0;
		double percentual2 = 0.0;

		IDPratos = (int) getId();

		//// SE FOR IMPAR
		if (IDPratos % 2 == 1) {
			System.out.println("Sopa de Cebola foi iniciada!");

			while (percentual1 < 99.9) {
				try {
					sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				tempoImpar = tempoImpar - 0.1;
				percentual1 = (0.1 / tempoImpar) * 100;

				if (percentual1 > 100) {
					System.out.println("Sopa de Cebola foi cozinhada. Percentual --> 100%");
				} else {
					System.out
							.println("Sopa de Cebola está sendo cozinhada. Percentual --> " + (int) percentual1 + "%");
				}
			}

			// FINALIZOU
			System.out.println("Sopa de Cebola está pronta.");

		} else {

			System.out.println("Lasanha a Bolonhesa foi iniciada!");

			while (percentual2 < 99.9) {
				try {
					sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				tempoPar = tempoPar - 0.1;
				percentual2 = (0.1 / tempoPar) * 100;

				if (percentual2 > 100) {
					System.out.println("Lasanha a Bolonhesa foi cozinhada. Percentual --> 100%");
				} else {
					System.out.println("Lasanha a Bolonhesa está sendo cozinhada. Percentual --> " + (int) percentual2 + "%");
				}
			}

			// FINALIZOU
			System.out.println("Lasanha a Bolonhesa está pronta.");
		}
	}

	// THREADS - ENTREGA
	private void entrega() {
		// LASANHA A BOLONHESA
		// LEVAM DE 0,6 A 1,2 SEGUNDOS

		if (IDPratos % 2 == 1) {
			try {
				semaforo1.acquire();
				System.out.println("Sopa de cebola está sendo entregue");
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaforo1.release();
				System.out.println("Sopa de cebola entregue. Bom apetite!");
			}

		} else {
			try {
				semaforo2.acquire();
				System.out.println("Lasanha a Bolonhesa está sendo entregue");
				sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaforo2.release();
				System.out.println("Lasanha a Bolonhesa entregue. Bom apetite!");
			}
		}

	}

}
