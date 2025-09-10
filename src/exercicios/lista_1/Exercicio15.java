package exercicios.lista_1;

public class Exercicio15 {
    private int numero;

    public Exercicio15(int numero) {
        this.numero = numero;
    }

    public void verificarCondicao() {
        int nums1 = numero / 100;
        int nums2 = numero % 100;

        int somaNums = nums1 + nums2;

        if (somaNums * somaNums == numero) {
            System.out.println("Este número faz parte da propriedade!");
            System.out.printf("%d + %d = %d => %d x %d = %d\n", nums1, nums2, somaNums,somaNums, somaNums, somaNums * somaNums);
        } else {
            System.out.println("Este número não faz parte da propriedade!");
            System.out.printf("%d + %d = %d => %d x %d = %d\n", nums1, nums2, somaNums, somaNums,somaNums, somaNums * somaNums);

        }
    }
}
