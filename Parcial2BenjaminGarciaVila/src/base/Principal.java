/**
Desarrollar una aplicación en JAVA que permita gestionar los dispositivos móviles que
vende una tienda de telefonía móvil.
La aplicación permitirá llevar registro de todos los dispositivos de la tienda, teniendo en
cuenta que cada dispositivo se especializa en Android o iOS.
Ten en cuenta que, tal y como se muestra en el diagrama uml los dispositivos Android y los
dispositivos iOS además de los métodos específicos de cada uno, incluirán los
constructores y métodos de la superclase y los métodos get, set y toString
correspondientes. Asimismo, se ha de tener en cuenta que el modelo se considerará un
atributo clave por lo que no admitirá repetidos.
Los métodos indicados en el diagrama uml se limitarán a mostrar un mensaje por pantalla,
mensaje que será distinto y personalizado según se trate de un Smartphone Android o un
Smartphone iOS tal y como se indica a continuación:
Smartphone Android:
llamar(): “LLamada desde un Smartphone Android”
colgar(): “Deslice para colgar la llamada desde un Smartphone Android”.
buscar(): “Abrir agenda desde un Smartphone Android”
tomarFotografia(): “Accediendo a la cámara desde Smartphone Android”.
Smartphone iOS:
llamar(): “LLamada de voz desde un Smartphone iOS”
colgar(): “Pulsación larga para colgar la llamada desde un Smartphone iOS”.
buscar(): “Abrir agenda de contactos desde un Smartphone iOS”
interactuarPorRedSocial(): “Accediendo a la redes sociales desde Smartphone iOS”.
El método toString mostrará por pantalla toda la información de cada dispositivo incluyendo
los campos/atributos así como la llamada a los métodos indicados anteriormente.
Menú principal:
1.- Submenú Smartphones Android
2.- Submenú Smartphones iOS
0.- Salir
Submenú Smartphones Android
1. Alta de dispositivo
2. Mostrar listado de dispositivos
3. —>>> apartado a añadir el día del examen presencial
4. Volver al menú principal
Submenú Smartphones iOS
1. Alta de dispositivo
2. Mostrar listado de dispositivos
3. —>>> apartado a añadir el día del examen presencial
4. Volver al menú principal
*************************************************************************************
 * @author Benjamin Garcia
 * @version 1.0
 * @date 21/03/2023
 * DNI: 53301596Q
 * email: benjamin.garcia@formacionchios.es
*/

package base;

import java.util.ArrayList;

import java.util.Scanner;

import utilidades.Menu;

import datos.DispositivoAndroid;
import datos.DispositivoIos;
import datos.DispositivoMovil;





public class Principal {
	//VARIABLES GLOBALES
	static Scanner sc = new Scanner(System.in);
	static ArrayList<DispositivoMovil> listadomoviles = new ArrayList<DispositivoMovil>();
	/**
	 * Metodo principal usado para llamar al menu y las diferentes opciones
	 */
	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Menu.menuPrincipal();
	sc.close();
	}
/************************************************************************************
 * Metodo AltaDispositivoAndroid() Da de alta los moviles tipo Android Menu 1.1    **
 ***********************************************************************************/
public static void AltaDispositivoAndroid() {
	String marca,tipo,modelo,color;
	System.out.println("Alta de moviles tipo android: ");
	marca = solicitarDato("marca de movil tipo android");
	tipo = solicitarDato("tipo");
	modelo = solicitarModeloAndroid ();
	color = solicitarDato ("color");
		
	//Instanciamos, construimos el objeto DispositivoAndroid utilizando el constructor completo
	DispositivoAndroid androidAux = new DispositivoAndroid(marca,tipo,modelo,color);
	//añadimos el objeto(ficha) DispositivoAndroid al listado de Moviles
	listadomoviles.add(androidAux);
}
/**
 * Metodo que realiza diversas acciones sobre moviles tipo android
 */

