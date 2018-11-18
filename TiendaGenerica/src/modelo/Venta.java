package modelo;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import controlador.Persistencia;

public class Venta implements Serializable{
	private int Codigoventa;
	private int Cedulacliente;
	private int Valortotaldeventa;
	private float ValordeiVA;
	private float Valortotaliva;
	private static final long serialVersionUID = 1L;
	public Venta(int CodigoVenta, int CedulaCliente, int ValorTotaldeVenta,float ValordeIVA,float ValorTotalIva){
		Codigoventa=CodigoVenta;
		Cedulacliente= CedulaCliente;
		Valortotaldeventa=ValorTotaldeVenta;
		ValordeiVA=ValordeIVA;
		Valortotaliva=ValorTotalIva;
	}

	public int agregarVenta(Venta venta){
		Persistencia persistencia= new Persistencia();
		ArrayList<Venta> ventas = new ArrayList<Venta>(); 
		if(new File ("C:\\data\\venta.out").exists()){
			ventas = persistencia.leerVenta();
				venta.Codigoventa = ventas.size() + 1;
				ventas.add(venta);
				String mensaje = persistencia.escribirVenta(ventas);
				JOptionPane.showMessageDialog(null, mensaje);}
		else{	
				ventas.add(venta);
				String mensaje = persistencia.escribirVenta(ventas);
				JOptionPane.showMessageDialog(null, mensaje);}
		return venta.Codigoventa;}

      public int buscarVenta( int CodigoVenta, ArrayList<Venta> ventas){
	        int indice = -1;
	         for (int i = 0; i < ventas.size(); i++) {
		        Venta actual = ventas.get(i);
		        if(actual.getCodigoventa()==CodigoVenta){
			            indice = i;}}
	                   return indice;}
	

	public int getCodigoventa() {
		return Codigoventa;
	}

	public void setCodigoventa(int codigoventa) {
		Codigoventa = codigoventa;
	}

	public int getCedulacliente() {
		return Cedulacliente;
	}

	public void setCedulacliente(int cedulacliente) {
		Cedulacliente = cedulacliente;
	}

	public int getValortotaldeventa() {
		return Valortotaldeventa;
	}

	public void setValortotaldeventa(int valortotaldeventa) {
		Valortotaldeventa = valortotaldeventa;
	}

	public float getValordeiVA() {
		return ValordeiVA;
	}

	public void setValordeiVA(float valordeiVA) {
		ValordeiVA = valordeiVA;
	}

	public float getValortotaliva() {
		return Valortotaliva;
	}

	public void setValortotaliva(float valortotaliva) {
		Valortotaliva = valortotaliva;
	}
	
}

