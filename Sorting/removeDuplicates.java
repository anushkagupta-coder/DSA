

public class removeDuplicates {
    public static void main(String[] args) {
        int n=7;
        int[] arr={2,5,2,6,6,6,4};
        removeduplicate(arr,7);
    }
    static int removeduplicate(int[] arr,int n){
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        return i+1;
    }
}
