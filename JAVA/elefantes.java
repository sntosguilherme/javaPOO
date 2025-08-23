import java.util.Scanner;

public class elefantes {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = read.nextInt();
        contaElefantes(n);
        read.close();
    }
    public static void contaElefantes(int n){
        int contador = n;
        for (int i = 0; i < n-1; i++) {
            for(int j = 0; j < contador; j++){
                System.out.print("elefantes ");    
            }
            System.out.print("incomodam\n");
            contador--;
        }

        System.out.println("elefante icomoda.");
        
    } 
}
