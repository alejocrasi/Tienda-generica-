package modelo;

import java.util.ArrayList;


public class Mundo {
	private ArrayList<Cliente>clientes;
	private ArrayList<Proveedor>provedores;
	
	
	public Mundo() {
		clientes = new ArrayList<Cliente>();
		provedores = new ArrayList<Proveedor>();
	}
	
	
	
	
	public boolean agregarCliente(String nombre, int cedula, String direccion, int telefono, String correo){
		boolean agrego = false;
		if(buscarCliente(cedula)==null){
		Cliente nuevo = new Cliente(nombre, cedula, direccion, telefono, correo);
		clientes.add(nuevo);
		agrego = true;
		}
		
		
		return agrego;
	}
	public Cliente buscarCliente( int cedula){
		Cliente encontrado = null;
		for (int i = 0; i < clientes.size(); i++) {
			Cliente actual = clientes.get(i);
			if(actual.getCedula()==cedula){
				encontrado = actual;
			}
			
		}
		return encontrado;
		
	}
	
	public Boolean agregarProveedor(int NIT, String nombreProveedor, String direccion, int telefono, String ciudad) {
		boolean agrego = false;
		if(buscarProveedor(NIT)==null){
		Proveedor nuevo = new Proveedor(NIT, nombreProveedor, direccion, telefono, ciudad);
		provedores.add(nuevo);
		agrego = true;
		}
		return agrego;
		
	}
		
		public Proveedor buscarProveedor( int NIT){
			Proveedor encontrado = null;
			for (int i = 0; i < provedores.size(); i++) {
				Proveedor actual = provedores.get(i);
				
				if(actual.getNIT()==NIT){
					encontrado = actual;
				}
				
			}
			return encontrado;
		}
	
	
	

}
