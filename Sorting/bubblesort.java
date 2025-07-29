import java.util.Scanner;
public class bubblesort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter no of elements of array");
        int n=scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements of array");

        for(int i=0;i<n;i++){
             arr[i]=scanner.nextInt();
        }
        bubble(arr,n);
        System.out.println("sorted array is");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
    static void bubble(int[] arr,int n){
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
