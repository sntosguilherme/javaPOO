/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado1;

/**
 *
 * @author Gui
 */
public class ControleProduto {
    Produto[] produtos = new Produto[10];
    private int totalProdutos = 0;
    public void cadastrarProduto(String nome, int preco, int quantidade){
        if (totalProdutos < 10){
           produtos[totalProdutos] = new Produto(nome, preco, quantidade);
           totalProdutos++;
        }
        else{
           System.out.println(nome +" nao pode ser adicionado. limite de produtos atingido");
        }
    }
    public boolean efetuaVenda(String nome, int quantidade){
       for(Produto p : produtos){
           if(p.getNome().equals(nome) && quantidade <= p.getQuantidade()){
               p.setQuantidade(p.getQuantidade()-quantidade);
               return true;
               
           }
       }
       return false;
    }
    public void listarProdutos(){
        System.out.println("PRODUTOS DO SUPERMERCADO: ");
        for(Produto p : produtos){
            if(p != null){
                p.exibirProduto();
            }
        }
    }
}