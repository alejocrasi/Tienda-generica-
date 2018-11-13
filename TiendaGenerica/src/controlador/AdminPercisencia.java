package controlador;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


import modelo.Cliente;
import modelo.Mundo;

public class AdminPercisencia {
	private String rutaClie = "./dato/archivos/cliente.out";
	private String rutaProve = "";
	private String rutaProduc = "";
	private String rutaTiend = "";

	private int REGISTROS = 10;
	private FileOutputStream fos;     
	private DataOutputStream dos;
	private FileInputStream fis;     
	private DataInputStream dis;
	private File f; 
	private Mundo mundo;

	
	public AdminPercisencia() {
		mundo = new Mundo();
		
		
	}
	public String escribirCliente(ArrayList<Cliente> cliente) {
		String mensaje = "Registro de Cliente Ingresado!";
		try{
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaClie));
			out.writeObject(cliente);
			out.flush();
			out.close();
		
		}catch (IOException e) {
			e.printStackTrace(); 
			mensaje = "Error de IO";
		}
		return mensaje;
	}
	
	public void leerCliente2(){
		System.out.println("hola??"); 
     ObjectInputStream in;
     ArrayList<Cliente> clientes;
	    try {
	    	in = new ObjectInputStream(new FileInputStream(rutaClie));
	        clientes = (ArrayList<Cliente>)in.readObject();
	        in.close();
	        for (int i = 0; i < clientes.size(); i++) {
				System.out.println(clientes.get(i).getCedula());
				System.out.println(clientes.get(i).getNombre());
				System.out.println(clientes.get(i).getDireccion());
				System.out.println(clientes.get(i).getTelefono());

			}

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ERROR");
			clientes = null;
		}
	   
	
	}
	public void leerCliente() {
		 f = new File(rutaClie);
		try {
			fis = new FileInputStream(f);
			dis = new DataInputStream(fis);
			for (int i=0; i<REGISTROS ; i++){
				//System.out.println(dis.readDouble());
				int cliente = mundo.getClientes().get(i).getTelefono() ;
				cliente = dis.readInt();
				System.out.println(cliente);
			}
			dis.close();
			
		}
		catch(IOException e){     
			e.printStackTrace(); 
			System.out.println("nose");
		} 
	}

}
