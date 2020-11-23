package com.daw.nomcognom.krona;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ComprovacioRendiment {
	int [] coordenadesTmp = null;
	List<Waypoint_Dades> llistaArrayList;
	List<Waypoint_Dades> llistaLinkedList;
	
	public ComprovacioRendiment() {
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
	
	this.coordenadesTmp = new int[] {0,0,0};
	this.llistaArrayList = new ArrayList<Waypoint_Dades>();
	this.llistaLinkedList = new LinkedList<Waypoint_Dades>();
	
	}
}