public static void metodoAndroid() {
	DispositivoAndroid androidAux = new DispositivoAndroid();
	String modelo,colgar,llamar;
	modelo = solicitarModeloAndroid2 ();
	int posicion = -1;
	for(int i=0; i<listadomoviles.size(); i++) {
		if(listadomoviles.get(i) instanceof DispositivoAndroid &&((DispositivoAndroid) listadomoviles.get(i)).getModelo().equals(modelo)){
		posicion = i;
		break;
		}		
	}
	if (posicion != -1) {
		
		llamar = androidAux.llamar();
		colgar = androidAux.colgar();
		System.out.println(llamar);
		System.out.println(colgar);
		
	}
	
}

/****************************************************************************
 * Metodo AltaDispositivoIos() Da de alta los moviles tipo ios Menu 2.1    **
 ****************************************************************************/

public static void AltaDispositivoIos() {
String marca,tipo,modelo,color;
	
	System.out.println("Alta de moviles tipo IOS: ");
	marca = solicitarDato("marca de movil tipo IOS");
	tipo = solicitarDato("tipo");
	modelo = solicitarModeloIos();
	color = solicitarDato ("color");
		
	//Instanciamos, construimos el objeto email utilizando el constructor completo
	DispositivoIos iosAux = new DispositivoIos(marca,tipo,modelo,color);
	//añadimos el objeto(ficha) Dispositivo IOS al listado de Telefonos
	listadomoviles.add(iosAux);
}

/*********************************************************************************************************************************
 * Metodo mostrarListado, lo usaremos indistintamente para mostrar el listado de telefono diferenciando tipo android de tipo IOS**
 * Mostrar el listado de todos los moviles de la lista . Menu 1.2 y Menu 2.2                                                    **
 *********************************************************************************************************************************/
public static void mostrarListado() {
	System.out.println("******LISTA DE MOVILES********");
	int contadorAndroid =0;
	int contadorIos =0;
	if (listadomoviles.isEmpty()) {
		System.out.println("La lista de moviles esta vacia");
	}else {
		/*
		 * Recorremos la lista de moviles y para cada posicion mostramos la ficha del telefono
		 */
		for (int i =0; i< listadomoviles.size();i++) {
			if (listadomoviles.get(i) instanceof DispositivoAndroid){
				System.out.println((DispositivoAndroid)listadomoviles.get(i));
				contadorAndroid++;
			}
			if (listadomoviles.get(i) instanceof DispositivoIos) {
				System.out.println((DispositivoIos)listadomoviles.get(i));
				contadorIos++;
			}
		}
		// compruebo si hay Telefonos tipo Android: si no hay y solo hay del tipo IOS mensaje correspondiente,si hay telefonos tipo android indico cuantos
		if (contadorAndroid == 0) {
			System.out.println("La lista de moviles no contiene ningun telefono tipo android");
		} else {
			System.out.println("La lista de moviles contiene: " + contadorAndroid + " telefono(S) tipo Android");
		}
		// compruebo si hay telefonos tipo Ios: si no hay y solo hay de tipo Android mensaje correspondiente, si hay telefonos tipo Ios indico cuantos
		if(contadorIos ==0) {
			System.out.println("La lista de moviles no contiene ningun telefono tipo IOS");
		} else {
			System.out.println("La lista de moviles contiene: " + contadorIos + " telefono(S) tipo IOS");
		}
	
	
	}
}
/**
 * metodo que sirve para interactuar con un dispositivo IOS MENU 2.3
 */
public static void Interactuar() {
	DispositivoIos iosAux = new DispositivoIos();
	String interactuar;
	interactuar = iosAux.interactuarPorRedSocial();
	System.out.println(interactuar);
	
}
	
/**
 * Metodo usado para solicitar datos generales
 * @param mensaje
 * @return dato
 */
public static String solicitarDato (String mensaje) {
	System.out.printf("introduzca " + mensaje + ": ");
	String dato = sc.nextLine();
	return dato;
}	
/**
 * Metodo que sirve para solicitar el dato de model de telefono tipo IOS
 * @return modelo
 */
public static String solicitarModeloIos(){
	String modelo;
	int posicion;
	do {
		System.out.println("introduzca modelo de dispositivo IOS");
		modelo = sc.nextLine();
		posicion = buscarModeloIos(modelo, "ios");
		if (posicion != -1) {
			System.out.println("El modelo que ha introducido ya existe");
		}
	}while (posicion != -1);
	return modelo;
	
}
/**
 * Metodo que sirve para solicitar el dato de model de telefono tipo android
 * @return modelo
 */
