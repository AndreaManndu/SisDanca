import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;



public class Gravador {
	public void gravar (String texto, String nomeDoArquivo) throws IOException{
		FileWriter cria = new FileWriter(nomeDoArquivo+".txt");
		BufferedWriter escreve = new BufferedWriter (cria);
		escreve.write(texto);
		escreve.close();// o close estava invertido
		cria.close();
		
		
	}
	public void gravar2(List object,String nomeDoArquivo) throws IOException {
        ObjectOutputStream out = null;
        try {
            out = new ObjectOutputStream(new FileOutputStream(nomeDoArquivo));
            out.writeObject(object);
        } catch (FileNotFoundException e) {
            throw new IOException("O arquivo não foi encontrado " + nomeDoArquivo);
        } catch (IOException e) {
            throw e;
        } finally {
            if (out != null) {
                out.close();
            }
        }
    }
    
    public List ler(String nomeDoArquivo) throws IOException{
        ObjectInputStream in = null;
        try{
            in = new ObjectInputStream(new FileInputStream(nomeDoArquivo));
            return (List) in.readObject();
        }catch(FileNotFoundException e){
            throw new IOException("O arquivo não foi encontrado " + nomeDoArquivo);
        }catch(IOException e){
            throw e;
        }catch(ClassNotFoundException e){
            throw new IOException("Classe dos objetos gravados no arquivo "+ nomeDoArquivo+" não existe");
        }finally{
            if (in!=null){
                in.close();
            }
        }
    }
}
