package biblioteca;

public abstract class Usuario {
	private String matricula;
	private String nome;
	private String senha;
	
	public Usuario (String matricula, String nome, String senha) {
		setMatricula(matricula);
		setNome(nome);
		setSenha(senha);
		
	}
	
	public String getMatricula () {
		return matricula;
	}
	
	private void setMatricula (String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	private void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
