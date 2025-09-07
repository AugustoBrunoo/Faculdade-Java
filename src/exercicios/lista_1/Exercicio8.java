package exercicios.lista_1;

public class Exercicio8 {
    // Ler 3 valores inteiros do usuário e mostrar o maior deles, o menor deles e a média.

    private int [] numeros;

    public Exercicio8(int[] numeros) {
        this.numeros = numeros;
    }

    private double calcularMedia() {
        int somaTotal = 0;

        for (int i = 0; i < 3; i++) {
            somaTotal += numeros[i];
        }

        return somaTotal / 3.0;
    }

    private int maiorNum() {
        int maiorT = Math.max(numeros[0], numeros[1]);
        int maiorReal = Math.max(maiorT, numeros[2]);

        return maiorReal;
    }

    private int menorNum() {
        int menorT = Math.min(numeros[0], numeros[1]);
        int menorReal = Math.min(menorT, numeros[2]);

        return menorReal;
    }

    public void mostrarResultado () {
        double media = calcularMedia();
        int maiorNum = maiorNum();
        int menorNum = menorNum();

        System.out.printf("Com os números: [ ");

        for (int i = 0; i < 3; i++) {
            System.out.printf("%d ", numeros[i]);
        }

        System.out.printf("]\n");

        System.out.printf("Média dos números: %.2f\n", media);
        System.out.printf("Maior número: %d\n", maiorNum);
        System.out.printf("Menor número: %d\n", menorNum);

    }
}
