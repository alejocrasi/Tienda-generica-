package modelo;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import controlador.Persistencia;

public class Cliente implements Serializable 
{
	private static final long serialVersionUID = 1L;
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
	public boolean agregarCliente(String nombre, int cedula, String direccion, int telefono, String correo){ 
		Persistencia persistencia= new Persistencia();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>(); 
		
		boolean agrego = false;
		if(new File ("C:\\data\\cliente.out").exists()){
			clientes = persistencia.leerCliente();
			if(buscarCliente(cedula,clientes)==-1){
				Cliente nuevo = new Cliente(nombre, cedula, direccion, telefono, correo);
				clientes.add(nuevo);
				persistencia.escribirCliente(clientes);
				agrego = true;}}
		else{Cliente nuevo = new Cliente(nombre, cedula, direccion, telefono, correo);		
				clientes.add(nuevo);
				persistencia.escribirCliente(clientes);
				agrego = true;}
		return agrego;}
    
	
	public int buscarCliente( int cedula, ArrayList<Cliente> clientes){
    	  int indice = -1;
		  for (int i = 0; i < clientes.size(); i++) {
			   Cliente actual = clientes.get(i);
			    if(actual.getCedula()==cedula){
				    indice = i;}}
		  return indice;}
    
	
    public void ActualizarCliente(Cliente cliente){
    	Persistencia persistencia;
		ArrayList<Cliente> clientes;
		clientes = new ArrayList<Cliente>(); 
		persistencia = new Persistencia(); 
		
    	clientes = persistencia.leerCliente();
    	  int indice = buscarCliente(cliente.getCedula(), clientes);
    	  if (indice != -1){
    		  if(cliente.getNombre() != ""){
    			  clientes.get(indice).setNombre(cliente.getNombre()); }
    		  if(cliente.getDireccion() !=""){
    			  clientes.get(indice).setDireccion(cliente.getDireccion()); }
    		  if(cliente.getTelefono() != 0){
    			  clientes.get(indice).setTelefono(cliente.getTelefono());}
    		  if(cliente.getCorreo() != ""){
    			  clientes.get(indice).setCorreo(cliente.getCorreo());}	
    		  persistencia.escribirCliente(clientes);
    		  JOptionPane.showMessageDialog(null, "se ha actualizado");}
    	  else if (indice == -1){
    		  JOptionPane.showMessageDialog(null, "Primero cree su usuario");}}
   
 
    public void eliminarCliente(Cliente cliente){
    	Persistencia persistencia;
		ArrayList<Cliente> clientes;
		clientes = new ArrayList<Cliente>(); 
		persistencia = new Persistencia();
		
    	clientes=persistencia.leerCliente();
    	  int indice = buscarCliente(cliente.getCedula(), clientes);
    	  if (indice != -1 ) {
			clientes.remove(indice);
			persistencia.escribirCliente(clientes);
			JOptionPane.showMessageDialog(null, "se ha borrado el cliente");}
    	  else{
    		  JOptionPane.showMessageDialog(null, "no se encontro el cliente");
    	  }
      }
    
    
    public Cliente leerCliente(Cliente cliente){
    	Persistencia persistencia;
		ArrayList<Cliente> clientes;
		clientes = new ArrayList<Cliente>(); 
		persistencia = new Persistencia();
		
    	  clientes =persistencia.leerCliente();
    	  Cliente encontrado = null;
    	  int indice = buscarCliente(cliente.getCedula(),clientes);
    	  if(indice != -1){
    		encontrado=clientes.get(indice);
    	  }
    	  else{
    		  JOptionPane.showMessageDialog(null, "no se encontro el cliente");
    		  encontrado = null;}
    	  return encontrado;}
    
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
	public static long getSerialversionuid() {
		return serialVersionUID;}
	
}