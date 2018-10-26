package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelTienda extends JPanel {
	private JButton btnAgregar;
	private JButton btnActualizar;
	private JButton btnBorrar;

	
	
	public PanelTienda() {
		
		setLayout(new GridLayout (1,3));
		setBorder(new TitledBorder("Panel Tienda"));
		
		btnActualizar = new JButton("btnActualizar");
		btnAgregar = new JButton("btnAgregar");
		btnBorrar = new JButton("btnBorrar");

		
		
		add(btnAgregar);
		add(btnActualizar);
		add(btnBorrar);
		
		
	}

}
