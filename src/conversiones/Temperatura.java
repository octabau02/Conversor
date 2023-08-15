package conversiones;

import java.util.HashMap;

public class Temperatura extends Conversiones implements DatosConversion{

	@Override
	public HashMap<String, Double> inicializarDatosConversion() {
		
		HashMap<String, Double> temperaturas = new HashMap<String, Double>();
		temperaturas.put("CelsiusFarenheit", (double) 9/5);
		temperaturas.put("FarenheitCelsius", (double) 5/9);
		
		temperaturas.put("CelsiusKelvin", 273.15);
		temperaturas.put("KelvinCelsius", 273.15);
		
		
		return temperaturas;
	}

	@Override
	public String MostrarOpcionesConversion() {
		String[] opciones = {"De Celsius a Farenheit", "De Celsius a Kelvin", "De Farenheit a Celsius", "De Kelvin a Celsius"};
		return obtenerOpcionConversion("Elige la temperatura a la que deseas convertir", "Temperaturas", opciones);
	}
	
	/**
	 * Se sobreescribe el metodo convertir para hacer la adaptacion a conversiones de temperatura
	 */
	@Override
	public double convertir(String opcionConversion, HashMap<String, Double> valorConversion, Double cantidad) {
	
		switch (opcionConversion) {
		case "CelsiusFarenheit": {
			return (cantidad * valorConversion.get(opcionConversion)) + 32;
			
		}
		case "CelsiusKelvin": {
			return cantidad + valorConversion.get(opcionConversion);
		}
		case "FarenheitCelsius": {
			return (cantidad - 32) * valorConversion.get(opcionConversion);
		}
		case "KelvinCelsius": {
			return cantidad - valorConversion.get(opcionConversion);
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + opcionConversion);
		}
		
	}


}
