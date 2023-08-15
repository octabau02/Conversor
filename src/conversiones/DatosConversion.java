package conversiones;

import java.util.HashMap;


public interface DatosConversion {
	
	/**
	 * Este metodo retorna un HashMap que guarda el nombre y  valor de conversion
	 * @return
	 */
	public HashMap<String, Double> inicializarDatosConversion();
	
	/**
	 * Este metodo retorna una string que almacenan los nombres de las conversiones
	 * @return
	 */
	public String MostrarOpcionesConversion();

}
