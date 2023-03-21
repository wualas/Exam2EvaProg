/**
 * Clase que hereda de de la clase dispositivomovil y que permite gestionar telefonos tipo IOS
 * @author Beni
 *
 */

package datos;

public class DispositivoIos extends DispositivoMovil{
	/**
	 * 
	 */
	public DispositivoIos() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		/**
	 * @param marca
	 * @param tipo
	 * @param modelo
	 * @param color
	 */
	public DispositivoIos(String marca, String tipo, String modelo, String color) {
		super(marca, tipo, modelo, color);
		// TODO Auto-generated constructor stub
	}
	

		@Override
		public String toString() {
			 return super.toString()
			 + "\n  llamar()=" + llamar()
			 + "\n  colgar()=" + colgar()
			 + "\n  buscar()=" + buscar()
			 + "\n  interactuarPorRedSocial()=" + interactuarPorRedSocial()
			 + "\n";
		}
		
		public String interactuarPorRedSocial() {
			return "Accediendo a las redes sociales desde Smartphone IOS";
		}

		@Override
		public String llamar() {
			return "LLamada de voz desde un Smartphone iOS";
		}
		@Override
		public String colgar() {
			return "Pulsación larga para colgar la llamada desde un Smartphone iOS";
		}
		@Override
		public String buscar() {
			return "Abrir agenda de contactos desde un Smartphone iOS";
		}
}

