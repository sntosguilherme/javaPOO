package org.example;

public class CDB extends AtivoFinanceiro {

    public CDB(String nome, double valorInvestido) {
        super(nome, valorInvestido);
    }

    @Override
    public double calcularRetorno(int meses) {
        return this.valorInvestido + this.valorInvestido * 0.04 * meses;
    }

    @Override
    public boolean podeResgatar(double valor, int meses) {
        return valor <= valorInvestido / 2;
    }
    public String retornarCDB(){
        return "NOME DO ATIVO: " + this.nome + "\nVALOR INVESTIDO: " + this.valorInvestido + "\nTIPO: CDB";
    }
}