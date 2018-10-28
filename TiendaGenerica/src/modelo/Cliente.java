package modelo;

public class Cliente {
	private String nombre;
	private int cedula;
	private String direccion;
	private int telefono;
	private String correo;
	
	
	
	public Cliente(String nombre, int cedula, String direccion, int telefono, String correo) {
		
		this.nombre = nombre;
		this.cedula = cedula;
		this.direccion = direccion;
		this.telefono = telefono;
		this.correo = correo;
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
