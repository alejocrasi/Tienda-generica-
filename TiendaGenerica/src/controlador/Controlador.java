package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Mundo;
import modelo.Tienda;
import vista.Ventana;

public class Controlador implements ActionListener {
	private Ventana vista ;
	private Tienda tienda;
	private Mundo mundo;
	
	
	
	
	
	public Controlador() {
		vista  = new Ventana(this);
		tienda = new Tienda();
		mundo = new Mundo();
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
			
			if (rta == true)
				mensaje("su cliente fue agregado");
			else
				mensaje("ERROR");

		}
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
				mensaje("ERROR");
			
			

			
			
			
			
		}
		
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		Controlador c = new Controlador();
		
	}
}
