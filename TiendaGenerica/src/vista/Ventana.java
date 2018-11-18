package vista;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
	private panelCheque panelcheque;
	private panelCompra panelcompra;
	private PanelVerificarCliente PanelVerifica;
	private PanelVentas panelventa;

	private Controlador controlador;
	private JMenuBar menu;
    private JMenu paneles,ventas,compras,tienda;
    private JMenuItem proveedor,producto,cliente,vender,comprar, configTienda,PanelVerificar;
    private JButton btnSalir;
    private JLabel lbImagen;
       
           
    public final static String ACTUALIZAR_TIENDA = "13241sdc234";
	public final static String LEER_TIENDA = "w4545yv";
	
	public static final String ACTUALIZAR_CLIENTE = "asccfsdhg";
	public static final String AGREGAR_CLIENTE = "servgcv";
	public static final String BORRAR_CLIENTE = "awvshst";
	public static final String LEER_CLIENTE = "eshvyrt";
	
	public static final String ACTUALIZAR_PROVEEDOR = "cl35tien";
	public static final String AGREGAR_PROVEEDOR = "aergertaerg";
	public static final String BORRAR_PROVEEDOR = "1eraxsdft";
	public static final String LEER_PROVEEDOR = "dyhgfh";
	
	public static final String ACTUALIZAR_PRODUCTO = "asd";
	public static final String AGREGAR_PRODUCTO = "3aasdsdasd5674";
	public static final String BORRAR_PRODUCTO = "234asdd526";
	public static final String LEER_PRODUCTO = "23gf4asd5";
	
	public static final String ACEPTAR_COMPRA = "sdfsdfsg";
	public static final String AGREGAR_PRODUCTO_COMPRA = "sgdsdf";
	
	public static final String BUSCAR_PRODUCTO = "wefwe";
	public static final String TOTALIZAR = "werwrefsd";
	
	public static final String BUSCAR_CLIENTE = "sdgsf";

	
	public static final String ELIMINAR_PRODUCTO = "3pp";
	public static final String CANTIDAD_PRODUCTO = "20pp";
	public static final String EFECTIVO_PRODUCTO = "21pp";
	public static final String CUOTAS_PRODUCTO = "22pp";
	
	
	public static final String AGREGAR_PRODUCTOS ="25pp";


	
	

	
	public Ventana(Controlador pcontrolador) {
		controlador =pcontrolador;
		setTitle("TIENDA GENERICA");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000,500);
		
		setLayout(new BorderLayout());
		
		
		  
		JLabel label = new JLabel();
		label.setIcon( new ImageIcon("./dato/imagenes/logo.png"));
		add(label, BorderLayout.WEST);
		
		
		
		
		 
		
		btnSalir = new JButton("salir");
		btnSalir.addActionListener(controlador);
		btnSalir.setActionCommand("salir");
		
		menu=new JMenuBar();
        setJMenuBar(menu);
        
        paneles=new JMenu("Opciones de creacion");
        menu.add(paneles);
        
        
        ventas=new JMenu("Ventas");
        menu.add(ventas);
        
        
        compras =new JMenu("Compras");
        menu.add(compras);
        
        tienda=new JMenu("tienda");
        menu.add(tienda);
        
        
        
        comprar=new JMenuItem("comprar");
        comprar.addActionListener(controlador);
        compras.add(comprar);
        
        PanelVerificar = new JMenuItem("ventas");
        ventas.add(PanelVerificar);
        PanelVerificar.addActionListener(controlador);
       
        configTienda = new JMenuItem("configurar la Tienda");
        configTienda.addActionListener(controlador);
        tienda.add(configTienda);
        
        proveedor=new JMenuItem("proveedor");       
        paneles.add(proveedor);
        proveedor.addActionListener(controlador);

        producto=new JMenuItem("producto");
        paneles.add(producto); 
        producto.addActionListener(controlador);

        cliente=new JMenuItem("cliente");
        paneles.add(cliente); 
        cliente.addActionListener(controlador);
        
        panelcheque = new panelCheque(controlador);
        
		
		panelTienda = new PanelTienda(this);
		panelTienda.getBtnActualizar().addActionListener(controlador);
		panelTienda.getBtnLeer().addActionListener(controlador);
		
		panelClientes = new PanelClientes(this);
		panelClientes.getBtnAgregar().addActionListener(controlador);
		panelClientes.getBtnBorrar().addActionListener(controlador);
		panelClientes.getBtnActualizar().addActionListener(controlador);
		panelClientes.getBtnLeer().addActionListener(controlador);
		
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
		
		panelcompra =  new panelCompra(this);
		panelcompra.getBtnAceptar().addActionListener(controlador);
		panelcompra.getBtnAgregarproducto().addActionListener(controlador);
		
		panelventa = new PanelVentas(this);
		panelventa.getBtnProducto().addActionListener(controlador);
		panelventa.getBtnTotalizar().addActionListener(controlador);
		panelventa.getBtnEliminarP().addActionListener(controlador);
		panelventa.getTxtCantidad().addActionListener(controlador);
		panelventa.getBtnEfectivo().addActionListener(controlador);
		panelventa.getBtnCuotas().addActionListener(controlador);
		
		PanelVerifica = new PanelVerificarCliente(this);
		PanelVerifica.getBtnCliente().addActionListener(controlador);
		
		add(btnSalir,BorderLayout.SOUTH);
		
		setVisible(true);
		
		
		
	}
	






	






	public PanelVentas getPanelventa() {
		return panelventa;
	}














	public void setPanelventa(PanelVentas panelventa) {
		this.panelventa = panelventa;
	}














	public JMenuItem getPanelVerificar() {
		return PanelVerificar;
	}














	public void setPanelVerificar(JMenuItem panelVerificar) {
		PanelVerificar = panelVerificar;
	}














	public PanelVerificarCliente getPanelVerifica() {
		return PanelVerifica;
	}

	public void setPanelVerifica(PanelVerificarCliente panelVerifica) {
		PanelVerifica = panelVerifica;
	}

	public panelCheque getPanelcheque() {
		return panelcheque;
	}

	public void setPanelcheque(panelCheque panelcheque) {
		this.panelcheque = panelcheque;
	}

	public panelCompra getPanelcompra() {
		return panelcompra;
	}

	public void setPanelcompra(panelCompra panelcompra) {
		this.panelcompra = panelcompra;
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

	public Controlador getControlador() {
		return controlador;
	}

	public void setControlador(Controlador controlador) {
		this.controlador = controlador;
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

	public JMenu getVentas() {
		return ventas;
	}


	public void setVentas(JMenu ventas) {
		this.ventas = ventas;
	}


	public JMenu getCompras() {
		return compras;
	}



	public void setCompras(JMenu compras) {
		this.compras = compras;
	}



	public JMenu getTienda() {
		return tienda;
	}

	public void setTienda(JMenu tienda) {
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







	public JMenuItem getVender() {
		return vender;
	}







	public void setVender(JMenuItem vender) {
		this.vender = vender;
	}







	public JMenuItem getComprar() {
		return comprar;
	}







	public void setComprar(JMenuItem comprar) {
		this.comprar = comprar;
	}







	public JMenuItem getConfigTienda() {
		return configTienda;
	}







	public void setConfigTienda(JMenuItem configTienda) {
		this.configTienda = configTienda;
	}







	public JLabel getLbImagen() {
		return lbImagen;
	}







	public void setLbImagen(JLabel lbImagen) {
		this.lbImagen = lbImagen;
	}

	
	

}
