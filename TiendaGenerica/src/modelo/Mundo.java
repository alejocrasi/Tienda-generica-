package modelo;

import java.io.File;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import controlador.AdminPercisencia;


public class Mundo {
	private ArrayList<Cliente>clientes;
	private ArrayList<Proveedor>proveedores;
	private AdminPercisencia persistencia;
	private ArrayList<Producto>productos;
	
	public Mundo() {
		persistencia = new AdminPercisencia();
		clientes = new ArrayList<Cliente>();
		proveedores = new ArrayList<Proveedor>();
		productos = new ArrayList<Producto>();
		//persistencia.escribirCliente(new Cliente("", 0, "", 0, ""));
	}
	
	public boolean agregarCliente(String nombre, int cedula, String direccion, int telefono, String correo){
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
    	clientes=persistencia.leerCliente();
    	  int indice = buscarCliente(cliente.getCedula(), clientes);
    	  if (indice != -1 ) {
			clientes.remove(indice);
			persistencia.escribirCliente(clientes);}
    	  else{
    		  JOptionPane.showMessageDialog(null, "no se encontro el cliente");
    	  }
      }
    public Cliente leerCliente(Cliente cliente){
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
	public Boolean agregarProveedor(int NIT, String nombreProveedor, String direccion, int telefono, String ciudad){
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
		proveedores = persistencia.leerProveedor();
		int indice = buscarProveedor(proveedor.getNIT(), proveedores);
		if(indice != -1){
			proveedores.remove(indice);
			persistencia.escribirProveedor(proveedores);}
		else{
			JOptionPane.showMessageDialog(null, "No se pudo eliminar");}}
  	public Proveedor leerProveedor(Proveedor provedor){
  		proveedores = persistencia.leerProveedor();
  		Proveedor encontrado = null;
  		int indice = buscarProveedor(provedor.getNIT(), proveedores);
  		if(indice != -1){
  			encontrado = proveedores.get(indice);}
  		else{
  			JOptionPane.showMessageDialog(null,"No ha registrado a su proveedor");
  			encontrado = null;}
  		
  		return encontrado;}
    public boolean agregarProducto(int pCodigoProducto, String NombreProducto, int pNitProveedorProducto,int pPrecioCompraProducto, int pPrecioVentaProducto){
 	boolean agrego = false;
    	proveedores = persistencia.leerProveedor();
    	if(buscarProveedor(pNitProveedorProducto, proveedores)!= -1){
    		if(new File("C:\\data\\producto.out").exists()){
    			System.out.println("enter al if");
    			productos = persistencia.leerProducto();
    			if(buscarProducto(pNitProveedorProducto, productos) == -1){
    				Producto nuevo = new Producto(pCodigoProducto, NombreProducto, pNitProveedorProducto, pPrecioCompraProducto, pPrecioVentaProducto);
    				productos.add(nuevo);
    				persistencia.escribirProducto(productos);
    				agrego = true;}}
    		else{
    			System.out.println("entre al else");
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
  	public void ActualizarProducto(Producto producto){
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
  		productos = persistencia.leerProducto();
  		int indice = buscarProducto(producto.getCodigoProducto(), productos);
  		if(indice != -1){
  			productos.remove(indice);
  			persistencia.escribirProducto(productos);}
  	    else{
  	    	JOptionPane.showMessageDialog(null, "Primero cree su producto");}}
  	public Producto leerProducto(Producto producto){
  		Producto encontrado = null;
  		productos = persistencia.leerProducto();
  		int indice = buscarProducto(producto.getCodigoProducto(),productos);
  		if(indice != -1){
  			encontrado = productos.get(indice);}
  		else{
  		JOptionPane.showMessageDialog(null, "No ha registrado su producto");
  		encontrado = null;}
  		return encontrado;}

		
		
		public ArrayList<Cliente> getClientes() {
			return clientes;
		}

		public void setClientes(ArrayList<Cliente> clientes) {
			this.clientes = clientes;
		}

		public ArrayList<Proveedor> getProvedores() {
			return proveedores;
		}

		public void setProvedores(ArrayList<Proveedor> provedores) {
			this.proveedores = provedores;
		}

		public AdminPercisencia getPersistencia() {
			return persistencia;
		}
		public void setPersistencia(AdminPercisencia persistencia) {
			this.persistencia = persistencia;
		}

		public ArrayList<Proveedor> getProveedores() {
			return proveedores;
		}

		public void setProveedores(ArrayList<Proveedor> proveedores) {
			this.proveedores = proveedores;
		}

		public ArrayList<Producto> getProductos() {
			return productos;
		}

		public void setProductos(ArrayList<Producto> productos) {
			this.productos = productos;
		}
		
}

