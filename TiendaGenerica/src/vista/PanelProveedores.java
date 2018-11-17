package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelProveedores extends JPanel {
	private JButton btnAgregar;
	private JButton btnActualizar;
	private JButton btnLeer;
	private JButton btnBorrar;
	
	private JTextField  txtNIT;
	private JTextField  txtnombreProveedor;
	private JTextField  txtdireccion;
	private JTextField  txttelefono;
	private JTextField  txtciudad;
	
	private JLabel  lbNIT;
	private JLabel  lbnombreProveedor;
	private JLabel  lbdireccion;
	private JLabel  lbtelefono;
	private JLabel  lbciudad;
	
	private JTable tabla;
	
	private String [][]datos= {{"", "", "","",""}};
	private String []cabe = {"Nombre", "Cedula", "direccion","telefono","correo"};

	private Ventana vista;

	
	
	public  PanelProveedores(Ventana pvista) {
		vista = pvista;
	
		setLayout(null);
		setBorder(new TitledBorder("Panel proveedores"));
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setActionCommand(vista.ACTUALIZAR_PROVEEDOR);

		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setActionCommand(vista.AGREGAR_PROVEEDOR);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setActionCommand(vista.BORRAR_PROVEEDOR);
		
		btnLeer = new JButton("leer");
		btnLeer.setActionCommand(vista.LEER_PROVEEDOR);
		
		txtNIT = new JTextField(" ");
		txtnombreProveedor = new JTextField(" ");
		txtdireccion = new JTextField(" ");
		txttelefono = new JTextField(" ");
		txtciudad= new JTextField(" ");
		
		lbNIT = new JLabel("NIT :");
		lbnombreProveedor = new JLabel("nombre :");
		lbdireccion = new JLabel("direccion:");
		lbtelefono = new JLabel("telefono :");
		lbciudad= new JLabel("ciudad :");
		
		int y = 30;
		int x = 10;
		
		JLabel label = new JLabel();
		label.setIcon( new ImageIcon("./dato/imagenes/icono_proveedores.png"));
		add(label);
		label.setBounds(x*37, y, 130, 130);
		
		
		add(lbNIT);
		lbNIT.setBounds(x, y, 120, 20);
		add(txtNIT);
		txtNIT.setBounds(x*4, y, 320, 20);
		
		
		add(lbnombreProveedor);
		lbnombreProveedor.setBounds(x, y*2, 120, 20);
		add(txtnombreProveedor);
		txtnombreProveedor.setBounds(x*7, y*2, 290, 20);
		
		add(lbdireccion);
		lbdireccion.setBounds(x, y*3, 120, 20);
		add(txtdireccion);
		txtdireccion.setBounds(x*7, y*3,290, 20);
		
		add(lbtelefono);
		lbtelefono.setBounds(x, y*4, 120, 20);
		add(txttelefono);
		txttelefono.setBounds(x*7, y*4,290, 20);

		add(lbciudad);
		lbciudad.setBounds(x, y*5, 120, 20);
		add(txtciudad);
		txtciudad.setBounds(x*7, y*5,290, 20);
		
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



	public JTextField getTxtNIT() {
		return txtNIT;
	}



	public void setTxtNIT(JTextField txtNIT) {
		this.txtNIT = txtNIT;
	}



	public JTextField getTxtnombreProveedor() {
		return txtnombreProveedor;
	}



	public void setTxtnombreProveedor(JTextField txtnombreProveedor) {
		this.txtnombreProveedor = txtnombreProveedor;
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



	public JTextField getTxtciudad() {
		return txtciudad;
	}



	public void setTxtciudad(JTextField txtciudad) {
		this.txtciudad = txtciudad;
	}

}
