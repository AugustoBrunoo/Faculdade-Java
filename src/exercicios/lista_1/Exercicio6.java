package exercicios.lista_1;

public class Exercicio6 {
    private double numero;

    public Exercicio6(double numero) {
        this.numero = numero;
    }

    private double arredondarContaParaCima() {
        return Math.ceil(numero);
    }

    private double arredondarContaParaBaixo() {
        return Math.floor(numero);
    }

    public void mostrarResultado() {
        double numCima = arredondarContaParaCima();
        double numBaixo = arredondarContaParaBaixo();

        System.out.printf("O valor de %.1f, arrendondado para cima: %.0f | arredondando para baixo: %.0f\n", numero, arredondarContaParaCima(), arredondarContaParaBaixo());
    }
}
