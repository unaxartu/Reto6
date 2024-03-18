package reto6;
import java.util.*;

/**
 * Creacion de la clase Sugereencias en el cual hay un metodo
 */

public class Sugerencias {

	/**
	 * Metodo el cual le hace una seria de preguntas al usuario para despues guardar las respuestas y devolverlas.
	 * @param suge - parametro que recibe el usuario que es un array unidimensional con las preguntas.
	 * @return arrat unidimensional con las respuestas de las preguntas.
	 */
	public static String [] sugerencias(String [] suge) {
		
		Scanner sc = new Scanner(System.in);
		String resp;
		String  [] rSuge = new String [suge.length];
		
		System.out.println("---------------------------------------------------------------------------------------------");
		
		for (int i = 0;i < suge.length; i ++) {
			
			System.out.println();
			System.out.println(suge[i]);
			
			//Mejorar
			do {
				
				System.out.println("---------------------------------------------------------------------------------------------");
				System.out.println();
				System.out.println("Introduce tu respuesta -->");
				resp = sc.nextLine();
				System.out.println("---------------------------------------------------------------------------------------------");
				
			}while(resp.equalsIgnoreCase(null));
			
			rSuge[i] = resp;
		}
		
		System.err.println("\n Muchas gracias por valorar y sugerirnos mejoras para nuestro programa");
		return rSuge;
		
	}
}
