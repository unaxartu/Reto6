package reto6;
import java.util.*;
public class LuisQuiz {

	/**
	 * Metodo que muestra un quiz y guarda las respuestas en un array.
	 * @param preg - Array de Strings con las preguntas.
	 * @param susresp - Array de String en el cual se guardan las respuestas del usuario.
	 * @param posibresp - Array Bidi de Strng en el cual estan las posibles respuestas que se le muestran al usuario.
	 * @param letras - Array uni de String en el cual estan las letras que aparecen antes de las posibles respuestas.
	 */
	
	//validacion
	public static void quiz (String[]preg, String[]susresp, String [][] posibresp,String[]letras){
		String resp;

		Scanner sc = new Scanner(System.in);

		System.out.println("Este es nuestro quiz");
		
			
			for(int i=0;i<posibresp.length;i++) {
				System.out.print("La pregunta numero " +(i+1)+ " es la siguiente: ");
				System.out.println(preg[i]);
				for(int j=0;j<posibresp[i].length;j++) {
					System.out.println("Posibles respuestas: "+letras[j]+" --> " +posibresp [i][j] );

				}
				// Validacion.
				do {
					resp = sc.nextLine();
					
					if(!(resp.equalsIgnoreCase("a") || resp.equalsIgnoreCase("b") || resp.equalsIgnoreCase("c"))){
						System.err.println("ERROR! INTRODUCE A, B o C !");
					}
					
				}while(!(resp.equalsIgnoreCase("a") || resp.equalsIgnoreCase("b") || resp.equalsIgnoreCase("c")));
			
				susresp[i]=resp;
			}
		}
	
	
	/**
	 * Metodo en el que compara las respuestas del usuario del metodo quiz.
	 * @param susresp - String de Arrays uni en el cual recibe las respuestas del usuario.
	 * @param misresp - String de Arrays uni en el cual estan las respuestas correctas del quiz.
	 */

	public static void compararResp(String []susresp,String []misresp) {

		int conttrue=0, contfalse=0;


		for (int i = 0;i<susresp.length;i++) {
			if(susresp[i].equalsIgnoreCase(misresp[i])==true) {
				conttrue++;
			}else{
				contfalse++;
			}
		}
		System.out.println();
		System.out.println("Respuestas correctas: " +conttrue);
		System.out.println("Respuestas incorrectas: " +contfalse);
		


	}
}




