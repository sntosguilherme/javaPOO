package org.example;

public class Acao extends AtivoFinanceiro {

    public Acao(String nome, double valorInvestido) {
        super(nome, valorInvestido);
    }

    @Override
    public double calcularRetorno(int meses) {
        return this.valorInvestido += this.valorInvestido * 0.08 * meses;
    }

    @Override
    public boolean podeResgatar(double valor, int meses) {
        return meses >= 6;
    }

    public String retornarAcao(){
        return "NOME DO ATIVO: " + this.nome + "\nVALOR INVESTIDO: " + this.valorInvestido + "\nTIPO: Acao";
    }

}