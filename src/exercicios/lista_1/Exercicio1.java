package exercicios.lista_1;

public class Exercicio1 {
    private double grausCelsius;

    public Exercicio1(double grausCelsius) {
        this.grausCelsius = grausCelsius;
    }

    public void calcular() {
        double fahrenheit = 32 + (212 - 32) / 100.0 * this.grausCelsius;

        System.out.printf("%.2fºC = %.2fºF\n", this.grausCelsius, fahrenheit);
    }
}
