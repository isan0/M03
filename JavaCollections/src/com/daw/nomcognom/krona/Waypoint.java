package com.daw.nomcognom.krona;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Waypoint {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
	
	// 1
	public static ComprovacioRendiment inicialitzarComprovacioRendiment() {
		ComprovacioRendiment comprovacioRendimentTmp = new ComprovacioRendiment();
		return comprovacioRendimentTmp;
	}
	
	// 2
	public static ComprovacioRendiment comprovarRendimentInicialitzacio(int numObjACrear, ComprovacioRendiment comprovacioRendimentTmp) {
		long tempsInicial;
		long tempsFinal;
		long tempsEnNanosegons;
		long tempsEnMilisegons;
		int meitaLlista;
		
		meitaLlista = numObjAcrear/2;
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
		int[] coordenadesTmp = new int[] {0,0,0};
		
		for(int i=0; i<numObjAcrear; i++) {
			
		}
	}
	
	// 3
	public static ComprovacioRendiment comprovarRendimentInsercio(ComprovacioRendiment comprovacioRendimentTmp) {
		
	}
	
	
	// 4
	public static ComprovacioRendiment modificarWaypoints(ComprovacioRendiment comprovacioRendimentTmp) {
		int ultimaPosicio;
		Waypoint_Dades waypointTmp;
		
		List<Integer> idsPerArrayList = new ArrayList<Integer>();
		
	}
	
	// 5
	public static ComprovacioRendiment esborrarWaypoints(ComprovacioRendiment comprovacioRendimentTmp) {
		waypoint_Dades waypointTmp;
		
		System.out.println();
		System.out.println("---- APARTAT 1 (bucle for ----");
		int idTmp;
		
		if(waypointTmp2.getId() < 6) {
			comprovacioRendimentTmp.llistaArrayList.remove(idTmp);
			System.out.println();
		}
		
		System.out.println();
		System.out.println("---- APARTAT 2 (comprovacio) ----");
		it = comprovacioRendimentTmp.llistaLinkedList.iterator();
		while(it.hasNext()) {
			waypointTmp = int.next();
			System.out.println("El waypoint amb id= " + comprovacioRendimentTmp.llistaLinkedList);
		}
		
		System.out.println();
		System.out.println("---- APARTAT 3 ----");
	}
	
	public static ComprovacioRendiment modificarCoordenadesINomDeWaypoints(ComprovacioRendiment comprovacioRendimentTmp) {};
	
	public static Waypoint inicialitzaDadesWaypoint() {
		return null;
	}
	
	public static Waypoint nouWaypoint() {
		return null;
	}
	
	public static Waypoint waypointsVsTipus() {
		return null;
	}
	
	public static Waypoint numWaypointsVsTipus() {
		return null;
	}
	
	public static Waypoint trobarWaypointvsNom() {
		return null;
	}
	
	public static Waypoint ordenarWaypointsPerData() {
		return null;
	}
}
