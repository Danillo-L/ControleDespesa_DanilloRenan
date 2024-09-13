package models;

public class Alimentacao extends Despesa {
    private String nomeRestaurante;
    private int qtdRefeicao;

    public String listarDespesa() {
        return nomeRestaurante + qtdRefeicao;
    }


    public void cadastrarDespesa(String descricao, String nome, int qtdRefeicao) {

        this.qtdRefeicao = qtdRefeicao;
        this.nomeRestaurante = nome;
    }

    public double calcularDespesa() {
        return qtdRefeicao * 18;
    }

    public String getNomeRestaurante() {
        return nomeRestaurante;
    }

    public void setNomeRestaurante(String nomeRestaurante) {
        this.nomeRestaurante = nomeRestaurante;
    }

    public int getQtdRefeicao() {
        return qtdRefeicao;
    }

    public void setQtdRefeicao(int qtdRefeicao) {
        this.qtdRefeicao = qtdRefeicao;
    }
}
