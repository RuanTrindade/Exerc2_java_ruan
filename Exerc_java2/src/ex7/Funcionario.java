package ex7;

public class Funcionario {

    private String nome;
    private double valorHora;
    private int horasTrabalhadas;

    public Funcionario(String nome, double valorHora, int horasTrabalhadas) {
        this.nome = nome;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public double calcularPagamento() {
        return valorHora * horasTrabalhadas;
    }
}
