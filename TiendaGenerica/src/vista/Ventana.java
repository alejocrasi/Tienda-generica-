package vista;

import java.awt.BorderLayout;


import javax.swing.JFrame;

import controlador.Controlador;

public class Ventana extends JFrame {
	private PanelClientes panelClientes;
	private PanelTienda panelTienda;
	private PanelProveedores panelProveedores;
	private PanelProductos panelProductos ;
	private Controlador controlador;
	
	public final static String ACTUALIZAR_TIENDA = "tienda";
	
	public Ventana(Controlador pcontrolador) {
		controlador =pcontrolador;
		setTitle("TIENDA GENERICA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(750,200);
		
		setLayout(new BorderLayout());
		
		
		panelTienda = new PanelTienda(this);
		panelTienda.getBtnActualizar().addActionListener(controlador);
		
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
