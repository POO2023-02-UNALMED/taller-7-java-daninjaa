package comunicacion;
import java.util.ArrayList;

public class Alfabeto extends Pictograma {
	static ArrayList<String> letras;
	private String interpretacion;

	public Alfabeto (String origen, ArrayList<String>letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	public void setInterpretacion() {
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
