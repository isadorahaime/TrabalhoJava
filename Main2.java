package Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        Cadastro cadastro = new Cadastro();
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("----- MENU -----");
            System.out.print("Escolha uma opção: ");
            System.out.println("1. Inserir Livro"); 
            System.out.println("2. Inserir emprestante"); 
            System.out.println("3. Inserir Livro na Biblioteca");
            System.out.println("4. Editar Livro");
            System.out.println("5. Editar Usuário");
            System.out.println("6. Emprestar Livro");
            System.out.println("7. Devolver Livro");
            System.out.println("8. Excluir Livro");
            System.out.println("9. Excluir artigo");
            System.out.println("10. Excluir Usuário");
            System.out.println("11. Exibir Livros do estoque");
            System.out.print("12. Exibir artigos do estoque ");
            System.out.println("13. Exibir Usuários");
            System.out.println("14. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = input.nextInt();


            switch (opcao) {
            
            case 1:
                System.out.print("Digite o titulo do livro: ");
                String tituloLivro = input.nextLine();
                System.out.print("Digite o autor do livro: ");
                String autorLivro = input.nextLine();
                System.out.print("Digite o ano do livro: ");
                int anoLivro = input.nextInt();
                System.out.print("Digite a editora do livro: ");
                String editora = input.nextLine();
                System.out.print("Digite o genero do livro: ");
                String genero = input.nextLine();
                System.out.println("Livro inserido: " + Livro.getTitulo());
                break;
                
            case 2:
                System.out.print("Digite o nome de quem empresta: ");
                String nome = input.nextLine();
                System.out.print("Digite o cpf de quem empresta: ");
                String cpf = input.nextLine();
                System.out.print("Digite o telefone de quem empresta: ");
                String telefone = input.nextLine();
                System.out.print("Digite o e-mail de quem empresta: ");
                String email= input.nextLine();
                System.out.print("Digite a data que esta emprestando: ");
                String dataEmprestimo = input.nextLine();
                PessoaEmpresta pessoaEmpresta = new PessoaEmpresta(null, nome, cpf, telefone, email);
                cadastro.AdicionarEmpresta(pessoaEmpresta);
                break;
                
            case 5:
            	System.out.println("digite o nome do usuario que deseja alterar");
            	nome = input.nextLine();
            	
            case 8:
                System.out.println("digite o nome do livro para excluir");
                String deletaLivros = input.nextLine();
                estoque.deletaLivro(deletaLivros);
                break;
                    
            case 9:
                System.out.println("digite o nome do artigo para excluir");
                String deletaArtigos = input.nextLine();
                estoque.deletaAtigo(deletaArtigos);
                break;
                    
                case 10:
                    System.out.println("escolha uma pessoa que voce deseja excluir");
                    String nomePessoa = input.nextLine();
                    cadastro.deletaPessoa(nomePessoa);
                    break;
                    
                case 11:
                    System.out.print("Lista de livros");
                    for (int i = 0; i < estoque.getLivros().size(); i++) {
                        String livros = estoque.get(i);
                        System.out.print(livros);
                        break;
                    }
                    
                case 12:
                    System.out.print("Lista de artigos ");
                    for (int i = 0; i < estoque.getArtigo().size(); i++) {
                        String artigo = estoque.get(i);
                        System.out.print(artigo);
                        break;
                    }
                case 13:
                    System.out.print("Lista de usuarios ");
                    for (int i = 0; i < cadastro.getPessoa().size(); i++) {
                        String users = cadastro.get(i);
                        System.out.print(users);
                        break;
                    }
              
                case 14:
                    System.out.print("Saindo... ");
                    break;
                    default:
                    System.out.print("Opção invalida");
                    break;

            }
        } 
        
        while (opcao != 14);
        scanner.close();

    }
}

        