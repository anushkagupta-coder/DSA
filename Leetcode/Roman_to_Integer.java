//conavert roman numbers into integers 
//we will use map because that will be easy and efficient 
//time complexity will be O(n)
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner; 
public class Roman_to_Integer {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the roman number");
        String s=scanner.nextLine();
        System.out.println("Integer value =" + fun(s));
    }

    static String fun(String s){
        Map<Character , Integer> map = new HashMap<>;
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result=0;
        for(int i=0; i<s.length() ; i++){
            int current= map.get(s.charAt(i));
            //next character check (subtraction case)
            if (i + 1 < s.length() && current < map.get(s.charAt(i + 1))) {
                result -= current;
            } else {
                result += current;
            }
        }
        return result ; 

    }
    
}
