package models;

public class Diaria extends Despesa {
    private double qtdDiaria;

    public String listarDespesa() {
        return " A despesa diária é: " + qtdDiaria;
    }

    public void cadastrarDespesa(String descricao, String nome, int qtdDiaria) {
        this.qtdDiaria = qtdDiaria;
    }

    public double calcularDespesa() {
        return qtdDiaria * 50;
    }

    public double getQtdDiaria() {
        return qtdDiaria;
    }

    public void setQtdDiaria(double qtdDiaria) {
        this.qtdDiaria = qtdDiaria;
    }
}
