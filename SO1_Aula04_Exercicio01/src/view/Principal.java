package view;

import controller.ThreadVetor;

public class Principal {

	public static void main(String[] args) {

		//INICIALIZANDO VETOR COM 1000 POSIÇÕES
		int[] vetor = new int[1000];
		
		//VALORES ALEATORIOS DE 1 A 100
		for (int i = 0 ; i < 1000 ; i++) {
			int num = (int) (Math.random() * 100) + 1;
			vetor[i] = num;
		}
		
		for (int i = 1; i <= 2 ; i++) {
			int num = i;
			Thread ThreadVetor= new ThreadVetor(num, vetor);
			ThreadVetor.start();
			System.out.println("Numero Gerado: " + vetor [i]);
		}
		
		System.out.println("===========================================");
	}

}
