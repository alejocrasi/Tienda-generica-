package controlador;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Properties;

import modelo.Cliente;
import modelo.Producto;
import modelo.Proveedor;
import modelo.Tienda;
	public class Persistencia {


		private String rutaClie = "C:\\data\\cliente.out";
		private String rutaProve = "C:\\data\\proveedor.out";
		private String rutaProduc = "C:\\data\\producto.out";
		private String archivoprop = "C:\\data\\archivo.properties";
		
		private Properties prop = new Properties ();
		public Persistencia() {
			// TODO Auto-generated constructor stub
		}
		public void setPropiedades(){
			
		}
		

		public String escribirCliente(ArrayList<Cliente> cliente) {
			String mensaje = "Registro de Cliente Ingresado!";
			try{ ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaClie));
				out.writeObject(cliente);
				out.flush();
				out.close();
			
			}catch (IOException e) {
				e.printStackTrace(); 
				mensaje = "Error de IO";
			}
			return mensaje;
		}
		public ArrayList<Cliente> leerCliente(){
	     ObjectInputStream in;
	     ArrayList<Cliente> clientes;
		    try {
		    	in = new ObjectInputStream(new FileInputStream(rutaClie));
		        clientes = (ArrayList<Cliente>)in.readObject();
		        in.close();

			} catch (Exception  e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				clientes = null;
			}
		return clientes;
		}
		public String escribirProveedor(ArrayList<Proveedor>proveedor){
			String mensaje = "se a ingresado al proveedor";
			try{ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaProve));
				out.writeObject(proveedor);
				out.flush();
				out.close();
			}
			catch(IOException e){
				e.printStackTrace();
				mensaje = "Error de IO";
			}
			return mensaje;
		}
		public ArrayList<Proveedor> leerProveedor(){
			ObjectInputStream in;
			ArrayList<Proveedor> proveedor;
			try{in = new ObjectInputStream(new FileInputStream(rutaProve));
				proveedor = (ArrayList<Proveedor>)in.readObject();
				in.close();
			}catch(IOException | ClassNotFoundException e){
				e.printStackTrace();
				proveedor = null;
			}
			return proveedor;
		}
		public String escribirProducto(ArrayList<Producto>producto){
			String mensaje = "se agrego producto";
			try{ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(rutaProduc));
			out.writeObject(producto);
			out.flush();
			out.close();
			}catch(IOException e){
				e.printStackTrace();
				mensaje = "Error IO";
			}
			return mensaje;
		}
		public ArrayList<Producto> leerProducto(){
			 ArrayList<Producto> producto;
			ObjectInputStream in;
			try{in = new ObjectInputStream(new FileInputStream(rutaProduc));
			   producto = (ArrayList<Producto>)in.readObject();
		        in.close();
			}catch(IOException|ClassNotFoundException e){
				e.printStackTrace();
				producto = null;
			}
			return producto;
		}
		
		public String getRutaProve() {
			return rutaProve;
		}

		public void setRutaProve(String rutaProve) {
			this.rutaProve = rutaProve;
		}

		public String getRutaClie() {
			return rutaClie;
		}

		public void setRutaClie(String rutaClie) {
			this.rutaClie = rutaClie;
		}

	
		

}
