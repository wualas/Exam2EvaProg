package utilidades;

import java.util.Scanner;

import base.Principal;

public class Menu {
	//Variables globales
	static Scanner sc = new Scanner(System.in);
	
	//Menu principal
    public static void menuPrincipal() {
    	final int tope=2;
    	int opc;
    	do {
    		System.out.println("\n \n ===   MENU   === \n");
    		System.out.println(" 1 - Submenu Smartphone Android");
    		System.out.println(" 2 - Submenu Smartphone IOS");
    		System.out.println(" 0 - Salir");
    		opc = sc.nextInt();
    		if (opc <0 || opc > tope) {
    			System.out.println("Error opcion invalida. Intentelo de nuevo");
    		}
    	}while (opc <0 || opc >tope);
    	switchMenuPrincipal(opc);
    }
  //Switch menu principal
    public static void switchMenuPrincipal(int opcion) {
    	switch (opcion) { 
    	case 1:
    		submenuAndroid();
    		break;
    	case 2:
    		submenuIos();
    		break;
    	default:
    		System.out.println("CERRANDO APLICACION...");
    		System.exit(0);
    		break;
    	}
    	menuPrincipal();
    }
    
  //Menu de la opcion Smartphone Android
    public static void submenuAndroid() {
    	final int tope=4;  //mirar si es 1 o 2 lo que hay q poner
    	int opc;
    	do {
    		System.out.println("\n \n ===   SUBMENU SMARTPHONES ANDROID   === \n");
    		System.out.println(" 1 - Alta de dispositivo");
    		System.out.println(" 2 - Mostrar listado de dispositivos");
    		System.out.println(" 3 - Examen");
    		System.out.println(" 4 - Volver al menu principal");
    		System.out.println("Introducir opcion: ");
    		opc = sc.nextInt();
    		if (opc <1 || opc > tope) {
    			System.out.println("Error opcion invalida. Intentelo de nuevo");
    		}
    	}while (opc <1 || opc >tope);
    	switchSubmenuAndroid(opc);
    }
    //Menu de la opcion sms
    public static void submenuIos() {
    	final int tope=4;
    	int opc;
    	do {
    		System.out.println("\n \n ===   SUBMENU SMARTPHONES IOS  === \n");
    		System.out.println(" 1 - Alta de dispositivo");
    		System.out.println(" 2 - Mostrar listado de dispositivos ");
    		System.out.println(" 3 - examen");
    		System.out.println(" 4 - Volver al menu principal");
    		System.out.println("Introducir opcion: ");
    		opc = sc.nextInt();
    		if (opc <1 || opc > tope) {
    			System.out.println("Error opcion invalida. Intentelo de nuevo");
    		}
    	}while (opc <1 || opc >tope);
    	switchSubmenuIos(opc);
    }
    
    
    
  //Switch del menu de Smartphone Android
    public static void switchSubmenuAndroid(int opcion) {
    	switch (opcion) {
	    	case 1:
	    		Principal.AltaDispositivoAndroid();
	    		break;
	    	
	    	case 2:
	    		Principal.mostrarListado();
	    		break;
	    	case 3:
	    		Principal.Examen();
	    		break;
	    	case 4:
	    		menuPrincipal();
	    		break;
    	}	
    	submenuAndroid();
    }
  //Switch del menu de Smartphone IOS
    public static void switchSubmenuIos(int opcion) {
    	switch (opcion) {
	    	case 1:
	    		Principal.AltaDispositivoIos();
	    		break;
	    	case 2:
	    		Principal.mostrarListado();
	    		break;
	    	case 3:
	    		Principal.Examen2();
	    		break;
	    	case 4:
	    		menuPrincipal();
	    		break;
    	}	
    	submenuIos();
    }
 
}