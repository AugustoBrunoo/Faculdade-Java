package exercicios.lista_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int loop = 0;
        Scanner leitor = new Scanner(System.in);

        while (loop != 1) {
            System.out.print("Digite o exercicio que deseja ver (Digite 0 para sair!): ");
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
                case 6:
                    // Exercicio 6:
                    System.out.printf("Digite um numero (com ponto flutuante) para arredondar: ");
                    double num = leitor.nextDouble();
                    var exercicio6 = new Exercicio6(num); // linha: 119

                    exercicio6.mostrarResultado();
                    break;

                case 7:
                    // Exercicio 7:
                    int h1, m1, s1, h2, m2, s2;

                    System.out.println("Digite os dados necessários:");
                    System.out.println(" ");
                    System.out.println("Horário 1: ");

                    do {
                        System.out.printf("Hora 1 (0-23h): ");
                        h1 = leitor.nextInt();

                        if (h1 < 0 || h1 > 23) {
                            System.out.println("Hora incorreta! Tente novamente!");
                        }

                    } while (h1 < 0 || h1 > 23);

                    do {
                        System.out.printf("Minuto 1: (0-59min): ");
                        m1 = leitor.nextInt();

                        if (m1 < 0 || m1 > 59) {
                            System.out.println("Minutos incorreto! Tente novamente!");
                        }

                    } while (m1 < 0 || m1 > 59);

                    do {
                        System.out.printf("Segundo 1: (0-59seg): ");
                        s1 = leitor.nextInt();

                        if (s1 < 0 || s1 > 59) {
                            System.out.println("Hora incorreta! Tente novamente!");
                        }

                    } while (s1 < 0 || s1 > 59);

                    System.out.println(" ");
                    System.out.println("Horário 2:");

                    do {
                        System.out.printf("Hora 2 (0-23h): ");
                        h2 = leitor.nextInt();

                        if (h2 < 0 || h2 > 23) {
                            System.out.println("Hora incorreta! Tente novamente!");
                        }

                    } while (h2 < 0 || h2 > 23);

                    do {
                        System.out.printf("Minuto 2: (0-59min): ");
                        m2 = leitor.nextInt();

                        if (m2 < 0 || m2 > 59) {
                            System.out.println("Hora incorreta! Tente novamente!");
                        }

                    } while (m2 < 0 || m2 > 59);

                    do {
                        System.out.printf("Segundo 2: (0-59seg): ");
                        s2 = leitor.nextInt();

                        if (s2 < 0 || s2 > 59) {
                            System.out.println("Hora incorreta! Tente novamente!");
                        }

                    } while (s2 < 0 || s2 > 59);


                    int somaTotalH1 = h1 * 3600 + m1 * 60 + s1;
                    int somaTotalH2 = h2 * 3600 + m2 * 60 + s2;

                    // se h2 for menor, um dia se passou e deve se passar 1 dia a mais em segundos
                    if (somaTotalH1 > somaTotalH2) {
                        somaTotalH2 += 24 * 3600;
                    }

                    var exercicio7 = new Exercicio7(somaTotalH1, somaTotalH2);

                    exercicio7.calcularResultado();

                    break;

                case 8:
                    // Exercício 8:
                    int [] numeros = new int[3];
                    System.out.println("Digite 3 números a seguir:");

                    for (int i = 0; i < 3; i++) {
                        System.out.printf("Digite o número %d: ", i + 1);
                        int digito = leitor.nextInt();
                        numeros[i] += digito;
                    }

                    var exercicio8 = new Exercicio8(numeros);
                    exercicio8.mostrarResultado();

                    break;

                case 9:
                    // Exercício 9:
                    List <Integer> nums = new ArrayList<>();
                    System.out.println("Digite 3 números a seguir:");

                    for (int i = 0; i < 3; i++) {
                        System.out.printf("Digite o número %d: ", i + 1);
                        int ns = leitor.nextInt();
                        nums.add(ns);
                    }

                    System.out.println("Ordem colocada: " + nums);

                    var exercicio9 = new Exercicio9(nums);

                    System.out.println("Em ordem decrescente: " + exercicio9.getNumeros());
                    break;

                case 10:
                    // Exercício 10:
                    // Ler 3 valores numéricos e imprimir a soma dos 2 maiores e a diferença dos 2 menores.

                    List <Integer> ns = new ArrayList<>();

                    System.out.println("Digite 3 números a seguir: ");

                    for (int i = 0; i < 3; i++) {
                        System.out.printf("Digite o número %d: ", i + 1);
                        int n = leitor.nextInt();
                        ns.add(n);
                    }

                    var exercicio10 = new Exercicio10(ns);

                    exercicio10.calcularResultado();

                    break;

                case 11:
                    // Exercício 11:
                    char escala;

                    do {
                        System.out.println("Digite a escala desejada para conversão: ");
                        System.out.println("C - Celsius");
                        System.out.println("F - Fahrenheit");
                        System.out.printf("Digite a escala: ");

                        escala = leitor.next().toUpperCase().charAt(0);

                        if (escala != 'C' && escala != 'F') {
                            System.out.println("Escala incorreta! Digite as escalas existentes:");
                        }

                    } while (escala != 'C' && escala != 'F');

                    double temperatura;

                    if (escala == 'C') {
                        System.out.printf("Digite a temperatura em ºC: ");
                        temperatura = leitor.nextDouble();
                    } else {
                        System.out.printf("Digite a temperatura em ºF: ");
                        temperatura = leitor.nextDouble();
                    }

                    var exercicio11 = new Exercicio11(escala, temperatura);

                    exercicio11.mostrarResultado();
                    break;

                case 12:
                    // Exercicio 12:
                    System.out.println("Calculadora de IR:");
                    int horasTrabalhadas;
                    double valorPorHora;

                    do {
                        System.out.printf("Quantas horas você trabalhou no mês? ");
                        horasTrabalhadas = leitor.nextInt();

                        if (horasTrabalhadas > 732) {
                            System.out.println("Atenção!");
                            System.out.println("1 mês tem 732h em média");
                            System.out.printf("%d execede mais de 1 mês de trabalho!\n", horasTrabalhadas);
                            System.out.println(" ");
                        }

                    } while (horasTrabalhadas > 732);

                    System.out.printf("Qual é o valor da sua hora trabalhada (R$/1h)? ");
                    valorPorHora = leitor.nextDouble();

                    var exercicio12 = new Exercicio12(horasTrabalhadas, valorPorHora);

                    exercicio12.calcularIR();

                    break;

                case 13:
                    System.out.println("Calculadora de bônus semanal:");

                    int horasTrab;
                    double valorDaHTrab;

                    do {
                        System.out.printf("Digite o numero de horas trabalhadas nesta semana: ");
                        horasTrab = leitor.nextInt();
                    } while (horasTrab > 168 || horasTrab < 0);

                    do {
                        System.out.printf("Digite o valor da sua hora trabalhada (1h/R$): R$");
                        valorDaHTrab = leitor.nextDouble();

                        if (valorDaHTrab < 0) System.out.printf("Digite o valor do seu salário corretamente!");

                    } while (valorDaHTrab < 0);

                    var exercicio13 = new Exercicio13(horasTrab, valorDaHTrab);

                    // Rever a partir daqui ---

                    // Calcula o salário final (com ou sem bônus) de uma vez
                    double salarioFinal = exercicio13.calcularBonus();

                    System.out.println("\n--- Holerite Semanal ---");
                    System.out.printf("Horas trabalhadas: %d h\n", horasTrab);
                    System.out.printf("Valor da hora normal: R$ %.2f\n", valorDaHTrab);

                    // Comparamos as horas trabalhadas para decidir a mensagem
                    if (horasTrab <= 40) {
                        System.out.println("Não houve horas extras nesta semana.");
                        System.out.printf("Salário Semanal: R$ %.2f\n", salarioFinal);
                    } else {
                        double salarioBase = 40 * valorDaHTrab;
                        double valorBonus = salarioFinal - salarioBase;

                        System.out.println("Houve horas extras com bônus!");
                        System.out.printf("Valor do bônus sobre as horas extras: R$ %.2f\n", valorBonus);
                        System.out.printf("Salário Semanal Final: R$ %.2f\n", salarioFinal);
                    }

                    break;

                case 14:
                    // Exercicio 14:

                    System.out.println("É um triangulo?");
                    System.out.printf("Digite o valor do lado a: ");
                    int a = leitor.nextInt();
                    System.out.printf("Digite o valor do lado b: ");
                    int b = leitor.nextInt();
                    System.out.printf("Digite o valor do lado c: ");
                    int c = leitor.nextInt();

                    if ((a + b > c) && (a + c > b) && (b + c > a)) {
                        var exercicio14 = new Exercicio14(a, b, c);
                        exercicio14.mostrarTriangulo();

                    } else {
                        System.out.println("Com as medidas dadas, ele não será um triângulo!");
                    }

                    break;

                case 15:
                    // Exercício 15:
                    int numDigito;

                    do {
                        System.out.printf("Digite um número de 4 digitos: ");
                        numDigito = leitor.nextInt();

                        if (numDigito < 1000 || numDigito > 9999) {
                            System.out.println("Digite um valor de 4 dígitos!");
                        }

                    } while (numDigito < 1000 || numDigito > 9999);

                    var exercicio15 = new Exercicio15(numDigito);

                    exercicio15.verificarCondicao();

                    break;
                case 0:
                    loop = 1;
                    break;
                default:
                    break;
            }
        }
        System.out.println("Programa encerrado!");
        leitor.close();
    }
}
