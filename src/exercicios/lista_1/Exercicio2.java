package exercicios.lista_1;

public class Exercicio2 {
    private int [] pesos;
    private double[] notas;

    public Exercicio2(int[] arrayDePesos, double[] arrayDeNotas) {
        this.pesos = arrayDePesos;
        this.notas = arrayDeNotas;
    }

    public double calcularMedia() {
        double somaNotas = 0;
        int somaPesos = 0;

        double resultado = 0;

        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }

        return resultado = somaNotas / somaPesos;
    }

    public void exibirMedia() {
        double media = calcularMedia();

        System.out.printf("A média das notas é: %.2f\n", media);
    }
}
