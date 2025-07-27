import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
        
        Scanner scanner = new scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        
        selection(int arr[],n);
    }
    static void selection(){
        
    }
}
