package modelo;



/**
 * @author Andres Barbosa Salamanca
 *
 */
public class Mundo {
	
		public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

		private Cliente cliente;
		private Proveedor proveedor;
		private Producto producto;
		private Tienda tienda;
		private Venta venta;
		
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

}