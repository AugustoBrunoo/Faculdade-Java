package exercicios.lista_1;

public class Exercicio14 {
    private int a, b, c;

    public Exercicio14(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

     public void mostrarTriangulo() {
        if (a == b && b == c) {
            System.out.println("É um triângulo equilátero!");
        } else if (a != b && b != c && c != a) {
            System.out.println("É um triângulo escaleno!");
        } else {
            System.out.println("É um triângulo isósceles");
        }
     }
}
