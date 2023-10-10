package comunicacion;

public class Fabula extends Escrito{
	
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int pagina, String ensenanza, String interpretacion) {
		super(origen,titulo, autor, pagina);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	public String getEnsenanza() {
		return ensenanza;
	}
	
	public void setEnsenanza() {
		this.ensenanza = ensenanza;
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
	
	public String getTitulo() {
		return super.getTitulo();
	}
	public void setTitulo(String titulo) {
		super.setTitulo(titulo);
	}
	
	public String getAutor() {
		return super.getAutor();
	}
	
	public void setAutor(String autor) {
		super.setAutor(autor);
	}
	
	public int getPaginas() {
		return super.getPaginas();
	}
	
	public void setPaginas(int paginas) {
		super.setPaginas(paginas);
	}
	
	public String toString() {
		return String.format("%s\n%s\n%s\n%s\n%s", super.getOrigen(), super.getTitulo(), super.getAutor(), super.getPaginas(), this.ensenanza);
	}
	
	public int palabrasTotales(int palabrasPagina) {
		return super.getPaginas() * palabrasPagina;
	}
}
