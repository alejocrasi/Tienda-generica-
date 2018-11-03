package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controlador.Controlador;

public class Ventana extends JFrame {
	private PanelClientes panelClientes;
	private PanelTienda panelTienda;
	private PanelProveedores panelProveedores;
	private PanelProductos panelProductos ;
	private Controlador controlador;
	private JMenuBar menu;
    private JMenu paneles;
    private JMenuItem tienda,proveedor,producto,cliente;
    
       
           
	
	public final static String ACTUALIZAR_TIENDA = "tienda";
	public static final String ACTUALIZAR_CLIENTE = "clien";
	public static final String AGREGAR_CLIENTE = "clienagre";
	public static final String BORRAR_CLIENTE = "clienboorr";
	public static final String LEER_CLIENTE = "clienleeer";
	
	public static final String ACTUALIZAR_PROVEEDOR = "clien";
	public static final String AGREGAR_PROVEEDOR = "aergaerg";
	public static final String BORRAR_PROVEEDOR = "1";
	public static final String LEER_PROVEEDOR = "2";
	
	public static final String ACTUALIZAR_PRODUCTO = "3";
	public static final String AGREGAR_PRODUCTO = "4";
	public static final String BORRAR_PRODUCTO = "5";
	public static final String LEER_PRODUCTO = "6";
	
	
	
	


	
	public Ventana(Controlador pcontrolador) {
		controlador =pcontrolador;
		setTitle("TIENDA GENERICA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000,500);
		
		setLayout(new GridLayout (1,4));
		
		
		menu=new JMenuBar();
        setJMenuBar(menu);
        paneles=new JMenu("Opciones");
        menu.add(paneles);
        
        tienda=new JMenuItem("tienda");
        tienda.addActionListener(controlador);
        paneles.add(tienda);
        
        proveedor=new JMenuItem("proveedor");       
        paneles.add(proveedor);
        proveedor.addActionListener(controlador);

        producto=new JMenuItem("producto");
        paneles.add(producto); 
        producto.addActionListener(controlador);

        cliente=new JMenuItem("cliente");
        paneles.add(cliente); 
        cliente.addActionListener(controlador);
		
		panelTienda = new PanelTienda(this);
		panelTienda.getBtnActualizar().addActionListener(controlador);
		
		panelClientes = new PanelClientes(this);
		panelClientes.getBtnAgregar().addActionListener(controlador);
		panelClientes.getBtnBorrar().addActionListener(controlador);
		panelClientes.getBtnActualizar().addActionListener(controlador);
		
		panelProveedores = new PanelProveedores(this);
		panelProveedores.getBtnAgregar().addActionListener(controlador);
		panelProveedores.getBtnBorrar().addActionListener(controlador);
		panelProveedores.getBtnActualizar().addActionListener(controlador);
		panelProveedores.getBtnLeer().addActionListener(controlador);
		
		
		panelProductos = new PanelProductos(this);
		panelProductos.getBtnAgregar().addActionListener(controlador);
		panelProductos.getBtnBorrar().addActionListener(controlador);
		panelProductos.getBtnActualizar().addActionListener(controlador);
		panelProductos.getBtnLeer().addActionListener(controlador);
		
		
		
		add(panelTienda);
		add(panelClientes);
		add(panelProveedores);
		add(panelProductos);
		
		setVisible(true);
		
	}

	public JMenuBar getMenu() {
		return menu;
	}

	public void setMenu(JMenuBar menu) {
		this.menu = menu;
	}

	public JMenu getPaneles() {
		return paneles;
	}

	public void setPaneles(JMenu paneles) {
		this.paneles = paneles;
	}

	public JMenuItem getTienda() {
		return tienda;
	}

	public void setTienda(JMenuItem tienda) {
		this.tienda = tienda;
	}

	public JMenuItem getProveedor() {
		return proveedor;
	}

	public void setProveedor(JMenuItem proveedor) {
		this.proveedor = proveedor;
	}

	public JMenuItem getProducto() {
		return producto;
	}

	public void setProducto(JMenuItem producto) {
		this.producto = producto;
	}

	public JMenuItem getCliente() {
		return cliente;
	}

	public void setCliente(JMenuItem cliente) {
		this.cliente = cliente;
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
