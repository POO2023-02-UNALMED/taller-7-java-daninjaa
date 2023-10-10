package comunicacion;
import java.util.ArrayList;
import java.util.Collections;
public class Tesis extends Escrito{

		private String idea;
		static ArrayList<String> argumentos;
		private String conclusion;
		private String referencias;
		private String interpretacion;
		
		public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
			super(origen, titulo, autor, paginas);
			this.idea = idea;
			ArrayList<String> argumentosTemporal = new ArrayList<>();
			Collections.addAll(argumentosTemporal, argumentos)
			this.argumentos = argumentosTemporal;
			this.conclusion = conclusion;
			this.referencias = referencias;			
		}
		
		public String getIdea() {
			return idea;
		}
		
		public void setIdea() {
			this.idea = idea;
		}
		
		public String getConclusion() {
			return conclusion;
		}
		
		public void setConclusion() {
			this.conclusion = conclusion;
		}
		
		public String getReferencias() {
			return referencias;
		}
		
		public void setReferencia() {
			this.referencias = referencias;
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
			return String.format("%s\n%s\n%s\n%s\n%s\n%i\n%s\n%s", super.getOrigen(), super.getTitulo(), super.getAutor(), super.getPaginas(), this.idea, this.argumentos.size(), this.conclusion, this.referencias);
		}
		
		public int palabrasTotales(int palabrasPagina) {
			return super.getPaginas() * palabrasPagina * 5;
		}

}