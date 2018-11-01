package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
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

	private Ventana vista;

	
	
	public  PanelProveedores(Ventana pvista) {
		vista = pvista;
	
		setLayout(new GridLayout (9,1));
		setBorder(new TitledBorder("Panel proveedores"));
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setActionCommand(vista.ACTUALIZAR_PROVEEDOR);

		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setActionCommand(vista.AGREGAR_PROVEEDOR);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setActionCommand(vista.BORRAR_PROVEEDOR);
		
		btnLeer = new JButton("leer");
		btnLeer.setActionCommand(vista.LEER_PROVEEDOR);
		
		txtNIT = new JTextField("NIT del proveedor");
		txtnombreProveedor = new JTextField("nombre del proveedor");
		txtdireccion = new JTextField("direccion del proveedor");
		txttelefono = new JTextField("telefono del proveedor");
		txtciudad= new JTextField("ciudad del proveedor");

		
		add(txtNIT);
		add(txtnombreProveedor);
		add(txtdireccion);
		add(txttelefono);
		add(txtciudad);
		
		add(btnAgregar);
		add(btnActualizar);
		add(btnBorrar);
		add(btnLeer);
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
