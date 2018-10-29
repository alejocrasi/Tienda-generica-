package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelTienda extends JPanel {
	
	private JLabel lbNombreTienda;
	private JButton btnActualizar;
	private JTextField  txtnombreTienda;
	private JTextField  txttipoTienda;
	private JTextField  txtNITtienda;
	private JTextField  txtciudad;
	private JTextField  txtIVA;
	private JTextField  txttasaInteres;
	private JTextField  txtnombreBanco;
	private JTextField  txtnumCuentaCorriente;
	private JTextField  txtgerente;

	private Ventana vista;
	 

	
	
	public PanelTienda(Ventana pVista) {
		vista = pVista;
		setLayout(new GridLayout (11,1));
		setBorder(new TitledBorder("Tienda"));
		
		txtnombreTienda = new JTextField("nombre de la tienda");
		txttipoTienda = new JTextField("tipo de  tienda");
		txtNITtienda = new JTextField("NIT de la tienda");
		txtciudad = new JTextField("Ciudad de la tienda");
		txtIVA = new JTextField("nombre de la tienda");
		txttasaInteres = new JTextField("nombre de la tienda");
		txtnombreBanco = new JTextField("nombre de la tienda");
		txtnumCuentaCorriente= new JTextField("nombre de la tienda");
		txtgerente= new JTextField("nombre de la tienda");

		
		lbNombreTienda = new JLabel("INGRESE DATOS DE LA TIENDA");
		btnActualizar = new JButton("btnActualizar");
		btnActualizar.setActionCommand(vista.ACTUALIZAR_TIENDA);
		
		
		add(lbNombreTienda);
		
		add(txtnombreTienda);
		add(btnActualizar);
	}




	public JLabel getLbNombreTienda() {
		return lbNombreTienda;
	}

	public void setLbNombreTienda(JLabel lbNombreTienda) {
		this.lbNombreTienda = lbNombreTienda;
	}

	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	public void setBtnActualizar(JButton btnActualizar) {
		this.btnActualizar = btnActualizar;
	}
	

}
