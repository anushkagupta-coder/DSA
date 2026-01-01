//Input: candidates = [2,3,6,7], target = 7
//Output: [[2,2,3],[7]]
//

import java.util.ArrayList;
import java.util.List;

public class Combination_sum {
    public static void main(String[] args) {
        int[] candidates = {2,3,5,7};
        int target=7;
        List<List<Integer>> result= new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        System.out.println(result);
    }

    static void backtrack(int[] candidates, int target, int index,List<Integer> current, List<List<Integer>> result){
        //BASE CASE
         if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if (target < 0) return;

        for(int i=index ; i < candidates.length;i++){
            current.add(candidates[i]);
            backtrack(candidates, target-candidates[i], i, current, result);
            current.remove(current.size()-1);
        }
    }
}

