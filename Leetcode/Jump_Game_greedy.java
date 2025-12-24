public class Jump_Game_greedy {
    public static void main(String[] args) {
        int[] nums={1,3,4,1,0,4,2};
        System.out.println("answer");
        System.out.println(canJump(nums));
    }

    static boolean canJump(int[] nums){
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i > maxReach) {
                return false;
            }

            maxReach = Math.max(maxReach, i + nums[i]);
        }

        return true;
    }
}
