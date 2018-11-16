package vista;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controlador.Controlador;

public class panelCheque extends JFrame{
	private Controlador controlador;
	private JLabel nomBanco;
	private JLabel numCheque;
	private JLabel fecha;
	private JLabel laOrden;
	private JLabel laSuma;
	private JLabel firma;
	private JLabel codigo;
	
	private JTextField montoNumero;
	private JTextField orden;
	private JTextField montoletras;








	public panelCheque(Controlador pcontrolador) {
		controlador =pcontrolador;
		setTitle("cheque");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(600,200);
		setLayout(null);
		
		
		int random = (int) (Math.random()*10000)+1;
		
		nomBanco = new JLabel("Banco");
		numCheque = new JLabel("CHEQUE No. 1000" + random);
		fecha = new JLabel("16"+"/"+"12"+"/"+"2018"+"  $");
		laOrden = new JLabel("PAGESE A LA ORDEN DE:");
		laSuma = new JLabel("LA SUMA  DE: ");
		firma = new JLabel("firma");
		codigo = new JLabel("356798"+random);
		JLabel linea = new JLabel("_______________________");

		montoNumero = new JTextField();
		orden = new JTextField();
		montoletras = new JTextField();
		

		
		
		int y = 30;
		int x = 10;
		
		add(nomBanco);
		nomBanco.setBounds(x, 20, 200, 20);
		add(numCheque);
		numCheque.setBounds(x*40, 10, 200, 20);
		add(fecha);
		fecha.setBounds(x*32, y, 200, 20);
		add(laOrden);
		laOrden.setBounds(x, y*2, 200, 20);
		add(montoNumero).setBounds(x*40, y, 150, 20);
		add(orden).setBounds(x*16, y*2, 400, 20);
		add(laSuma).setBounds(x, y*3, 200, 20);
		add(montoletras).setBounds(x*10, y*3, 460, 20);
		add(linea).setBounds(x*27, 110, 200, 20);
		add(firma).setBounds(x*34, 130, 200, 20);
		add(codigo).setBounds(x*7, y*4, 200, 20);


		
	}
	


	
	public JLabel getNomBanco() {
		return nomBanco;
	}




	public void setNomBanco(JLabel nomBanco) {
		this.nomBanco = nomBanco;
	}




	public JLabel getNumCheque() {
		return numCheque;
	}




	public void setNumCheque(JLabel numCheque) {
		this.numCheque = numCheque;
	}




	public JLabel getFecha() {
		return fecha;
	}




	public void setFecha(JLabel fecha) {
		this.fecha = fecha;
	}




	public JLabel getLaOrden() {
		return laOrden;
	}




	public void setLaOrden(JLabel laOrden) {
		this.laOrden = laOrden;
	}




	public JLabel getLaSuma() {
		return laSuma;
	}




	public void setLaSuma(JLabel laSuma) {
		this.laSuma = laSuma;
	}




	public JLabel getFirma() {
		return firma;
	}




	public void setFirma(JLabel firma) {
		this.firma = firma;
	}




	public JLabel getCodigo() {
		return codigo;
	}




	public void setCodigo(JLabel codigo) {
		this.codigo = codigo;
	}




	public JTextField getMontoNumero() {
		return montoNumero;
	}




	public void setMontoNumero(JTextField montoNumero) {
		this.montoNumero = montoNumero;
	}




	public JTextField getOrden() {
		return orden;
	}




	public void setOrden(JTextField orden) {
		this.orden = orden;
	}




	public JTextField getMontoletras() {
		return montoletras;
	}




	public void setMontoletras(JTextField montoletras) {
		this.montoletras = montoletras;
	}



		
	}

