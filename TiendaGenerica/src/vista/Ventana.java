package vista;

import java.awt.BorderLayout;


import javax.swing.JFrame;

public class Ventana extends JFrame {
	private PanelClientes panelClientes;
	private PanelTienda panelTienda;
	private PanelProveedores panelProveedores;
	private PanelProductos panelProductos ;
	
	public Ventana() {
		setTitle("TIENDA GENERICA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,400);
		
		setLayout(new BorderLayout());
		
		
		panelTienda = new PanelTienda();
		panelClientes = new PanelClientes();
		panelProveedores = new PanelProveedores();
		panelProductos = new PanelProductos();
		
		add(panelTienda, BorderLayout.NORTH);
		add(panelClientes, BorderLayout.CENTER);
		add(panelProveedores, BorderLayout.EAST);
		add(panelProductos, BorderLayout.SOUTH);
		
		setVisible(true);
		
	}
	

}
