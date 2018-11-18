package modelo;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

import controlador.Persistencia;

public class Venta implements Serializable{
	//private  venta  = new ArrayList <Venta>();
    //private String [] producto = new Venta[venta][4]; 
	private int Codigoventa;
	private int Cedulacliente;
	private int Valortotaldeventa;
	private int ValordeiVA;
	private int Valortotaliva;
	private static final long serialVersionUID = 1L;
	public Venta(int CodigoVenta, int CedulaCliente, int ValorTotaldeVenta,int ValordeIVA,int ValorTotalIva){
		Codigoventa=CodigoVenta;
		Cedulacliente= CedulaCliente;
		Valortotaldeventa=ValorTotaldeVenta;
		ValordeiVA=ValordeIVA;
		Valortotaliva=ValorTotalIva;
	}

	public boolean agregarVenta(int CodigoVenta, int Cedulacliente, int ValorTotaldeVenta,int ValordeIVA,int ValorTotalIva){
		Persistencia persistencia= new Persistencia();
		ArrayList<Venta> venta = new ArrayList<Venta>(); 
		
		boolean agrego = false;
		if(new File ("C:\\data\\venta.out").exists()){
			venta = persistencia.leerVenta();
			if(buscarVenta(CodigoVenta,venta)==-1){
				Venta nuevo = new Venta( CodigoVenta, Cedulacliente, ValorTotaldeVenta, ValordeIVA, ValorTotalIva);
				venta.add(nuevo);
				persistencia.escribirVenta(venta);
				agrego = true;}}
		else{Venta nuevo = new Venta(CodigoVenta, Cedulacliente, ValorTotaldeVenta, ValordeIVA, ValorTotalIva);		
				venta.add(nuevo);
				persistencia.escribirVenta(venta);
				agrego = true;}
		return agrego;}

      public int buscarVenta( int CodigoVenta, ArrayList<Venta> ventas){
	        int indice = -1;
	         for (int i = 0; i < ventas.size(); i++) {
		        Venta actual = ventas.get(i);
		        if(actual.getCodigoventa()==CodigoVenta){
			            indice = i;}}
	                   return indice;}
	
	public boolean agregarProductoVenta(){
		return false;
	}

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

	public int getValordeiVA() {
		return ValordeiVA;
	}

	public void setValordeiVA(int valordeiVA) {
		ValordeiVA = valordeiVA;
	}

	public int getValortotaliva() {
		return Valortotaliva;
	}

	public void setValortotaliva(int valortotaliva) {
		Valortotaliva = valortotaliva;
	}
	
}
