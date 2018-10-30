package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

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
	
	private Ventana vista;

	public  PanelClientes(Ventana pvista) {
		vista = pvista;
		setLayout(new GridLayout (9,1));
		setBorder(new TitledBorder("Clientes"));
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setActionCommand(vista.ACTUALIZAR_CLIENTE);

		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setActionCommand(vista.AGREGAR_CLIENTE);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setActionCommand(vista.BORRAR_CLIENTE);
		
		btnLeer = new JButton("leer");
		btnLeer.setActionCommand(vista.LEER_CLIENTE);
		
		
		txtnombre = new JTextField("nombre del cliente");
		txtcedula = new JTextField("cedula del cliente");
		txtdireccion = new JTextField("direccion del cliente");
		txttelefono = new JTextField("telefono del cliente");
		txtcorreo = new JTextField("correo del cliente");
		
		add(txtnombre);
		add(txtcedula);
		add(txtdireccion);
		add(txttelefono);
		add(txtcorreo);



		
		
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
