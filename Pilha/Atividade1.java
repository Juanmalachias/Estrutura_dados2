package Pilha;

import java.util.Stack;
import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Stack<String> pilhaLivros = new Stack<>();
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("Menu:");
            System.out.println("1: Adicionar um novo livro na pilha");
            System.out.println("2: Listar todos os livros da pilha");
            System.out.println("3: Retirar um livro da pilha");
            System.out.println("0: O programa deve ser finalizado.");
            System.out.print("Digite uma opção: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine();  // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    String nomeLivro = scanner.nextLine();
                    pilhaLivros.push(nomeLivro);
                    System.out.println("\nPilha:\n" + pilhaLivros.toString().replaceAll(",", "\n") + "\nLivro adicionado!\n");
                    break;

                case 2:
                    System.out.println("\nLista de Livros na Pilha:\n" + pilhaLivros.toString().replaceAll(",", "\n") + "\n");
                    break;

                case 3:
                    if (!pilhaLivros.isEmpty()) {
                        String livroRetirado = pilhaLivros.pop();
                        System.out.println("\nPilha:\n" + pilhaLivros.toString().replaceAll(",", "\n") + "\nUm Livro foi retirado da pilha!\n");
                    } else {
                        System.out.println("\nA Pilha está vazia!\n");
                    }
                    break;

                case 0:
                    System.out.println("\nPrograma Finalizado!\n");
                    break;

                default:
                    System.out.println("\nOpção inválida. Por favor, escolha uma opção válida.\n");
            }
        }

        scanner.close();
    }
}
