package vista;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class PanelVerificarCliente extends JPanel{
	private JLabel lbCliente;
	private JButton btnCliente;
	private JTextField TxtCliente;
	private Ventana vista;
	
	public PanelVerificarCliente(Ventana pVista){
		vista = pVista;
		setLayout(null);
		setBorder(new TitledBorder("Ventas"));
		
		btnCliente = new JButton("buscar Cliente");
		btnCliente.setActionCommand(vista.BUSCAR_CLIENTE);
		
		TxtCliente = new JTextField();
		
		lbCliente = new JLabel("Ingrese ID cliente :");
		
		int y = 30;
		int x = 10;
		
		add(lbCliente);
		lbCliente.setBounds(x, y, 290, 20);
		add(TxtCliente);
		TxtCliente.setBounds(x*7, y, 290, 20);
		add(btnCliente);
		btnCliente.setBounds(x, y*2, 350, 20);
	
	}

	public JLabel getLbCliente() {
		return lbCliente;
	}

	public void setLbCliente(JLabel lbCliente) {
		this.lbCliente = lbCliente;
	}

	public JButton getBtnCliente() {
		return btnCliente;
	}

	public void setBtnCliente(JButton btnCliente) {
		this.btnCliente = btnCliente;
	}

	public JTextField getTxtCliente() {
		return TxtCliente;
	}

	public void setTxtCliente(JTextField txtCliente) {
		TxtCliente = txtCliente;
	}
	
	

}
