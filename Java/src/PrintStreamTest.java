import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

/*A partir do Java 5, temos a classe java.util.Scanner, que facilita bastante o trabalho de ler de um InputStream. 
 * Além disso, a classe PrintStream possui um construtor que já recebe o nome de um arquivo como argumento.*/
public class PrintStreamTest {
	public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        PrintStream  ps = new PrintStream("arquivo.txt");
        while (s.hasNextLine()) {
            ps.println(s.nextLine());
        }
	}
}
