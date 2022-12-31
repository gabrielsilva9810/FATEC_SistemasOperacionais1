package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import json.DadosBrutos;

public class OperacoesController {

	public OperacoesController() {
		super();
	}

	// ------------ LENDO DIRETORIO ----------------------------------------------------------///
	public void lerDiretorio(String caminho, String arquivo, String digitado) throws Exception {
		File arq = new File(caminho, arquivo);

		if (arq.exists() && arq.isFile()) {
			FileInputStream fluxo = new FileInputStream(arq);
			InputStreamReader leFluxo = new InputStreamReader(fluxo);
			BufferedReader buffer = new BufferedReader(leFluxo);
			String linha = buffer.readLine();

			while (linha != null) {
				
				// ---------------NAME-----------------------------------------------------///
				if (linha.contains("name")) {

					DadosBrutos db = new DadosBrutos();
					String[] vetWord = linha.split(": ");
					db.name = vetWord[1].substring(1, vetWord[1].length() - 2);
					linha = buffer.readLine();

					// ---------------UNIDADE----------------------------------------------///
					if (linha.contains("unit")) {
						vetWord = linha.split(": ");
						db.unit = vetWord[1].substring(1, vetWord[1].length() - 2);
						linha = buffer.readLine();


						// -----------------VALUE-----------------------------------------///
						if (linha.contains("value")) {
							vetWord = linha.split(": ");
							String convertDouble = vetWord[1].substring(0, vetWord[1].length() - 1);
							db.value = Double.parseDouble(convertDouble);
							linha = buffer.readLine();

							// -----------------TYPE--------------------------------------///
							if (linha.contains("type")) {
								vetWord = linha.split(": ");
								db.type = vetWord[1].substring(1);

								//TESTE PARA EXIBIR TODOS
								//System.out.println(db);
							}
						}
					}

					//PEGA VALOR DIGITADO E PROCURAR NO CÓDIGO
					if(db.unit.equals(digitado)) {
						System.out.println(db);
					}
				}
				
				linha = buffer.readLine();

			}

			buffer.close();
			leFluxo.close();
			fluxo.close();
		}
	}
}
