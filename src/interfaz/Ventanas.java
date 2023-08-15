package interfaz;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import conversor.AppConversor;

/**
 * Contiene los metodos para la interfaz grafica
 */
public class Ventanas {
	
	public Object mostrarMenu() {
		String[] opciones= {"Conversor de Moneda", "Conversor de Temperatura"};

		return JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu", JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
	}
	
	public String RecibirCantidad(){

		String respuesta = JOptionPane.showInputDialog("Ingrese la cantidad a convertir");
//		validamos si presiono el boton cancelar
		if(respuesta == null) {
			finalizar();
		}
		return respuesta;
	
	}
	
	
	public void mostrarResultado(Double cantidad) {
		DecimalFormat df = new DecimalFormat();
		JOptionPane.showMessageDialog(null, "el resultado es: " + df.format(cantidad) );
	}
	
	public void continuar() {
		if(JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Selecciona una opción", 1) == 0) {
			AppConversor.main(null);
		}else {
			finalizar();
		}
	}
	
	public static void finalizar() {
		JOptionPane.showMessageDialog(null, "Programa terminado");
		System.exit(0);
	}
}
