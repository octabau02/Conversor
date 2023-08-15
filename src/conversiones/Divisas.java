package conversiones;

import java.util.HashMap;



public class Divisas extends Conversiones implements DatosConversion{
	
	
	@Override
	public HashMap<String, Double> inicializarDatosConversion() {
		HashMap<String, Double> tasasConversion = new HashMap<>();
		tasasConversion.put("PesosDolar", 1 / 16.72);
		tasasConversion.put("DolarPesos", 16.72);
		
		tasasConversion.put("PesosEuros", 1 / 18.39);
		tasasConversion.put("EurosPesos", 18.39);
		
		tasasConversion.put("PesosLibras", 1 / 21.50);
		tasasConversion.put("LibrasPesos", 21.50);
		
		tasasConversion.put("PesosYen", 1 / 0.12);
		tasasConversion.put("YenPesos", 0.12);
		
		tasasConversion.put("PesosWon", 1 / 0.013);
		tasasConversion.put("WonPesos", 0.013);
		
		return tasasConversion;
	}
	
	@Override
	public String MostrarOpcionesConversion() {
		String[] opciones = {"De Pesos a Dolar", "De Pesos a Euros", "De Pesos a Libras Esterlinas", "De Pesos a Yen Japones", "De Pesos a Won Sul-coreano",
							"De Dolar a Pesos", "De Euros a Pesos", "De Yen a Pesos", "De Won a Pesos"};
		return obtenerOpcionConversion("Monedas", "Seleccione una opción", opciones);
	}
	
	
}
