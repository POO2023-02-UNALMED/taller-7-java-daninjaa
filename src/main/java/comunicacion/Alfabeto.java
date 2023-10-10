package comunicacion;
import java.util.ArrayList;
import java.util.Collections;

public class Alfabeto extends Pictograma {
	static ArrayList<String> letras;
	private String interpretacion;

	public Alfabeto (String origen, String[] letras, String interpretacion) {
		super(origen);
		ArrayList<String> letrasTemporal = new ArrayList<>();
		Collections.addAll(letrasTemporal, letras);
		this.letras = letrasTemporal;
		this.interpretacion = interpretacion;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	public String getOrigen() {
		return super.getOrigen();
	}
	public void setOrigen(String origen) {
		super.setOrigen(origen);
	}
		
	public String toString() {
		return String.join(", ", letras);
	}
	
	public int cantidadLetras() {
		return letras.size();
	}
}
