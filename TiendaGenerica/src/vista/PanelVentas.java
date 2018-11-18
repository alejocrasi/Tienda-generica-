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
	
	private JLabel lbCliente;
	private JLabel lbIDcliente;
	private JLabel lbCodigoProducto;
	private JLabel lbNombreProducto;
	private JLabel lbValorUnitario;
	private JLabel lbCantidad;
	private JLabel lbValorTotal;
	private JLabel lbCodigoVenta;
	private JLabel lbIVA;
	private JLabel lbValorconIva;
	private JLabel lbTotalVenta;
	private JLabel lbMetodoPago;
	
	private JTextField TxtCliente;
	private JTextField TxtIDcliente;
	private JTextField TxtCodigoProducto;
	private JTextField TxtNombreProducto;
	private JTextField TxtValorUnitario;
	private JTextField TxtCantidad;
	private JTextField TxtValorTotal;
	private JTextField TxtCodigoVenta;
	private JTextField TxtIVA;
	private JTextField TxtValorconIva;
	private JTextField TxtTotalVenta;
	
	
	private JButton btnProducto;
	private JButton btnEliminarP;
	private JButton btnTotalizar;
	private JButton btnEfectivo;
	private JButton btnCuotas;

	private JTable tabla;
	
	private String [][]datos= {{"", "", "","",""}};
	private String []cabe = {"Nit", "Producto", "valor unitario","cantidad","valor total"};
	
	private Ventana vista;
	
	public PanelVentas(Ventana pVista){
		vista = pVista;
		setLayout(null);
		setBorder(new TitledBorder("Ventas"));
		
		btnProducto = new JButton("buscar producto");
		btnProducto.setActionCommand(vista.BUSCAR_PRODUCTO);
		
		btnTotalizar = new JButton("totalizar");
		btnTotalizar.setActionCommand(vista.TOTALIZAR);
		
		btnEliminarP = new JButton("eliminar producto");
		btnEliminarP.setActionCommand(vista.ELIMINAR_PRODUCTO);
		
		btnEfectivo = new JButton("Efectivo");
		btnEfectivo.setActionCommand(vista.EFECTIVO_PRODUCTO);
		
		btnCuotas = new JButton("Cuotas");
		btnCuotas.setActionCommand(vista.CUOTAS_PRODUCTO);
		
		TxtCliente = new JTextField("");
		TxtIDcliente = new JTextField(""); 
		TxtCodigoProducto = new JTextField("");
		TxtNombreProducto = new JTextField("");
		TxtValorUnitario = new JTextField ("");
		TxtCantidad = new JTextField("");
		TxtValorTotal = new JTextField("");
		TxtCodigoVenta = new JTextField("");
		TxtIVA = new JTextField("");
		TxtValorconIva = new JTextField("");
		TxtTotalVenta = new JTextField("");
		
		
		lbCliente = new JLabel("nombre del cliente:");
		lbIDcliente = new JLabel("ID del cliente:");
		lbCodigoProducto = new JLabel("Codigo del producto:");
		lbNombreProducto = new JLabel("nombre del producto:");
		lbValorUnitario = new JLabel("valor unitario:");
		lbCantidad = new JLabel("cantidad producto:");
		lbValorTotal = new JLabel("valor Total:");
		lbCodigoVenta = new JLabel("Codigo por venta:");
		lbIVA = new JLabel ("IVA:");
		lbValorconIva = new JLabel("valor con IVA:");
		lbTotalVenta = new JLabel ("total venta:");
		lbMetodoPago = new JLabel ("Metodo de pago:");
		
		
		add(lbCliente);
		lbCliente.setBounds(40, 20, 120, 20);
		add(TxtCliente);
		TxtCliente.setBounds(160, 20, 200, 20);
		TxtCliente.setEnabled(false);
		
		add(lbIDcliente);
		lbIDcliente.setBounds(40, 50, 120, 20);
		add(TxtIDcliente);
		TxtIDcliente.setBounds(130, 50, 230, 20);
		TxtIDcliente.setEnabled(false);
		
		add(lbCodigoProducto);
		lbCodigoProducto.setBounds(40, 80, 120, 20);
		add(TxtCodigoProducto);
		TxtCodigoProducto.setBounds(170, 80 , 190, 20);
		
		add(lbNombreProducto);
		lbNombreProducto.setBounds(40, 110, 120, 20);
		add(TxtNombreProducto);
		TxtNombreProducto.setBounds(170, 110 , 190, 20);
		TxtNombreProducto.setEnabled(false);
		
		add(lbValorUnitario);
		lbValorUnitario.setBounds(40, 140, 120, 20);
		add(TxtValorUnitario);
		TxtValorUnitario.setBounds(170, 140 , 190, 20);
		TxtValorUnitario.setEnabled(false);
		
		add(lbCantidad);
		lbCantidad.setBounds(40, 170, 120, 20);
		add(TxtCantidad);
		TxtCantidad.setBounds(170, 170 , 190, 20);
		TxtCantidad.setActionCommand(vista.CANTIDAD_PRODUCTO);
		
		add(lbValorTotal);
		lbValorTotal.setBounds(40, 200, 120, 20);
		add(TxtValorTotal);
		TxtValorTotal.setBounds(170, 200 , 190, 20);
		TxtValorTotal.setEnabled(false);
		
		add(lbCodigoVenta);
		lbCodigoVenta.setBounds(500, 20, 120, 20);
		add(TxtCodigoVenta);
		TxtCodigoVenta.setBounds(610, 20, 200, 20);
		
		add(lbIVA);
		lbIVA.setBounds(500, 50, 120, 20); 
		add(TxtIVA);
		TxtIVA.setBounds(610, 50, 120, 20);
		TxtIVA.setEnabled(false);
		
		add(lbValorconIva);
		lbValorconIva.setBounds(500, 80, 120, 20);
		add(TxtValorconIva);
		TxtValorconIva.setBounds(610, 80, 120, 20);
		TxtValorconIva.setEnabled(false);
		
		add(lbTotalVenta);
		lbTotalVenta.setBounds(500, 110, 120, 20);
		add(TxtTotalVenta);
		TxtTotalVenta.setBounds(610, 110, 120, 20);
		TxtTotalVenta.setEnabled(false);
		
		add(lbMetodoPago);
		lbMetodoPago.setBounds(500, 340, 120, 20);
		
		
		
		add(btnProducto);
		btnProducto.setBounds(50,230, 180, 40);
		add(btnEliminarP);
		btnEliminarP.setBounds(250, 230, 180, 40);
		add(btnEfectivo);
		btnEfectivo.setBounds(620, 340, 120, 40);
		add(btnCuotas);
		btnCuotas.setBounds(760, 340, 120, 40);
		
		tabla = new JTable(datos,cabe);
		JScrollPane tab = new JScrollPane(tabla);
		tab.setBounds(440,187,400, 150);
		add(tab);
		
		add(btnTotalizar);
		btnTotalizar.setBounds(640, 140, 120, 40);
		
		
	}

	public JLabel getLbCodigoProducto() {
		return lbCodigoProducto;
	}

	public void setLbCodigoProducto(JLabel lbCodigoProducto) {
		this.lbCodigoProducto = lbCodigoProducto;
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

	public JTextField getTxtCodigoProducto() {
		return TxtCodigoProducto;
	}

	public void setTxtCodigoProducto(JTextField txtCodigoProducto) {
		TxtCodigoProducto = txtCodigoProducto;
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

	public JButton getBtnProducto() {
		return btnProducto;
	}

	public void setBtnProducto(JButton btnProducto) {
		this.btnProducto = btnProducto;
	}

	public JButton getBtnEliminarP() {
		return btnEliminarP;
	}

	public void setBtnEliminarP(JButton btnEliminarP) {
		this.btnEliminarP = btnEliminarP;
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

	public JLabel getLbNombreProducto() {
		return lbNombreProducto;
	}

	public void setLbNombreProducto(JLabel lbNombreProducto) {
		this.lbNombreProducto = lbNombreProducto;
	}

	public JLabel getLbValorUnitario() {
		return lbValorUnitario;
	}

	public void setLbValorUnitario(JLabel lbValorUnitario) {
		this.lbValorUnitario = lbValorUnitario;
	}

	public JLabel getLbCantidad() {
		return lbCantidad;
	}

	public void setLbCantidad(JLabel lbCantidad) {
		this.lbCantidad = lbCantidad;
	}

	public JLabel getLbValorTotal() {
		return lbValorTotal;
	}

	public void setLbValorTotal(JLabel lbValorTotal) {
		this.lbValorTotal = lbValorTotal;
	}

	public JTextField getTxtNombreProducto() {
		return TxtNombreProducto;
	}

	public void setTxtNombreProducto(JTextField txtNombreProducto) {
		TxtNombreProducto = txtNombreProducto;
	}

	public JTextField getTxtValorUnitario() {
		return TxtValorUnitario;
	}

	public void setTxtValorUnitario(JTextField txtValorUnitario) {
		TxtValorUnitario = txtValorUnitario;
	}

	public JTextField getTxtCantidad() {
		return TxtCantidad;
	}

	public void setTxtCantidad(JTextField txtCantidad) {
		TxtCantidad = txtCantidad;
	}

	public JTextField getTxtValorTotal() {
		return TxtValorTotal;
	}

	public void setTxtValorTotal(JTextField txtValorTotal) {
		TxtValorTotal = txtValorTotal;
	}

	public JLabel getLbCodigoVenta() {
		return lbCodigoVenta;
	}

	public void setLbCodigoVenta(JLabel lbCodigoVenta) {
		this.lbCodigoVenta = lbCodigoVenta;
	}

	public JLabel getLbIVA() {
		return lbIVA;
	}

	public void setLbIVA(JLabel lbIVA) {
		this.lbIVA = lbIVA;
	}

	public JLabel getLbValorconIva() {
		return lbValorconIva;
	}

	public void setLbValorconIva(JLabel lbValorconIva) {
		this.lbValorconIva = lbValorconIva;
	}

	public JLabel getLbTotalVenta() {
		return lbTotalVenta;
	}

	public void setLbTotalVenta(JLabel lbTotalVenta) {
		this.lbTotalVenta = lbTotalVenta;
	}

	public JLabel getLbMetodoPago() {
		return lbMetodoPago;
	}

	public void setLbMetodoPago(JLabel lbMetodoPago) {
		this.lbMetodoPago = lbMetodoPago;
	}

	public JTextField getTxtCodigoVenta() {
		return TxtCodigoVenta;
	}

	public void setTxtCodigoVenta(JTextField txtCodigoVenta) {
		TxtCodigoVenta = txtCodigoVenta;
	}

	public JTextField getTxtIVA() {
		return TxtIVA;
	}

	public void setTxtIVA(JTextField txtIVA) {
		TxtIVA = txtIVA;
	}

	public JTextField getTxtValorconIva() {
		return TxtValorconIva;
	}

	public void setTxtValorconIva(JTextField txtValorconIva) {
		TxtValorconIva = txtValorconIva;
	}

	public JTextField getTxtTotalVenta() {
		return TxtTotalVenta;
	}

	public void setTxtTotalVenta(JTextField txtTotalVenta) {
		TxtTotalVenta = txtTotalVenta;
	}

	public JButton getBtnEfectivo() {
		return btnEfectivo;
	}

	public void setBtnEfectivo(JButton btnEfectivo) {
		this.btnEfectivo = btnEfectivo;
	}

	public JButton getBtnCuotas() {
		return btnCuotas;
	}

	public void setBtnCuotas(JButton btnCuotas) {
		this.btnCuotas = btnCuotas;
	}

    

}
