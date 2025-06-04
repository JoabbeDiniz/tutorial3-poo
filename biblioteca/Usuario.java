package biblioteca;

public abstract class Usuario {
	private String matricula;
	private String nome;
	private String senha;
	private int numEmprestimos;
	
	public Usuario (String matricula, String nome, String senha) {
		setMatricula(matricula);
		setNome(nome);
		setSenha(senha);
		numEmprestimos = 0;
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
	
	public int getNumEmprestimos() {
		return numEmprestimos;
	}

	public void adicionarEmprestimo() {
		numEmprestimos++;
	}
	
	public void finalizarEmprestimo() {
		numEmprestimos--;
	}
	
	@Override
	public String toString() {
		return "Usuario [matricula=" + matricula + ", nome=" + nome + ", senha=" + senha + "]";
	}
}
