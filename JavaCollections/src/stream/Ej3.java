package stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ej3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File Original = new File("ej3.txt");
		File Destino = new File("ej3_2.txt");
		try {
			copiar(Original, Destino);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static void copiar(File Original, File Destino) throws IOException {
		FileInputStream in = null;
		FileOutputStream out = null;
		try {
			in = new FileInputStream(Original);
			out = new FileOutputStream(Destino);
			int x;
			while ( (x=in.read())>-1){
				out.write(x);
			}
		
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			in.close();
			out.close();
		}
		
	}

}
