package view;

import controller.ThreadCalc;
import controller.ThreadID;

public class Principal {

	public static void main(String[] args) {
		
		//EXIBIR 5 THREADS -> CLASSE ThreadID
		for (int idThread = 0 ; idThread < 5; idThread ++) {
			
			Thread threadId = new ThreadID(idThread);			//PUXA DIRETO DA CLASSE THREAD ID		
			threadId.start();									//STARTA A THREAD
		}
		
		//FAZER OPERACOES -> CLASSE ThreadCalc
		
		//DECLARAR VALOR DE A E B
		int a = 10;
		int b = 2;
		
		//OP = 4 POIS SÃO 4 OPERACOES;
		for (int op = 0; op < 4; op++) {
			Thread tCalc = new ThreadCalc(a, b, op);
			tCalc.start();
		}

	}

}
