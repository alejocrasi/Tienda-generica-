package modelo;

import javax.swing.JButton;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

import controlador.Controlador;

public class Librerias {
	private Controlador controlador;

	public Librerias(Controlador pcontrolador) {
		controlador =pcontrolador;
	}
	
	
	
	
	public void libreria(String []pCategorias  , int[] pNum) {
		DefaultPieDataset data = new DefaultPieDataset();
		for (int i = 0; i < pNum.length; i++) {
			data.setValue(pCategorias[i], pNum[i] );
		}


		// create a chart...
		JFreeChart chart = ChartFactory.createPieChart(
		"Sample Pie Chart",
		data,
		true, // legend?
		true, // tooltips?
		false // URLs?
		);
		// create and display a frame...
		ChartFrame frame = new ChartFrame("Proporción de Venta", chart);
		JButton btn = new JButton("aceptar");
		btn.setActionCommand("acep");
		btn.addActionListener(controlador);
		frame.add(btn).setBounds(100,500,120,120);;
		

		frame.pack();
		frame.setVisible(true);
		}

}
