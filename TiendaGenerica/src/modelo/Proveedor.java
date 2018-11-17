package modelo;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import controlador.Persistencia;

public class Proveedor implements Serializable{

	private static final long serialVersionUID = 1L;
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
	
	public Boolean agregarProveedor(int NIT, String nombreProveedor, String direccion, int telefono, String ciudad){
		ArrayList<Proveedor>proveedores = new ArrayList<Proveedor>();
		Persistencia persistencia = new Persistencia();
		
		boolean agrego = false;
		if(new File("C:\\data\\proveedor.out").exists()){
			proveedores=persistencia.leerProveedor();
		if(buscarProveedor(NIT,proveedores)==-1){
			Proveedor nuevo = new Proveedor(NIT, nombreProveedor, direccion, telefono, ciudad);
			proveedores.add(nuevo);
			persistencia.escribirProveedor(proveedores);
		    agrego = true;}}
		else{
			Proveedor nuevo = new Proveedor(NIT, nombreProveedor, direccion, telefono, ciudad);
			proveedores.add(nuevo);
	        persistencia.escribirProveedor(proveedores);
	        agrego= true;}
		return agrego;}
	
	public int buscarProveedor( int NIT,ArrayList<Proveedor>proveedores){
			int indice = -1;
			for (int i = 0; i < proveedores.size(); i++) {
				Proveedor actual = proveedores.get(i);
				if(actual.getNIT()==NIT){
					indice = i;}}
		return indice;}
	
	public void ActualizarProveedor(Proveedor proveedor){
		ArrayList<Proveedor>proveedores = new ArrayList<Proveedor>();
		Persistencia persistencia = new Persistencia();
		
		proveedores = persistencia.leerProveedor();
		int indice = buscarProveedor(proveedor.getNIT(), proveedores);
		if(indice != -1){
			if(proveedor.getNombreProveedor() != ""){
				proveedores.get(indice).setNombreProveedor(proveedor.getNombreProveedor());}
			if(proveedor.getDireccion() != ""){
				proveedores.get(indice).setDireccion(proveedor.getDireccion());}
			if(proveedor.getTelefono() != 0){
				proveedores.get(indice).setTelefono(proveedor.getTelefono());}
			if(proveedor.getCiudad() != ""){
				proveedores.get(indice).setCiudad(proveedor.getCiudad());}
			persistencia.escribirProveedor(proveedores);
			JOptionPane.showMessageDialog(null, "se ha actualizado");}
			else if (indice == -1){
				JOptionPane.showMessageDialog(null, "cree primero su proveedor");}}
	
	public void eliminarProveedor(Proveedor proveedor){
		ArrayList<Proveedor>proveedores = new ArrayList<Proveedor>();
		Persistencia persistencia = new Persistencia();
		
		proveedores = persistencia.leerProveedor();
		int indice = buscarProveedor(proveedor.getNIT(), proveedores);
		if(indice != -1){
			proveedores.remove(indice);
			persistencia.escribirProveedor(proveedores);
			JOptionPane.showMessageDialog(null, "se ha eliminado tu proveedor");}
		else{
			JOptionPane.showMessageDialog(null, "No se pudo eliminar");}}
  
	public Proveedor leerProveedor(Proveedor provedor){
  		ArrayList<Proveedor>proveedores = new ArrayList<Proveedor>();
		Persistencia persistencia = new Persistencia();
		
  		proveedores = persistencia.leerProveedor();
  		Proveedor encontrado = null;
  		int indice = buscarProveedor(provedor.getNIT(), proveedores);
  		if(indice != -1){
  			encontrado = proveedores.get(indice);}
  		else{
  			JOptionPane.showMessageDialog(null,"No ha registrado a su proveedor");
  			encontrado = null;}
  		
  		return encontrado;}
	
	

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
