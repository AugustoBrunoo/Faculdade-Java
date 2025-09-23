package exercicio.lista_2;

import java.util.ArrayList;

public class Exercicio8_l2 {
    ArrayList<Integer> valores = new ArrayList<>();

    private int numerosPares = 0;
    private int numerosImpares = 0;
    private int contPar = 0;
    private int contImpar = 0;

    public Exercicio8_l2(ArrayList<Integer> valores) {
        this.valores = valores;

        realizarMedia();
    }

    private void realizarMedia() {
        for (Integer valor : valores) {
            // se for par

            if (valor % 2 == 0) {
                numerosPares += valor;
                contPar++;
            } else {
                numerosImpares += valor;
                contImpar++;
            }
        }
    }

    public void mostrarCalculo() {
        if (valores.isEmpty()) {
            System.out.println("Nenhum valor foi adicionado!");
        }

        System.out.printf("A média de números pares é: %.2f\n", (float)numerosPares / contPar);
        System.out.printf("A média de números ímpares é %.2f\n", (float)numerosImpares / contImpar);
    }
}
