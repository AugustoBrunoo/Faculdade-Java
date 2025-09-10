package exercicios.lista_1;

public class Exercicio11 {
    private char escala;
    private double temperatura;

    public Exercicio11(char escala, double temperatura) {
        this.escala = escala;
        this.temperatura = temperatura;
    }

    public void mostrarResultado() {
        double f, c;

        if (this.escala == 'C') {
            f = 32 + ((212 - 32) / 100.0) * this.temperatura;

            System.out.printf("%.1f ºC = %.1f ºF\n", this.temperatura, f);

        } else {
            c = (this.temperatura - 32) * 100.0 / (212 - 32);

            System.out.printf("%.1f ºF = %.1f ºC\n", this.temperatura, c);
        }
    }

}
