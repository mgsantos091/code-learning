package alura;

//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class Excercicio2 {
	public static void main(String args[]) throws FileNotFoundException {
		// InputStream is = new FileInputStream("src/arquivo.txt");
		InputStream is = System.in;
		Scanner sc = new Scanner(is);

		while (sc.hasNextLine()) {
			String x = sc.nextLine();
			System.out.println(x);
			if (x.equals(""))
				break;
		}

		sc.close();
	}
}
