import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;



public class Gravador {
	public void gravar (String texto, String nomeDoArquivo) throws IOException{
		FileWriter cria = new FileWriter(nomeDoArquivo+".txt");
		BufferedWriter escreve = new BufferedWriter (cria);
		escreve.write(texto);
		escreve.close();// o close estava invertido
		cria.close();
		
		
	}

}
