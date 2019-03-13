package examen.ejercicio3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StringUtil {

	public static void main(String[] args) {
			
			String cadena="";	
			HashMap<Character, Integer> h = new HashMap<Character, Integer>();
			Scanner leer = new Scanner(System.in);
			System.out.println("Introduce una palabra");
			cadena=leer.nextLine();
			for ( int i = 0; i < cadena.length(); i++ ) {

				if ( h.containsKey ( cadena.charAt ( i ) ) ) {

					h.put ( cadena.charAt ( i ), (int)h.get ( cadena.charAt ( i ) ) + 1 );

				} else {

					h.put ( cadena.charAt ( i ), 1 );
					}
			}	 

			Set<Map.Entry<Character, Integer>> freq = h.entrySet();	 
			Iterator<Map.Entry<Character, Integer>> it = freq.iterator();		

			while ( it.hasNext() ) {
				Map.Entry<Character, Integer> item = it.next();
				System.out.println ( item.getKey() + ": " + item.getValue() );

			}
	}

}
