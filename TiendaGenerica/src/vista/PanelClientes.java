package vista;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import org.omg.CORBA.PolicyHolder;

public class PanelClientes extends JPanel {
	private JButton btnAgregar;
	private JButton btnActualizar;
	private JButton btnLeer;
	private JButton btnBorrar;
	
	private JTextField  txtnombre;
	private JTextField  txtcedula;
	private JTextField  txtdireccion;
	private JTextField  txttelefono;
	private JTextField  txtcorreo;
	
	private JLabel  lbnombre;
	private JLabel  lbcedula;
	private JLabel  lbdireccion;
	private JLabel  lbtelefono;
	private JLabel  lbcorreo;
	
	private JTable tabla;
	
	private String [][]datos= {{"", "", "","",""}};
	private String []cabe = {"Nombre", "Cedula", "direccion","telefono","correo"};
	
	
	private Ventana vista;

	public  PanelClientes(Ventana pvista) {
		vista = pvista;
		setLayout(null);
		setBorder(new TitledBorder("Clientes"));
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setActionCommand(vista.ACTUALIZAR_CLIENTE);

		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setActionCommand(vista.AGREGAR_CLIENTE);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setActionCommand(vista.BORRAR_CLIENTE);
		
		btnLeer = new JButton("leer");
		btnLeer.setActionCommand(vista.LEER_CLIENTE);
		
		
		txtnombre = new JTextField("");
		txtcedula = new JTextField("");
		txtdireccion = new JTextField("");
		txttelefono = new JTextField("");
		txtcorreo = new JTextField("");
		
		lbnombre = new JLabel("nombre:");
		lbcedula = new JLabel("cedula:");
		lbdireccion = new JLabel("direccion:");
		lbtelefono = new JLabel("telefono:");
		lbcorreo = new JLabel("correo :");
		
		int y = 30;
		int x = 10;
		
		
		add(lbnombre);
		lbnombre.setBounds(x, y, 120, 20);
		add(txtnombre);
		txtnombre.setBounds(x*7, y, 290, 20);
		
		add(lbcedula);
		lbcedula.setBounds(x, y*2, 290, 20);
		add(txtcedula);
		txtcedula.setBounds(x*7, y*2, 290, 20);
		
		add(lbdireccion);	
		lbdireccion.setBounds(x, y*3, 290, 20);
		add(txtdireccion);
		txtdireccion.setBounds(x*7, y*3, 290, 20);
		
		add(lbtelefono);	
		lbtelefono.setBounds(x, y*4, 290, 20);
		add(txttelefono);
		txttelefono.setBounds(x*7, y*4, 290, 20);
		
		add(lbcorreo);
		lbcorreo.setBounds(x, y*5, 290, 20);
		add(txtcorreo);
		txtcorreo.setBounds(x*7, y*5, 290, 20);
		
		JLabel label = new JLabel();
		label.setIcon( new ImageIcon("./dato/imagenes/cliente.png"));
		add(label);
		label.setBounds(x*37, y, 140, 140);

		
		JPanel boton = new JPanel();
		boton.setBounds(x, y*6,490, 50);
		add(boton);
		
		boton.add(btnAgregar);
		boton.add(btnActualizar);
		boton.add(btnBorrar);
		boton.add(btnLeer);
		
		
		
		tabla = new JTable(datos,cabe);
		JScrollPane tab = new JScrollPane(tabla);
		tab.setBounds(x, y*8,500, 150);
		add(tab);
		
		
	}

	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}

	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	public void setBtnActualizar(JButton btnActualizar) {
		this.btnActualizar = btnActualizar;
	}

	public JButton getBtnLeer() {
		return btnLeer;
	}

	public void setBtnLeer(JButton btnLeer) {
		this.btnLeer = btnLeer;
	}

	public JButton getBtnBorrar() {
		return btnBorrar;
	}

	public void setBtnBorrar(JButton btnBorrar) {
		this.btnBorrar = btnBorrar;
	}

	public JTextField getTxtnombre() {
		return txtnombre;
	}

	public void setTxtnombre(JTextField txtnombre) {
		this.txtnombre = txtnombre;
	}

	public JTextField getTxtcedula() {
		return txtcedula;
	}

	public void setTxtcedula(JTextField txtcedula) {
		this.txtcedula = txtcedula;
	}

	public JTextField getTxtdireccion() {
		return txtdireccion;
	}

	public void setTxtdireccion(JTextField txtdireccion) {
		this.txtdireccion = txtdireccion;
	}

	public JTextField getTxttelefono() {
		return txttelefono;
	}

	public void setTxttelefono(JTextField txttelefono) {
		this.txttelefono = txttelefono;
	}

	public JTextField getTxtcorreo() {
		return txtcorreo;
	}

	public void setTxtcorreo(JTextField txtcorreo) {
		this.txtcorreo = txtcorreo;
	}

	
}
