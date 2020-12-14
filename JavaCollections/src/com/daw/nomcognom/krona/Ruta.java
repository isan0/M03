package com.daw.nomcognom.krona;

import java.time.LocalDateTime;
import java.util.List;

public class Ruta {
	public static ComprovacioRendiment inicialitzarRuta(ComprovacioRendiment comprovacioRendimentTmp) {};
	
	public static List<Waypoint_Dades> crearRutaInicial(){
		List<Waypoint_Dades> llistaWaypointLinkedList = null;
		
		llistaWaypointLinkedList = new LinkedList<Waypoint_Dades>();
		
		llistaWaypointLinkedList.add(new Waypoint_Dades(0, "Òrbita de la Terra", new int[] {0,0,0}, true, LocalDateTime.parse("21-10-2020 01:10", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
		llistaWaypointLinkedList.add(new Waypoint_Dades(1, "Punt Lagrange Terra-LLuna", new int[] {1,1,1}, true, LocalDateTime.parse("21-10-2020 01:00", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
		llistaWaypointLinkedList.add(new Waypoint_Dades(2, "Òrbita de la LLuna", new int[] {2,2,2}, true, LocalDateTime.parse("21-10-2020 00:50", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
		llistaWaypointLinkedList.add(new Waypoint_Dades(3, "Òrbita de Mart", new int[] {3,3,3}, true, LocalDateTime.parse("21-10-2020 00:40", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
		llistaWaypointLinkedList.add(new Waypoint_Dades(4, "Òrbita de Júpiter", new int[] {4,4,4}, true, LocalDateTime.parse("21-10-2020 00:30", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
		llistaWaypointLinkedList.add(new Waypoint_Dades(5, "Punt Lagrange Júpiter-Europa", new int[] {5,5,5}, true, LocalDateTime.parse("21-10-2020 00:20", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
		llistaWaypointLinkedList.add(new Waypoint_Dades(6, "Òrbita de Europa", new int[] {6,6,6}, true, LocalDateTime.parse("21-10-2020 00:10", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
		llistaWaypointLinkedList.add(new Waypoint_Dades(7, "Òrbita de Venus", new int[] {7,7,7}, true, LocalDateTime.parse("21-10-2020 00:01", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter)));
		
		return llistaWaypointLinkedList;
	};
	
	public static void visualitzarRuta(ComprovacioRendiment comprovacioRendimentTmp) {
		System.out.println("La ruta està formada pels waypoints:");
		
		for (Waypoint_Dades waypointTmp : comprovacioRendimentTmp.pilaWaypoints) {
			System.out.println(waypointTmp.toString());
		}
	};
	
	
	public static void invertirRuta(ComprovacioRendiment comprovacioRendimentTmp) {
		Deque<Waypoint_Dades> pilaWaypointsInversa = new ArrayDeque<Waypoint_Dades>();
		
        while (!comprovacioRendimentTmp.pilaWaypoints.isEmpty()) {
        	pilaWaypointsInversa.push(comprovacioRendimentTmp.pilaWaypoints.pop());
        }
        
        while (!pilaWaypointsInversa.isEmpty()) {
        	System.out.println(pilaWaypointsInversa.pop());
        }
	};
	
	
	public static void existeixWaypointEnRuta(ComprovacioRendiment comprovacioRendimentTmp) {
Waypoint_Dades wtmp;
		
		if (comprovacioRendimentTmp.pilaWaypoints.size() == 0) {
			System.out.println("La ruta està buida.");
		} else {
			if (comprovacioRendimentTmp.pilaWaypoints.contains(comprovacioRendimentTmp.wtmp)) {
				System.out.println("SI hem trobat el waypoint " + comprovacioRendimentTmp.wtmp.getNom() + " emmagatzemat en comprovacioRendimentTmp.wtmp, en la llista.");
			} else {
				System.out.println("NO hem trobat el waypoint " + comprovacioRendimentTmp.wtmp.getNom() + " emmagatzemat en comprovacioRendimentTmp.wtmp, en la llista.");
			}
			
			wtmp = new Waypoint_Dades(4, "Òrbita de Júpiter", new int[] {4,4,4}, true, LocalDateTime.parse("21-10-2020 00:30", Data.formatter), null, LocalDateTime.parse("22-10-2020 23:55", Data.formatter));
			if (comprovacioRendimentTmp.pilaWaypoints.contains(wtmp)) {
				System.out.println("SI hem trobat el waypoint " + wtmp.getNom() + " creat ara mateix, en la llista.");
			} else {
				System.out.println("NO hem trobat el waypoint " + wtmp.getNom() + " creat ara mateix, en la llista.");
			}
		}
	};
	
}
