package biblioteca;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Aluno("1111", "pedro", "1111"));
		usuarios.add(new Professor("2222", "maria", "2222"));
		usuarios.add(new Bibliotecario("3333", "josé", "3333"));
		usuarios.add(new Administrador("4444", "miguel", "4444"));

		List<Livro> livros = new ArrayList<>();
		livros.add(new Livro("0001", "livro1", "autor1", "comédia"));
		livros.add(new Livro("0002", "livro2", "autor2", "drama"));
		livros.add(new Livro("0003", "livro3", "autor3", "terror"));

		Scanner s = new Scanner(System.in);
		menu();

		int opcao = s.nextInt();
		while (opcao != 0) {
			try {
				if (opcao == 1) {
					login(s, usuarios, livros);
				} else {
					throw new RuntimeException("Opção inválida!");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {
				System.out.println();
				menu();
				opcao = s.nextInt();
			}

		}

	}

	private static void menu() {
		System.out.println();
		System.out.println("Sitema de login da biblioteca");
		System.out.println("1. Fazer Login");
		System.out.println("0. Sair");
		System.out.print("Digite o número de acordo com o que deseja fazer:");

	}

	private static void login(Scanner s, List<Usuario> usuarios, List<Livro> livros) {
		System.out.print("Escreva sua matrícula:");
		String matricula = s.next();
		System.out.print("Escreva sua senha:");
		String senha = s.next();
		Usuario usuario = null;
		System.out.println();
		for (Usuario u : usuarios) {
			if (matricula.equals(u.getMatricula()) && senha.equals(u.getSenha())) {
				usuario = u;
			}
		}
		if (usuario == null) {
			throw new RuntimeException("Credenciais inválidas!");
		}
		if (usuario instanceof Aluno) {
			menuAluno(livros, s);
		} else if (usuario instanceof Professor) {
			menuProfessor();
		} else if (usuario instanceof Bibliotecario) {
			menuBibliotecario();
		} else if (usuario instanceof Administrador) {
			menuAdministrador();
		}
	}

	private static void menuAluno(List<Livro> livros, Scanner s) {
		while (true) {
			try {
				System.out.println();
				System.out.println("Portal do aluno");
				System.out.println("1. Buscar livros");
				System.out.println("2. Reservar livros");
				System.out.println("3. Renovar empréstimos");
				System.out.println("0. Sair");
				System.out.print("Digite o número de acordo com o que deseja fazer:");
				int opcao = s.nextInt();
				if (opcao == 1) {
					buscarLivro(livros, s);
				} else if (opcao == 2) {
					reservarLivro();
				} else if (opcao == 3) {
					renovarEmprestimo();
				} else if (opcao == 0) {
					return;
				} else {
					throw new RuntimeException("Opção inválida!");
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}
	}

	private static void menuProfessor() {
		System.out.println("Portal do professor");
		System.out.println("1. Buscar livros");
		System.out.println("2. Reservar livros");
		System.out.println("3. Renovar empréstimos");
		System.out.println("0. Sair");
		System.out.print("Digite o número de acordo com o que deseja fazer:");
	}

	private static void menuBibliotecario() {
		System.out.println("Portal do bibliotecário");
		System.out.println("1. Buscar livros");
		System.out.println("2. Reservar livros");
		System.out.println("3. Renovar empréstimos");
		System.out.println("4. Registrar empréstimo");
		System.out.println("5. Registrar devolução");
		System.out.println("0. Sair");
		System.out.print("Digite o número de acordo com o que deseja fazer:");
	}

	private static void menuAdministrador() {
		System.out.println("Portal do administrador");
		System.out.println("1. Buscar livros");
		System.out.println("2. Reservar livros");
		System.out.println("3. Renovar empréstimos");
		System.out.println("4. Registrar empréstimo");
		System.out.println("5. Registrar devolução");
		System.out.println("6. Cadastrar livro");
		System.out.println("7. Exluir registro de livro");
		System.out.println("8. Gerar relatório");
		System.out.println("0. Sair");
		System.out.print("Digite o número de acordo com o que deseja fazer:");

	}

	private static void buscarLivro(List<Livro> livros, Scanner s) {
		System.out.println("1. Buscar por título");
		System.out.println("2. Buscar por autor");
		System.out.println("3. Buscar por categoria");
		System.out.print("Digite o número de acordo com o que deseja fazer:");
		int opcao = s.nextInt();
		if (opcao == 1) {
			System.out.print("Digite o título do livro:");
			String titulo = s.next();
			for (Livro l : livros) {
				if (titulo.equals(l.getTitulo())) {
					System.out.println(l);
				}
			}
		} else if (opcao == 2) {
			System.out.println("Digite o nome do autor:");
			String autor = s.next();
			for (Livro l : livros) {
				if (autor.equals(l.getAutor())) {
					System.out.println(l);
				}
			}
		} else if (opcao == 3) {
			System.out.println("Digite o nome da categoria:");
			String categoria = s.next();
			for (Livro l : livros) {
				if (categoria.equals(l.getCategoria())) {
					System.out.println(l);
				}
			}
		} else {
			throw new RuntimeException("Opção inválida!");
		}
	}

	private static void reservarLivro() {
		// TODO Auto-generated method stub

	}

	private static void renovarEmprestimo() {
		// TODO Auto-generated method stub

	}
}
