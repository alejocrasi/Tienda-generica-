package vista;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class panelCompra extends JPanel{
	
	private JButton btnAceptar;
	private JButton btnAgregarproducto;
	

	private JTextField  txtNITdelProv;
	private JTextField  txtcodigo;
	private JTextField  txtcantidad;
	
	private JLabel  lbNITdelProv;
	private JLabel  lbcodigo;
	private JLabel  lbcantidad;
	private int total;
	 
	private JTable tabla;
	
	private String [][]datos= {{"", "", "","",""}};
	private String []cabe = {"código", "nombre ", "NIT de proveedor","precio de compra","precio de venta"};
	
	 
	private Ventana vista;

	public  panelCompra(Ventana pvista) {
		vista = pvista;
		setLayout(null);
		setBorder(new TitledBorder("compra"));
		
		btnAceptar = new JButton("Total");
		btnAceptar.setActionCommand(vista.ACEPTAR_COMPRA);

		
		btnAgregarproducto = new JButton("Agregar producto");
		btnAgregarproducto.setActionCommand(vista.AGREGAR_PRODUCTO_COMPRA);
		
		
		
		
		
		
		txtNITdelProv = new JTextField("");
		txtcodigo = new JTextField("");
		txtcantidad = new JTextField("");
		
		
		lbNITdelProv = new JLabel("NIT del provedor");
		lbcodigo = new JLabel("Codigo del producto:");
		lbcantidad = new JLabel("cantidad del producto:");
		
		
		int y = 30;
		int x = 10;
		
		
		add(lbNITdelProv);
		lbNITdelProv.setBounds(x, y, 290, 20);
		add(txtNITdelProv);
		txtNITdelProv.setBounds(x*11, y, 230, 20);
		
		add(lbcodigo);
		lbcodigo.setBounds(x, y*2, 290, 20);
		add(txtcodigo);
		txtcodigo.setBounds(x*13, y*2, 210, 20);
		
		add(lbcantidad);	
		lbcantidad.setBounds(x, y*3, 290, 20);
		add(txtcantidad);
		txtcantidad.setBounds(x*14, y*3, 200, 20);
		
		
		
		JLabel label = new JLabel();
		label.setIcon( new ImageIcon("./dato/imagenes/deayler.png"));
		add(label);
		label.setBounds(x*37, y, 140, 140);

		
		JPanel boton = new JPanel();
		boton.setBounds(x, y*6,490, 50);
		add(boton);
		
		boton.add(btnAceptar);
		boton.add(btnAgregarproducto);
		
		
		
		
		tabla = new JTable(datos,cabe);
		JScrollPane tab = new JScrollPane(tabla);
		tab.setBounds(x, y*8,500, 150);
		add(tab);
		
		
		
		
	}
	
	
	

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public JButton getBtnAceptar() {
		return btnAceptar;
	}

	public void setBtnAceptar(JButton btnAceptar) {
		this.btnAceptar = btnAceptar;
	}

	public JButton getBtnAgregarproducto() {
		return btnAgregarproducto;
	}

	public void setBtnAgregarproducto(JButton btnAgregarproducto) {
		this.btnAgregarproducto = btnAgregarproducto;
	}
	
	
	public JTextField getTxtNITdelProv() {
		return txtNITdelProv;
	}

	public void setTxtNITdelProv(JTextField txtNITdelProv) {
		this.txtNITdelProv = txtNITdelProv;
	}

	public JTextField getTxtcodigo() {
		return txtcodigo;
	}

	public void setTxtcodigo(JTextField txtcodigo) {
		this.txtcodigo = txtcodigo;
	}

	public JTextField getTxtcantidad() {
		return txtcantidad;
	}

	public void setTxtcantidad(JTextField txtcantidad) {
		this.txtcantidad = txtcantidad;
	}

	public JLabel getLbNITdelProv() {
		return lbNITdelProv;
	}

	public void setLbNITdelProv(JLabel lbNITdelProv) {
		this.lbNITdelProv = lbNITdelProv;
	}

	public JLabel getLbcodigo() {
		return lbcodigo;
	}

	public void setLbcodigo(JLabel lbcodigo) {
		this.lbcodigo = lbcodigo;
	}

	public JLabel getLbcantidad() {
		return lbcantidad;
	}

	public void setLbcantidad(JLabel lbcantidad) {
		this.lbcantidad = lbcantidad;
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
