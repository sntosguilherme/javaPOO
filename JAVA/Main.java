package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarteiraInvestimento carteira = new CarteiraInvestimento();

        Acao ativo1 = new Acao("petrobras", 15000);
        Acao ativo2 = new Acao("weg", 12500);
        TesouroDireto ativo3 = new TesouroDireto("titulo publico 1", 5000);
        CDB ativo4 = new CDB("certificado de deposito bancario 1", 7500);
        CDB ativo5 = new CDB("certificado de deposito bancario 2", 2500);


        carteira.adicionarAtivo(ativo1);
        carteira.adicionarAtivo(ativo2);
        carteira.adicionarAtivo(ativo3);
        carteira.adicionarAtivo(ativo4);
        carteira.adicionarAtivo(ativo5);
        System.out.println("");

        carteira.printarCarteira();

        System.out.println("Rendimento após 12 meses: "+carteira.calcularValorTotal(12));
        System.out.println("");

        carteira.resgatar("microsoft", 12500, 12);
        carteira.resgatar("weg", 12500, 4);
        carteira.resgatar("titulo publico 1", 5000, 3);
        carteira.resgatar("certificado de deposito bancario 1", 3751, 5);

        Acao ativo6 = new Acao("microsoft", 12500);
        carteira.adicionarAtivo(ativo6);
        System.out.println("");

        carteira.printarCarteira();
    }
}