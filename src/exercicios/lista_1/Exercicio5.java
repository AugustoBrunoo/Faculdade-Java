package exercicios.lista_1;

public class Exercicio5 implements InterfaceEx5 {
    private int numero;
    private int[] digitos = new int[3];

    public Exercicio5(int numero) {
        this.numero = numero;
    }

    public int calcularResultado() {
        int numeroRestante = this.numero;
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            int digito = numeroRestante % 10;

            digitos[2 - i] = digito;

            soma += digito;

            numeroRestante /= 10;
        }

        return soma;
    }

    public void mostrarResultado() {
        int resultado = calcularResultado();

        System.out.printf("%d + %d + %d = %d\n", digitos[0], digitos[1], digitos[2], resultado);
    }



}
