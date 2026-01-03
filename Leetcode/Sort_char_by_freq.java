//sort charecter by decreasing order of frequency

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Sort_char_by_freq {
    public static void main(String[] args){
        System.out.println(fun("tree"));
        System.out.println(fun("cccaaa"));
        System.out.println(fun("Aabb"));
    }

    static String fun(String s){
        HashMap<Character, Integer> map = new HashMap<>();

        //step1 count frequency
        for(Char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) +1);
        }

        //step 2 put map entries into list
        List<Character> list =new ArrayList<>(map.keySet());

        //sort characters by freq;
         Collections.sort(list, (a, b) -> map.get(b) - map.get(a));

         //step 4 build result string 
         StringBuilder sb= new StringBuilder();
         for(Char c: list){
            int freq  = map.get(c);
            for(int i=0;i<freq ;i++){
                sb.append(c);
            }
         }

         return sb.toString();
    }
}
