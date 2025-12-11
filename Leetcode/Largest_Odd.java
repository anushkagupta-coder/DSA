public class Largest_Odd {
    public static void main(String[] args) {
        String str = 1234589;
        System.out.println("the larget odd number is");
        System.out.println(str);
    }

    static int fun(String str){
        //left to right
        int n=str.length();
        for(int i=n-1; i>=0;i--){
            int digit=str.charAt(i) - '0'; 

            if(digit%2==0){
                return str.substring(0,i+1);
            }
        }
        return "";
    }
}