package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Cliente;
import modelo.Mundo;
import modelo.Producto;
import modelo.Proveedor;
import modelo.Tienda;
import vista.Ventana;

public class Controlador implements ActionListener {
	private Ventana vista ;
	private Tienda tienda;
	private Mundo mundo;
	private Cliente cliente;
	private Proveedor proveedor;
	private Producto producto;
	private Persistencia persis;
	
	
	
	
	
	public Controlador() {
		vista  = new Ventana(this);
		tienda = new Tienda();
		persis = new Persistencia();
		mundo = new Mundo(cliente);
		
		vista.setVisible(true);

	}
	
	
	
	public String pedirDato( String pmensaje) {
		String rta =JOptionPane.showInputDialog(pmensaje);
		return rta;
	}
	public void mensaje( String pmensaje) {
		JOptionPane.showMessageDialog(null, pmensaje);
		
	}
	
	

	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		
		if(comando.equals("salir")){
			vista.setVisible(false);
			vista.dispose();
			
		}
	if (e.getSource()==vista.getComprar()) {
		
		    vista.add(vista.getPanelcompra());
			vista.getPanelcompra().setVisible(true);
			vista.getPanelClientes().setVisible(false);
			vista.getPanelTienda().setVisible(false);
			vista.getPanelProductos().setVisible(false);
			vista.getPanelProveedores().setVisible(false);
			vista.getPanelVerifica().setVisible(false);

			vista.setVisible(true);
        	
        	
            
        }
		
		if (e.getSource()==vista.getCliente()) {
			
			vista.add(vista.getPanelClientes());
			vista.getPanelcompra().setVisible(false);
			vista.getPanelClientes().setVisible(true);
			vista.getPanelTienda().setVisible(false);
			vista.getPanelProductos().setVisible(false);
			vista.getPanelProveedores().setVisible(false);
			vista.getPanelVerifica().setVisible(false);

        	vista.setVisible(true);
        	
        	
            
        }
		if (e.getSource()==vista.getConfigTienda()) {
        	vista.add(vista.getPanelTienda());
        	vista.getPanelTienda().setVisible(true);
			vista.getPanelcompra().setVisible(false);
        	vista.getPanelClientes().setVisible(false);
			vista.getPanelProductos().setVisible(false);
			vista.getPanelProveedores().setVisible(false);
			vista.getPanelVerifica().setVisible(false);

        	vista.setVisible(true);

        }
		if (e.getSource()==vista.getProducto()) {
        	vista.add(vista.getPanelProductos());
        	vista.getPanelProductos().setVisible(true);
			vista.getPanelcompra().setVisible(false);
        	vista.getPanelClientes().setVisible(false);
			vista.getPanelTienda().setVisible(false);
			vista.getPanelProveedores().setVisible(false);
			vista.getPanelVerifica().setVisible(false);

        	vista.setVisible(true);
        }
		if (e.getSource()==vista.getProveedor()) {
        	vista.add(vista.getPanelProveedores());
        	vista.getPanelProveedores().setVisible(true);
        	vista.getPanelClientes().setVisible(false);
			vista.getPanelcompra().setVisible(false);
			vista.getPanelTienda().setVisible(false);
			vista.getPanelProductos().setVisible(false);
			vista.getPanelVerifica().setVisible(false);

        	vista.setVisible(true);
        }
		if (e.getSource()==vista.getPanelVerificar()) {
			vista.add(vista.getPanelVerifica());
			vista.getPanelVerifica().setVisible(true);
			vista.getPanelProveedores().setVisible(false);
        	vista.getPanelClientes().setVisible(false);
			vista.getPanelTienda().setVisible(false);
			vista.getPanelProductos().setVisible(false);
			vista.getPanelcompra().setVisible(false);

			vista.setVisible(true);
		}
		if (comando.equals(vista.ACEPTAR_COMPRA)){
			int i = 0;
			
			vista.getPanelcheque().setVisible(true);
			
			

			
		}
		if (comando.equals(vista.AGREGAR_PRODUCTO_COMPRA)){
			
			
			

			
		}
        
