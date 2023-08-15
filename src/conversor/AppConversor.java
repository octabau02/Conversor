package conversor;

import java.util.HashMap;

import javax.swing.JOptionPane;

import conversiones.Divisas;
import conversiones.Temperatura;
import interfaz.Ventanas;
/**
 * Clase principal donde inicia el programa
 */
public class AppConversor {
	
	public static void main(String[] args) {
		
		Ventanas vista = new Ventanas();
		Double cantidad = 0.0;
		String conversionElegida = "";
		Double cantidadConvertida = 0.0;
		
		String opcionSeleccionada = (String) vista.mostrarMenu();
		
		if (opcionSeleccionada == null) {
			Ventanas.finalizar();
		}
		
		boolean valido = false;
		do {
			String cantidadRecibida = vista.RecibirCantidad();
			try {
				cantidad = Double.parseDouble(cantidadRecibida);
				valido = true;
				
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Valor no valido", "ERROR", JOptionPane.ERROR_MESSAGE);
			}
			
		}while(!valido);

			
		
		switch (opcionSeleccionada) {
		case "Conversor de Moneda": {
			Divisas divisa = new Divisas();

			conversionElegida = divisa.MostrarOpcionesConversion();
			
			HashMap<String, Double> tasas = divisa.inicializarDatosConversion();
			
			cantidadConvertida = divisa.convertir(conversionElegida, tasas, cantidad);
						
			break;
		}
		case "Conversor de Temperatura":{
			
			Temperatura temp = new Temperatura();
						
			conversionElegida = temp.MostrarOpcionesConversion();
			
			HashMap<String, Double> valoresTemperatura = temp.inicializarDatosConversion();
			
			cantidadConvertida = temp.convertir(conversionElegida, valoresTemperatura, cantidad);
			
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcionSeleccionada);
		}
		
		vista.mostrarResultado(cantidadConvertida);
		vista.continuar();

	}
	

}