public static String solicitarModeloAndroid(){
	String modelo;
	int posicion;
	do {
		System.out.println("introduzca modelo de dispositivo Android");
		modelo = sc.nextLine();
		posicion = buscarModeloAndroid(modelo, "android");
		if (posicion != -1) {
			System.out.println("El modelo que ha introducido ya existe");
		}
	}while (posicion != -1);
	return modelo;
	
}
/**
 * Metodo que usamos para buscar si el modelo introducido de ios esta repetido
 * @param modelo
 * @param tipoClaseMensaje
 * @return posicion
 */

public static int buscarModeloIos(String modelo, String tipoClaseMensaje) {
	int posicion = -1; //guardo la posicion -1 si no existe
	for(int i=0; i<listadomoviles.size(); i++) {
		if(listadomoviles.get(i) instanceof DispositivoIos &&((DispositivoIos) listadomoviles.get(i)).getModelo().equals(modelo)){
			posicion = i;
			break;
		}
	}
	return posicion;
}	
/**
 * Metodo que usamos para buscar si el modelo introducido de Android esta repetido
 * @param modelo
 * @param tipoClaseMensaje
 * @return posicion
 */
public static int buscarModeloAndroid(String modelo, String tipoClaseMensaje) {
			int posicion = -1; //guardo la posicion , -1 si no existe
			for(int i=0; i<listadomoviles.size(); i++) {
				if(listadomoviles.get(i) instanceof DispositivoAndroid &&((DispositivoAndroid) listadomoviles.get(i)).getModelo().equals(modelo)){
				posicion = i;
				break;
				}		
			}
 return posicion;
  }

public static String solicitarModeloAndroid2(){
	String modelo;
	int posicion;
	do {
		System.out.println("introduzca modelo de dispositivo Android");
		modelo = sc.nextLine();
		posicion = buscarModeloAndroid(modelo, "android");
		//if (posicion != -1) {
		//	System.out.println("El modelo que ha introducido no existe en la lista");
		//}
	}while (posicion == -1);
	return modelo;
	
}

}
//****************************************************************************
//* Metodo mostrarListadoAndroid() Muestra los moviles tipo Android Menu 1.2**
//****************************************************************************/
//public static void mostrarListadoAndroid() {
//	int contadorAndroids =0;
//	if( listadomoviles.isEmpty()) {
//		System.out.println("Lista de moviles esta vacia");
//	}else {
//		//Recorresmos lista de moviles y para cada posicion verificamos que tipo de ficha es
//		for( int i=0; i<listadomoviles.size();i++) {
//			//comprobamos de que tipo de clase es la ficha actual de la lista de mensajes
//			if (listadomoviles.get(i) instanceof DispositivoAndroid){
//				System.out.println((DispositivoAndroid)listadomoviles.get(i));//se invoca el metodo tostring()
//				contadorAndroids++;
//			}
//		}
//		if (contadorAndroids == 0) {
//			System.out.println("La lista de moviles no contiene ningun telefono tipo android");
//		}else {
//			System.out.println("La lista de moviles contiene: " + contadorAndroids + " telefono(S) tipo Android");
//			  }
//	}
//}
//****************************************************************************
//* Metodo mostrarListadoAndroid() Muestra los moviles tipo IOS Menu 2.2    **
//****************************************************************************/
//public static void mostrarListadoIos() {
//	int contadorIos =0;
//	if( listadomoviles.isEmpty()) {
//		System.out.println("Lista de moviles esta vacia");
//	}else {
//		//Recorresmos lista de moviles y para cada posicion verificamos que tipo de ficha es
//		for( int i=0; i<listadomoviles.size();i++) {
//			//comprobamos de que tipo de clase es la ficha actual de la lista de mensajes
//			if (listadomoviles.get(i) instanceof DispositivoIos){
//				System.out.println((DispositivoIos)listadomoviles.get(i));//se invoca el metodo tostring()
//				contadorIos++;
//			}
//		}
//		if (contadorIos == 0) {
//			System.out.println("La lista de moviles no contiene ningun telefono tipo IOS");
//		}else {
//			System.out.println("La lista de moviles contiene: " + contadorIos + " telefono(S) tipo IOS");
//		}
//	}
//	
//}


	