		if (comando.equals(vista.ACTUALIZAR_TIENDA)){
			String nombre = vista.getPanelTienda().getTxtnombreTienda().getText();
			tienda.setNombreTienda(nombre);
			String tipo = vista.getPanelTienda().getTxttipoTienda().getText();
			tienda.setTipoTienda(tipo);
			int nittienda = Integer.parseInt(vista.getPanelTienda().getTxtNITtienda().getText());
			tienda.setNITtienda(nittienda);
			String city = vista.getPanelTienda().getTxtciudad().getText();
			tienda.setCiudad(city);
			int iva = Integer.parseInt(vista.getPanelTienda().getTxtIVA().getText());
			tienda.setIVA(iva); 
			int tasainteres = Integer.parseInt(vista.getPanelTienda().getTxttasaInteres().getText());
			tienda.setTasaInteres(tasainteres);
			String nomBanco = vista.getPanelTienda().getTxtnombreBanco().getText();
			tienda.setNombreBanco(nomBanco);
			int numCuenta = Integer.parseInt(vista.getPanelTienda().getTxtnumCuentaCorriente().getText());
			tienda.setNumCuentaCorriente(numCuenta);
			String gerente = vista.getPanelTienda().getTxtgerente().getText();
			tienda.setGerente(gerente);
			
			mensaje(tienda.TiendaActual());}
		
		
		
		if (comando.equals(vista.AGREGAR_CLIENTE)){
			String nombre = vista.getPanelClientes().getTxtnombre().getText();
			int cedu ;
			try{ cedu = Integer.parseInt(vista.getPanelClientes().getTxtcedula().getText());
				}catch(NumberFormatException ex){
					  cedu =0;}
			String direc = vista.getPanelClientes().getTxtdireccion().getText();
			int tel;
			try{ tel = Integer.parseInt(vista.getPanelClientes().getTxttelefono().getText());
			}catch(NumberFormatException ex){
				  tel =0;}
			String correo = vista.getPanelClientes().getTxtcorreo().getText();
			cliente = new Cliente(nombre, cedu, direc, tel, correo);
			mundo = new Mundo(cliente);
		    boolean rta = mundo.getCliente().agregarCliente(nombre, cedu, direc, tel, correo);
		    if (rta == true)
				mensaje("su cliente fue agregado");
			else
			   mensaje("ERROR");}
		   
		    
		if(comando.equals(vista.ACTUALIZAR_CLIENTE))
		{
			
			String nombre = vista.getPanelClientes().getTxtnombre().getText();
			int cedu ;
			try{ cedu = Integer.parseInt(vista.getPanelClientes().getTxtcedula().getText());
				}catch(NumberFormatException ex){
					  cedu =0;}
			String direc = vista.getPanelClientes().getTxtdireccion().getText();
			int tel;
			try{ tel = Integer.parseInt(vista.getPanelClientes().getTxttelefono().getText());
			}catch(NumberFormatException ex){
				  tel =0;}
			String correo = vista.getPanelClientes().getTxtcorreo().getText();
		    cliente = new Cliente(nombre, cedu, direc, tel, correo);
		    mundo = new Mundo(cliente);
			mundo.getCliente().ActualizarCliente(cliente);}

		if(comando.equals(vista.BORRAR_CLIENTE))
		{	String nombre = vista.getPanelClientes().getTxtnombre().getText();
		int cedu ;
		try{ cedu = Integer.parseInt(vista.getPanelClientes().getTxtcedula().getText());
			}catch(NumberFormatException ex){
				  cedu =0;}
			String direc = vista.getPanelClientes().getTxtdireccion().getText();
			int tel;
			try{ tel = Integer.parseInt(vista.getPanelClientes().getTxttelefono().getText());
			}catch(NumberFormatException ex){
				  tel =0;}
			String correo = vista.getPanelClientes().getTxtcorreo().getText();
			cliente = new Cliente (nombre, cedu, direc, tel, correo);
			mundo = new Mundo(cliente);
			mundo.getCliente().eliminarCliente(cliente);}
		
