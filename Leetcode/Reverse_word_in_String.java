public class Reverse_word_in_String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to reverse");
        String s = scanner.nextLine();
        System.out.println("reversed string is " + fun(s));
    }

    static String fun(String s){
        String words=s.trim.split("\\s+");

        StringBuilder result = new StringBuilder();

        for(int i=words.length-1 ; i>=0 ; i--){
            result.append(words[i]);
            if(i!+0){
                result.append(" ");
            }
        }
        return resu;t.toString();
    }
}
