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

	public static void main(String[] args) {
	// TODO Auto-generated method stub
	Menu.menuPrincipal();
	sc.close();
	}

public static void AltaDispositivoAndroid() {
	String marca,tipo,modelo,color;
	
	System.out.println("Alta de moviles tipo android: ");
	marca = solicitarDato("marca de movil tipo android");
	tipo = solicitarDato("tipo");
	modelo = solicitarDato ("modelo");
	color = solicitarDato ("color");
		
	//Instanciamos, construimos el objeto email utilizando el constructor completo
	DispositivoAndroid androidAux = new DispositivoAndroid(marca,tipo,modelo,color);
	//añadimos el objeto(ficha) sms al listado de Mensajes
	listadomoviles.add(androidAux);
}
/**
 * Metodo mostrarListadoAndroid() Muestra los moviles tipo Android Menu 2.2
 */
public static void mostrarListadoAndroid() {
	int contadorAndroids =0;
	if( listadomoviles.isEmpty()) {
		System.out.println("Lista de moviles esta vacia");
	}else {
		//Recorresmos lista de moviles y para cada posicion verificamos que tipo de ficha es
		for( int i=0; i<listadomoviles.size();i++) {
			//comprobamos de que tipo de clase es la ficha actual de la lista de mensajes
			if (listadomoviles.get(i) instanceof DispositivoAndroid){
				System.out.println((DispositivoAndroid)listadomoviles.get(i));//se invoca el metodo tostring()
				contadorAndroids++;
			}
		}
		if (contadorAndroids == 0) {
			System.out.println("La lista de moviles no contiene ningun telefono tipo android");
		}else {
			System.out.println("La lista de moviles contiene: " + contadorAndroids + "telefono(S) tipo Android");
		}
	}
	
}

public static void Examen() {}
public static void AltaDispositivoIos() {
String marca,tipo,modelo,color;
	
	System.out.println("Alta de moviles tipo IOS: ");
	marca = solicitarDato("marca de movil tipo IOS");
	tipo = solicitarDato("tipo");
	modelo = solicitarDato ("modelo");
	color = solicitarDato ("color");
		
	//Instanciamos, construimos el objeto email utilizando el constructor completo
	DispositivoIos iosAux = new DispositivoIos(marca,tipo,modelo,color);
	//añadimos el objeto(ficha) sms al listado de Mensajes
	listadomoviles.add(iosAux);
}
public static void mostrarListadoIos() {
	int contadorIos =0;
	if( listadomoviles.isEmpty()) {
		System.out.println("Lista de moviles esta vacia");
	}else {
		//Recorresmos lista de moviles y para cada posicion verificamos que tipo de ficha es
		for( int i=0; i<listadomoviles.size();i++) {
			//comprobamos de que tipo de clase es la ficha actual de la lista de mensajes
			if (listadomoviles.get(i) instanceof DispositivoIos){
				System.out.println((DispositivoIos)listadomoviles.get(i));//se invoca el metodo tostring()
				contadorIos++;
			}
		}
		if (contadorIos == 0) {
			System.out.println("La lista de moviles no contiene ningun telefono tipo IOS");
		}else {
			System.out.println("La lista de moviles contiene: " + contadorIos + "telefono(S) tipo IOS");
		}
	}
	
}

public static void Examen2() {}
	
/**
 * Metodo usado para solicitar datos generales
 * @param mensaje
 * @return
 */
public static String solicitarDato (String mensaje) {
	System.out.printf("introduzca " + mensaje + ": ");
	String dato = sc.nextLine();
	return dato;
}	
	
	
}
