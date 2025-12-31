//this code is to find the kth missing number from set of natural numbers 
//imp formalus are the key u have to keep them in mind no matter how 


import java.util.Scanner;
public class Kth_missing_num {
    public static void main(String[] args){
        Scanner scanner=new  Scanner(System.in);
       
          System.out.println("enter size of the array");
        int n= scanner.nextInt();
        int[] arr= new int[n];
       System.out.println("enter the array");
        
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println("which kth missing number u have to find");
        int k=scanner.nextInt();

        System.out.println("the kth missing number is"+fun(arr,k));
    }

    static int fun(int[] arr,int k){
        int n=arr.length;
        for(int i=0 ; i<n ;i++){
            int missingcount=arr[i]-(i+1);
            if (missingcount>=k){
                return k+i;
            }
        }
        return k+n;
    }
    
}
