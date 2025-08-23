import java.util.Scanner;

public class mensagens {
    static int contador = 0;
    public static void main(String[] args) {
        String[] historico = new String[5];
        Scanner read = new Scanner(System.in);
        String msg = "";
        while(true){
            System.out.println("Digite uma mensagem (ou 'sair' para encerrar): ");
            msg = read.nextLine();
            if (msg.toLowerCase().equals("sair")){break;}
            fifo(msg, historico);
        }
        read.close();
    }

    public static void fifo(String msg, String[] arr) {
        arr[contador % arr.length] = msg; 
        contador++;

        System.out.println("Histórico:");
        for (String string : arr) {
            if (string != null) {
                System.out.println("Mensagem: " + string);
            }
        }
    }
}
