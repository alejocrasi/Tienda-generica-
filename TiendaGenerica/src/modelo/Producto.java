package modelo;

import java.io.Serializable;

public class Producto implements Serializable {
	private int codigoProducto;
	private String nombreProducto;
	private int nitProveedorProducto;
	private int precioCompraProducto;
	private int precioVentaProducto;
	
	public Producto(int pCodigoProducto, String pNombreProducto, int pNitProveedorProducto, int pPrecioCompraProducto, int pPrecioVentaProducto ){
		codigoProducto = pCodigoProducto;
		nombreProducto = pNombreProducto;
		nitProveedorProducto = pNitProveedorProducto;
		precioCompraProducto = pPrecioCompraProducto;
		precioVentaProducto = pPrecioVentaProducto;
	}

	public int getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public int getNitProveedorProducto() {
		return nitProveedorProducto;
	}

	public void setNitProveedorProducto(int nitProveedorProducto) {
		this.nitProveedorProducto = nitProveedorProducto;
	}

	public int getPrecioCompraProducto() {
		return precioCompraProducto;
	}

	public void setPrecioCompraProducto(int precioCompraProducto) {
		this.precioCompraProducto = precioCompraProducto;
	}

	public int getPrecioVentaProducto() {
		return precioVentaProducto;
	}

	public void setPrecioVentaProducto(int precioVentaProducto) {
		this.precioVentaProducto = precioVentaProducto;
	}

}