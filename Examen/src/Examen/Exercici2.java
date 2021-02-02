package Examen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.InputStream;
import java.io.OutputStream;

public class Exercici2 {
	//Contador de lineas
	static int cont1 = 0;
	static int cont2 = 0;
	
	//Contador de caracter
	static int llegits1 = 0;
	static int llegit2 = 0;
	
	//Lecturas de fichero
	static String arxiulectura1 = "2_1.txt";
	static String arxiulectura2 = "2_2.txt";
	
	//Lectura por caracteres
	static Reader fReader = null;
	static Reader fReader2 = null;
	
	//Lectura por lineas
	static BufferedReader bufferR = null;
	static BufferedReader bufferR2 = null;
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		try {
			fReader = new FileReader(arxiulectura1);
			fReader2 = new FileReader(arxiulectura2);
			
			bufferR = new BufferedReader(new FileReader(arxiulectura1));
			bufferR2 = new BufferedReader(new FileReader(arxiulectura2));
			
			
			llegirlinies(bufferR);
			llegirlinies2(bufferR2);
			
			llegirperblocorientatcaracter(fReader);
			llegirperblocorientatcaracter2(fReader2);
			
		} catch(IOException e){
			e.printStackTrace();
		}finally {
			if(fReader != null) {
				fReader.close();
			}if(fReader2 != null) {
				fReader2.close();
			}if(bufferR != null) {
				bufferR.close();
			}if(bufferR2 != null) {
				bufferR2.close();
			}
		}
		
	}
	
	private static void llegirlinies(BufferedReader inputStream) {
		System.out.println("El nombre del fichero es: " + arxiulectura1);
		String l;
		try {
			while ((l = inputStream.readLine()) != null) {
				cont1 += 1;
				System.out.println(l);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("El total de lineas del fichero son " + cont1);
	}
	
	private static void llegirlinies2(BufferedReader inputStream) {
		System.out.println();
		System.out.println("El nombre del fichero es: " + arxiulectura2);
		String m;
		try {
			while ((m = inputStream.readLine()) != null) {
				cont2 += 1;
				System.out.println(m);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("El total de lineas del fichero son " + cont2);
	}
	
	private static void llegirperblocorientatcaracter(Reader fInput) {
		try {
			char[] dades = new char[100];
			int llegits = 0;
			while (-1 < (llegits = fInput.read(dades)))
				llegits += 1;
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("El numero de los caracteres son: " + llegits);
	}
	
	private static void llegirperblocorientatcaracter2(Reader fInput) {
		try {
			char[] dades = new char[100];
			int llegits = 0;
			while (-1 < (llegits = fInput.read(dades)))
				llegits += 1;
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
