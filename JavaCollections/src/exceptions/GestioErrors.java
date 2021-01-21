package exceptions;

public class GestioErrors {
	
	public static void met01() {
		int v[] = {1,2,3};
		int elem;
		
		try {
			elem = v[5];
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Codi del catch");
		}
		
		finally {
			System.out.println("Final del programa");
		}
	}
	
	public static void met02() {
		String cadena = "hola";
		try {
			System.out.println(cadena.charAt(5));
		}
		
		catch(Exception e) {
			System.out.println("Codi del catch");
		}
		
		finally {
			System.out.println("Final del programa");
		}
	}
	
	public static void met03() {
		
	}
	
	public static void funcio3() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//met01();
		//met02();
	}

}
