package modelo;

import javax.swing.JTextField;

public class Proveedor {
	
	
	
	
	private int  NIT;
	private String  nombreProveedor;
	private String  direccion;
	private int  telefono;
	private String  ciudad;
	
	
	
	
	
	
	public Proveedor(int nIT, String nombreProveedor, String direccion, int telefono, String ciudad) {
		
		NIT = nIT;
		this.nombreProveedor =nombreProveedor;
		this.direccion = direccion;
		this.telefono = telefono;
		this.ciudad = ciudad;
	}
	
	
	
	
	
	

	public int getNIT() {
		return NIT;
	}

	public void setNIT(int nIT) {
		NIT = nIT;
	}

	public String getNombreProveedor() {
		return nombreProveedor;
	}

	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
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

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	
	
	
}
