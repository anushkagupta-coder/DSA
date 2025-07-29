import java.util.Scanner;

public class secondlargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

        }
        secondlargest(arr,n);
    }
    static void secondlargest(int[] arr,int n){
        int secondlargest=-1;
        int largest=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                secondlargest=largest;
                largest=arr[i];
            }
            else if(arr[i]<largest &&arr[i]>secondlargest){
                secondlargest=arr[i];
            }
        }
        System.out.println(secondlargest+"is sceond largest number");
    }
}
