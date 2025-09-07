package exercicios.lista_1;

import java.util.Collections;
import java.util.List;

public class Exercicio9 {
    // Ler 3 valores inteiros e imprimi-los em ordem decrescente.

    private List <Integer> numeros;

    public Exercicio9(List<Integer> numeros) {
        this.numeros = numeros;
    }

    public void colocarEmOrdem() {
        // Deve invocar na main ou no seu get
        // forma de ordenar uma List
        Collections.sort(this.numeros, Collections.reverseOrder());
    }

    public List<Integer> getNumeros() {
        colocarEmOrdem();
        return numeros;
    }
}
