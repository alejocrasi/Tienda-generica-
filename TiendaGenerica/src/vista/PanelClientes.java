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
		setLayout(new GridLayout (1,3));
		setBorder(new TitledBorder("Panel  Clientes"));
		
		btnActualizar = new JButton("btnActualizar");
		btnActualizar.setActionCommand(vista.ACTUALIZAR_CLIENTE);

		
		btnAgregar = new JButton("btnAgregar");
		btnActualizar.setActionCommand(vista.ACTUALIZAR_CLIENTE);

		
		btnBorrar = new JButton("btnBorrar");

		
		
		add(btnAgregar);
		add(btnActualizar);
		add(btnBorrar);
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

	public JButton getBtnBorrar() {
		return btnBorrar;
	}

	public void setBtnBorrar(JButton btnBorrar) {
		this.btnBorrar = btnBorrar;
	}
	

}
