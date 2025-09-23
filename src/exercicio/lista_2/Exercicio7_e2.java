package exercicio.lista_2;

import java.util.ArrayList;

public class Exercicio7_e2 {
    private ArrayList<Integer> numeros = new ArrayList<>();

    private int maiorNumero;
    private int menorNumero;

    public Exercicio7_e2(ArrayList<Integer> numeros) {
        this.numeros = numeros;

        if (numeros != null && !numeros.isEmpty()) {
            this.maiorNumero = numeros.getFirst();
            this.menorNumero = numeros.getFirst();
        }

        this.numExtremos();
    }

    private void numExtremos() {
        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) > maiorNumero) {
                maiorNumero = numeros.get(i);
            }

            if (numeros.get(i) < menorNumero) {
                menorNumero = numeros.get(i);
            }
        }
    }

    private int somaNumeros() {
        int soma = 0;

        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
        }

        return soma;
    }

    public void mostrarCalculo() {
        int acumuladorNumeros = somaNumeros();

        if (numeros == null || numeros.isEmpty()) {
            System.out.println("Nenhum número foi inserido para calcular!");
            return;
        }

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        // o -1 retira o zero da conta

        System.out.printf("A média dos números é: %.2f\n", (float)acumuladorNumeros / numeros.size() - 1);
        System.out.printf("O maior número é: %d\n", this.maiorNumero);
        System.out.printf("O menor número é: %d\n", this.menorNumero);
    }
}
