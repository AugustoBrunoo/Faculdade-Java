package exercicio.lista_2;

import java.util.ArrayList;

public class Exercicio7_e2 {
    private ArrayList<Integer> numeros = new ArrayList<>();

    private int maiorNumero = numeros.getFirst();
    private int menorNumero = numeros.getFirst();

    public Exercicio7_e2(ArrayList<Integer> numeros) {
        this.numeros = numeros;
    }

    private void numExtremos() {
        for (int i = 1; i < numeros.size(); i++) {
            if (numeros.get(i) > maiorNumero) {
                maiorNumero = numeros.get(i);
            }

            if (numeros.get(i) < menorNumero) {
                menorNumero = numeros.get(i);
            }
        }
    }

    private int somaNumeros() {
        int soma = 0;

        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
        }
        return soma;
    }
}
