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
	private AdminPercisencia persis;
	
	
	
	
	
	public Controlador() {
		vista  = new Ventana(this);
		tienda = new Tienda();
		persis = new AdminPercisencia();
		mundo = new Mundo();
		
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
			vista.setVisible(true);
        	
        	
            
        }
		
		
		if (e.getSource()==vista.getCliente()) {
			
			vista.add(vista.getPanelClientes());
			vista.getPanelcompra().setVisible(false);
			vista.getPanelClientes().setVisible(true);
			vista.getPanelTienda().setVisible(false);
			vista.getPanelProductos().setVisible(false);
			vista.getPanelProveedores().setVisible(false);
        	vista.setVisible(true);
        	
        	
            
        }
		if (e.getSource()==vista.getConfigTienda()) {
        	vista.add(vista.getPanelTienda());
        	vista.getPanelTienda().setVisible(true);
			vista.getPanelcompra().setVisible(false);
        	vista.getPanelClientes().setVisible(false);
			vista.getPanelProductos().setVisible(false);
			vista.getPanelProveedores().setVisible(false);
        	vista.setVisible(true);

        }
		if (e.getSource()==vista.getProducto()) {
        	vista.add(vista.getPanelProductos());
        	vista.getPanelProductos().setVisible(true);
			vista.getPanelcompra().setVisible(false);
        	vista.getPanelClientes().setVisible(false);
			vista.getPanelTienda().setVisible(false);
			vista.getPanelProveedores().setVisible(false);
        	vista.setVisible(true);
        }
		if (e.getSource()==vista.getProveedor()) {
        	vista.add(vista.getPanelProveedores());
        	vista.getPanelProveedores().setVisible(true);
        	vista.getPanelClientes().setVisible(false);
			vista.getPanelcompra().setVisible(false);
			vista.getPanelTienda().setVisible(false);
			vista.getPanelProductos().setVisible(false);
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
			int cedu = Integer.parseInt(vista.getPanelClientes().getTxtcedula().getText());
			String direc = vista.getPanelClientes().getTxtdireccion().getText();
			int tel = Integer.parseInt(vista.getPanelClientes().getTxttelefono().getText());
			String correo = vista.getPanelClientes().getTxtcorreo().getText();
			boolean rta =mundo.agregarCliente(nombre, cedu, direc, tel, correo);
			
			if (rta == true)
				mensaje("su cliente fue agregado");
			else
			   mensaje("ERROR");}
		if(comando.equals(vista.ACTUALIZAR_CLIENTE))
		{
			String nombre = vista.getPanelClientes().getTxtnombre().getText();
			int cedu = Integer.parseInt(vista.getPanelClientes().getTxtcedula().getText());
			String direc = vista.getPanelClientes().getTxtdireccion().getText();
			int tel = Integer.parseInt(vista.getPanelClientes().getTxttelefono().getText());
			String correo = vista.getPanelClientes().getTxtcorreo().getText();
		    cliente = new Cliente(nombre, cedu, direc, tel, correo);
			mundo.ActualizarCliente(cliente);}
		if(comando.equals(vista.BORRAR_CLIENTE))
		{
			String nombre = vista.getPanelClientes().getTxtnombre().getText();
			int cedu = Integer.parseInt(vista.getPanelClientes().getTxtcedula().getText());
			String direc = vista.getPanelClientes().getTxtdireccion().getText();
			int tel = Integer.parseInt(vista.getPanelClientes().getTxttelefono().getText());
			String correo = vista.getPanelClientes().getTxtcorreo().getText();
			cliente = new Cliente (nombre, cedu, direc, tel, correo);
			mundo.eliminarCliente(cliente);}
		if(comando.equals(vista.LEER_CLIENTE)){

			String nombre = vista.getPanelClientes().getTxtnombre().getText();
			int cedu = Integer.parseInt(vista.getPanelClientes().getTxtcedula().getText());
			String direc = vista.getPanelClientes().getTxtdireccion().getText();
			int tel = Integer.parseInt(vista.getPanelClientes().getTxttelefono().getText());
			String correo = vista.getPanelClientes().getTxtcorreo().getText();
			cliente = new Cliente (nombre, cedu, direc, tel, correo);
			cliente = mundo.leerCliente(cliente);
			vista.getPanelClientes().getTxtnombre().setText(cliente.getNombre());
			vista.getPanelClientes().getTxtdireccion().setText(cliente.getDireccion());
			vista.getPanelClientes().getTxttelefono().setText(Integer.toString(cliente.getTelefono()));
			vista.getPanelClientes().getTxtcorreo().setText(cliente.getCorreo());}
		
		
		
		
		
		if(comando.equals(vista.AGREGAR_PROVEEDOR)) {
			int NIT = Integer.parseInt(vista.getPanelProveedores().getTxtNIT().getText());
			String nombre = vista.getPanelProveedores().getTxtnombreProveedor().getText();
			String direccion = vista.getPanelProveedores().getTxtdireccion().getText();
			int telefono = Integer.parseInt(vista.getPanelProveedores().getTxttelefono().getText());
			String ciudad = vista.getPanelProveedores().getTxtciudad().getText();

				boolean rta = mundo.agregarProveedor(NIT, nombre, direccion, telefono, ciudad);
				
			if (rta == true)
				mensaje("su Proveedor fue agregado");
			else
				mensaje("ERROR");}
	   if (e.getActionCommand().equals(vista.ACTUALIZAR_PROVEEDOR)){
		   int NIT = Integer.parseInt(vista.getPanelProveedores().getTxtNIT().getText());
			String nombre = vista.getPanelProveedores().getTxtnombreProveedor().getText();
			String direccion = vista.getPanelProveedores().getTxtdireccion().getText();
			int telefono = Integer.parseInt(vista.getPanelProveedores().getTxttelefono().getText());
			String ciudad = vista.getPanelProveedores().getTxtciudad().getText();
			proveedor = new Proveedor(NIT, nombre, direccion, telefono, ciudad);
			mundo.ActualizarProveedor(proveedor);
	   }
	   if(comando.equals(vista.BORRAR_PROVEEDOR)){
		   int NIT = Integer.parseInt(vista.getPanelProveedores().getTxtNIT().getText());
			String nombre = vista.getPanelProveedores().getTxtnombreProveedor().getText();
			String direccion = vista.getPanelProveedores().getTxtdireccion().getText();
			int telefono = Integer.parseInt(vista.getPanelProveedores().getTxttelefono().getText());
			String ciudad = vista.getPanelProveedores().getTxtciudad().getText();
			proveedor = new Proveedor(NIT, nombre, direccion, telefono, ciudad);
			mundo.eliminarProveedor(proveedor);
	   }
	   if(comando.equals(vista.LEER_PROVEEDOR)){
		   int NIT = Integer.parseInt(vista.getPanelProveedores().getTxtNIT().getText());
			String nombre = vista.getPanelProveedores().getTxtnombreProveedor().getText();
			String direccion = vista.getPanelProveedores().getTxtdireccion().getText();
			int telefono = Integer.parseInt(vista.getPanelProveedores().getTxttelefono().getText());
			String ciudad = vista.getPanelProveedores().getTxtciudad().getText();
			proveedor = new Proveedor(NIT, nombre, direccion, telefono, ciudad);
			proveedor = mundo.leerProveedor(proveedor);		
			vista.getPanelProveedores().getTxtNIT().setText(Integer.toString(proveedor.getNIT()));
			vista.getPanelProveedores().getTxtnombreProveedor().setText(proveedor.getNombreProveedor());
			vista.getPanelProveedores().getTxtdireccion().setText(proveedor.getDireccion());
			vista.getPanelProveedores().getTxttelefono().setText(Integer.toString(proveedor.getTelefono()));
			vista.getPanelProveedores().getTxtciudad().setText(proveedor.getCiudad());
	   }
	   
	   
	   
	  
	  if(comando.equals(vista.AGREGAR_PRODUCTO)){
		  int codigoProducto = Integer.parseInt(vista.getPanelProductos().getTxtcodigoProducto().getText());
		  String nombreProducto = vista.getPanelProductos().getTxtnombreProducto().getText();
		  int nitProveedorProducto = Integer.parseInt(vista.getPanelProductos().getTxtNITProveedor().getText());
		  int precioCompraProducto = Integer.parseInt(vista.getPanelProductos().getTxtPrecioCompraProducto().getText());
		  int percioVentaProducto= Integer.parseInt(vista.getPanelProductos().getTxtPrecioVentaProducto().getText());
		  boolean rta = mundo.agregarProducto(codigoProducto, nombreProducto, nitProveedorProducto, precioCompraProducto, percioVentaProducto);
		  if (rta == true)
				mensaje("su Producto fue agregado");
			else
				mensaje("ERROR");}
	if(comando.equals(vista.ACTUALIZAR_PRODUCTO)){
		int codigoProducto = Integer.parseInt(vista.getPanelProductos().getTxtcodigoProducto().getText());
		String nombreProducto = vista.getPanelProductos().getTxtnombreProducto().getText();
		int nitProveedorProducto = Integer.parseInt(vista.getPanelProductos().getTxtNITProveedor().getText());
		int precioCompraProducto = Integer.parseInt(vista.getPanelProductos().getTxtPrecioCompraProducto().getText());
		int precioVentaProducto = Integer.parseInt(vista.getPanelProductos().getTxtPrecioVentaProducto().getText());
		producto = new Producto(codigoProducto, nombreProducto, nitProveedorProducto, precioCompraProducto, precioVentaProducto);
		mundo.ActualizarProducto(producto);}
	if(comando.equals(vista.BORRAR_PRODUCTO)){
		int codigoProducto = Integer.parseInt(vista.getPanelProductos().getTxtcodigoProducto().getText());
		String nombreProducto = vista.getPanelProductos().getTxtnombreProducto().getText();
		int nitProveedorProducto = Integer.parseInt(vista.getPanelProductos().getTxtNITProveedor().getText());
		int precioCompraProducto = Integer.parseInt(vista.getPanelProductos().getTxtPrecioCompraProducto().getText());
		int precioVentaProducto = Integer.parseInt(vista.getPanelProductos().getTxtPrecioVentaProducto().getText());
		producto = new Producto(codigoProducto, nombreProducto, nitProveedorProducto, precioCompraProducto, precioVentaProducto);
		mundo.eliminarProducto(producto);}
	if(comando.equals(vista.LEER_PRODUCTO)){
		
		int codigoProducto = Integer.parseInt(vista.getPanelProductos().getTxtcodigoProducto().getText());
		String nombreProducto = vista.getPanelProductos().getTxtnombreProducto().getText();
		int nitProveedorProducto = Integer.parseInt(vista.getPanelProductos().getTxtNITProveedor().getText());
		int precioCompraProducto = Integer.parseInt(vista.getPanelProductos().getTxtPrecioCompraProducto().getText());
		int precioVentaProducto = Integer.parseInt(vista.getPanelProductos().getTxtPrecioVentaProducto().getText());
		
			producto = new Producto(codigoProducto, nombreProducto, nitProveedorProducto, precioCompraProducto, precioVentaProducto);
			producto = mundo.leerProducto(producto);
		
		vista.getPanelProductos().getTxtnombreProducto().setText(producto.getNombreProducto());
		vista.getPanelProductos().getTxtNITProveedor().setText(Integer.toString(producto.getNitProveedorProducto()));
		vista.getPanelProductos().getTxtPrecioCompraProducto().setText(Integer.toString(producto.getPrecioCompraProducto()));
		vista.getPanelProductos().getTxtPrecioVentaProducto().setText(Integer.toString(producto.getPrecioVentaProducto()));
		
	}
	}
	
	
	
	public static void main(String[] args) {
		Controlador c = new Controlador();
		
	}
}
