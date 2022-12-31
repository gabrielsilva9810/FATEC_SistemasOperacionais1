package controller;


	public class MatrizThread extends Thread {

		private int[][] matriz;
		private int linha;
		
		public MatrizThread (int[][] matriz, int linha) {
			this.matriz = matriz;
			this.linha = linha;
		}
		
		@Override
		public void run() {
			calcularLinha(matriz, linha);
		}

		private void calcularLinha(int[][] matriz2, int linha2) {
			int soma = 0;
			for (int i = linha; i < 3; i++) {
				for (int j = 0; j < 5; j++) {
						soma = matriz [linha][j] + soma;
				}
			}
			
			System.out.println("#ID: " + getId() + " ==> Linha: " + linha + " Soma = " + soma);
		}
		
		
}


