//Here i am writting lal the java collection and learning them 
//List , map hashmap , set 

//List - Ordered collection, allows duplicates Dynamic size (unlike arrays)

/*import java.util.ArrayList;

public class Java_collection {
    public static void main(String[] args) {
    // to initialize list 
    ArrayList<String> fruits = new ArrayList<>();    
    
    fruits.add("Apple");
    fruits.add("Mango");
    fruits.add("MEEE");

    System.out.println(fruits.get(2));

    fruits.remove("Mango");

    for(String f : fruits){
        System.out.println(f);
    }
    System.out.println("total frfuits:" + fruits.size());
    }
    

}*/

//------------------------------------------------------------//
//Set Hashset - Unordered collection, no duplicates 
//Useful when you want unique elements only

/*import java.util.HashSet;

public class Java_collection{
    public static void main(String[] args) {
        HashSet<String> fruits = new HashSet<>();
         fruits.add("apple");
         fruits.add("mango");

         for(String f: fruits){
            System.out.println(f);
         }
         System.out.println(fruits.size());

    }
}*/

//-------------------------------------------------------------//
//map hashmap

import java.util.HashMap;

public class Java_collection{
    public static void main(String[] args) {
        HashMap<String , Integer> marks = new HashMap<>();

        marks.put("Math", 100);
        marks.put("spos", 90);

        System.out.println("maths marks "+marks.get("Math"));

        //loop through 
        for(String subject : marks.keySet()){
            System.out.println(subject + "->" + marks.get(subject));
        }
    }
}

