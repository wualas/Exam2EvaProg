/**
 * Clase que hereda de de la clase dispositivomovil y que permite gestionar telefonos tipo ANDROID
 * @author Beni
 *
 */

package datos;


public class DispositivoAndroid extends DispositivoMovil {

	/**
	 * 
	 */
	public DispositivoAndroid() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param marca
	 * @param tipo
	 * @param modelo
	 * @param color
	 */
	public DispositivoAndroid(String marca, String tipo, String modelo, String color) {
		super(marca, tipo, modelo, color);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		 return super.toString()
		 + "\n  llamar()=" + llamar()
		 + "\n  colgar()=" + colgar()
		 + "\n  buscar()=" + buscar()
		 + "\n";
	}


	/**
	 * Metodos propios de la clase	
	 */
		@Override
		public String llamar() {
			return "LLamada desde un Smartphone Android";
		}
		@Override
		public String colgar() {
			return "Deslice para colgar la llamada desde un Smartphone Android”.";
		}
		@Override
		public String buscar() {
			return "Abrir agenda desde un Smartphone Android";
		}
	
}