		if(comando.equals(vista.LEER_CLIENTE))
		{	String nombre = vista.getPanelClientes().getTxtnombre().getText();
		int cedu ;
		try{ cedu = Integer.parseInt(vista.getPanelClientes().getTxtcedula().getText());
			}catch(NumberFormatException ex){
				  cedu =0;}
			String direc = vista.getPanelClientes().getTxtdireccion().getText();
			int tel;
			try{ tel = Integer.parseInt(vista.getPanelClientes().getTxttelefono().getText());
			}catch(NumberFormatException ex){
				  tel =0;}
			String correo = vista.getPanelClientes().getTxtcorreo().getText();
			cliente = new Cliente (nombre, cedu, direc, tel, correo);
			mundo = new Mundo(cliente);
			cliente = mundo.getCliente().leerCliente(cliente);
			vista.getPanelClientes().getTxtnombre().setText(cliente.getNombre());
			vista.getPanelClientes().getTxtdireccion().setText(cliente.getDireccion());
			vista.getPanelClientes().getTxttelefono().setText(Integer.toString(cliente.getTelefono()));
			vista.getPanelClientes().getTxtcorreo().setText(cliente.getCorreo());}
		
		
		
		
		if(comando.equals(vista.AGREGAR_PROVEEDOR)) {
			int NIT;
			try{  NIT = Integer.parseInt(vista.getPanelProveedores().getTxtNIT().getText());
			}catch(NumberFormatException ex){
				NIT =0;}
			String nombre = vista.getPanelProveedores().getTxtnombreProveedor().getText();
			String direccion = vista.getPanelProveedores().getTxtdireccion().getText();
			int telefono;
			try{telefono = Integer.parseInt(vista.getPanelProveedores().getTxttelefono().getText());
			}catch(NumberFormatException ex){
				telefono =0;}
			String ciudad = vista.getPanelProveedores().getTxtciudad().getText();
             Proveedor proveedor = new Proveedor(NIT, nombre, direccion, telefono, ciudad);
             mundo = new Mundo(proveedor);
				boolean rta = mundo.getProveedor().agregarProveedor(NIT, nombre, direccion, telefono, ciudad);		
			if (rta == true)
				mensaje("su Proveedor fue agregado");
			else
				mensaje("ERROR");}
		
