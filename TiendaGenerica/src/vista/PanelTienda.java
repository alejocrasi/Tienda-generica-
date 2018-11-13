package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelTienda extends JPanel {
	
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
	private JLabel  lbnombreTienda;
	private JLabel  lbtipoTienda;
	private JLabel  lbNITtienda;
	private JLabel  lbciudad;
	private JLabel  lbIVA;
	private JLabel  lbtasaInteres;
	private JLabel  lbnombreBanco;
	private JLabel  lbnumCuentaCorriente;
	private JLabel  lbgerente;

	private Ventana vista;
	 

	
	

	public PanelTienda(Ventana pVista) {
		vista = pVista;
		
		setLayout(null);
		
		
		
		
		setBorder(new TitledBorder("Tienda"));
		
		txtnombreTienda = new JTextField(30);
		txttipoTienda = new JTextField(30);
		txtNITtienda = new JTextField(30);
		txtciudad = new JTextField(30);
		txtIVA = new JTextField(30);
		txttasaInteres = new JTextField(30);
		txtnombreBanco = new JTextField(30);
		txtnumCuentaCorriente= new JTextField(30);
		txtgerente= new JTextField(30);
		
		lbnombreTienda = new JLabel("Nombre:");
		lbtipoTienda = new JLabel("tipo:");
		lbNITtienda = new JLabel("NIT:");
		lbciudad = new JLabel("Ciudad:");
		lbIVA = new JLabel("IVA :");
		lbtasaInteres = new JLabel("taza de intereses :");
		lbnombreBanco = new JLabel("nombre del banco :");
		lbnumCuentaCorriente= new JLabel("numero de cuenta: ");
		lbgerente= new JLabel("nombre del gerente :");


		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setActionCommand(vista.ACTUALIZAR_TIENDA);
		
		
		int y = 30;
		int x = 10;
	
		add(lbnombreTienda);
		lbnombreTienda.setBounds(x, y, 120, 20);
		add(txtnombreTienda);
		txtnombreTienda.setBounds(x*7, y, 380, 20);
		
		add(lbtipoTienda);
		lbtipoTienda.setBounds(x, y*2, 120, 20);
		add(txttipoTienda);
		txttipoTienda.setBounds(x*7, y*2, 380, 20);
		
		add(lbNITtienda);
		lbNITtienda.setBounds(x, y*3, 120, 20);
		add(txtNITtienda);
		txtNITtienda.setBounds(x*7, y*3, 380, 20);

		add(lbciudad);
		lbciudad.setBounds(x, y*4, 120, 20);
		add(txtciudad);
		txtciudad.setBounds(x*7, y*4, 380, 20);

		add(lbIVA);
		lbIVA.setBounds(x, y*5, 120, 20);
		add(txtIVA);
		txtIVA.setBounds(x*7, y*5, 380, 20);

		add(lbtasaInteres);
		lbtasaInteres.setBounds(x, y*6, 120, 20);
		add(txttasaInteres);
		txttasaInteres.setBounds(x*12, y*6, 330, 20);

		add(lbnombreBanco);
		lbnombreBanco.setBounds(x, y*7, 120, 20);
		add(txtnombreBanco);
		txtnombreBanco.setBounds(x*12, y*7, 330, 20);

		add(lbnumCuentaCorriente);
		lbnumCuentaCorriente.setBounds(x, y*8, 120, 20);
		add(txtnumCuentaCorriente);
		txtnumCuentaCorriente.setBounds(x*12, y*8, 330, 20);
		
		add(lbgerente);
		lbgerente.setBounds(x, y*9, 120, 20);
		add(txtgerente);
		txtgerente.setBounds(x*13, y*9, 320, 20);
		
		
		btnActualizar.setBounds(x, y*10 ,100, 100);
		add(btnActualizar);
		
		
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
