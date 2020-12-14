package com.daw.nomcognom.krona;

import java.io.IOException;
import java.util.Scanner;

public class Krona {
	 public static void bloquejarPantalla() {
	        Scanner in = new Scanner(System.in);
	        System.out.print("\nToca 'C' per a continuar ");
	        while (in.hasNext()) {
	            if ("C".equalsIgnoreCase(in.next())) break;
	        }
	    }
	 public static void menuKrona() throws IOException  {
	        String opcio;
	        Scanner sc = new Scanner(System.in);
	        StringBuilder menu = new StringBuilder("");
	        
	        ComprovacioRendiment comprovacioRendimentTmp = null;
	        
	        do {
	            menu.delete(0, menu.length());
	            
	            menu.append(System.getProperty("line.separator"));
	            menu.append("RV-18A Krona ");
	            menu.append(System.getProperty("line.separator"));
	            menu.append(System.getProperty("line.separator")); 
	            
	            menu.append("1. Inicialitzar el procés de comprovació d'un ArrayList i un LinkedList de waypoints");
	            menu.append(System.getProperty("line.separator"));
	            menu.append("2. Comprovar rendiment d'inicialització d'un ArrayList i un LinkedList de waypoints");
	            menu.append(System.getProperty("line.separator"));
	            menu.append("3. Comprovar rendiment d'inserció en un ArrayList i en un LinkedList de waypoints");
	            menu.append(System.getProperty("line.separator"));
	            menu.append("4. Modificació dels waypoints de l'ArrayList i del LinkedList ");
	            menu.append(System.getProperty("line.separator"));
	            menu.append("5. Esborrar waypoints de l'ArrayList i del LinkedList.");
	            menu.append(System.getProperty("line.separator"));
	            menu.append(System.getProperty("line.separator"));
	            
	            menu.append("6. Modificar coordenades i nom dels waypoints de l'ArrayList amb ID parell.");
	            menu.append(System.getProperty("line.separator"));
	            menu.append("7. Visualitzar els waypoints de l'ArrayList ordenats.");
	            menu.append(System.getProperty("line.separator"));
	            menu.append("8. LListar els waypoints de l'ArrayList que es trobin a certa distància de la Terra.");
	            menu.append(System.getProperty("line.separator"));
	            menu.append(System.getProperty("line.separator"));
	            
	            menu.append("10. Carregar en la BD les rutes");
	            menu.append(System.getProperty("line.separator"));
	            menu.append("11. Carregar en la BD les rutes carregades en memòria");
	            menu.append(System.getProperty("line.separator"));
	            menu.append("12. LListar les rutes (només amb els ID dels waypoints)");
	            menu.append(System.getProperty("line.separator"));
	            menu.append("13. LListar les rutes(amb tota la informació dels waypoints)");
	            menu.append(System.getProperty("line.separator"));
	            menu.append("14. LListar els waypoints d'una ruta");
	            menu.append(System.getProperty("line.separator"));
	            menu.append("15. Crear una ruta");
	            menu.append(System.getProperty("line.separator"));
	            menu.append("16. Modificar una ruta");
	            menu.append(System.getProperty("line.separator"));
	            menu.append("17. LListar les rutes que tinguin un waypoint concret");
	            menu.append(System.getProperty("line.separator"));
	            menu.append("18. Donar de baixa una ruta");
	            menu.append(System.getProperty("line.separator"));
	            menu.append("19. Esborrar de la BD una ruta");
	            menu.append(System.getProperty("line.separator"));
	            menu.append(System.getProperty("line.separator"));
	            
	            menu.append("20. Fer una copia de seguretat de la BD");
	            menu.append(System.getProperty("line.separator"));
	            menu.append("21. Esborrar tota la BD");
	            menu.append(System.getProperty("line.separator"));
	            menu.append(System.getProperty("line.separator"));
	            
	            menu.append("50. Tornar al menú pare (PNS-24 Puma)");
	            menu.append(System.getProperty("line.separator"));
	            
	            
	            System.out.print(MenuConstructorPantalla.constructorPantalla(menu));
	            
	            opcio = sc.next();
	            
	            
	            switch (opcio) {
	                case "1":
	                	comprovacioRendimentTmp = Waypoint.inicialitzarComprovacioRendiment();
	                    bloquejarPantalla();
	                    break;
	                case "2":
	                	comprovacioRendimentTmp = Waypoint.comprovarRendimentInicialitzacio(10, comprovacioRendimentTmp);
	                    bloquejarPantalla();
	                    break;
	                case "3":
	                	comprovacioRendimentTmp = Waypoint.comprovarRendimentInsercio(comprovacioRendimentTmp);
	                    bloquejarPantalla();
	                    break;
	                case "4":
	                	comprovacioRendimentTmp = Waypoint.modificarWaypoints(comprovacioRendimentTmp);
	                    bloquejarPantalla();
	                    break;
	                case "5":
	                	comprovacioRendimentTmp = Waypoint.esborrarWaypoints(comprovacioRendimentTmp);
	                    bloquejarPantalla();
	                    break;
	                case "6":
	                	comprovacioRendimentTmp = Waypoint.modificarCoordenadesINomDeWaypoints(comprovacioRendimentTmp);
	                    bloquejarPantalla();
	                    break;
	                case "7":
	                	Waypoint.visualitzarWaypointsOrdenats(comprovacioRendimentTmp);
	                    bloquejarPantalla();
	                    break;
	                case "8":
	                    Waypoint.waypointsACertaDistanciaMaxDeLaTerra(comprovacioRendimentTmp);
	                    bloquejarPantalla();
	                    break;    
	                case "12":
	                    
	                    bloquejarPantalla();
	                    break;
	                case "13":
	                    
	                    bloquejarPantalla();
	                    break;
	                case "15":
	                    
	                    bloquejarPantalla();
	                    break;
	                case "19":
	                    
	                    bloquejarPantalla();
	                    break;                    
	                case "50":
	                    break; 
	                default:
	                    System.out.println("COMANDA NO RECONEGUDA");
	            }   
	        } while (!opcio.equals("50"));
	    }
}
