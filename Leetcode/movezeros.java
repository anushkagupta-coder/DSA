//this program is used to move zeroes
public class movezeros {
    public static void main(String[] args) {
        int[] arr={2,3,0,6,8,0,0,1};
        int n=arr.length;
        movezeros(arr, n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
    static void movezeros(int[] arr,int n){
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
            j=i;
            break;
            }
        }
        if (j==-1){
            System.out.println(arr[j]);
        }
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            
            j++;
        }
    }
    }
}
