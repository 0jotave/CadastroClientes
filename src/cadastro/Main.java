package cadastro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cadastro cadastro = new Cadastro();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Adicionar cliente");
            System.out.println("2. Listar clientes");
            System.out.println("3. Buscar cliente por CPF");
            System.out.println("4. Remover cliente por CPF");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("CPF: ");
                    String cpf = sc.nextLine();
                    System.out.print("Email: ");
                    String email = sc.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = sc.nextLine();
                    cadastro.adicionarCliente(new Cliente(nome, cpf, email, telefone));
                    break;
                case 2:
                    cadastro.listarClientes();
                    break;
                case 3:
                    System.out.print("Digite o CPF: ");
                    cadastro.buscarPorCPF(sc.nextLine());
                    break;
                case 4:
                    System.out.print("Digite o CPF a remover: ");
                    cadastro.removerPorCPF(sc.nextLine());
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        sc.close();
    }
}
