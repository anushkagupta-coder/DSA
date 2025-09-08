public class pascal_tree {
    public static void main(String[] args) {
        
    }
    static void pascal(){
        if(numrows==0) return new ArrayList<>();
        if(numrows==1){
            List<List<Integer>>result=new ArrayList<>();
            result.add(Array.asList(1));
            return result;
        }
        List<List<Integer>>prevrows = generate(numrows-1);
        List<Integer>newrow = new ArrayList<>();

        for (int i=0;i<numrows;i++){
            newrow.add(1);
        }
        for(int i=1;i<numrows-1;i++){
            newrow.set(i,prevrows.get(numrows-2).get(i-1)+prevrows.get(numsrows-2).get(i));
        }
        prevrows.add(newrow);
        return prevrows;
    }
}
