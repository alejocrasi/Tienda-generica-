package vista;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.print.DocFlavor.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
    private JButton btnSalir;
    private JLabel lbImagen;
       
           
	
	public final static String ACTUALIZAR_TIENDA = "tieergnda";
	public static final String ACTUALIZAR_CLIENTE = "clisfbegn";
	public static final String AGREGAR_CLIENTE = "clieertnagre";
	public static final String BORRAR_CLIENTE = "clienerboorr";
	public static final String LEER_CLIENTE = "clienleeer";
	
	public static final String ACTUALIZAR_PROVEEDOR = "cl35tien";
	public static final String AGREGAR_PROVEEDOR = "aergertaerg";
	public static final String BORRAR_PROVEEDOR = "1ert";
	public static final String LEER_PROVEEDOR = "2ert";
	
	public static final String ACTUALIZAR_PRODUCTO = "3ert";
	public static final String AGREGAR_PRODUCTO = "4ert";
	public static final String BORRAR_PRODUCTO = "245";
	public static final String LEER_PRODUCTO = "6wrf";
	
	
	
	


	
	public Ventana(Controlador pcontrolador) {
		controlador =pcontrolador;
		setTitle("TIENDA GENERICA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000,500);
		
		setLayout(new BorderLayout());
		
		
		  
		JLabel label = new JLabel();
		label.setIcon( new ImageIcon("C:/Users/alejo/git/Tienda-generica-/TiendaGenerica/dato/tienda.jpg"));
		add(label, BorderLayout.WEST);
		
		btnSalir = new JButton("salir");
		btnSalir.addActionListener(controlador);
		btnSalir.setActionCommand("salir");
		
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
		
		
		
		add(btnSalir,BorderLayout.SOUTH);
		
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
