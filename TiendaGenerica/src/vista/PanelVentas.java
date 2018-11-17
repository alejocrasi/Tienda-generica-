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
	private JLabel lbIDcliente;
	private JTextField TxtProducto;
	private JTextField TxtTotalizar;
	private JTextField TxtCliente;
	private JTextField TxtIDcliente;
	private JButton btnProducto;
	private JButton btnTotalizar;
	
	
	private JTable tabla;
	
	private String [][]datos= {{"", "", "","",""}};
	private String []cabe = {"Producto", "Cantidad", "Valor total por producto","Iva","Valor con Iva"};
	
	private Ventana vista;
	
	public PanelVentas(Ventana pVista){
		vista = pVista;
		setLayout(null);
		setBorder(new TitledBorder("Ventas"));
		
		btnProducto = new JButton("buscar producto");
		btnProducto.setActionCommand(vista.BUSCAR_PRODUCTO);
		
		btnTotalizar = new JButton("totalizar");
		btnTotalizar.setActionCommand(vista.TOTALIZAR);
		
		TxtProducto = new JTextField("");
		TxtTotalizar = new JTextField("");
		TxtCliente = new JTextField("");
		TxtIDcliente = new JTextField(""); 
		
		lbProducto = new JLabel("Codigo del producto :");
		lbCliente = new JLabel("nombre del cliente :");
		lbIDcliente = new JLabel("ID del cliente :");
		
		int y = 30;
		int x = 10;
		
		add(lbCliente);
		lbCliente.setBounds(x, y, 290, 20);
		add(TxtCliente);
		
		TxtCliente.setBounds(x*7, y, 290, 20);
		TxtCliente.setEnabled(false);
		
		add(lbIDcliente);
		lbIDcliente.setBounds(x, y*2, 290, 20);
		add(TxtIDcliente);
		TxtIDcliente.setBounds(x*7, y*2, 290, 20);
		TxtIDcliente.setEnabled(false);
		
		add(lbProducto);
		lbProducto.setBounds(x, y*3, 290, 20);
		add(TxtProducto);
		TxtProducto.setBounds(x*7, y*3, 290, 20);
		
		add(btnProducto);
		btnProducto.setBounds(x, y*2, 290, 20);
		
		tabla = new JTable(datos,cabe);
		JScrollPane tab = new JScrollPane(tabla);
		tab.setBounds(50,170,500, 150);
		add(tab);
		
		add(btnTotalizar);
		btnTotalizar.setBounds(240, 340, 120, 40);
		
		
	}

	public JLabel getLbCliente() {
		return lbCliente;
	}

	public void setLbCliente(JLabel lbCliente) {
		this.lbCliente = lbCliente;
	}

	public JLabel getLbIDcliente() {
		return lbIDcliente;
	}

	public void setLbIDcliente(JLabel lbIDcliente) {
		this.lbIDcliente = lbIDcliente;
	}

	public JTextField getTxtCliente() {
		return TxtCliente;
	}

	public void setTxtCliente(JTextField txtCliente) {
		TxtCliente = txtCliente;
	}

	public JTextField getTxtIDcliente() {
		return TxtIDcliente;
	}

	public void setTxtIDcliente(JTextField txtIDcliente) {
		TxtIDcliente = txtIDcliente;
	}

	public JTextField getTxtProducto() {
		return TxtProducto;
	}

	public JLabel getLbProducto() {
		return lbProducto;
	}

	public void setLbProducto(JLabel lbProducto) {
		this.lbProducto = lbProducto;
	}

	public void setTxtProducto(JTextField txtProducto) {
		TxtProducto = txtProducto;
	}

	public JTextField getTxtTotalizar() {
		return TxtTotalizar;
	}

	public void setTxtTotalizar(JTextField txtTotalizar) {
		TxtTotalizar = txtTotalizar;
	}

	public JButton getBtnProducto() {
		return btnProducto;
	}

	public void setBtnProducto(JButton btnProducto) {
		this.btnProducto = btnProducto;
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

	public Ventana getVista() {
		return vista;
	}

	public void setVista(Ventana vista) {
		this.vista = vista;
	}

}
