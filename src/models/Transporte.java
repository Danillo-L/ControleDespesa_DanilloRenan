package models;

public class Transporte extends Despesa{
    private double kmPercorrida;
    private double valorPedagio;



    public void cadastrarDespesa(String descricao, double kmPercorrida, double valorPedagio) {

    }

    public String listarDespesa() {
        return "A valor gasto com transporte é:  " ;
    }

    public double calcularDespesa() {
        return (kmPercorrida * 3) + valorPedagio;
    }

    public void cadastrarDespesa(String descricao, String nome, int qtdRefeicao) {
        this.kmPercorrida = kmPercorrida;
        this.valorPedagio = valorPedagio;
    }

    public double getKmPercorrida() {
        return kmPercorrida;
    }

    public void setKmPercorrida(double kmPercorrida) {
        this.kmPercorrida = kmPercorrida;
    }

    public double getValorPedagio() {
        return valorPedagio;
    }

    public void setValorPedagio(double valorPedagio) {
        this.valorPedagio = valorPedagio;
    }
}
