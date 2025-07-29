
import java.util.Scanner;
public class largest {
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter no of elements");
        int n=scanner.nextInt();

        int[] arr=new int[n];

        System.out.print("enter elements of array");
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        largestelement(arr,n);
        
    }
    static void largestelement(int[] arr,int n){
        int largest=arr[0];
        
        for(int i=0;i<n;i++){
            if (arr[i]>largest){
                largest=arr[i];
            }
            
        }
        System.out.println(largest+"is the largest element");
    }
}
