package controller;

public class Corrida extends Thread {

	private int distancia;
	private int salto;

	// CONSTRUTOR
	public Corrida(int distancia, int salto) {
		this.distancia = distancia;
		this.salto = salto;
	}

	// METODO CORRA
	@Override
	public void run() {
		correr(distancia, salto);
		System.out.println("Podium: " + "#" + getId());
	}

	//METODO DA CORRIDA
	private void correr(int distancia, int salto) {

		while (salto <= distancia) {
			if (salto <= distancia) {

				int novoSalto = (int) (Math.random() * 10) + 1;
				System.out.println("#" + getId() + " ==> Salto Atual: " + novoSalto);
				salto = salto + novoSalto;
				System.out.println("Distancia Percorrida: " + salto + "\n");
			}
		}

		// TRATAMENTO DO TEMPO
		int tempo = 1000;

		try {
			sleep(tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
