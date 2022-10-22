
public class VideoJuego implements Entregable {
	
	private char titulo; 
	private int horas_estimadas = 10;
	private char genero ; 
	private char compañia;
	private boolean entregado = false;
	
	
	public VideoJuego() {
	}
	
	
	public VideoJuego(char titulo, int horas_estimadas) {
		this.titulo = titulo;
		this.horas_estimadas = horas_estimadas;
	}


	public VideoJuego(char titulo, int horas_estimadas, char genero, char compañia) {
		this.titulo = titulo;
		this.horas_estimadas = horas_estimadas;
		this.genero = genero;
		this.compañia = compañia;
	}


	public char getTitulo() {
		return titulo;
	}
	public void setTitulo(char titulo) {
		this.titulo = titulo;
	}
	public int getHoras_estimadas() {
		return horas_estimadas;
	}
	public void setHoras_estimadas(int horas_estimadas) {
		this.horas_estimadas = horas_estimadas;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public char getCompañia() {
		return compañia;
	}
	public void setCompañia(char compañia) {
		this.compañia = compañia;
	}



	public String toString() {
		return "VideoJuego [getTitulo()=" + getTitulo() + ", getHoras_estimadas()=" + getHoras_estimadas()
				+ ", getGenero()=" + getGenero() + ", getCompañia()=" + getCompañia() + "]";
	}


	@Override
	public boolean entregar() {
		// TODO Auto-generated method stub
		return true;
	}


	@Override
	public boolean devolver() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean isEntregado() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public void compareTo(Object a) {
		// TODO Auto-generated method stub
		horas_estimadas;
	}





	
	
	
	
	
	
	
	
	
	
	
}
