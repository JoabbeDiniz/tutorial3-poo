package biblioteca;

import java.time.LocalDate;

public class Emprestimo {
	private Usuario usuario;
	private Livro livro;
	private LocalDate dataEmp;
	private LocalDate dataDev;
	
	public Emprestimo(Usuario usuario, Livro livro) {
		this.usuario = usuario;
		this.livro = livro;
		dataEmp = LocalDate.now();
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public Livro getLivro() {
		return livro;
	}

	public LocalDate getDataEmp() {
		return dataEmp;
	}

	public LocalDate getDataDev() {
		return dataDev;
	}

	@Override
	public String toString() {
		return "Emprestimo [usuario=" + usuario + ", livro=" + livro + ", dataEmp=" + dataEmp + ", dataDev=" + dataDev
				+ "]";
	}
}
