package Fila;

import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        Queue<String> Fila = new LinkedList<>();
        
        Scanner leia = new Scanner(System.in);
        int opcao = 0;
        String nome = "";
        
        while (opcao != 4) {
            System.out.println("\nMenu");
            System.out.println("1 - Adicionar cliente à lista");
            System.out.println("2 - Mostrar a lista de clientes");
            System.out.println("3 - Chamar o cliente");
            System.out.println("4 - Sair");
            
            opcao = leia.nextInt();
            leia.nextLine(); // Consumir a quebra de linha após o nextInt()
            
            switch (opcao) {
                case 1:
                    System.out.println("\nAdicionar o nome à lista: ");
                    nome = leia.nextLine();
                    Fila.add(nome);
                    System.out.println("\nCliente " + nome + " adicionado");
                    break;

                case 2:
                    System.out.println("\nLista de clientes:");
                    for (String cliente : Fila) {
                        System.out.println(cliente);
                    }
                    break;

                case 3:
                    if (!Fila.isEmpty()) {
                        String clienteChamado = Fila.poll();
                        System.out.println("\nCliente " + clienteChamado + " foi chamado");
                    } else {
                        System.out.println("\nA fila está vazia!");
                    }
                    break;

                case 4:
                    System.out.println("\nPrograma Finalizado!");
                    break;

                default:
                    System.out.println("\nOpção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }
        
        leia.close();
    }

}
