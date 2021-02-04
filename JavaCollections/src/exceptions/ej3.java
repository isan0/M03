package exceptions;

public class ej3 extends Exception{
	/*Fes un mètode anomenat divisió. Aquest mètode crearà un objecte Excepció en cas 
	 * de que els divisor sigui igual a 0. Crida el mètode divisió des del main i encapsula 
	 * el codi en un bloc try-catch. 
	 */
	private int num;
	excepcion3(int n)
	{
		this.num = n;
	}
	public String toString()
	{
		return "Excepcion 3: " + this.num;
	}
}
