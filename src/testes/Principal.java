package testes;

import models.Alimentacao;
import models.Despesa;
import models.Diaria;
import models.Transporte;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Alimentacao alimentacao = new Alimentacao();
        Diaria diaria = new Diaria();
        Transporte transporte = new Transporte();
        Despesa despesa = new Despesa() {

            public double calcularDespesa() {
                return 0;
            }

            public String listarDespesa() {
                return "";
            }

            public void cadastrarDespesa(String descricao, String nome, int qtdRefeicao) {

            }
        };

        Scanner list = new Scanner(System.in);
        System.out.println("CADASTRAR, LISTAR E CALCULAR DESPESA");
        System.out.println("==================================================");

        System.out.println("Gerenciamento de Despesas" +
                "\n 1 - Alimentação" +
                "\n 2 - Transporte" +
                "\n 3 - Diaria" +
                "\n 0 - Sair" +
                "\n Escolha o tipo de despesa");
        int opcao = list.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Despesas com Alimento" +
                        "\n ");

        }






    }
}
