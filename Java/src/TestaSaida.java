import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

class TestaSaida {
	public static void main(String[] args) throws IOException {
		File f = new File("saida.txt");
//		if (!f.exists())
//			f.createNewFile();
//		else
//			f.delete();
		
		System.out.println("imprindo dados no arquivo " + f.getAbsolutePath());
		
		OutputStream os = new FileOutputStream(f);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		BufferedWriter bw = new BufferedWriter(osw);

		bw.write("caelum");

		bw.close();
	}
}