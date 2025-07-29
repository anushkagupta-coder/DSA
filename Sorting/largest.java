
import java.util.Scanner;
public class largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter no of elements");
        int n=scanner.nextInt();

        int[] arr=new int[n];

        System.out.println("enter elements of array");
        for(int i=0;i<n;i++){
            arr=scanner.nextInt();
        }
        largest(arr);
        
    }
    static void largest(int[] arr){
        largest=arr[0];
        for(int i=0;i<n;i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
            System.out.println(largest+"is the largest element");
        
        }
    }
}
