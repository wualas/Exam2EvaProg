package datos;

public class DispositivoMovil {
//*************ATRIBUTOS**********
	protected String marca;  
	protected String tipo;
	protected String modelo;  //campo clave - validado
	protected String color;
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
 * Metodos propios de la clase
 */
public void llamar() {
		
}
public void colgar() {
	
}
public void buscar() {
	
}
}



