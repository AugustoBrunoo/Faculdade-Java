package exercicios.lista_1;

public class Exercicio13 {
    private int horasTrabalhadas;
    private double valorDaHora;

    public Exercicio13(int horasTrabalhadas, double valorDaHora) {
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorDaHora = valorDaHora;
    }

    public double salarioBruto() {
        return this.horasTrabalhadas * this.valorDaHora;
    }

    public double calcularBonus() {
        double salario = salarioBruto();
        double porcentagem = 0;

        if (this.horasTrabalhadas <= 40) {
            // sem horas extras
            return horasTrabalhadas * valorDaHora;

        } else if (this.horasTrabalhadas <= 50) {
            // com 20% de bonus
            double salarioNormal = 40 * valorDaHora;
            int horasExtras = horasTrabalhadas - 40;
            double valorDaHoraExtra = valorDaHora * 1.20;
            double salarioExtra = horasExtras * valorDaHoraExtra;

            return  salarioNormal + salarioExtra;
        } else {

            double salarioNormal = 40 * valorDaHora;
            double salarioExtra1 = 10 * (valorDaHora * 1.20);

            int horasExtras2 = horasTrabalhadas - 50;
            double valorHoraExtra2 = valorDaHora * 2.0;
            double salarioExtra2 = horasExtras2 * valorHoraExtra2;

            return salarioNormal + salarioExtra1 + salarioExtra2;
        }
    }

}
