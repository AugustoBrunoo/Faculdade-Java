package exercicios.lista_1;

import java.util.Collections;
import java.util.List;

public class Exercicio10 {
    // Ler 3 valores numéricos e imprimir a soma dos 2 maiores e a diferença dos 2 menores.
    // primeiro ordena e depois pega o primeiro mais o segundo

    private List <Integer> numeros;

    public Exercicio10(List<Integer> numeros) {
        Collections.sort(numeros);

        this.numeros = numeros;
    }

    private int somaMenores() {
         return numeros.get(0) + numeros.get(1);
    }

    private int somaMaiores() {
        return numeros.get(2) + numeros.get(1);
    }

    public void calcularResultado() {
        System.out.printf("A soma dos maiores números é: %d\n", somaMaiores());
        System.out.printf("A soma dos menores números é: %d\n", somaMenores());
    }
}
