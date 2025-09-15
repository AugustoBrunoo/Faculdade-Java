package exercicio.lista_2;

public class Exercicio2_l2 {
    int v1, v2, valorInicial, valorFinal;

    public Exercicio2_l2(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
    }

    public void realizarCalculo() {
        if (this.v1 % 2 == 0) {
            this.v1++;
        }

        if (v1 > v2) {
            for (int i = v1; i >= v2 ; i-=2) {
                System.out.printf("%d ", i);
            }
        } else {
            for (int i = v1; i < v2; i += 2) {
                System.out.printf("%d ", i);
            }
        }
        System.out.println(" ");
    }
}
