package exercicio.lista_2;

public class Exercicio4_l2 {
    int n, m, k;

    public Exercicio4_l2(int n, int m, int k) {
        this.n = n;
        this.m = m;
        this.k = k;
    }

    public void realizarCalculo() {
        int soma = 0;
        int contador = 0;

        for (int i = n; i < m; i++) {
            if (i % k == 0) {
                System.out.printf("%d ", i);
                soma += i;
                contador++;
            }
        }

        double media = (double) soma / contador;
        System.out.printf("\n");

        if (contador == 0) {
            System.out.printf("Não há números com os valores que você colocou!\n");
        } else {
            System.out.printf("A soma dos números é: %d\n", soma);
            System.out.printf("A média dos números é: %.2f\n", media);
        }
    }
}
