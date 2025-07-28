import java.util.Scanner;

public class mat{
    public static void main(String[] args){
        int tamanho = 0;
        Scanner read = new Scanner(System.in);
        while (true) {
            if(tamanho >= 2 && tamanho <= 5) break;
            System.out.print("digite o tamanho da matriz de 2 a 5: ");
            tamanho = read.nextInt();
        }
        read.close();

        int[][] matriz = new int[tamanho][tamanho];
        
        preencherMatriz(matriz);
        printarMatriz(matriz);
        
        System.out.println("Produto da diagonal principal = "+diagPrincipal(matriz));
        System.out.println("Produto da diagonal secundaria = "+diagSecund(matriz));

        switch (tamanho){
            case 2:
                System.out.println("determinante: "+determinante2x2(matriz));
                break;
            case 3:
                System.out.println("determinante: "+determinante3x3(matriz));
                break;
            case 4:
                System.out.println("determinante: "+determinante4x4(matriz));
                break;
            case 5:
                System.out.println("determinante: "+determinante5x5(matriz));
                break;
        }
    }
    
    public static void preencherMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz.length; j++){
                matriz[i][j] = (int)(Math.random()*19-9);
            }
        }
    }
    public static void printarMatriz(int matriz[][]){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%3d", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static int diagPrincipal(int[][] matriz){
        int soma = 1;
        for (int i = 0; i < matriz.length; i++) {
            soma *= matriz[i][i];
        }
        return soma;
    }
    public static int diagSecund(int[][] matriz){
        int soma = 1;
        int k = matriz.length -1;
        for (int i = 0; i < matriz.length; i++) {
            soma *= matriz[k][i];
            k -= 1;
        }
        return soma;
    }
    public static int determinante2x2(int[][] matriz){
        return diagPrincipal(matriz) - diagSecund(matriz);
    }
    public static int determinante3x3(int[][] m){
        return (m[2][0]*m[0][1]*m[1][2])+(m[0][0]*m[1][1]*m[2][2])+(m[1][0]*m[2][1]*m[0][2])
        -((m[2][2]*m[0][1]*m[1][0])+(m[0][2]*m[1][1]*m[2][0])+(m[1][2]*m[2][1]*m[0][0]));
    }
    public static int determinante4x4(int[][] m){
        int determinante = 0;
        int linha1[] = new int[4];
        int cofatores[] = new int[4];
        
        for (int k = 0; k < cofatores.length; k++) {
            
//linha1[] recebe os elementos da primeira linha 
            linha1[k] = m[0][k]; 

//array cofatores[] recebe os cofatores
            int[][] aux = new int[3][3];
            int contador = 0;
            
// criador de matriz auxiliar
            for (int i = 1; i < m.length; i++) {
                for (int j = 0; j < m.length; j++) {

                    if(j != k){
                        aux[i-1][contador] = m[i][j];
                        contador++; 
                    }
                }
                contador = 0; 
            }
          
            cofatores[k] = ((int)Math.pow(-1, 1+(k+1)) * determinante3x3(aux));

        }

// laplace
        for (int i = 0; i < cofatores.length; i++) {
            determinante += cofatores[i] * linha1[i];
        }

        return determinante;
    }

    public static int determinante5x5(int[][] m){
        int determinante = 0;
        int linha1[] = new int[5];
        int cofatores[] = new int[5];
        
        for (int k = 0; k < cofatores.length; k++) {
            
//linha1[] recebe os elementos da primeira linha 
            linha1[k] = m[0][k]; 

//array cofatores[] recebe os cofatores
            int[][] aux = new int[4][4];
            int contador = 0;
            
// criador de matriz auxiliar
            for (int i = 1; i < m.length; i++) {
                for (int j = 0; j < m.length; j++) {

                    if(j != k){
                        aux[i-1][contador] = m[i][j];
                        contador++; 
                    }
                }
                contador = 0; 
            }
          
            cofatores[k] = ((int)Math.pow(-1, 1+(k+1)) * determinante4x4(aux));
        }
// laplace
        for (int i = 0; i < cofatores.length; i++) {
            determinante += cofatores[i] * linha1[i];
        }

        return determinante;
    }
}
