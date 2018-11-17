package modelo;

import java.io.Serializable;
import java.util.ArrayList;





public class DetalleCompras  implements Serializable 
{
	private static final long serialVersionUID = 1L;
	
	private int NITdelProv;
	private int codigo;
	private int cantidad;
	
	public DetalleCompras(int nITdelProv, int codigo, int cantidad) {
		super();
		NITdelProv = nITdelProv;
		this.codigo = codigo;
		this.cantidad = cantidad;
	}

	public boolean agregarCompras(int nITdelProv, int codigo, int cantidad) {
		ArrayList<DetalleCompras> compra = new ArrayList<DetalleCompras>(); 
		boolean a = false;
		DetalleCompras nuevo = new DetalleCompras(nITdelProv, codigo, cantidad);	
		compra.add(nuevo);
		a = true;
		return a;
	}

	public int getNITdelProv() {
		return NITdelProv;
	}

	public void setNITdelProv(int nITdelProv) {
		NITdelProv = nITdelProv;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
