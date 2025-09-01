package exercicios.lista_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int loop = 0;
        Scanner leitor = new Scanner(System.in);

        while (loop != 1) {
            System.out.print("Digite o exercicio que deseja ver: ");
            int escolha = leitor.nextInt();

            switch (escolha) {
                case 1:
                    // Exercício 1:
                    System.out.print("Digite um valor em ºC: ");

                    double valor = leitor.nextDouble();

                    var exercicio1 = new Exercicio1(valor);
                    exercicio1.calcular();
                    break;

                case 2:
                    // Exercício 2:
                    int [] pesos = new int[3];
                    double [] notas = new double[3];

                    System.out.println("Digite a nota dos trabalhos:");

                    for (int i = 0; i < 3; i++) {
                        System.out.printf("Digite a nota %d: ", i + 1);

                        double nota;

                        do {
                            nota = leitor.nextDouble();
                        } while (nota < 0 || nota > 10);

                        System.out.printf("Digite o peso da nota %d: ", i + 1);

                        int peso;
                        do {
                            peso = leitor.nextInt();
                        } while (peso < 0 || peso > 10);

                        notas[i] = nota;
                        pesos[i] = peso;

                    }

                    var exercicio2 = new Exercicio2(pesos, notas);

                    exercicio2.exibirMedia();
                    break;
                case 3:
                    // Exercício 3

                    System.out.printf("Digite seu salário: R$ ");

                    double salario;
                    do {
                        salario = leitor.nextDouble();
                    } while (salario < 0);

                    System.out.printf("Digite o percentual de comissão em (%%): ");

                    double comissao;

                    do {
                        comissao = leitor.nextDouble();
                    } while (comissao < 0);

                    var exercicio3 = new Exercicio3(salario, comissao);
                    exercicio3.exibirSalario();
                    break;

                case 4:
                    // Exercicio 4:
                    double raio, altura;

                    do {
                        System.out.printf("Digite o raio da lata: ");
                        raio = leitor.nextDouble();

                        if (raio <= 0) {
                            System.out.println("Digite um valor maior que 0!");
                        }

                    } while (raio <= 0);

                    do {
                        System.out.printf("Digite a altura da lata: ");
                        altura = leitor.nextDouble();

                        if (altura <= 0) {
                            System.out.println("Digite um valor maior que 0!");
                        }
                    } while (altura <= 0);

                    var exercicio = new Exercicio4(raio, altura);

                    exercicio.mostrarResultado();
                    break;

                case 5:
                    // Exercício 5:
                    System.out.printf("Digite um número de 100 - 999: ");
                    int numero = leitor.nextInt();

                    var exercicio5 = new Exercicio5(numero);
                    exercicio5.mostrarResultado();
                    break;

                case 0:
                    loop = 1;
                    break;
                default:
                    break;
            }
        }
        leitor.close();
    }
}
