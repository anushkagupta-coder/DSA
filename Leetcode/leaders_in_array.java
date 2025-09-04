//everthing to the right side of the number must br smaller and that number is callled as leader;
public class leaders_in_array {
    public static void main(String[] args) {
        int[] arr={16,17,4,3,5,2};
        System.out.println("(the leaders of array are)");
        leaders(arr);
    }
    static void leaders(int[] arr){
        int n=arr.length;
        int maxfromright=arr[n-1];
        System.out.println(maxfromright+" ");

        for(int i=n-2;i>=0;i--) {
            if(arr[i]>=maxfromright){
                maxfromright=arr[i];
                System.out.println(maxfromright+" ");
            }
        }
    }
}
