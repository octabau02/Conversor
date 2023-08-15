
package conversiones;

import java.util.HashMap;

import javax.swing.JOptionPane;

import interfaz.Ventanas;

	public class Conversiones {
		/**
		 * Este metodo llama a funcion "obtenerOpcionConversion" y nos retorna la opcion seleccionada para
		 * obtener la conversion de entrada y salida
		 * @param mensaje
		 * @param titulo
		 * @param opciones
		 * @return
		 */
	
	public String obtenerOpcionConversion(String mensaje, String titulo, String[] opciones) {
		String  opcion = (String) JOptionPane.showInputDialog(null, mensaje, titulo, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);
		
		if (opcion == null) {
			Ventanas.finalizar();
		}
		
		String[] partes = opcion.split(" ");
		String origen = partes[1];
		String destino = partes[3];
		
		return origen+destino;
	}
	
	/**
	 * Este metodo retorna el valor ya convertido
	 * @param opcionConversion
	 * @param valorConversion
	 * @param cantidad
	 * @return
	 */
	public double convertir(String opcionConversion, HashMap<String, Double> valorConversion, Double cantidad) {
		
		return cantidad * valorConversion.get(opcionConversion);
	}
	
}
