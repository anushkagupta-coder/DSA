public class Greedy_lemonade {
    public static void main(String[] args) {
        int[] bills = {5,5,10,15};
        System.out.println(lemonadeChange(bills));

    }
    
    static boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;

        for (int bill : bills) {

            if (bill == 5) {
                five++;   // no change needed
            }

            else if (bill == 10) {
                if (five > 0) {
                    five--;
                    ten++;
                } else {
                    return false;
                }
            }

            else if (bill == 20) {
                // best case: give 10 + 5
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                }
                // else give 5 + 5 + 5
                else if (five >= 3) {
                    five -= 3;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}
