public class Jump_Game_greedy {
    public static void main(String[] args) {
        int[] nums={1,3,4,1,0,4,2};
        System.out.println("answer");
        System.out.println(canJump(nums));
        System.out.println("if its true how many jumps will it require ");
        System.out.println(Countofjumps(nums));
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

    //Now to find ki pata hai can reach end 
    //find kitne jumps will be required

    static int Countofjumps(int[] nums){
        int currentend=0;
        int maxreach=0;
        int jumps = 0;

        for(int i=0; i< nums.length-1 ;i++){
             farthest = Math.max(farthest, i + nums[i]);

             if(i==currentend){
                jumps++;
                currentend=farthest;

             }
        }
        return jumps;
    }
}
