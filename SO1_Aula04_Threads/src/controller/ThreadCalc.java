package controller;

public class ThreadCalc extends Thread {

	//DECLARANDO VARIAVEL PRIVADA
	private int a, b, op;
	
	//CONSTRUTOR - RECEBENDO PARAMÊTROS ACIMA
	public ThreadCalc(int a, int b, int op) {
		this.a = a;									
		this.b = b;
		this.op = op;
	}
	
	//ATALHO: DIGITAR RUN E DAR CONTROL + ESPAÇO
	
	@Override					//RUN VAI CHAMAR A OPERAÇÃO CALC
	public void run() {
		calc();
	}

	//A CLASSE PRINCIPAL CHAMA A THREAD
	//A THREAD, CHAMA CALC						---> DESSA FORMA A PRINCIPAL NÃO ENXERGA
	private void calc() {
		
		//SLEEP DA THREAD -> FICAR BLOQUEADA POR 1000 MILISEGUNDOS
		int tempo = 1000;
		
		try {
			sleep(op * tempo);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//INICIO OPERACOES
		int res = 0;
		String operacao = "";
		
		switch (op) {
		
		case 0: {
			res = a + b;
			operacao = "+";
			break;
		}
		
		case 1: {
			res = a - b;
			operacao = "-";
			break;
		}
		
		case 2: {
			res = a * b;
			operacao = "*";
			break;
		}
		
		case 3: {
			res = a / b;
			operacao = "/";
			break;
		}
		
	}
		//EXIBIR RESULTADOS DAS OPERACOES
		System.out.println("==================================");
		System.out.println("TID #" + getId() + " ==> " + a + " " + operacao + " " + b + " = " + res);
		
	}
}
