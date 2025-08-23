/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package supermercado1;
import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        
        ControleProduto controle = new ControleProduto();
        Scanner read = new Scanner(System.in);
      
        while(true){
            int escolha = menu(read);
            if (escolha == 4) break;
            operacao(escolha, read, controle);
        }
        
    }
    public static int menu(Scanner read){
        int escolha = 0;
               
           System.out.println("Bem vindo, Escolha entre as opcoes:");
           System.out.println("(1) para adicionar um produto");
           System.out.println("(2) para ver o estoque");
           System.out.println("(3) para realizar uma venda");
           System.out.println("(4) para SAIR");
           escolha = read.nextInt();
           read.nextLine();
           
            return escolha;
    }
    public static void operacao(int escolha, Scanner read, ControleProduto controle){
        switch(escolha){
            case 1:
                System.out.print("Digite o nome do produto: ");
                String nome = read.nextLine();
                System.out.print("Digite a quantidade de produtos no estoque: ");
                int quantidade = read.nextInt();
                System.out.print("Digite o preco do produto: ");
                int preco = read.nextInt();
                System.out.println("");
                
                controle.cadastrarProduto(nome, preco, quantidade);
                break;
            case 2:
                controle.listarProdutos();
                break;
            case 3:
                System.out.print("Digite o nome do produto: ");
                nome = read.nextLine();
                System.out.print("Digite a quantidade de produtos que deseja vender: ");
                quantidade = read.nextInt();
                controle.efetuaVenda(nome, quantidade);
                System.out.print("");
                break;
                
        }
    }
}
