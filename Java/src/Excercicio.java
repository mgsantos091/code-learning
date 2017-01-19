import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Excercicio {
	public static void main(String args[]) throws IOException {
//		InputStream is = System.in;
		File f = new File("src/arquivo.txt");
		System.out.println(f.getAbsolutePath());

//		InputStream is = new FileInputStream(f);
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(isr);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
		
		String text = new String();
		while((text = br.readLine())!=null) {
			System.out.println(text);
		}
		br.close();
	}
}
