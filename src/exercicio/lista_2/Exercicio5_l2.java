package exercicio.lista_2;

public class Exercicio5_l2 {
    int num;

    public Exercicio5_l2(int num) {
        this.num = num;
    }

    private int realizarCalculo() {
        int div1 = num / 100;
        int div2 = num % 100;

        System.out.printf("%d + %d = %d * %d = %d \n", div1, div2, div1 + div2, div1 + div2, (div1 + div2) * (div1 + div2));

        return (div1 + div2) * (div1 + div2);
    }

    public void mostrarResultado() {
        int resultado = realizarCalculo();

        if (resultado == num) {
            System.out.printf("O número condiz com o calculo!\n");
        } else {
            System.out.printf("O número não condiz com o calculo!\n");
        }
    }
}
