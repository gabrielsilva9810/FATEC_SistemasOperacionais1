package controller;

public class ThreadVetor extends Thread {

	//DECLARANDO VARIAVEL PRIVADA -> NUM E VETOR
	private int num;
	private int [] vetor;
	
	//CONSTRUTOR
	public ThreadVetor(int num, int [] vetor) {
			this.num = num;									
			this.vetor = vetor;
		}
	
	//METODO RUN PARA CHAMAR A THREAD
	@Override
	public void run() {
		timeSeconds();
	}

	//THREAD DOS SEGUNDOS
	private void timeSeconds() {
		
		int id = (int) getId();
		
		//SE FOR PAR
		if(num % 2 == 0) {
			
			//REGISTRAR TEMPO INICIAL
			double tempoInicial = System.nanoTime();
			
			//PERCORRENDO VETOR
			for (int i = 0 ; i < vetor.length; i++){
			}
			
			//REGISTRAR TEMPO FINAL
			double tempoFinal = System.nanoTime();
			
			//TOTAL
			double tempoTotal = tempoFinal - tempoInicial;
			tempoFinal = tempoFinal / Math.pow(10,  9);						//PASSAR PARA SEGUNDOS
			System.out.println("#ID: " + id+ " PAR | TEMPO ==> " + tempoFinal + "s.");
			
		} else if (num % 2 == 1){
			
			//SE FOR IMPAR
			double tempoInicial = System.nanoTime();
			
			
			for(int cada : vetor) {
				
			}
			
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			tempoFinal = tempoFinal / Math.pow(10,  9);						//PASSAR PARA SEGUNDOS
			System.out.println("#ID: " + id+ " IMPAR | TEMPO ==> " + tempoFinal + "s.");
		}
		
	}
}


