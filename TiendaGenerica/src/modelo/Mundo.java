package modelo;

import java.util.ArrayList;


public class Mundo {
	private ArrayList<Cliente>clientes;
	
	
	public Mundo() {
		clientes = new ArrayList<Cliente>();
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
		
	
	
	

}
