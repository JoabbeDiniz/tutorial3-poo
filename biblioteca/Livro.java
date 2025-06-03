package biblioteca;

public class Livro {
	private String codigo;
	private String titulo;
	private String autor;
	private String categoria;
	
	public Livro(String codigo, String titulo, String autor, String categoria) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.categoria = categoria;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public String getCategoria() {
		return categoria;
	}
	

}
