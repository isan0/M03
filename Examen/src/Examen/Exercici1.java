package Examen;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Exercici1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pathDirArrel = "fitxers_examen/";
		String pathDirExercici1 = "exercici1/";
		//String pathDirPatata = "patata/";
		String pathDirACopiar = "dirACopiar";
		
		File directoriArrel = new File(pathDirArrel);
		File directoriPatata = new File("patata");
		File directoriACopiar = new File(pathDirArrel + pathDirACopiar);
		//File fitxerIndex = new File(pathDirArrel + pathDirExercici1 +pathDirPatata + "/index.txt");
		
		directoriPatata.mkdir();
		
		FileWriter fw = null;
		PrintWriter pw = null;
		StringBuilder permisosFile = new StringBuilder("---, ");
		File fitxerIndex2;
		
		
		
		String[] llistafitxers = directoriArrel.list();
		for (int i = 0; i < llistafitxers.length; i++) {
			System.out.println("fitxer " + llistafitxers[i]);
		}
		
	}

}
