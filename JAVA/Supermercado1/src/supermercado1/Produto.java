/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermercado1;
/**
 *
 * @author Gui
 */
public class Produto {
    private String nome;
    private int quantidade;
    private int preco;
    
    public Produto(String nome, int quantidade, int preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public String getNome(){
        return this.nome;
    }
    public int getQuantidade(){
        return this.quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public void adicionarEstoque(int qtd){
        this.quantidade += qtd; 
    }
    public void reduzirEstoque(int qtd){
        this.quantidade -= qtd;
    }
    public void exibirProduto(){
        System.out.println("Nome do produto: " + this.nome);
        System.out.println("preco: " + this.preco);
        System.out.println("estoque: " + this.quantidade); 
    }
}
