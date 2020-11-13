package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class JavaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("Gat");
		l1.add("Jaguar");
		
		System.out.println(l1.get(0));
		System.out.println(l1.get(1));
		//System.out.println(l1.get(2));
		
		l1.set(1, "guepard");
		System.out.println(l1.get(1));
		
		l1.add("pantera");
		l1.add("lynx");
		System.out.println(l1.get(2));
		System.out.println(l1.get(3));
		
		if(l1.contains("lynx")) {
			System.out.println("Lyns es present");
		}else {
			System.out.println("Lynz no es troba");
		}
		l1.add("feli 2");
		
		for(int i=0;i<l1.size();i++) {
			System.out.println(l1.get(i));
		}
		
		for(String animal : l1) {
			System.out.println(animal);
		}
		Iterator i=l1.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		String s[] = new String[l1.size()];
		s=l1.toArray(s);
		
		for(int a=0;a<l1.size();a++) {
			System.out.println(a);
		}
		
		//Car c1 = new Car(2000, "3Series");
	}

}
