package br.com.fiap.tds.view;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Exemplo03 {
	
	public static void main(String[] args) {
		
		//Instanciar um objeto que representa o arquivo exemplo.txt
		File arquivo = new File("exemplo.txt");
		
		//Validar se o arquivo existe
		if (arquivo.isFile() && arquivo.exists()) {
			
			//Exibir o path do arquivo
			System.out.println(arquivo.getAbsolutePath());
			
			//Exibir o tamanho do arquivo
			System.out.println(arquivo.length());

			//Apagar o arquivo
			arquivo.delete();
		} else {
			try {
				//Se o arquivo n�o existir, criar o arquivo
				arquivo.createNewFile();
				
				PrintWriter outPrintWriter = new PrintWriter(arquivo);
				outPrintWriter.println("Teste");
				outPrintWriter.close();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
	}//main
}//class
