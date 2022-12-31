package view;

import controller.MatrizThread;

public class Principal {

	public static void main(String[] args) {

		int[][] matriz = new int[3][5];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 5; j++) {
				
				int num = (int) (Math.random() * 10);
				matriz[i][j] = num;
				
			}
		}

		for (int i = 0; i < 3; i++) {
			Thread calcMatriz = new MatrizThread(matriz, i);
			calcMatriz.start();
		}
	}
}
