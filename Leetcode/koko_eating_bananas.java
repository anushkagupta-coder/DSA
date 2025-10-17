//Koko loves to eat bananas. There are n piles of bananas, the ith pile has piles[i] bananas. The guards have gone and will come back in h hours.

/*Koko can decide her bananas-per-hour eating speed of k. Each hour, she chooses some pile of bananas and eats k bananas from that pile. If the pile has less than k bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return the minimum integer k such that she can eat all the bananas within h hours.*/

import java.util.*;
public class koko_eating_bananas{
    public static void main(String[] args) {
        int[] piles={3,6,7,11};
        int h=8;

        System.out.println(eatingSpeed(piles, h));

    }
    
    static int totalHours (int[] piles , int speed){
        int totalH=0;
        for(int bananas:piles ){
            totalH+= (int)Math.ceil((double)bananas/speed);

        }
        return totalH;
    }

    static int eatingSpeed(int[] piles , int h){
        int maxPile=Arrays.stream(piles).max().getAsInt();
        
        int low=1,high=maxPile;
        int ans=maxPile;
        
        while(low<=high){
            int mid=(low+high)/2;
            int totalH =totalHours(piles,mid);

            if(totalH<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
}

