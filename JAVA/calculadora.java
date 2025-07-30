import java.util.Scanner;
public class calculadora {
    
    static int contador = 0;
    static String[] historico = new String[5];
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        double operacao;
        String resultado = "0";
        
        while (true)
        {
            int op = menu(read);
            if (op == 5) {
                for (String str : historico) {
                        System.out.println(str);
                }
                continue;
            }
            if (op == 6) break;
            
                System.out.println("digite o valor dos numeros que deseja operar");
            System.out.print("valor do primeiro: ");
            double a = read.nextDouble();
            read.nextLine();
            System.out.print("valor do segundo: ");
            double b = read.nextDouble();
            read.nextLine();


            switch (op) {
                case 1: 
                    operacao = a+b;
                    resultado = a + " + " + b + " = " + operacao;
                    break;
                case 2: 
                    operacao = a-b;
                    resultado = a + " - " + b + " = " + operacao;
                    break;
                case 3: 
                    operacao = a*b;
                    resultado = a + " * " + b + " = " + operacao;
                    break;
                case 4: 
                    operacao = a/b;
                    resultado = a + " / " + b + " = " + operacao;
                    break;
                default:
                    break;
            }

            System.out.println(resultado);
            historico(resultado);
            
    }
    read.close();        
    }
    public static int menu(Scanner read){
        System.out.println("Digite: \n1. Para soma\n2. Para subtracao\n3. Para multiplicacao \n4. Para divisao\n5. Para ver o historico\n6. para sair");
        int op = read.nextInt();
        return op;
    }
    
    public static void historico(String resultado){
        
        if (contador < 5){
            historico[contador] = resultado;
            contador++;
        }
        else if(contador == 5){ 
            historico[0] = resultado; 
            contador = 1;
        }
        else{ 
            contador++;
        }
    }

}
