package modelo;

import java.io.Serializable;

public class Cliente implements Serializable
{
	private String nombre;
	private int cedula;
	private String direccion;
	private int telefono;
	private String correo;
	public Cliente(String pNombre, int pCedula, String pDireccion, int pTelefono, String pCorreo) {
		
		this.nombre = pNombre;
		this.cedula = pCedula;
		this.direccion = pDireccion;
		this.telefono = pTelefono;
		this.correo = pCorreo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
}



	
	
	
	
	

	


