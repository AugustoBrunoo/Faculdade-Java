package exercicio.lista_2;

public class Exercicio6_l2 {
    private int num;

    public Exercicio6_l2(int num) {
        this.num = num;
    }

    private int calcularResultado() {
        int valor = Math.abs(num);
        int contador = 0;

        while (valor > 0) {
            valor /= 10;
            System.out.println(valor);
            contador++;
        }

        return contador;
    }

    public void mostrarCalculo() {
        int contador = calcularResultado();

        System.out.printf("Contador: %d\n", contador);
    }

}
