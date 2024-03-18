package reto6;

public class InformacionGeneral {
	
	/**
	 * Metodo que muestra en pantalla informacion general sobre el San Vicente Y Las Granadinas.
	 * Usamos un for para imprimir todo lo del switch.
	 * Igual era mejor usar otra estrcutura pero el programador decidio usar esta estrucutura.
	 */
	
	public static void infoGeneral () { 

		// For para recorrere todos los casos del switch
		
		System.out.println("INFORMACION SOBRE SAN VICENTE:");
		for(int i=0;i<6;i++) {


			switch (i){

			case 0:{

				//Historia de San Vicente y Las Granadinas
				
				System.out.println("HISTORIA SOBRE SAN VICENTE Y LAS GRANADINAS");
				System.out.println();
				System.out.println("Sus primeros habitantes fueron los indios arauacos, procedentes de América del Sur, posteriormente desplazados por los caribes. \n"
						+ "Contra ellos debió enfrentarse Colón cuando llegó a las islas en 1498.\n "
						+ "Probablemente San Vicente fue avistada y bautizada por Cristóbal Colón en 1498.\n "
						+ "Estaba habitada por los fieros caribes y sólo en 1762 fue colonizada con éxito, cuando los británicos fundaron un asentamiento; \n "
						+ "los caribes fueron sojuzgados y muchos deportados tras un levantamiento que tuvo lugar en 1795.\n");
				System.out.println();
				break;

			}

			case 1:{

				//Gobierno de San Vicente Y Las Granadinas
				
				System.out.println("GOBIERNO DE SAN VICENTE Y LAS GRANADINAS");
				System.out.println();
				System.out.println("Charles Antrobus, gobernador general designado por el Reino Unido en 1996. \n "
						+ "James Mitchell, primer ministro y jefe del gobierno. El Parlamento consta de 13 miembros.\n"
						+ "Hay también un Senado de 6 miembros. El Nuevo Partido Democrático (NDP).\n"
						+ "El Partido Laborista de San Vicente (SVLP).\n"
						+ "El Movimiento de Unidad Nacional (MNU), socialdemócrata y el Movimiento del Pueblo Unido (UPM) conforman una alianza de izquierda.\n"
						+ "El gobernador general representa la soberanía británica pero el poder real lo ejerce un primer ministro, responsable ante la Cámara de la Asamblea, \n"
						+ "formada por 21 miembros, 15 son elegidos popularmente y 6 los nombra el gobernador general con la recomendación del primer ministro y el dirigente de la oposición.\n");
				System.out.println();
				break;

			}

			case 2:{

				//Geografia de San Vicente y Las Granadinas
				
				System.out.println(" GEOGRAFIA DE SAN VICENTE Y LAS GRANADINAS");
				System.out.println();
				System.out.println("Está formada por la Isla de San Vicente y las Granadinas con ocho islas y ocho pequeñas islitas cada una con su interés particular.\n"
						+ "En general las islas ofertan sus atributos y diversidad de opciones para el turismo que la visita,sus hoteles y variados restaurantes dan fe de lo peculiar de la isla. \n "
						+ "La isla de San Vicente, es la mayor en importancia, la capital es Kingstown. \n "
						+ "Se trata de una ciudad muy alegre y divertida. En las Granadinas encontrará un rosario de islas.\n "
						+ "En algunas de ellas podrá alquilar caballos y recorrer la isla al galope. \n"
						+ "Un recorrido por las islas de los alrededores completará la estancia en estos parajes tropicales.\n "
						+ "Entre ella tenemos Mustique, Bequia, Palm Beach, Coouan, Bay y Petit San Vicent, Caliquia, entre otras.\n"
						+ "Mustique, es una isla privada en la que suele verse a los miembros de la realeza británica.\n"
						+ "El único hotel es el Cotton House, con una playa llamada Playa Macaroni, bellísima por el contraste del azul del mar y el verde de la espesa vegetación de los alrededores.\n");
				System.out.println();
				break;

			}
			case 3:{

				//Territorio de San Vicente y Las Granadinas
				
				System.out.println(" TERRITORIO DE SAN VICENTE Y LAS GRANADINAS");
				System.out.println();
				System.out.println("El territorio está distribuido en la isla de San Vicente (345 km2) y la porción septentrional de las islas Granadinas (43 km2), entre las que destacan Bequia, Baliceau, Canouan, Mustique, Mayreau, Quatre, Savan y Unión.\n "
						+ "Tiene un relieve ondulado y suelos fértiles. Además de la isla principal, el país comprende la parte norte de la cadena de las Granadinas, que se extiende entre San Vicente y Granada. \n"
						+ "Las principales islas de este grupo son Bequia, Mustique, Canouan, Mayreau y Unión. Las islas que componen San Vicente y las Granadinas son de origen volcánico y presentan boscosas montañas. \n"
						+ "San Vicente comparte muchas características geo-físicas con las islas Granadinas, en particular sus playas de arenas blancas y sus arecifes de coral. \n"
						+ "Tiene un clima tropical con una temperatura cuyo promedio anual es de unos 24ºC. Las precipitaciones anuales oscilan entre los 1.500 mm en la costa hasta los 3.800 mm en las montañas del interior.\n "
						+ "La isla de San Vicente está atravesada de norte a sur por una cadena montañosa cubierta de vegetación que se eleva hasta un máximo en el volcán de la Soufrière (1.234 m), un volcán activo situado en la parte norte de la isla que entró en violenta erupción en 1821, 1902 y 1979.\n");
				System.out.println();
				break;

			}
			case 4:{

				//Flora de San Vicente y Las Granadinas
				
				System.out.println("FLORA");
				System.out.println();
				System.out.println("Las islas están dotadas de una flora tropical espectacular.\n "
						+ "El árbol más original y típico es el Mangostino.\n "
						+ "En los jardines botánicos se pueden admirar la \"spachea perforata\", un árbol autóctono de San Vicente.\n "
						+ "El Sucker, es la tercera generación del llamado \"árbol del pan\" traído en el 1793 desde Tahití.\n");
				System.out.println();
				break;

			}

			case 5:{

				//Fauna de San Vicente y Las Granadinas
				
				System.out.println("FAUNA");
				System.out.println();
				System.out.println("La fauna tiene a los papagayos, también llamados Amazona guildinguii, como la especie característica de las islas pero hay que vigilarlos ya que están en peligro de extinción.\n"
						+ " Este animal es el símbolo nacional. Existen otras especies protegidas como el loro de San Vicente, la boa Bimini, la curruca silbadora, la golondrina de las Bahamas y la oropéndola.\n"
						+ "La Fauna marina ofrece una variedad de pesca poco común: barracuda, sábalo, martín pescador, merlín, atún, bonito y pez vela.\n"
						+ " Las especies protegidas son la foca monje del Caribe, la langosta espinosa manchada y la concha reina.\n");
				System.out.println();
				break;

			}

			}
		}

	}

}
