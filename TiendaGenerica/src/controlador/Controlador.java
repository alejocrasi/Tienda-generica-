package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Cliente;
import modelo.DetalleCompras;
import modelo.Librerias;
import modelo.Mundo;
import modelo.Producto;
import modelo.Proveedor;
import modelo.Tienda;
import modelo.Venta;
import vista.Ventana;

public class Controlador implements ActionListener {
	private Ventana vista ;
	private Tienda tienda;
	private Mundo mundo;
	private Cliente cliente;
	private Proveedor proveedor;
	private Producto producto;
	private Librerias lib;
	private Venta venta;
	private Persistencia persis;
	private ArrayList<DetalleCompras> detalleCompras;
	
	
	
	
	
	public Controlador() {
		vista  = new Ventana(this);
		tienda = new Tienda();
		persis = new Persistencia();
		mundo = new Mundo(cliente);
		lib = new Librerias(this);
		
		
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
			vista.getPanelventa().setVisible(false);
			vista.setSize(1000, 500);


			vista.setVisible(true);
        	
        	
            
        }
	if (e.getSource()==vista.getVender()) {
		
	    vista.add(vista.getPanelventa());
		vista.getPanelventa().setVisible(true);
		vista.getPanelClientes().setVisible(false);
		vista.getPanelTienda().setVisible(false);
		vista.getPanelProductos().setVisible(false);
		vista.getPanelProveedores().setVisible(false);
		vista.getPanelVerifica().setVisible(false);
		vista.setSize(1500, 500);
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
			vista.getPanelventa().setVisible(false);
			vista.setSize(1000, 500);

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
			vista.getPanelventa().setVisible(false);
			vista.setSize(1000, 500);

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
			vista.getPanelventa().setVisible(false);
			vista.setSize(1000, 500);

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
			vista.getPanelventa().setVisible(false);
			vista.setSize(1000, 500);

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
			vista.getPanelventa().setVisible(false);
			vista.setSize(1000, 500);

			vista.setVisible(true);
		}
		if (comando.equals(vista.ACEPTAR_COMPRA)){
			
			String [] nombre = new String[3];
			nombre[0] = "compra 1";
			nombre[1] = "compra 2";
			nombre[2] = "compra 3";
			
			int [] cantidad  = new int[3];
			//cantidad[0] = detalleCompras.get(0).getCantidad();
			//cantidad[1] = detalleCompras.get(1).getCantidad();
			//cantidad[2] = detalleCompras.get(2).getCantidad();
			cantidad[0] = 10;
			cantidad[1] = 10;
			cantidad[2] = 10;
			lib.libreria(nombre, cantidad);
			
			
			
			

			
		}
		if(comando.equals("acep")){
			vista.getPanelcheque().setVisible(true);
		}
		if (comando.equals(vista.AGREGAR_PRODUCTO_COMPRA)){
			int nITdelProv = Integer.parseInt(vista.getPanelcompra().getTxtNITdelProv().getText());
			int codigo =  Integer.parseInt(vista.getPanelcompra().getTxtcodigo().getText());
			int cantidad =  Integer.parseInt(vista.getPanelcompra().getTxtcodigo().getText());
			
			
			DetalleCompras compra = new DetalleCompras(cantidad, cantidad, cantidad);
			compra.agregarCompras(nITdelProv, codigo, cantidad);
			mensaje("se agrego");
			

			
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
			mundo = new Mundo(tienda);
			mundo.getTienda().ActualizarTienda(tienda);
		}
		
		if(comando.equals(vista.LEER_TIENDA)){
			System.out.println("leer");
			 tienda = tienda.leerTienda();
			 vista.getPanelTienda().getTxtnombreTienda().setText(tienda.getNombreTienda());
			 vista.getPanelTienda().getTxttipoTienda().setText(tienda.getTipoTienda());
			 vista.getPanelTienda().getTxtNITtienda().setText(Integer.toString(tienda.getNITtienda()));
			 vista.getPanelTienda().getTxtciudad().setText(tienda.getCiudad());
			 vista.getPanelTienda().getTxtIVA().setText(Integer.toString(tienda.getIVA())); 
			 vista.getPanelTienda().getTxttasaInteres().setText(Integer.toString(tienda.getTasaInteres()));
			 vista.getPanelTienda().getTxtnombreBanco().setText(tienda.getNombreBanco());
			 vista.getPanelTienda().getTxtnumCuentaCorriente().setText(Integer.toString(tienda.getNumCuentaCorriente()));
			 vista.getPanelTienda().getTxtgerente().setText (tienda.getGerente());
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
		vista.getPanelventa().getTxtCliente().setText(Integer.toString(cliente.getCedula()));
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
				vista.setSize(1500, 500);

	        	vista.setVisible(true);
		}
	}  
	
	if(comando.equals(vista.BUSCAR_PRODUCTO)){
		int NITproducto = Integer.parseInt(vista.getPanelventa().getTxtCodigoProducto().getText());
	    producto = new Producto(NITproducto,"", 0, 0, 0);
	    mundo = new Mundo(producto);
	    producto = mundo.getProducto().leerProducto(producto);
	    vista.getPanelventa().getTxtNombreProducto().setText(producto.getNombreProducto());
	    vista.getPanelventa().getTxtValorUnitario().setText(Integer.toString(producto.getPrecioVentaProducto()));
	}
	
	if(comando.equals(vista.CANTIDAD_PRODUCTO)){
		int cantidad = Integer.parseInt(vista.getPanelventa().getTxtCantidad().getText());
		int valorUnitario = Integer.parseInt(vista.getPanelventa().getTxtValorUnitario().getText());
		vista.getPanelventa().getTxtValorTotal().setText(Integer.toString(cantidad*valorUnitario));
	}
	
    if(comando.equals(vista.TOTALIZAR)){
    	int totalventa = Integer.parseInt(vista.getPanelventa().getTxtTotalVenta().getText());
    	tienda = new Tienda();
    	mundo = new Mundo(tienda);
    	tienda = mundo.getTienda().leerTienda();
    	vista.getPanelventa().getTxtIVA().setText(Integer.toString(tienda.getIVA()));
    	vista.getPanelventa().getTxtValorconIva().setText(Integer.toString(tienda.getIVA()*totalventa));	
    }
    
    if(comando.equals(vista.EFECTIVO_PRODUCTO)){
    	int codigoVenta = Integer.parseInt(vista.getPanelventa().getTxtCodigoVenta().getText());
    	int cedulaCliente = Integer.parseInt(vista.getPanelventa().getTxtIDcliente().getText());
    	int valorTotalventa = Integer.parseInt(vista.getPanelventa().getTxtTotalVenta().getText());
    	int valorIVA = Integer.parseInt(vista.getPanelventa().getTxtIVA().getText());
    	int valorTotalmasIVA = Integer.parseInt(vista.getPanelventa().getTxtValorconIva().getText());
    	venta = new Venta(codigoVenta, cedulaCliente, valorTotalventa, valorIVA, valorTotalmasIVA);
    	mundo = new Mundo(venta);  
    	mundo.getVenta().agregarVenta(codigoVenta, cedulaCliente, valorTotalventa, valorIVA, valorTotalmasIVA);
    }
    }
	
	
	
	


	public static void main(String[] args) {
		Controlador c = new Controlador();
		
	}
}
