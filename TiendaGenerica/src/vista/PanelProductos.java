package vista;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelProductos extends JPanel {
	private JButton btnAgregar;
	private JButton btnActualizar;
	private JButton btnLeer;
	private JButton btnBorrar;
	
	private JTextField  txtnombreProducto;
	private JTextField  txtcodigoProducto;
	private JTextField  txtNITProveedor;
	private JTextField  txtPrecioCompraProducto;
	private JTextField  txtPrecioVentaProducto;
	
	private JLabel  lbnombreProducto;
	private JLabel  lbcodigoProducto;
	private JLabel  lbNITProveedor;
	private JLabel  lbPrecioCompraProducto;
	private JLabel  lbPrecioVentaProducto;
	
	
	private JTable tabla;
	
	private String [][]datos= {{"", "", "","",""}};
	private String []cabe = {"Nombre", "Cedula", "direccion","telefono","correo"};
	
	private Ventana vista;

	
	
	public PanelProductos(Ventana pvista) {
		vista = pvista;
	
		setLayout(null);
		setBorder(new TitledBorder("Panel Productos"));
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setActionCommand(vista.ACTUALIZAR_PRODUCTO);

		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setActionCommand(vista.ACTUALIZAR_PRODUCTO);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setActionCommand(vista.ACTUALIZAR_PRODUCTO);
		
		btnLeer = new JButton("leer");
		btnLeer.setActionCommand(vista.ACTUALIZAR_PRODUCTO);
	
		
		
		txtnombreProducto = new JTextField(" ");
		txtcodigoProducto = new JTextField(" ");
		txtNITProveedor = new JTextField(" ");
		txtPrecioCompraProducto = new JTextField(" ");
		txtPrecioVentaProducto = new JTextField(" ");
		
		lbnombreProducto = new JLabel("código:");
		lbcodigoProducto = new JLabel("nombre :");
		lbNITProveedor = new JLabel("NIT : ");
		lbPrecioCompraProducto = new JLabel("precio de compra:");
		lbPrecioVentaProducto = new JLabel("precio de venta:");


		int y = 30;
		int x = 10;
		
		
		
		
		add(lbnombreProducto);
		lbnombreProducto.setBounds(x, y, 120, 20);
		add(txtnombreProducto);
		txtnombreProducto.setBounds(x*7, y, 290, 20);
		
		add(lbcodigoProducto);
		lbcodigoProducto.setBounds(x, y*2, 320, 20);
		add(txtcodigoProducto);
		txtcodigoProducto.setBounds(x*7, y*2, 290, 20);
		
		add(lbNITProveedor);
		lbNITProveedor.setBounds(x, y*3, 320, 20);
		add(txtNITProveedor);
		txtNITProveedor.setBounds(x*7, y*3, 290, 20);
		
		add(lbPrecioCompraProducto);
		lbPrecioCompraProducto.setBounds(x, y*4, 320, 20);
		add(txtPrecioCompraProducto);
		txtPrecioCompraProducto.setBounds(x*12, y*4, 240, 20);
		
		add(lbPrecioVentaProducto);
		lbPrecioVentaProducto.setBounds(x, y*5, 320, 20);
		add(txtPrecioVentaProducto);
		txtPrecioVentaProducto.setBounds(x*11, y*5, 250, 20);
		
		JLabel label = new JLabel();
		label.setIcon( new ImageIcon("./dato/imagenes/icono_producto.png"));
		add(label);
		label.setBounds(x*37, y, 130, 130);
		
		
		JPanel boton = new JPanel();
		boton.setBounds(x, y*6,490, 50);
		add(boton);
		
		boton.add(btnAgregar);
		boton.add(btnActualizar);
		boton.add(btnBorrar);
		boton.add(btnLeer);
		
		tabla = new JTable(datos,cabe);
		JScrollPane tab = new JScrollPane(tabla);
		tab.setBounds(x, y*8,500, 150);
		add(tab);
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



	public JTextField getTxtnombreProducto() {
		return txtnombreProducto;
	}



	public void setTxtnombreProducto(JTextField txtnombreProducto) {
		this.txtnombreProducto = txtnombreProducto;
	}



	public JTextField getTxtcodigoProducto() {
		return txtcodigoProducto;
	}



	public void setTxtcodigoProducto(JTextField txtcodigoProducto) {
		this.txtcodigoProducto = txtcodigoProducto;
	}



	public JTextField getTxtNITProveedor() {
		return txtNITProveedor;
	}



	public void setTxtNITProveedor(JTextField txtNITProveedor) {
		this.txtNITProveedor = txtNITProveedor;
	}



	public JTextField getTxtPrecioCompraProducto() {
		return txtPrecioCompraProducto;
	}



	public void setTxtPrecioCompraProducto(JTextField txtPrecioCompraProducto) {
		this.txtPrecioCompraProducto = txtPrecioCompraProducto;
	}



	public JTextField getTxtPrecioVentaProducto() {
		return txtPrecioVentaProducto;
	}



	public void setTxtPrecioVentaProducto(JTextField txtPrecioVentaProducto) {
		this.txtPrecioVentaProducto = txtPrecioVentaProducto;
	}
	

	
}
