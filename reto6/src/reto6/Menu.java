package reto6;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
	/**
	 * Creamos y mostramos un menu, donde damos a seleccionar una de las opciones.
	 * 
	 * @param error ->  Validación de numero introducido mediante boolean.
	 * @return -> Devuelvo la  respuesta del usuario para saber a que clase ir.
	 */
	public static int menu(boolean error) {
		Scanner sc=new Scanner(System.in);

		// poner try catch
		if(error)System.out.println("INTRODUCE ÚNICAMENTE UNA VALOR [0,1,2,3,4]");
		System.out.println("---------MENU---------");
		System.out.println("[0] SALIR");
		System.out.println("[1] INFORMACION GENERAL");
		System.out.println("[2] QUIZ");
		System.out.println("[3] CUESTIONARIO INFORMATIVO");
		System.out.println("[4] CUESTIONARIO DE SUGERENCIAS");
		System.out.println("----------------------");
		System.out.println("TU OPCION [0,1,2,3,4]-> ");

		/*try {
			respuesta=sc.nextInt();
			while(respuesta<0||respuesta>4) {
				System.out.println();
				System.out.println("El numero introducido no es valido");
				System.out.println();
				respuesta=menu(true);
				sc.close();
			}
			return respuesta;
		}catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		return respuesta;*/



			if(error)System.out.println("INTRODUCE ÚNICAMENTE UNA VALOR [0,1,2,3,4]");
		System.out.println("---------MENU---------");
		System.out.println("[0] SALIR");
		System.out.println("[1] INFORMACION GENERAL");
		System.out.println("[2] QUIZ");
		System.out.println("[3] CUESTIONARIO INFORMATIVO");
		System.out.println("[4] CUESTIONARIO DE SUGERENCIAS");
		System.out.println("----------------------");
		System.out.println("TU OPCION [0,1,2,3,4]-> ");
		int respuesta=sc.nextInt();
		while(respuesta<0||respuesta>4) {
			System.out.println();
			System.out.println("El numero introducido no es valido");
			System.out.println();
			respuesta=menu(true);
			sc.close();
		}
		return respuesta;
	}

	/**
	 * Empieza el programa y comprueba la respuesta para mandarte.
	 * @param args - es el main del programa
	 */
	public static void main(String[] args) {
		int respuesta=-1;

		String [] sugerencias = {"Que te ha parecido nuestro programa","Te ha gustado nuestro pais, San Vicente y Las Granadinas","Valora el programa(1-10)","Valora el contenido de nuestro programa","Alguna sugerencia"};
		String [] preg  = {"¿En que año llegó Colón a las Islas?: ","¿Cuando se colonizaron las islas?: ","¿De cuantos miembros dota el Parlamento?: ","¿Cuantos movimientos políticos hubieron?:",
				"¿Cuantas islas en total hay en San Vicente y las Granadinas?: ","¿De cuantos hoteles consta la isla?: ","¿De cuantos km al cuadrado consta toda la unión de las islas?: ",
				"¿La temperatura anual de cuantos grados es (normalmente)?: ","¿En que año fue traído el llamado 'árbol del pan'?: ","¿Cuantas especies están protegidas?: "};

		String [] susresp = new String [10];
		String [] misresp = {"b","c","b","a","a","a","b","a","c","a"};
		String [] letras = {"a","b","c"};
		String [][] posibresp = {{"1489","1498","1492"},{"1796","1795","1792"},{"20","13","17"},{"4","2","3"},{"16","8","12"},{"1","2","3"},{"433","388","500"},{"24","30","33"},{"1759","1776","1793"},{"3","8","10"}};
		String [][] preguntasTurismo = {{"bequia","Si","No"},{"Esnorquel y navegacion en los Cayos de Tobago","Si","No"},{"Petit St. Vincent","Si","No"},{"Palm Island","Si","No"},{"Salt Whistle Bay,Mayreau","Si","No"},{"Tour de senderismo al volcan La Soufriere","Si","No"},{"Mustique","Si","No"},{"Kingstown, San VIcente","Si","No"},{"Jardines Botanicos de San Vicente","Si","No"},{"Paseo panoramico de la autopista de sotavento","Si","No"},{"Canouan","Si","No"},{"Union Island","Si","No"}};
		char [] res ;
		String [] turismo = {"\n\nLa segunda más grande de las Granadinas, la encantadora Bequia (que se pronuncia «Beck-way») es un popular destino de yates con una rica historia de caza de ballenas. Exuberantes laderas salpicadas de buganvillas se convierten en playas y bahías llenas de barcos.\r\n"
				+ "\r\n"
				+ "La isla también es conocida por ser segura y amigable. Los lugares populares para visitar en Bequia incluyen Puerto Elizabeth sobre Bahía del Almirantazgo, principal centro comercial de la isla. Una pasarela recorre el paseo marítimo en el lado sur de la ciudad, pasando por restaurantes y pequeñas tiendas pintorescas. Pasa por el Museo Marítimo de Bequia para conocer un poco la historia de la isla.\r\n"
				+ "\r\n"
				+ "En el extremo sur de Port Elizabeth, un sendero conduce por una pequeña subida a la bonita Playa Princess Margaret. Separado de esta playa por un afloramiento rocoso, Bahía Inferior es otro tramo de arena dorada con gran snorkel.\r\n"
				+ "\r\n"
				+ "Otra cosa popular para hacer en Bequia es un Plantación de luciérnagas excursión. Aquí, puede pasear por los exuberantes jardines probando algunas de las frutas tropicales recién recolectadas de los árboles, como guayaba, coco, fruta del pan, plátanos y mangos. También puede triturar caña de azúcar para hacer su propio jugo y ver las ruinas de un ingenio azucarero de 280 años.","\n\nEn el sur de las Granadinas, los Cayos de Tobago abarcan cinco pequeñas islas deshabitadas que ahora son la característica clave de la Parque Marino Tobago Cays. Protegidas por arrecifes, las playas ofrecen aguas tranquilas y transparentes para nadar y bucear, y los jardines de coral circundantes son ricos en vida marina.\r\n"
						+ "\r\n"
						+ "Los buceadores y buceadores pueden observar tortugas marinas, así como mantarrayas, barracudas y cardúmenes de peces de arrecife. Las excursiones de un día a los Cayos de Tobago son una de las mejores cosas que hacer en San Vicente y las Granadinas, y muchos navegantes anclan aquí para divertirse en las aguas cristalinas y disfrutar de las playas.","\n\nPetit St. Vincent es una fantasía tropical hecha realidad. También conocida como PSV, esta isla de propiedad privada alberga la boutique Petit St. Vincent Recurso, donde los huéspedes se instalan en villas apartadas con vista al mar esparcidas por las laderas y bahías.\r\n"
								+ "\r\n"
								+ "Para preservar la tranquilidad de la isla, las villas no tienen teléfonos ni televisores. En cambio, las banderas de colores transmiten mensajes al atento personal. El complejo abarca toda la isla y pertenece a la cartera de Small Luxury Hotels of the World. También es uno de los mejores resorts de lujo con todo incluido en el Caribe y un destino de luna de miel favorito","\n\nPalm Island es un pequeño paraíso. Hogar del Palm Island Resort y Spa, uno de los mejores resorts de playa de San Vicente y las Granadinas, así como una serie de villas de vacaciones, la isla lleva el nombre de las abundantes palmeras de coco plantadas por los antiguos propietarios del resort.\r\n"
										+ "\r\n"
										+ "Cinco playas de arena blanca bordean la costa, con excelente esnórquel cerca de la costa en aguas turquesas translúcidas. La isla tiene un pequeño aeropuerto y también está a un corto trayecto en barco desde Union Island.\r\n"
										+ "\r\n"
										+ "Además de bucear, las actividades favoritas para hacer aquí incluyen paddleboard, kayak, vela, andar en bicicleta por la isla, deleitarse con mariscos frescos en los restaurantes del resort y disfrutar de las hermosas playas.","\n\nMayreau, accesible solo por barco, es una pequeña isla de solo 2,5 kilómetros cuadrados con una de las bahías más bonitas del Caribe. Salt Whistle Bay. La bahía es un lugar popular para los yates, y su arco de playa de arena blanca bordeado de palmeras es encantador para tomar el sol. Algunos vendedores locales venden recuerdos y bocadillos a lo largo de la costa.\r\n"
												+ "\r\n"
												+ "La única carretera de la isla conduce cuesta arriba desde la playa hasta un pequeño pueblo con vistas espectaculares del océano y el Cayos de Tobago. La mayoría de los visitantes llegan al muelle de Saline Bay.","\n\nUna de las actividades más populares en la isla de San Vicente es una caminata guiada hasta el cráter del volcán La Soufrière (que no debe confundirse con La Grande Soufrière en Guadalupe). Con una altura de 1.234 metros sobre el nivel del mar, La Soufriere es el pico más alto de San Vicente. Todavía está activo, entró en erupción por última vez en 1979, afortunadamente sin víctimas mortales.\r\n"
														+ "\r\n"
														+ "Para llegar al cráter, puede caminar por el sendero de sotavento (alrededor de seis a ocho horas de ida y vuelta) o el sendero de barlovento más fácil y popular (de tres a cuatro horas de ida y vuelta). En el camino, aprenderá sobre las plantas y animales adaptados de forma única, y verá la selva tropical, el bosque nuboso y las vistas espectaculares del campo circundante. Una vez en la cima, también tendrás la oportunidad de explorar el cráter.\r\n"
														+ "\r\n"
														+ "Si desea permanecer cerca del volcán, el económico Richmond Vale Diving & Hiking Centrar ofrece alojamiento básico y caminatas guiadas a lo largo del sendero de sotavento que comienza justo en el hotel.","\n\nExclusive Mustique es un patio de recreo para celebridades, estrellas de rock y los súper ricos. Con su propio aeropuerto y tienda general, esta isla privada de cinco kilómetros de largo alberga elegantes villas privadas y dos hoteles de lujo: Firefly Mustique y el algodon casa.\r\n"
																+ "\r\n"
																+ "Mick Jagger, Tommy Hilfiger y Princess Margaret se encuentran entre los visitantes famosos, y algunas celebridades aún poseen villas en este pequeño trozo de paraíso.\r\n"
																+ "\r\n"
																+ "Los arrecifes de coral están cerca de la costa y las playas de arena blanca rodean la isla, lo que brinda excelentes oportunidades para nadar y bucear. Playa de macarrones es un favorito. Otras cosas que hacer aquí incluyen buceo, pesca, kayak, tenis y explorar la isla a caballo.","\n\nEn la isla de San Vicente (San Vicente), Kingstown es la capital y principal centro comercial de San Vicente y las Granadinas. La mayoría de los turistas lo consideran una puerta de entrada a otras islas, pero la ciudad rezuma un antiguo encanto caribeño, y encontrará algunas atracciones turísticas que vale la pena visitar aquí.\r\n"
																		+ "\r\n"
																		+ "Las calles adoquinadas y los edificios coloniales realzan el pintoresco centro de la ciudad, y si se pregunta qué hacer en Kingstown, St. Vincent, sus hermosas iglesias se encuentran entre los aspectos más destacados. Hermosas vidrieras adornan Catedral Anglicana de San Jorge, una estructura de estilo georgiano de 1820, y el 1823 Catedral católica de Santa María presenta agujas góticas y columnas y arcos románicos.\r\n"
																		+ "\r\n"
																		+ "Los pulgares verdes también deben hacer un punto para pasar Jardines botánicos de San Vicente, los jardines botánicos más antiguos de las Indias Occidentales. Pasear por estos terrenos llenos de palmeras durante unas horas es una buena opción si está buscando cosas que hacer en St. Vincent desde un crucero.\r\n"
																		+ "\r\n"
																		+ "Para disfrutar de hermosas vistas de Kingstown y las islas circundantes, diríjase a Fuerte Charlotte, en lo alto de una loma al norte de la ciudad.\r\n"
																		+ "\r\n"
																		+ "Si eres un amante de la naturaleza, puedes caminar por el popular Sendero natural de Vermont, a unos 14 kilómetros de Kingstown, y busque el loro endémico de San Vicente.\r\n"
																		+ "\r\n"
																		+ "¿Se pregunta dónde alojarse en la isla? Aproximadamente a 20 minutos en automóvil al norte de Kingstown, está programada la inauguración de un muy esperado resort Beaches en St. Vincent en el antiguo Buccament Bay Resort.","\n\nEstablecidos en 1765, los encantadores Jardines Botánicos de San Vicente son los más antiguos de las Indias Occidentales. Los jardines abarcan 20 acres de plantas y árboles tropicales autóctonos y exóticos, como hibisco, canela, nuez moscada, caoba, palmeras y un árbol del pan que supuestamente crece a partir de una plántula traída a la isla por el Capitán Bligh.\r\n"
																				+ "\r\n"
																				+ "Los amantes de las aves pueden ver el loro endémico de San Vicente en un pequeño aviario en el terreno. Contrate a un guía aquí en la entrada por una pequeña tarifa para aprovechar al máximo estos hermosos jardines.","\n\nEl paseo panorámico de la autopista de sotavento es una forma gratificante de hacer turismo. Tallada a lo largo de acantilados y pintorescos tramos costeros, esta carretera de 40 kilómetros va desde Kingstown para Playa de Richmond, a lo largo de la protegida costa oeste de San Vicente.\r\n"
																						+ "\r\n"
																						+ "El camino pasa por pueblos locales, playas de arena negra, plantaciones de cocoteros y algunas atracciones turísticas que valen la pena. Por el camino, Carib Rock presenta una cara tallada que data del año 600 d.C.\r\n"
																						+ "\r\n"
																						+ "Muchos viajeros también pasan por Barrouallie, un pequeño pueblo de pescadores con un altar de piedra caribe y petroglifos. La tradición de la caza de calderones todavía se practica aquí.\r\n"
																						+ "\r\n"
																						+ "La ruta termina cerca de las arenas negras de Playa de Richmond, una popular zona de baño. En la distancia, puedes ver La Soufrière, un volcán activo y el pico más alto de la isla.\r\n"
																						+ "\r\n"
																						+ "Desde este tramo de costa, los tours parten hacia el Cataratas de Baleine, una cascada de 18 metros en el extremo noroeste de San Vicente. El acceso a las cataratas es en bote o a pie, ya que no hay caminos hacia esta área.","\n\n¿Se pregunta dónde están las mejores playas de San Vicente y las Granadinas? Encontrarás muchos de ellos en Canouan.\r\n"
																								+ "\r\n"
																								+ "A unos 40 kilómetros al sur de San Vicente, esta pequeña isla ofrece deslumbrantes costas de arena blanca y un excelente esnórquel gracias a una barrera de coral que protege el lado atlántico de la isla.\r\n"
																								+ "\r\n"
																								+ "La mayoría de los visitantes de la isla se alojan en uno de sus dos exclusivos resorts, el Mandarin Oriental, Canouan y Canouan Estate Resort & Villas, que se extienden a lo largo de la mitad norte de la isla, con vistas a un campo de golf muy aclamado.\r\n"
																								+ "\r\n"
																								+ "Si no desea quedarse en uno de estos costosos complejos turísticos, siempre puede alquilar un yate, anclar en alta mar y pasar un día retozando en las deslumbrantes playas.","\n\nCoronada por espectaculares picos volcánicos, Union Island es el puerto de entrada al sur de San Vicente y las Granadinas y una puerta de entrada para excursiones a las islas cercanas.\r\n"
																										+ "\r\n"
																										+ "La isla tiene dos pueblos principales: Ashton y Clifton. Ashton es el punto de partida para las caminatas por las colinas, mientras Clifton es el hogar de la mayoría de las instalaciones turísticas, con tiendas, restaurantes, puerto deportivo y aeropuerto. Este es también el lugar para visitar si está buscando un poco de vida nocturna.\r\n"
																										+ "\r\n"
																										+ "Las dos mejores playas de la isla se encuentran en la costa norte en Bahía de Richmond y Bahía de Belmont."};





		respuesta=menu(false);
		while(respuesta!=0) {
			switch(respuesta) {
			case 1:
				InformacionGeneral.infoGeneral();
				break;
			case 2:
				LuisQuiz.quiz(preg, susresp, posibresp,letras);
				LuisQuiz.compararResp(susresp,misresp);
				break;
			case 3:
				res = CuestionarioInformacion.cuestionarioInformacion(preguntasTurismo);
				CuestionarioInformacion.mostrarResultadosPantalla(res,turismo);
				break;
			case 4:
				Sugerencias.sugerencias(sugerencias);

				break;
			}
			respuesta=menu(false);
		}

		System.out.println("FIN DE PROGRAMA. GRACIAS POR USAR NUESTRO PROGRAMA.");

	}
}
