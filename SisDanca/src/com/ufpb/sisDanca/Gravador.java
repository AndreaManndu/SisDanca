package com.ufpb.sisDanca;
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
	
	public void gravar2(List object,String nomeDoArquivo) throws IOException {
		//objeto que salva o objeto em arquivo
        ObjectOutputStream out = null;
        try {
        	//cria a insancia do objeto em um novo arquivo
            out = new ObjectOutputStream(new FileOutputStream(nomeDoArquivo));
            //escreve o objeto no arquivo
            out.writeObject(object);
        } catch (FileNotFoundException e) {
        	//se tiver erro
            throw new IOException("O arquivo não foi encontrado " + nomeDoArquivo);
        } catch (IOException e) {
        	//se tiver erro
            throw e;
        } finally {
        	//finalizar o arquivo
            if (out != null) {
                out.close();
            }
        }
    }
    
    public List ler(String nomeDoArquivo) throws IOException{
        ObjectInputStream in = null; //objeo que le os objeos em arquivo
        try{
        	//le um objeo em um arquivo
            in = new ObjectInputStream(new FileInputStream(nomeDoArquivo));
            //retorna a lisa de objeos do arquivo
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
