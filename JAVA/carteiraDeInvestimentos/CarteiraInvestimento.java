package org.example;

public class CarteiraInvestimento {
    AtivoFinanceiro[] ativos = new AtivoFinanceiro[5];

    public void adicionarAtivo(AtivoFinanceiro ativo) {
        boolean criado = false;

        for (int i = 0; i < ativos.length; i++) {
            if (ativos[i] == null) {
                ativos[i] = ativo;
                criado = true;
                System.out.println("Ativo '" + ativo.getNome() + "' adicionado com sucesso. Posição na carteira: " + (i+1));
                break;
            }
        }

        if (!criado) {
            System.out.println("Impossível adicionar ativo.");
        }
    }

    public double calcularValorTotal(int meses) {
        double total = 0;

        for (int i = 0; i < ativos.length; i++) {
            if(ativos[i] != null) {
                total += ativos[i].calcularRetorno(meses);
            }
        }

        return total;
    }

    public void resgatar(String nomeAtivo, double valor, int meses) {
        boolean encontrado = false;
        boolean resgatavel = false;
        AtivoFinanceiro ativo;

        for (int i = 0; i < ativos.length; i++) {
            if (ativos[i] != null && nomeAtivo.equals(ativos[i].getNome())) {
                encontrado = true;
                ativo = ativos[i];
                resgatavel = ativo.podeResgatar(valor, meses);

                if (resgatavel) {
                    if (ativo.getNome() != null) {
                        System.out.println("Ativo resgatado com sucesso e removido da carteira.");
                        ativos[i] = null;
                    }
                }
                else{
                    if( ativo instanceof Acao){
                        System.out.println("Nao foi possivel resgatar o ativo. Motivo: Tempo de investimento insuficiente.");
                    }
                    else if( ativo instanceof CDB){
                        System.out.println("Nao foi possivel resgatar o ativo. Motivo: valor invalido.");
                    }
                }
            }
        }

        if (!encontrado) {
            System.out.println("Nao foi possivel resgatar o ativo. Motivo: ativo nao encontrado.");
        }
    }
    public void printarCarteira(){
        System.out.println("ATIVOS PRESENTES NA CARTEIRA: ");
        for(AtivoFinanceiro ativo : ativos) {
            if(ativo != null) {
                System.out.println("NOME DO ATIVO:" + ativo.getNome());
                System.out.println("VALOR INVESTIDO:" + ativo.getValorInvestido()+"\n");
            }
        }
    }
}
