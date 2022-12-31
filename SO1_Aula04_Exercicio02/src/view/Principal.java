package view;

import controller.ThreadID;

public class Principal {

	public static void main(String[] args) {
		
		for(int i = 0; i < 5; i++) {
			
			Thread id = new ThreadID(i);
			id.start();
		}
	}

}
