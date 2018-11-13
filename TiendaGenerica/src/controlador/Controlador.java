package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Cliente;
import modelo.Mundo;
import modelo.Tienda;
import vista.Ventana;

public class Controlador implements ActionListener {
	private Ventana vista ;
	private Tienda tienda;
	private Mundo mundo;
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
		
		
		if (e.getSource()==vista.getCliente()) {
			
			vista.add(vista.getPanelClientes());
			vista.getPanelClientes().setVisible(true);
			vista.getPanelTienda().setVisible(false);
			vista.getPanelProductos().setVisible(false);
			vista.getPanelProveedores().setVisible(false);
        	vista.setVisible(true);
        	
        	
            
        }
		if (e.getSource()==vista.getTienda()) {
        	vista.add(vista.getPanelTienda());
        	vista.getPanelTienda().setVisible(true);
        	vista.getPanelClientes().setVisible(false);
			vista.getPanelProductos().setVisible(false);
			vista.getPanelProveedores().setVisible(false);
        	vista.setVisible(true);

        }
		if (e.getSource()==vista.getProducto()) {
        	vista.add(vista.getPanelProductos());
        	vista.getPanelProductos().setVisible(true);
        	vista.getPanelClientes().setVisible(false);
			vista.getPanelTienda().setVisible(false);
			vista.getPanelProveedores().setVisible(false);
        	vista.setVisible(true);
        }
		if (e.getSource()==vista.getProveedor()) {
        	vista.add(vista.getPanelProveedores());
        	vista.getPanelProveedores().setVisible(true);
        	vista.getPanelClientes().setVisible(false);
			vista.getPanelTienda().setVisible(false);
			vista.getPanelProductos().setVisible(false);
        	vista.setVisible(true);
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
			
			mensaje(tienda.TiendaActual());
			

			
		}
		
		if (comando.equals(vista.AGREGAR_CLIENTE)){
			String nombre = vista.getPanelClientes().getTxtnombre().getText();
			int cedu = Integer.parseInt(vista.getPanelClientes().getTxtcedula().getText());
			String direc = vista.getPanelClientes().getTxtdireccion().getText();
			int tel = Integer.parseInt(vista.getPanelClientes().getTxttelefono().getText());
			String correo = vista.getPanelClientes().getTxtcorreo().getText();
			
			boolean rta =mundo.agregarCliente(nombre, cedu, direc, tel, correo);
			
			if (rta == true){
				mensaje("su cliente fue agregado");
			}
			else
				mensaje("ERROR");

		}
		
		if(comando.equals(vista.BORRAR_CLIENTE)){
			int cedu = Integer.parseInt(pedirDato("ingrese cedula del cliente que desea eliminar"));
			
			boolean rta = mundo.eliminarCliente(cedu);
			if (rta ==true) {
				mensaje("el cliente con la cedula "+ cedu+" fue eliminado");
				
			}
			else
				mensaje("no se encontro el cliente");

			
		}
		
		
		if(comando.equals(vista.LEER_CLIENTE)){
			System.out.println("holi??");
			persis.leerCliente();

		
	}
		
		if(comando.equals(vista.AGREGAR_PROVEEDOR)) {
			int NIT = Integer.parseInt(vista.getPanelProveedores().getTxtNIT().getText());
			String nombre = vista.getPanelProveedores().getTxtnombreProveedor().getText();
			String direccion = vista.getPanelProveedores().getTxtdireccion().getText();
			int telefono = Integer.parseInt(vista.getPanelProveedores().getTxttelefono().getText());
			String ciudad = vista.getPanelProveedores().getTxtciudad().getText();
			
			boolean rta = mundo.agregarProveedor(NIT, nombre, direccion, telefono, ciudad);
			
			if (rta == true){
				mensaje("su Proveedor fue agregado");
				
			}
			else
				mensaje("ERROR");	
		}
	}
	
	
	
	public static void main(String[] args) {
		Controlador c = new Controlador();
		
	}
}
