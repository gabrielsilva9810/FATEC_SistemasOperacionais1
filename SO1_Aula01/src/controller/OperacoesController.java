package controller;

public class OperacoesController {

	public OperacoesController() {
		super();
	}

	// STRING
	public void concatenaString() {
		String var = "a";
		double tempoInicial = System.nanoTime();
		
		for (int i = 0; i < 32768; i++) {
			var = var + "a";
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10,  9);
		System.out.println("String --> " + tempoTotal + "s.");
	}
	
	// BUFFER
	public void concatenaBuffer() {
		StringBuffer buffer = new StringBuffer();
		double tempoInicial = System.nanoTime();
		
		for(int i = 0; i < 32768 ; i++) {
			buffer.append("a");
		}
		
		double tempoFinal = System.nanoTime();
		double tempoTotal = tempoFinal - tempoInicial;
		tempoTotal = tempoTotal / Math.pow(10,  9);
		System.out.println("Buffer --> " + tempoTotal + "s.");
	}
	
	//FRASE - Utilizando o Split
	
	public void divideFrase(String frase) {
		String[] vetorPalavras = frase.split(" ");
		int length = vetorPalavras.length;		//Maneira de não passar por todos
		
		for(int i = 0; i < length; i++) {
		}
		
		//FOREACH - For (TipoDado var : vetor)
		for(String palavra : vetorPalavras) {
			System.out.println(palavra);
		}
	}
}
