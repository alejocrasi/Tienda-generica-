package vista;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelTienda extends JPanel {
	
	private JLabel lbNombreTienda;
	private JButton btnActualizar;
	private Ventana vista;
	

	
	
	public PanelTienda(Ventana pVista) {
		vista = pVista;
		setLayout(new GridLayout (2,1));
		setBorder(new TitledBorder("Panel Tienda"));
		
		
		lbNombreTienda = new JLabel("NOMBRE GENERICO");
		btnActualizar = new JButton("btnActualizar");
		btnActualizar.setActionCommand(vista.ACTUALIZAR_TIENDA);
		
		add(lbNombreTienda);
		add(btnActualizar);
	}




	public JLabel getLbNombreTienda() {
		return lbNombreTienda;
	}

	public void setLbNombreTienda(JLabel lbNombreTienda) {
		this.lbNombreTienda = lbNombreTienda;
	}

	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	public void setBtnActualizar(JButton btnActualizar) {
		this.btnActualizar = btnActualizar;
	}
	

}
