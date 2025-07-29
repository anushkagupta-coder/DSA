public class checksorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int n=arr.length;
        checksorted(arr,n);
        System.out.println("checked");
    }
    static boolean checksorted(int[] arr,int n)
    {
        for(int i=1;i<n;i++) {
            if(arr[i]>=arr[i-1]){

            }
            else{
                return false;
            }
    }
    return true;
}
    
}
