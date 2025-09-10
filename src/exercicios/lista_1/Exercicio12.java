package exercicios.lista_1;

public class Exercicio12 {
    private int horasTrabalhadas;
    private double valorDaHora;

    public Exercicio12(int horasTrabalhadas, double valorDaHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorDaHora = valorDaHora;
    }

    public double salarioBruto() {
        return this.horasTrabalhadas * this.valorDaHora;
    }

    public void calcularIR(){
        double salario = salarioBruto();
        double porcentagem = 0;

        if (salario <= 1200) {
            porcentagem = 0;
        } else if (salario <= 1800) {
            porcentagem = 0.10;
        } else if (salario <= 2200) {
            porcentagem = 0.15;
        } else {
            porcentagem = 0.275;
        }

        if (porcentagem != 0) {
            salario -= salario * porcentagem;

            System.out.printf("Com o salário de R$ %.2f, terá %.1f%% de Imposto de Renda\n", salarioBruto(), porcentagem * 100);
            System.out.printf("Valor a pagar: R$ %.2f\n", salario);
        } else {
            System.out.printf("Seu salário de R$ %.2f tem isenção de Imposto de Renda!\n", salarioBruto());
        }
    }
}
