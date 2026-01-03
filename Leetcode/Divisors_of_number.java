import java.util.*;  // For Scanner and TreeSet

public class Divisors_of_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User se number input lo
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // TreeSet use kar rahe hain taaki divisors automatically sorted ho jaaye
        Set<Integer> divisors = new TreeSet<>();

        // Loop from 1 to sqrt(n)
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisors.add(i);       // i is a divisor
                divisors.add(n / i);   // n/i is also a divisor
            }
        }

        // Print all divisors
        System.out.println("Divisors of " + n + " are: " + divisors);

        sc.close();
    }
}


