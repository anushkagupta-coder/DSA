import java.util.Scanner;
public class selectionsort {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        selection( arr,n);
        System.out.println("sorted array is:");
        for(int k=0;k<n;k++){
            System.out.println(arr[k]);
        }
    
    
}
    static void selection(int[] arr,int n){
        for(int i=0;i<n-2;i++){
            int mini=i;
            for(int j=i;j<n-1;j++){
                if(arr[j]<arr[i]){
                    mini=j;
                }
            }
            int temp=arr[mini];
            arr[mini]=arr[i];
            arr[i]=temp;
        }
    }
}

