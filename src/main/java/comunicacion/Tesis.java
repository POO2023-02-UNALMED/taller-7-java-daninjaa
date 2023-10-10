package comunicacion;
import java.util.ArrayList;
import java.util.Collections;
public class Tesis extends Escrito{

		private String idea;
		private ArrayList<String> argumentos;
		private String[] argumentosRegular;
		private String conclusion;
		private String referencias;
		private String interpretacion;
		
		public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
			super(origen, titulo, autor, paginas);
			this.idea = idea;
			this.argumentosRegular = argumentos;
			ArrayList<String> argumentosTemporal = new ArrayList<>();
			Collections.addAll(argumentosTemporal, this.argumentosRegular);
			this.argumentos = argumentosTemporal;
			this.conclusion = conclusion;
			this.referencias = referencias;			
		}
		
		public String getIdea() {
			return idea;
		}
		
		public void setIdea(String idea){
			idea = idea;
		}
		public String[] getArgumentos() {
			return argumentosRegular;
		}
		public void setArgumentos(String[] argumentos) {
			this.argumentosRegular = argumentos;
			ArrayList<String> argumentosTemporal = new ArrayList<>();
			Collections.addAll(argumentosTemporal, this.argumentosRegular);
		}
		public String getConclusion() {
			return this.conclusion;
		}
		
		public void setConclusion(String conclusion) {
			this.conclusion = conclusion;
		}
		
		public String getReferencias() {
			return this.referencias;
		}
		
		public void setReferencia(String referencias) {
			this.referencias = referencias;
		}
		
		public String interpretacion() {
			return this.interpretacion;
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
			String tempOrigen = super.getOrigen();
			String tempTitulo = super.getTitulo();
			String tempAutor = super.getAutor();
			int tempPaginas = super.getPaginas();
			int size = this.argumentos.size();
			return String.format("%s\n%s\n%s\n%d\n%s\n%d\n%s\n%s", tempOrigen, tempTitulo, tempAutor, tempPaginas, this.idea, size, this.conclusion, this.referencias);
		}
		
		public int palabrasTotales(int palabrasPagina) {
			return super.getPaginas() * palabrasPagina * 5;
		}

}
