package modelo;

public class Tienda {
	private String nombreTienda;
	private String tipoTienda;
	private int  NITtienda;
	private String ciudad;
	private int IVA;
	private int tasaInteres;
	private String nombreBanco;
	private int numCuentaCorriente;
	private String gerente;
	
	public Tienda() {
		nombreTienda = null;
		tipoTienda = null;
		NITtienda = 0 ;
		ciudad = null;
		IVA = 0;
		tasaInteres = 0;
		nombreBanco = null;
		numCuentaCorriente =0;
		gerente = "alejandro";
		
	}
	
	
	
	public String TiendaActual() {
		
		String linea="";
		linea= nombreTienda + "\n\n";
		linea+="\t tipo de Tienda  : " + tipoTienda +"\n";
		linea+="\t NIT             : " + NITtienda +"\n";
		linea+="\t ciudad          : " + ciudad +"\n";
		linea+="\t tasa de Interes : " + tasaInteres +"\n";
		linea+="\t IVA             : " + IVA +"\n";
		linea+="\t nombre del Banco: " + nombreBanco+" \n";
		linea+="\t Cuenta Corriente: " + numCuentaCorriente+ "\n";
		linea+="\t gerente         : " + gerente + "\n";
		
		return linea;
	}
	
	

	
	
	
	public String getNombreTienda() {
		return nombreTienda;
	}

	public void setNombreTienda(String nombreTienda) {
		this.nombreTienda = nombreTienda;
	}

	public String getTipoTienda() {
		return tipoTienda;
	}

	public void setTipoTienda(String tipoTienda) {
		this.tipoTienda = tipoTienda;
	}

	public int getNITtienda() {
		return NITtienda;
	}

	public void setNITtienda(int nITtienda) {
		NITtienda = nITtienda;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public int getIVA() {
		return IVA;
	}

	public void setIVA(int iVA) {
		IVA = iVA;
	}

	public int getTasaInteres() {
		return tasaInteres;
	}

	public void setTasaInteres(int tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

	public String getNombreBanco() {
		return nombreBanco;
	}

	public void setNombreBanco(String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}

	public int getNumCuentaCorriente() {
		return numCuentaCorriente;
	}

	public void setNumCuentaCorriente(int numCuentaCorriente) {
		this.numCuentaCorriente = numCuentaCorriente;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}
	
	
	
	

	





	
	
}