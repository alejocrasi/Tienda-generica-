package modelo;

import java.util.ArrayList;

/**
 * @author Andres Barbosa Salamanca
 *
 */
public class Mundo {
	
	private Cliente cliente;
	private Proveedor proveedor;
	private Producto producto;
	private Tienda tienda;
	private Venta venta;
	private ArrayList<ArrayList<String>> productos = new ArrayList<ArrayList<String>>();
	private int contarproductos = 0;
	
	public Mundo(Cliente in_cliente) {
		cliente = in_cliente;
	}
	
	public Mundo(Proveedor in_proveedor) {
		proveedor = in_proveedor;
	}
	
	public Mundo(Producto in_producto){
		producto = in_producto;
	}
	
	public Mundo (Tienda in_tienda){
		tienda = in_tienda;
	}
	
	public Mundo (Venta in_venta){
		venta = in_venta;
	}
	
	public Mundo (){
	}
	
	/*public String [][] AgregarProductosVenta(String[] product){
		ArrayList<String>lista = new ArrayList<String>(Arrays.asList(product));
		productos.add(lista);
		contarproductos ++;
		String [][] tabla= new String[productos.size()][5];
		tabla = productos.toArray(tabla);
		return tabla;
	}*/
	
		public Tienda getTienda() {
		return tienda;
	}

	public void setTienda(Tienda tienda) {
		this.tienda = tienda;
	}

		public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

		public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}
}