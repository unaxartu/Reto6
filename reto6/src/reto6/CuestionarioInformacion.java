package reto6;
import java.util.*;

public class CuestionarioInformacion {

	/**
	 * Usando un array bidimensional que hemos recibido por un parametro, haremos un metodo que imprima en pantalla una serie de preguntas donde guardaremos
	 * la respuesta para despues mostrar la informacion requerida por el usuario.
	 * @param c - c es un array bidimensional el cual usaremos para recibir el array con el cuestionario.
	 */
	public static char[] cuestionarioInformacion(String [][] c) {

		Scanner sc = new Scanner(System.in);
		int columnas;
		char a;


		columnas = c.length;//Usamos el indice porque el array bidimensional todas las columnas son del mismo tamaño y lo mismo con las filas.

		char [] res = new char[columnas];


		System.out.println("A CONTINUACIÓN TE HARE UNA SERIE DE PREGUNTAS PARA SABER LO QUE QUIERES SABER/VISITAR DE SAN VICENTE Y LAS GRANADIBAS");

		for(int i = 0; i < c.length;i++) {
			System.out.println("\n" + (i+1) + ".PREGUNTA");
			System.out.println();
			System.out.println("\n----------------------------------------------------------------------------------\n");
			System.out.println("\n" + c[i][0] + "\n");
			for (int j = 1; j <c[i].length ;j++) {
				System.out.println(c[i][j]);
			}
			System.out.println("\n----------------------------------------------------------------------------------\n");
			System.out.println("ELIGE UNA DE LAS DOS OPCIONES 'S' para si o 'N' para no:\n");

			do {
				a = sc.next().toLowerCase().charAt(0);

				if (a != 's' && a != 'n') {
					System.err.println("ERROR! Introduce s o n");
				}

			}while(a != 's' && a != 'n');

			res[i] = a;
		}
		return res;
	}
	
	/**
	 * Metodo en el cual recibiendo dos arrays unidimensionales mostramos en pantalla una serie de cosas
	 * @param r - array unidimensional en le cual recibimos las respuestas del metodo cuestionarioInformacion
	 * @param resp - array unidimensional en el cual recibimos las respuestas ha mostrar en pantalla
	 */
	
	public static void mostrarResultadosPantalla(char [] r, String [] resp) {
		
		System.out.println("\n----------------------------------------------------------------------------------------------------------\n");
		System.out.println("El resultado del anterior cuestionario de preguntas");
		System.out.println("\n----------------------------------------------------------------------------------------------------------\n");
		

		for(int i = 0; i < r.length; i++) {
			if (r[i] == 's') {
				System.out.println("\n----------------------------------------------------------------------------------------------------------\n");
				System.out.println(resp[i]);
				System.out.println("\n----------------------------------------------------------------------------------------------------------\n");
			}
		}
	}
	
}
