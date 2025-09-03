package org.example;

public abstract class AtivoFinanceiro {
    protected String nome;
    protected double valorInvestido;

    public AtivoFinanceiro() {
        this.nome = "null";
        this.valorInvestido = 0;
    }

    public AtivoFinanceiro(String nome, double valorInvestido) {
        this.nome = nome;
        this.valorInvestido = valorInvestido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    protected abstract double calcularRetorno(int meses);

    protected abstract boolean podeResgatar(double valor, int meses);

}