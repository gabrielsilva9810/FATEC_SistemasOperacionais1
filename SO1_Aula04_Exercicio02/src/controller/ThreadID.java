package controller;

public class ThreadID extends Thread {
	// ----------------------- ENUNCIADO ------------------
	// Fazer uma aplicação que rode 5 Threads que cada uma delas imprima no console o seu número.

	// DECLARANDO VARIAVEL PRIVADA
	private int idThread;
	private long numId;

	// CONSTRUTOR
	public ThreadID(int idThread) {
		this.idThread = idThread;
	}

	@Override
	
	public void run() {
		System.out.println("#ID: " + idThread);
		id(numId);
	}
	
	private void id(long numId) {				
		numId = getId();
		System.out.println("#NUMERO DO ID: " + numId);
		System.out.println("============================");
	
}
}
