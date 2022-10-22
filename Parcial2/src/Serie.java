
public class Serie implements Entregable {
	
	private int numero_de_temporadas = 3;
	private char genero ;
	private char creador;
	private char titulo ;
	private boolean entregado = false;
	
	
	public Serie() {
	}
	
	
	public Serie(char creador, char titulo) {
		this.creador = creador;
		this.titulo = titulo;
	}
	
	

	public Serie(int numero_de_temporadas, char genero, char creador, char titulo) {
		this.numero_de_temporadas = numero_de_temporadas;
		this.genero = genero;
		this.creador = creador;
		this.titulo = titulo;
	}


	public int getNumero_de_temporadas() {
		return numero_de_temporadas;
	}
	public void setNumero_de_temporadas(int numero_de_temporadas) {
		this.numero_de_temporadas = numero_de_temporadas;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public char getCreador() {
		return creador;
	}

	public void setCreador(char creador) {
		this.creador = creador;
	}

	public char getTitulo() {
		return titulo;
	}

	public void setTitulo(char titulo) {
		this.titulo = titulo;
	}



	public String toString() {
		return "Serie [getNumero_de_temporadas()=" + getNumero_de_temporadas() + ", getGenero()=" + getGenero()
				+ ", getCreador()=" + getCreador() + ", getTitulo()=" + getTitulo() + "]";
	
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
		numero_de_temporadas;
		
	}
	
	
	
}

