//this code is to find out the min capacity a ship can take in given nno of days 

/*A conveyor belt has packages that must be shipped from one port to another within days days.

The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.

Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.*/

public class min_ship_capacity {
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int days=5;
        System.out.println("the min capacity ship can load is ");
        int answer=min_capacity(weights, days);
        System.out.println(answer);



    }

    static int possible(int[] weights,int cap){
        int days=1;
        int load=0;
        int n=weights.length;

        for(int i=0;i<n;i++){
            if(load +weights[i]>cap){
                days+=1;
                load=weights[i];
            }

            else{
                load+=weights[i];
            }
        }

        return days;
    }


    static int min_capacity(int [] weights, int days){
        int low =Integer.MIN_VALUE;
        int high=0;
        for (int i = 0; i < weights.length; i++) {
            high += weights[i];
            low = Math.max(low, weights[i]);
        }
        
        while(low<= high){
            int mid=(low + +high)/2;

            int possibledays = possible(weights ,mid);
            if (possibledays<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        
        
        }
        return low;
    }
}
