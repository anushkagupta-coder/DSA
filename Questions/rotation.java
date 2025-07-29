//THIS PROGRAM IS TO ROTATE THE ARRAY LEFT
public class rotation {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        rotaionByLeft(arr,5);
    }
    static void rotaionByLeft(int[] arr,int n){
        temp=arr[0];
        for(int i=0;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
    }

}
