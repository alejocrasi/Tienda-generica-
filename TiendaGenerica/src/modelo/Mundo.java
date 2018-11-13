package modelo;

import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Mundo {
	private ArrayList<Cliente>clientes;
	private ArrayList<Proveedor>provedores;
	
	
	public Mundo() {
		clientes = new ArrayList<Cliente>();
		provedores = new ArrayList<Proveedor>();
	}
	
	
	
	
	public boolean agregarCliente(String nombre, int cedula, String direccion, int telefono, String correo){
		boolean agrego = false;
		if(buscarCliente(cedula)==-1){
		Cliente nuevo = new Cliente(nombre, cedula, direccion, telefono, correo);
		clientes.add(nuevo);
		agrego = true;
		}
		
		
		return agrego;
	}
	public int buscarCliente( int cedula){
		int pos = -1;
		for (int i = 0; i < clientes.size()&& pos==-1; i++) {
			Cliente actual = clientes.get(i);
			if(actual != null && actual.getCedula()== cedula){
				pos =i;
			}	
		}	
		return pos;
	}
	
    public boolean eliminarCliente(int cedula){
    	boolean agre = false;
    	int indice = buscarCliente(cedula);
    	
    	  if (indice >=0) {
			clientes.remove(indice);
			agre = true;
    	  }

    	  return agre;
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




	public ArrayList<Cliente> getClientes() {
		return clientes;
	}




	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
	

}
