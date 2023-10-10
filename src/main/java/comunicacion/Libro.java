package comunicacion;

public class Libro extends Escrito{
	
	private String co_autor;
	private String editorial;
	private String edicion;
	private String interpretacion;
	
	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editorial = editorial;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
	}
	
	public String getCo_autor() {
		return co_autor;
	}
	
	public void setCoa_autor(String co_autor) {
		this.co_autor = co_autor;
	}
	
	public String getEditorial() {
		return editorial;
	}
	
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	public String getEdicion() {
		return edicion;
	}
	
	public void setEdicion(String edicion) {
		this.edicion = edicion;
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
		return String.format("%s\n%s\n%s\n%s\n%s\n%s\n%s", super.getOrigen(), super.getTitulo(), super.getAutor(), super.getPaginas(), this.co_autor, this.editorial, this.edicion);
	}
	
	public int palabrasTotales(int palabrasPagina) {
		return super.getPaginas() * palabrasPagina * 2;
	}
}
