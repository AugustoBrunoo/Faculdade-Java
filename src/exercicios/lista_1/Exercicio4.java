package exercicios.lista_1;

public class Exercicio4 {
    private double raio;
    private double altura;

    public Exercicio4(double raio, double altura) {
        this.raio = raio;
        this.altura = altura;
    }

    private double calcularVolume() {
        double volume;
        volume =  Math.PI * raio * raio * altura;
        return volume;
    }

    public void mostrarResultado() {
        double resultado = calcularVolume();

        System.out.printf("O volume de uma lata de raio %.2f cm e altura de %.2f cm é: %.2f cm^3\n", raio, altura, resultado);
    }
}