	   if (e.getActionCommand().equals(vista.ACTUALIZAR_PROVEEDOR)){
		   int NIT;
			try{  NIT = Integer.parseInt(vista.getPanelProveedores().getTxtNIT().getText());
			}catch(NumberFormatException ex){
				NIT =0;}
			String nombre = vista.getPanelProveedores().getTxtnombreProveedor().getText();
			String direccion = vista.getPanelProveedores().getTxtdireccion().getText();
			int telefono;
			try{telefono = Integer.parseInt(vista.getPanelProveedores().getTxttelefono().getText());
			}catch(NumberFormatException ex){
				telefono =0;}
			String ciudad = vista.getPanelProveedores().getTxtciudad().getText();
			proveedor = new Proveedor(NIT, nombre, direccion, telefono, ciudad);
			mundo = new Mundo(proveedor);
			mundo.getProveedor().ActualizarProveedor(proveedor);
	   }
	   if(comando.equals(vista.BORRAR_PROVEEDOR)){
		   int NIT;
			try{  NIT = Integer.parseInt(vista.getPanelProveedores().getTxtNIT().getText());
			}catch(NumberFormatException ex){
				NIT =0;}
			String nombre = vista.getPanelProveedores().getTxtnombreProveedor().getText();
			String direccion = vista.getPanelProveedores().getTxtdireccion().getText();
			int telefono;
			try{telefono = Integer.parseInt(vista.getPanelProveedores().getTxttelefono().getText());
			}catch(NumberFormatException ex){
				telefono =0;}
			String ciudad = vista.getPanelProveedores().getTxtciudad().getText();
			proveedor = new Proveedor(NIT, nombre, direccion, telefono, ciudad);
			mundo = new Mundo(proveedor);
			mundo.getProveedor().eliminarProveedor(proveedor);
	   }
	   if(comando.equals(vista.LEER_PROVEEDOR)){
		  int NIT;
			try{  NIT = Integer.parseInt(vista.getPanelProveedores().getTxtNIT().getText());
			}catch(NumberFormatException ex){
				NIT =0;}
			String nombre = vista.getPanelProveedores().getTxtnombreProveedor().getText();
			String direccion = vista.getPanelProveedores().getTxtdireccion().getText();
			
	     int telefono;
			try{telefono = Integer.parseInt(vista.getPanelProveedores().getTxttelefono().getText());
			}catch(NumberFormatException ex){
				telefono =0;}
			
			String ciudad = vista.getPanelProveedores().getTxtciudad().getText();
			proveedor = new Proveedor(NIT, nombre, direccion, telefono, ciudad);
			mundo = new Mundo(proveedor);
			proveedor = mundo.getProveedor().leerProveedor(proveedor);		
			vista.getPanelProveedores().getTxtnombreProveedor().setText(proveedor.getNombreProveedor());
			vista.getPanelProveedores().getTxtdireccion().setText(proveedor.getDireccion());
			vista.getPanelProveedores().getTxttelefono().setText(Integer.toString(proveedor.getTelefono()));
			vista.getPanelProveedores().getTxtciudad().setText(proveedor.getCiudad());
	   }
	   
	   
	   
	  
	  if(comando.equals(vista.AGREGAR_PRODUCTO)){
		int codigoProducto;
		try{ codigoProducto = Integer.parseInt(vista.getPanelProductos().getTxtcodigoProducto().getText());
		}catch(NumberFormatException ex){
				codigoProducto =0;}
		
		  String nombreProducto = vista.getPanelProductos().getTxtnombreProducto().getText();
		  
		int nitProveedorProducto;
		try{ nitProveedorProducto = Integer.parseInt(vista.getPanelProductos().getTxtNITProveedor().getText());
		}catch(NumberFormatException ex){
				nitProveedorProducto =0;}
		
		int precioCompraProducto;
			try{ precioCompraProducto = Integer.parseInt(vista.getPanelProductos().getTxtPrecioCompraProducto().getText());
			}catch(NumberFormatException ex){
				precioCompraProducto =0;}
			
			int  precioVentaProducto;
			try{  precioVentaProducto = Integer.parseInt(vista.getPanelProductos().getTxtPrecioVentaProducto().getText());
			}catch(NumberFormatException ex){
				 precioVentaProducto =0;}
			
		  Producto producto = new Producto(codigoProducto, nombreProducto, nitProveedorProducto, precioCompraProducto, precioVentaProducto);
		  mundo = new Mundo(producto);
		  boolean rta = mundo.getProducto().agregarProducto(codigoProducto, nombreProducto, nitProveedorProducto, precioCompraProducto, precioVentaProducto);
		  if (rta == true)
				mensaje("su Producto fue agregado");
			else
				mensaje("ERROR");}
	
	if(comando.equals(vista.ACTUALIZAR_PRODUCTO)){
		int codigoProducto;
		try{ codigoProducto = Integer.parseInt(vista.getPanelProductos().getTxtcodigoProducto().getText());
		}catch(NumberFormatException ex){
				codigoProducto =0;}
		
		  String nombreProducto = vista.getPanelProductos().getTxtnombreProducto().getText();
		  
		int nitProveedorProducto;
		try{ nitProveedorProducto = Integer.parseInt(vista.getPanelProductos().getTxtNITProveedor().getText());
		}catch(NumberFormatException ex){
				nitProveedorProducto =0;}
		
		int precioCompraProducto;
			try{ precioCompraProducto = Integer.parseInt(vista.getPanelProductos().getTxtPrecioCompraProducto().getText());
			}catch(NumberFormatException ex){
				precioCompraProducto =0;}
			
			int  precioVentaProducto;
			try{  precioVentaProducto = Integer.parseInt(vista.getPanelProductos().getTxtPrecioVentaProducto().getText());
			}catch(NumberFormatException ex){
				 precioVentaProducto =0;}
			
		producto = new Producto(codigoProducto, nombreProducto, nitProveedorProducto, precioCompraProducto, precioVentaProducto);
		mundo = new Mundo(producto);
		mundo.getProducto().ActualizarProducto(producto);}
	
