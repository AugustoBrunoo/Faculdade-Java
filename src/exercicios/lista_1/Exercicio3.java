package exercicios.lista_1;

public class Exercicio3 {
    private double salario;
    private double percentual;

    public Exercicio3(double salario, double percentual) {
        this.salario = salario;
        this.percentual = percentual;
    }

    private double calcularSalario () {
        double percentualSalario = this.salario * (this.percentual / 100);

        double calculo = salario + percentualSalario;

        return calculo;
    }

    public void exibirSalario() {
        double calculo = calcularSalario();
        System.out.printf("O salário de R$ %.2f com %.1f %% de comissão = R$ %.2f\n", this.salario, this.percentual, calculo);
    }
}
