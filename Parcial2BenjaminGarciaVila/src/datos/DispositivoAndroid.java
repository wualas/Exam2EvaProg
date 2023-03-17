/**
 * Clase que hereda de de la clase dispositivomovil y que permite gestionar telefonos tipo ANDROID
 * @author Beni
 *
 */

package datos;


public class DispositivoAndroid extends DispositivoMovil {
//*************ATRIBUTOS**********
	public String marca;  
	public String tipo;
	public String modelo;  //campo clave - validado
	public String color;
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
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.modelo = modelo;
		this.color = color;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}
	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * Metodos propios de clase
	 */
	public String tomarFotografia() {
		
		return "Accediendo a la cámara desde Smartphone Android”.";
		
	}
	
	/**
	 * metodo tostring
	 */
	 
		@Override
		public String toString() {
		return " ->Dispositivos moviles: \n"
		+ "\n marca:" + this.marca +"\n"
		+ "\n tipo:" + this.tipo + "\n"
		+ "\n modelo:" + this.modelo + "\n"
		+ "\n color:" + this.color + "\n";
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
