package modelo;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import controlador.Persistencia;

public class Producto implements Serializable {

	private static final long serialVersionUID = 1L;
	private int codigoProducto;
	private String nombreProducto;
	private int nitProveedorProducto;
	private int precioCompraProducto;
	private int precioVentaProducto;
	
	public Producto(int pCodigoProducto, String pNombreProducto, int pNitProveedorProducto, int pPrecioCompraProducto, int pPrecioVentaProducto ){
		codigoProducto = pCodigoProducto;
		nombreProducto = pNombreProducto;
		nitProveedorProducto = pNitProveedorProducto;
		precioCompraProducto = pPrecioCompraProducto;
		precioVentaProducto = pPrecioVentaProducto;
	}
	
	 public boolean agregarProducto(int pCodigoProducto, String NombreProducto, int pNitProveedorProducto,int pPrecioCompraProducto, int pPrecioVentaProducto){
		 	ArrayList<Producto> productos = new ArrayList<Producto>();
		 	Persistencia persistencia = new Persistencia();
		 	ArrayList<Proveedor> proveedores = new ArrayList<Proveedor>();
		 boolean agrego = false;
		 proveedores = persistencia.leerProveedor();
		 if(buscarProveedor(pNitProveedorProducto, proveedores)!= -1){
		    if(new File("C:\\data\\producto.out").exists()){
		    	productos = persistencia.leerProducto();
		    	if(buscarProducto(pNitProveedorProducto, productos) == -1){
		    	 Producto nuevo = new Producto(pCodigoProducto, NombreProducto, pNitProveedorProducto, pPrecioCompraProducto, pPrecioVentaProducto);
		    	 productos.add(nuevo);
		    	 persistencia.escribirProducto(productos);
		    	 agrego = true;}}
		        else{
		    	 Producto nuevo = new Producto(pCodigoProducto, NombreProducto, pNitProveedorProducto, pPrecioCompraProducto, pPrecioVentaProducto);
		    	 productos.add(nuevo);
		    	 persistencia.escribirProducto(productos);
		    	 agrego= true;}}
		    else {
		    	 JOptionPane.showMessageDialog(null, "cree primero su provedor");}
		         return agrego;}
	 
	 public int buscarProducto(int pCodigoProducto , ArrayList<Producto>producto){
		    	int indice = -1;
		    	for (int i = 0; i < producto.size(); i++) {
					Producto actual = producto.get(i);
					if(actual.getCodigoProducto()== pCodigoProducto){
						indice = i;}}
		    	return indice;}
		    
     public int buscarProveedor( int NIT,ArrayList<Proveedor>proveedores){
				int indice = -1;
				for (int i = 0; i < proveedores.size(); i++) {
					Proveedor actual = proveedores.get(i);
					if(actual.getNIT()==NIT){
						indice = i;}}
			return indice;}
		
		    
     public void ActualizarProducto(Producto producto){
		  		ArrayList<Producto> productos = new ArrayList<Producto>();
			 	Persistencia persistencia = new Persistencia();
		  		productos = persistencia.leerProducto();
		  		int indice = buscarProducto(producto.getCodigoProducto(), productos);
		  		if(indice !=-1){
		  			if(producto.getNombreProducto() != ""){
		  				productos.get(indice).setNombreProducto(producto.getNombreProducto());
		  			if(producto.getPrecioCompraProducto() != 0){
		  				productos.get(indice).setPrecioCompraProducto(producto.getPrecioCompraProducto());}
		  			if(producto.getPrecioVentaProducto() != 0){
		  				productos.get(indice).setPrecioVentaProducto(producto.getPrecioVentaProducto());}
		  			persistencia.escribirProducto(productos);
		  			JOptionPane.showMessageDialog(null, "se ha actualizado");}}
		  	   else{
		  		    JOptionPane.showMessageDialog(null, "Primero cree su producto");}}
		  	
     public void eliminarProducto(Producto producto){
		  		ArrayList<Producto> productos = new ArrayList<Producto>();
			 	Persistencia persistencia = new Persistencia();
			 	
		  		productos = persistencia.leerProducto();
		  		int indice = buscarProducto(producto.getCodigoProducto(), productos);
		  		if(indice != -1){
		  			productos.remove(indice);
		  			persistencia.escribirProducto(productos);}
		  	    else{
		  	    	JOptionPane.showMessageDialog(null, "Primero cree su producto");}}
		  	
     public Producto leerProducto(Producto producto){
		  		ArrayList<Producto> productos = new ArrayList<Producto>();
			 	Persistencia persistencia = new Persistencia();
			 	
		  		Producto encontrado = null;
		  		productos = persistencia.leerProducto();
		  		int indice = buscarProducto(producto.getCodigoProducto(),productos);
		  		if(indice != -1){
		  			encontrado = productos.get(indice);}
		  		else{
		  		JOptionPane.showMessageDialog(null, "No ha registrado su producto");
		  		encontrado = null;}
		  		return encontrado;}
	

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public int getNitProveedorProducto() {
		return nitProveedorProducto;
	}

	public void setNitProveedorProducto(int nitProveedorProducto) {
		this.nitProveedorProducto = nitProveedorProducto;
	}

	public int getPrecioCompraProducto() {
		return precioCompraProducto;
	}

	public void setPrecioCompraProducto(int precioCompraProducto) {
		this.precioCompraProducto = precioCompraProducto;
	}

	public int getPrecioVentaProducto() {
		return precioVentaProducto;
	}

	public void setPrecioVentaProducto(int precioVentaProducto) {
		this.precioVentaProducto = precioVentaProducto;
	}

}
