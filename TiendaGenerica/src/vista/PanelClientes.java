package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelClientes extends JPanel {
	private JButton btnAgregar;
	private JButton btnActualizar;
	private JButton btnBorrar;

	
	
	public  PanelClientes() {
	
		setLayout(new GridLayout (1,3));
		setBorder(new TitledBorder("Panel Clientes"));
		
		btnActualizar = new JButton("btnActualizar");
		btnAgregar = new JButton("btnAgregar");
		btnBorrar = new JButton("btnBorrar");

		
		
		add(btnAgregar);
		add(btnActualizar);
		add(btnBorrar);
	}

}
