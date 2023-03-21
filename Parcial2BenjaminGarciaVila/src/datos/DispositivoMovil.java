package datos;

public abstract class DispositivoMovil {
//*************ATRIBUTOS**********
	private String marca;  
	private String tipo;
	private String modelo;  //campo clave - validado
	private String color;
//*************CONSTRUCTORES**********
	/**
	 * 
	 */
public DispositivoMovil() {
		super();
	}
/**
 * @param marca
 * @param tipo
 * @param modelo
 * @param color
 */
public DispositivoMovil(String marca, String tipo, String modelo, String color) {
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
 * Metodos abstratos 
 * 
 */
public abstract String llamar();
public abstract String colgar();
public abstract String buscar();

/**
 * metodo tostring
 */
 
	@Override
	public String toString() {
		return " ->Dispositivos moviles: \n "
				+ "\n marca:" + this.marca + "\n"
				+ "\n tipo:" + this.tipo + "\n"
				+ "\n modelo:" + this.modelo + "\n"
				+ "\n color:" + this.color + "\n";
				}

}



