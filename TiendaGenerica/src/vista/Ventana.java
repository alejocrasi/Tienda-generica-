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
	public static final String ACTUALIZAR_CLIENTE = "clien";

	
	public Ventana(Controlador pcontrolador) {
		controlador =pcontrolador;
		setTitle("TIENDA GENERICA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(750,200);
		
		setLayout(new BorderLayout());
		
		
		panelTienda = new PanelTienda(this);
		panelTienda.getBtnActualizar().addActionListener(controlador);
		
		panelClientes = new PanelClientes(this);
		panelClientes.getBtnActualizar().addActionListener(controlador);
		
		panelProveedores = new PanelProveedores(this);
		
		
		panelProductos = new PanelProductos(this);
		
		add(panelTienda, BorderLayout.NORTH);
		add(panelClientes, BorderLayout.CENTER);
		add(panelProveedores, BorderLayout.EAST);
		add(panelProductos, BorderLayout.SOUTH);
		
		setVisible(true);
		
	}

	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
	}

	public PanelClientes getPanelClientes() {
		return panelClientes;
	}

	public void setPanelClientes(PanelClientes panelClientes) {
		this.panelClientes = panelClientes;
	}

	public PanelTienda getPanelTienda() {
		return panelTienda;
	}

	public void setPanelTienda(PanelTienda panelTienda) {
		this.panelTienda = panelTienda;
	}

	public PanelProveedores getPanelProveedores() {
		return panelProveedores;
	}

	public void setPanelProveedores(PanelProveedores panelProveedores) {
		this.panelProveedores = panelProveedores;
	}

	public PanelProductos getPanelProductos() {
		return panelProductos;
	}

	public void setPanelProductos(PanelProductos panelProductos) {
		this.panelProductos = panelProductos;
	}
	
	

}
