package edu.curso;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTeste {

	public static void main(String[] args) {
		File f = new File("C:/temp/teste.txt");
		
		try {
			FileWriter fr = new FileWriter( f );
			fr.write("Linha 1\n");
			fr.write("Linha 2\n");
			fr.write("Linha 3\n");
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
