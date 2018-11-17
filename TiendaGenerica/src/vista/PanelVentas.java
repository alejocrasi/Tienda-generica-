package vista;

import java.awt.Button;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelVentas extends JPanel {
	
	private JLabel lbProducto;
	private JLabel lbCliente;
	private JLabel lbcantidad;
	
	private JTextField TxtProducto;
	private JTextField TxtCantidad;
	private JTextField TxtCliente;
	
	private JButton btnAgregarProducto;
	private JButton btnTotalizar;
	
	
	private JTable tabla;
	
	private String [][]datos= {{"", "", "","",""}};
	private String []cabe = {"Producto", "Cantidad", "Valor total por producto","Iva","Valor con Iva"};
	
	private Ventana vista;
	
	public PanelVentas(Ventana pVista){
		vista = pVista;
		setLayout(null);
		setBorder(new TitledBorder("Ventas"));
		
		btnAgregarProducto = new JButton("Agregar Producto");
		btnAgregarProducto.setActionCommand(vista.BUSCAR_PRODUCTO);
		
		btnTotalizar = new JButton("totalizar");
		btnTotalizar.setActionCommand(vista.TOTALIZAR);
		
		TxtProducto = new JTextField("");
		TxtCantidad = new JTextField("");
		TxtCliente = new JTextField("");
		
		lbProducto = new JLabel("Codigo del producto :");
		lbCliente = new JLabel("cedula del cliente :");
		lbcantidad = new JLabel("cantidad:");
		
		int y = 30;
		int x = 10;
		
		add(lbCliente);
		lbCliente.setBounds(x, y, 290, 20);
		
		add(TxtCliente);
		TxtCliente.setBounds(x*15, y, 290, 20);
		
		add(lbProducto);
		lbProducto.setBounds(x, y*2, 290, 20);
		add(TxtProducto);
		TxtProducto.setBounds(x*15, y*2, 290, 20);
		
		add(lbcantidad);
		lbcantidad.setBounds(x, y*3, 290, 20);
		add(TxtCantidad);
		TxtCantidad.setBounds(x*10, y*3, 290, 20);
		
		
		
		
		
		tabla = new JTable(datos,cabe);
		JScrollPane tab = new JScrollPane(tabla);
		tab.setBounds(x, y*4, 500, 150);
		add(tab);
		
		add(btnAgregarProducto);
		btnAgregarProducto.setBounds(x, y*10, 200, 20);
		
		add(btnTotalizar);
		btnTotalizar.setBounds(x*25, y*10, 150, 20);
		
		
	}

	public JLabel getLbProducto() {
		return lbProducto;
	}

	public void setLbProducto(JLabel lbProducto) {
		this.lbProducto = lbProducto;
	}

	public JLabel getLbCliente() {
		return lbCliente;
	}

	public void setLbCliente(JLabel lbCliente) {
		this.lbCliente = lbCliente;
	}

	public JLabel getLbcantidad() {
		return lbcantidad;
	}

	public void setLbcantidad(JLabel lbcantidad) {
		this.lbcantidad = lbcantidad;
	}

	public JTextField getTxtProducto() {
		return TxtProducto;
	}

	public void setTxtProducto(JTextField txtProducto) {
		TxtProducto = txtProducto;
	}

	public JTextField getTxtCantidad() {
		return TxtCantidad;
	}

	public void setTxtCantidad(JTextField txtCantidad) {
		TxtCantidad = txtCantidad;
	}

	public JTextField getTxtCliente() {
		return TxtCliente;
	}

	public void setTxtCliente(JTextField txtCliente) {
		TxtCliente = txtCliente;
	}

	public JButton getBtnAgregarProducto() {
		return btnAgregarProducto;
	}

	public void setBtnAgregarProducto(JButton btnAgregarProducto) {
		this.btnAgregarProducto = btnAgregarProducto;
	}

	public JButton getBtnTotalizar() {
		return btnTotalizar;
	}

	public void setBtnTotalizar(JButton btnTotalizar) {
		this.btnTotalizar = btnTotalizar;
	}

	public JTable getTabla() {
		return tabla;
	}

	public void setTabla(JTable tabla) {
		this.tabla = tabla;
	}

	public String[][] getDatos() {
		return datos;
	}

	public void setDatos(String[][] datos) {
		this.datos = datos;
	}

	public String[] getCabe() {
		return cabe;
	}

	public void setCabe(String[] cabe) {
		this.cabe = cabe;
	}

	

}
