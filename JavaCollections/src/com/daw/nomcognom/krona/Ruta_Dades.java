package com.daw.nomcognom.krona;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Ruta_Dades {
	private int id;
	private String nom;
	private ArrayList<Integer> waypoints;
	
	private boolean actiu;
	private LocalDateTime dataCreacio;
	private LocalDateTime dataAnulacio;
	private LocalDateTime dataModificacio;
}
