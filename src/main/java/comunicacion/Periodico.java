package comunicacion;

public class Periodico extends Escrito{
	private String fecha;
	private String primicia;
	private String interpretacion;
	
	public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	public String getPrimicia() {
		return primicia;
	}
	
	public void setPrimicia(String primicia) {
		this.primicia = primicia;
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
		return String.format("%s\n%s\n%s\n%d\n%s\n%s", super.getOrigen(), super.getTitulo(), super.getAutor(), super.getPaginas(), this.fecha, this.primicia);
	}
	
	public int palabrasTotales(int palabrasPagina) {
		return super.getPaginas() * palabrasPagina * 10;
	}
}
