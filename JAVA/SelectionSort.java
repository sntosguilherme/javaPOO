import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = -1;

        while(n < 0 || n > 50){
            System.out.print("Digite o numero de elementos da array: ");
            n = read.nextInt();
        }

        int[] arr = new int[n];
        preencherArray(arr);
        printarArray(arr);

        selectionSort(arr);
        printarArray(arr);
        read.close();
    } 

    public static void preencherArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 50);
        }
    }
    public static void printarArray(int[] arr) {
    System.out.print("[");
    for (int j = 0; j < arr.length; j++) {
        if (j == arr.length - 1) {
            System.out.print(arr[j]);
        } else {
            System.out.print(arr[j] + ", ");
        }
    }
    System.out.print("]");
    System.out.println();
    }
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}