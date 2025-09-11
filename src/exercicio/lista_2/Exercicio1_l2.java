package exercicio.lista_2;

public class Exercicio1_l2 {
    private int valor1, valor2;

    public Exercicio1_l2(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }

    public void realizarCalculo () {
        int inicio = this.valor1;
        int fim = this.valor2;

        if (inicio % 2 == 0) {
            inicio += 1;
        }

        System.out.printf("Os números no intervalo de [%d - %d]: ", inicio, fim);
        for (int i = inicio; i < fim; i += 2) {
            System.out.printf("%d ", i);
        }

        System.out.printf("\n\n");
    }
}
