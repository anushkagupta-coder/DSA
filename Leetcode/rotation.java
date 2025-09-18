//THIS PROGRAM IS TO ROTATE THE ARRAY LEFT BY ONE
public class rotation {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        rotaionByLeft(arr,n);
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    static void rotaionByLeft(int[] arr,int n){
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }

}

//if aksed to rotate by k
//the optimal solution is to reverse 3 times first 0 to k and then k+1 to end andthen reverse the whole string;
