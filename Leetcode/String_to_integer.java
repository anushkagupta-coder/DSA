public class String_to_integer {
    public static void main(String[] args) {
        
    }

    static void fun(String s){
        int sign=1;
        long num=0;
        while(int i=0;i<n && ss.charAt(i)==''){
            i++;
        }

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') {
                sign = -1;
            }
            i++;
        }

        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            if (num * sign >= Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            if (num * sign <= Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            i++;

    }
    return (int)(num * sign);
}
}