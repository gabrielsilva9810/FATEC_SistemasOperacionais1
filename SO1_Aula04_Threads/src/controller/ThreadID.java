package controller;

//EXTENDS THREAD -> PARA SER CONSIDERADA UMA THREAD
//PARAMETROS PASSADOS POR CONSTRUTOR
//METODO RUN, SÓ SERÁ EXECUTADO DENTRO DO MÉTODO RUN

	public class ThreadID extends Thread {
		
		//DECLARANDO VARIAVEL PRIVADA
		private int idThread;
		
		//CONSTRUTOR
		public ThreadID(int idThread) {
			this.idThread = idThread;
		}
		
		@Override									//É uma de garantir que você está sobrescrevendo um método e não criando um novo
		public void run() {
			//SÓ EXECUTA O QUE ESTÁ AQUI DENTRO;
			System.out.println("#ID: " + idThread);			
		}
}
