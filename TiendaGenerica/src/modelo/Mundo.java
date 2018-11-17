package modelo;



/**
 * @author Andres Barbosa Salamanca
 *
 */
public class Mundo {
	private Cliente cliente;
	private Proveedor proveedor;
	private Producto producto;
	
	public Mundo(Cliente in_cliente) {
		cliente = in_cliente;
	}
	
	public Mundo(Proveedor in_proveedor) {
		proveedor = in_proveedor;
	}
	
	public Mundo(Producto in_producto){
		producto = in_producto;
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

}
