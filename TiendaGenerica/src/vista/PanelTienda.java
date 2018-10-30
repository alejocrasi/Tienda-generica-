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
		txtIVA = new JTextField("IVA de la tienda");
		txttasaInteres = new JTextField("taza de intereses de la tienda");
		txtnombreBanco = new JTextField("nombre del banco de la tienda");
		txtnumCuentaCorriente= new JTextField("numero de cuenta corriente de la tienda");
		txtgerente= new JTextField("nombre del gerente de la tienda");

		
		lbNombreTienda = new JLabel("INGRESE DATOS DE LA TIENDA");
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setActionCommand(vista.ACTUALIZAR_TIENDA);
		
		
		add(lbNombreTienda);
		add(txtnombreTienda);
		add(txttipoTienda);
		add(txtNITtienda);
		add(txtciudad);
		add(txtIVA);
		add(txttasaInteres);
		add(txtnombreBanco);
		add(txtnumCuentaCorriente);
		add(txtgerente);
		
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




	public JTextField getTxtnombreTienda() {
		return txtnombreTienda;
	}




	public void setTxtnombreTienda(JTextField txtnombreTienda) {
		this.txtnombreTienda = txtnombreTienda;
	}




	public JTextField getTxttipoTienda() {
		return txttipoTienda;
	}




	public void setTxttipoTienda(JTextField txttipoTienda) {
		this.txttipoTienda = txttipoTienda;
	}




	public JTextField getTxtNITtienda() {
		return txtNITtienda;
	}




	public void setTxtNITtienda(JTextField txtNITtienda) {
		this.txtNITtienda = txtNITtienda;
	}




	public JTextField getTxtciudad() {
		return txtciudad;
	}




	public void setTxtciudad(JTextField txtciudad) {
		this.txtciudad = txtciudad;
	}




	public JTextField getTxtIVA() {
		return txtIVA;
	}




	public void setTxtIVA(JTextField txtIVA) {
		this.txtIVA = txtIVA;
	}




	public JTextField getTxttasaInteres() {
		return txttasaInteres;
	}




	public void setTxttasaInteres(JTextField txttasaInteres) {
		this.txttasaInteres = txttasaInteres;
	}




	public JTextField getTxtnombreBanco() {
		return txtnombreBanco;
	}




	public void setTxtnombreBanco(JTextField txtnombreBanco) {
		this.txtnombreBanco = txtnombreBanco;
	}




	public JTextField getTxtnumCuentaCorriente() {
		return txtnumCuentaCorriente;
	}




	public void setTxtnumCuentaCorriente(JTextField txtnumCuentaCorriente) {
		this.txtnumCuentaCorriente = txtnumCuentaCorriente;
	}




	public JTextField getTxtgerente() {
		return txtgerente;
	}




	public void setTxtgerente(JTextField txtgerente) {
		this.txtgerente = txtgerente;
	}




	

}
