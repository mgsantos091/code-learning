import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/*No Java 7 há a estrutura ::try-with-resources::, que já fará o finally cuidar dos recursos declarados dentro do try(), invocando close.*/
public class TryWithResources {
	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("C:\\Users\\mgsantos\\Documents\\pessoal\\investimento\\estudo\\mestrado-computação\\unifesp\\g_t\\aula_1.txt"); // Responsável por ler o byte
		InputStreamReader isr = new InputStreamReader(is,"UTF-8"); // Recupera os caracteres através dos bytes lidos
		try (BufferedReader br = new BufferedReader(isr)) { // Transforma os caracteres em Strings
			String texto = new String();
			while((texto = br.readLine()) != null) {
				System.out.println(texto);
			}		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
