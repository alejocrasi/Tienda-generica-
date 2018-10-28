package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Tienda;
import vista.Ventana;

public class Controlador implements ActionListener {
	private Ventana vista ;
	private Tienda tienda;
	
	
	
	
	
	public Controlador() {
		vista  = new Ventana(this);
		tienda = new Tienda();
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
			String nombre = pedirDato("ingrese el nombre de la tienda");
			tienda.setNombreTienda(nombre);
			String tipo = pedirDato("ingrese el tipo de  tienda");
			tienda.setTipoTienda(tipo);
			int nittienda = Integer.parseInt(pedirDato("ingrese el NIT de la tienda"));
			tienda.setNITtienda(nittienda);
			String city = pedirDato("ingrese la ciudad de la tienda");
			tienda.setCiudad(city);
			int iva = Integer.parseInt(pedirDato("ingrese el IVA de la tienda"));
			tienda.setIVA(iva);
			int tasainteres = Integer.parseInt(pedirDato("ingrese la tasa de interes de la tienda"));
			tienda.setTasaInteres(tasainteres);
			String nomBanco = pedirDato("ingrese el nombre del banco de la tienda");
			tienda.setNombreBanco(nomBanco);
			int numCuenta = Integer.parseInt(pedirDato("ingrese el numero de cuenta corriente de la tienda"));
			tienda.setNumCuentaCorriente(numCuenta);
			String gerente = pedirDato("ingrese el gerente de la tienda");
			tienda.setGerente(gerente);
			
			mensaje(tienda.TiendaActual());
		}
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		Controlador c = new Controlador();
		
	}
}
