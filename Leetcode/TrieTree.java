class TrieNode{
    TrieNode[] children;
    boolean isEndOfWord;

    TrieNode(){
        children = new TrieNode[26];
        isEndOfWord=false;
    }
}

class Trie{
    TrieNode root;

    Trie(){
        root = new TrieNode();
    }
}

public class TrieTree {
    public static void main(String[] args) {
        Trie trie = new Trie();

        Trie.insert("apple");

        System.out.println(Trie.search("apple"));
        System.out.println(Trie.search("app"));
        System.out.println(Trie.startwith("app"));

        Trie.insert("app");
        System.out.println(trie.search("app"));
    }

    static void insert(String word){
        TrieNode curr=root;
        for(char ch:word.toCharArray()){
            int index = ch-'a';

            if(curr.children[index] == null){
                curr.children[index] =new TrieNode();
            }

            curr=curr.children[index];

        }
        curr.isEndOfWord = true;
    }


    static boolean search(String word){
        TrieNode curr = root;

        for(char ch: word.toCharArray()){
            int index = ch-'a';

            if(curr.children[index] == null){
                return false;
            }

            curr=curr.children[index];
        }

        return curr.isEndOfWord;
    }

    static boolean startwith(String prefix){
        TrieNode curr=root;
        for(char ch: prefix.toCharArray()){
            int index=ch-'a';

            if(curr.children[index] == null){
                return false;
            }

            curr = curr.children[index];
        }

        return true;
    }
}

