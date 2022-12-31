package view;

import javax.swing.JOptionPane;

import controller.OperacoesController;

public class Principal {

	public static void main(String[] args) {

		OperacoesController op = new OperacoesController();

		// LER O ARQUIVO
		String caminho = "C:\\TEMP";
		String arquivo = "exchange.json";
		String digitado = JOptionPane.showInputDialog(null, "Digite um UNIT");

		//EXECUTA O CONTROLLER
		try {
			op.lerDiretorio(caminho, arquivo, digitado);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
