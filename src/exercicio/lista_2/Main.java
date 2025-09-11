package exercicio.lista_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Lista 2: Estruturas Condicionais e de Repetição");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        int opcao = 1;
        Scanner leitor = new Scanner(System.in);

        while (opcao != 0) {
            System.out.printf("Digite o exercício que você deseja ver (1 - 15): ");
            opcao = leitor.nextInt();

            switch (opcao) {
                case 1:
                    // Exercício 1: Ler os números inteiros n e m e imprimir os números ímpares no intervalo de n a m.
                    System.out.printf("Digite o 1º valor: ");
                    int v1 = leitor.nextInt();

                    System.out.printf("Digite o 2º valor: ");
                    int v2 = leitor.nextInt();

                    var exercicio1 = new Exercicio1_l2(v1, v2);

                    exercicio1.realizarCalculo();
                    break;

                default:
                    break;
            }
        }
    }
}
