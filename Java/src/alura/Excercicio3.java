package alura;
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.OutputStream;
//import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.util.Scanner;

public class Excercicio3 {
	public static void main(String args[]) throws IOException {
//		OutputStream os = new FileOutputStream("saida.txt");
//		OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
//		BufferedWriter bw = new BufferedWriter(osw);
//		
//		InputStream is = System.in;
//		InputStreamReader isr = new InputStreamReader(is);
//		BufferedReader br = new BufferedReader(isr);
//		
//		System.out.print("Digite algo:");
//		String text = br.readLine();
//		
//		while(!text.equals("")) {
//			bw.write(text);
//			bw.newLine();
//			
//			text = br.readLine();
//		}
//		
//		br.close();
//		bw.close();
		
//	     Scanner entrada = new Scanner(new FileInputStream("src/arquivo.txt"));
		Scanner entrada = new Scanner(System.in);
         PrintStream saida = new PrintStream(new FileOutputStream("copia.txt"));
         while (entrada.hasNextLine()) {
             saida.println(entrada.nextLine());
         }
         saida.close();
         entrada.close();
		
	}
}
