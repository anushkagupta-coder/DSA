//finding square root of a number using binary search
import java.util.Scanner;

public class Square_Root {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(system.in);
        System.out.println("Enter the Number");
        int n = scanner.nextInt();
        int ans=func(n);
        System.out.println("Square root of the number" + n+ "is" +ans);
    }
    static void func(int arr[] ,int n){
        int low=1;
        int high=n;
        while(low < high){
            int mid=(low+high)/2 ;
            int val=mid*mid;

            if(val<=n){
                low=mid+1;

            }
            else{
                high=mid-1;
            }
        }
        return high ;

    }
}
