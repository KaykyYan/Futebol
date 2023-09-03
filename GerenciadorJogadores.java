import java.util.Scanner;

public class GerenciadorJogadores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vetor vetor = new Vetor();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Adicionar jogador");
            System.out.println("2. Listar jogadores");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha após o próximo inteiro

            switch (opcao) {
                case 1:
                    System.out.print("Nome do jogador: ");
                    String nome = scanner.nextLine();
                    System.out.print("Posição do jogador: ");
                    String posicao = scanner.nextLine();
                    Jogador jogador = new Jogador(nome, posicao);
                    vetor.adicionar(jogador);
                    break;
                case 2:
                    for (int i = 0; i < vetor.tamanho(); i++) {
                        Jogador j = vetor.obter(i);
                        System.out.println(i + ". " + j);
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