	if(comando.equals(vista.BORRAR_PRODUCTO)){
		int codigoProducto;
		try{ codigoProducto = Integer.parseInt(vista.getPanelProductos().getTxtcodigoProducto().getText());
		}catch(NumberFormatException ex){
				codigoProducto =0;}
		
		  String nombreProducto = vista.getPanelProductos().getTxtnombreProducto().getText();
		  
		int nitProveedorProducto;
		try{ nitProveedorProducto = Integer.parseInt(vista.getPanelProductos().getTxtNITProveedor().getText());
		}catch(NumberFormatException ex){
				nitProveedorProducto =0;}
		
		int precioCompraProducto;
			try{ precioCompraProducto = Integer.parseInt(vista.getPanelProductos().getTxtPrecioCompraProducto().getText());
			}catch(NumberFormatException ex){
				precioCompraProducto =0;}
			
			int  precioVentaProducto;
			try{  precioVentaProducto = Integer.parseInt(vista.getPanelProductos().getTxtPrecioVentaProducto().getText());
			}catch(NumberFormatException ex){
				 precioVentaProducto =0;}
			
		producto = new Producto(codigoProducto, nombreProducto, nitProveedorProducto, precioCompraProducto,  precioVentaProducto);
		mundo = new Mundo(producto);
		mundo.getProducto().eliminarProducto(producto);}
	
	if(comando.equals(vista.LEER_PRODUCTO)){
	
		int codigoProducto;
		try{ codigoProducto = Integer.parseInt(vista.getPanelProductos().getTxtcodigoProducto().getText());
		}catch(NumberFormatException ex){
				codigoProducto =0;}
		
		  String nombreProducto = vista.getPanelProductos().getTxtnombreProducto().getText();
		  
		int nitProveedorProducto;
		try{ nitProveedorProducto = Integer.parseInt(vista.getPanelProductos().getTxtNITProveedor().getText());
		}catch(NumberFormatException ex){
				nitProveedorProducto =0;}
		
		int precioCompraProducto;
			try{ precioCompraProducto = Integer.parseInt(vista.getPanelProductos().getTxtPrecioCompraProducto().getText());
			}catch(NumberFormatException ex){
				precioCompraProducto =0;}
			
			int  precioVentaProducto;
			try{  precioVentaProducto = Integer.parseInt(vista.getPanelProductos().getTxtPrecioVentaProducto().getText());
			}catch(NumberFormatException ex){
				 precioVentaProducto =0;}
					
			producto = new Producto(codigoProducto, nombreProducto, nitProveedorProducto, precioCompraProducto,  precioVentaProducto);
			mundo = new Mundo(producto);
			producto = mundo.getProducto().leerProducto(producto);
		
		vista.getPanelProductos().getTxtnombreProducto().setText(producto.getNombreProducto());
		vista.getPanelProductos().getTxtNITProveedor().setText(Integer.toString(producto.getNitProveedorProducto()));
		vista.getPanelProductos().getTxtPrecioCompraProducto().setText(Integer.toString(producto.getPrecioCompraProducto()));
		vista.getPanelProductos().getTxtPrecioVentaProducto().setText(Integer.toString(producto.getPrecioVentaProducto()));
		
	}
	
	if(comando.equals(vista.BUSCAR_CLIENTE)){
		int IDcliente = Integer.parseInt(vista.getPanelVerifica().getTxtCliente().getText());
		Cliente cliente = new Cliente("", IDcliente, "", 0, "");
		mundo = new Mundo(cliente);
		cliente = mundo.getCliente().leerCliente(cliente);
		vista.getPanelventa().getTxtCliente().setText(cliente.getNombre());
		vista.getPanelventa().getTxtIDcliente().setText(Integer.toString(cliente.getCedula()));
		if (cliente == null){
			JOptionPane.showMessageDialog(null, "Cliente no encontrado");}
		else{
				vista.add(vista.getPanelventa());
				vista.getPanelClientes().setVisible(false);
				vista.getPanelTienda().setVisible(false);
				vista.getPanelProductos().setVisible(false);
				vista.getPanelProveedores().setVisible(false);
				vista.getPanelVerifica().setVisible(false);
				vista.getPanelventa().setVisible(true);
	        	vista.setVisible(true);
		}}  
	}
	
	
	
	public static void main(String[] args) {
		Controlador c = new Controlador();
		
	}
}
