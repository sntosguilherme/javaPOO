package org.example;

public class TesouroDireto extends AtivoFinanceiro {

    public TesouroDireto(String nome, double valorInvestido) {
        super(nome, valorInvestido);
    }

    @Override
    public double calcularRetorno(int meses) {
        return this.valorInvestido + this.valorInvestido * 0.03 * meses;
    }

    @Override
    public boolean podeResgatar(double valor, int meses) {
        return true;
    }
    public String retornarTesouroDireto(){
        return "NOME DO ATIVO: " + this.nome + "\nVALOR INVESTIDO: " + this.valorInvestido + "\nTIPO: Tesouro Direto";
    }
}
