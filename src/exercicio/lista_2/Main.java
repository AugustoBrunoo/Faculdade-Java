package exercicio.lista_2;

import java.util.ArrayList;
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
                case 2:
                    // Exercício 2
                    System.out.printf("Digite o 1º valor: ");
                    int v1_e2 = leitor.nextInt();
                    System.out.printf("Digite o 2º valor: ");
                    int v2_e2 = leitor.nextInt();

                    var exercicio2 = new Exercicio2_l2(v1_e2, v2_e2);

                    exercicio2.realizarCalculo();
                    break;

                case 3:
                    // Exercício 3: Ler os números inteiros n, m e k e imprimir os números no intervalo de
                    // n a m que são divisíveis por k.

                    System.out.printf("Digite o valor n: ");
                    int vN = leitor.nextInt();

                    System.out.printf("Digite o valor m: ");
                    int vM = leitor.nextInt();

                    System.out.printf("Digite o valor k: ");
                    int vK = leitor.nextInt();

                    var exercicio3 = new Exercicio3_l2(vN,vM, vK);

                    exercicio3.realizarCalculo();
                    break;

                case 4:
                    System.out.printf("Digite o valor n: ");
                    int vN_e4 = leitor.nextInt();

                    System.out.printf("Digite o valor m: ");
                    int vM_e4 = leitor.nextInt();

                    System.out.printf("Digite o valor k: ");
                    int vK_e4 = leitor.nextInt();

                    var exercicio4 = new Exercicio4_l2(vN_e4,vM_e4,vK_e4);

                    exercicio4.realizarCalculo();

                    break;

                case 5:
                    // Exercício 5:

                    int num;

                    do {
                        System.out.printf("Digite um valor (4 algarismos): ");
                        num = leitor.nextInt();

                        if (num < 1000 || num > 9999) {
                            System.out.printf("Digite um número de 4 algarismos! (1000 - 9999)\n");
                        }

                    } while (num < 1000 || num > 9999);

                    var exercicio5 = new Exercicio5_l2(num);

                    exercicio5.mostrarResultado();
                    break;
                case 6:
                    // Exercicio 6:
                    System.out.printf("Digite um número: ");
                    int num_e6 = leitor.nextInt();

                    var exercicio6 = new Exercicio6_l2(num_e6);

                    exercicio6.mostrarCalculo();
                    break;

                case 7:
                    // Exercício 7:
                    int num_e7;
                    int acumulador = 0;
                    int contador = 0;

                    ArrayList <Integer> numeros = new ArrayList<>();

                    do {
                        System.out.printf("(Para encerrar digite zero ou valor negativo)\n");
                        System.out.printf("Digite um número: ");
                        num_e7 = leitor.nextInt();

                        if (num_e7 > 0) {
                            numeros.add(num_e7);
                        }

                    } while (num_e7 != 0);

                    var exercicio7 = new Exercicio7_e2(numeros); // linha 123

                    exercicio7.mostrarCalculo();
                    break;

                case 8:
                    // Exercício 8:
                    ArrayList<Integer> valores = new ArrayList<>();

                    int v;
                    int pos = 0;

                    do {
                        System.out.printf("Posição do número da lista: %d\n", pos);
                        System.out.printf("(Para encerrar digite zero ou valor negativo)\n");
                        System.out.printf("Digite um número: ");
                        v = leitor.nextInt();

                        if (v > 0) {
                            valores.add(v);
                        }

                        pos++;
                    } while (v != 0);

                    var exercicio8 = new Exercicio8_l2(valores);

                    exercicio8.mostrarCalculo();

                    break;

                case 9:
                    // Exercicio 9: Ler um inteiro n e imprimir seus divisores.

                    System.out.printf("Digite um número e direi seus divisores: ");
                    int n9 = leitor.nextInt();

                    var exercicio9 = new Exercicio9_l2();
                    // continuar aqui...
                    break;
                default:
                    break;
            }
        }
    }
}
