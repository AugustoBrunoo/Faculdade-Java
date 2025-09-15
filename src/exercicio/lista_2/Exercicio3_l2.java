package exercicio.lista_2;

public class Exercicio3_l2 {
    int n, m, k;

    public Exercicio3_l2(int n, int m, int k) {
        this.n = n;
        this.m = m;
        this.k = k;
    }

    public void realizarCalculo() {
        for (int i = n; i < m; i++) {
            if (i % k == 0) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println(" ");
    }
}
