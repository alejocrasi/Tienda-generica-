package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
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
	
	

	
	private Ventana vista;

	
	
	public PanelProductos(Ventana pvista) {
		vista = pvista;
	
		setLayout(new GridLayout (9,1));
		setBorder(new TitledBorder("Panel Productos"));
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setActionCommand(vista.ACTUALIZAR_PRODUCTO);

		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setActionCommand(vista.ACTUALIZAR_PRODUCTO);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setActionCommand(vista.ACTUALIZAR_PRODUCTO);
		
		btnLeer = new JButton("leer");
		btnLeer.setActionCommand(vista.ACTUALIZAR_PRODUCTO);
	
		
		
		txtnombreProducto = new JTextField("código de producto");
		txtcodigoProducto = new JTextField("nombre del producto");
		txtNITProveedor = new JTextField("NIT de proveedor ");
		txtPrecioCompraProducto = new JTextField("precio de compra");
		txtPrecioVentaProducto = new JTextField("precio de venta");

		
		
		
		add(txtnombreProducto);
		add(txtcodigoProducto);
		add(txtNITProveedor);
		add(txtPrecioCompraProducto);
		add(txtPrecioVentaProducto);
		
		add(btnAgregar);
		add(btnActualizar);
		add(btnBorrar);
		add(btnLeer);
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
