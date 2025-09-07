package exercicios.lista_1;

public class Exercicio7 {
    /*
    Ler dois valores de hora, minuto e segundo (h1, m1, s1, h2, m2, s2). Em seguida imprimir o
    intervalo entre esses dois horários em hora, minuto e segundo. Dica: converta os horários lidos
    para segundos, calcule a diferença e converta a diferença em hora, minuto e segundo.
    */

    private int h1;
    private int h2;

    public Exercicio7(int h1, int h2) {
        this.h1 = h1;
        this.h2 = h2;
    }

    public void calcularResultado() {
        int diferencaSeg = Math.abs(this.h1 - this.h2);
        int horas = diferencaSeg / 3600;
        diferencaSeg %= 3600;
        int minutos = diferencaSeg / 60;
        diferencaSeg %= 60;
        int segundos = diferencaSeg;

        System.out.printf("A diferença dos horários é de: %d h %d min %d seg\n", horas, minutos, segundos);
    }
}
