import java.util.*; // Needed for Arrays and List classes

public class Merge_overlapping {
    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {1, 3}, {5, 6}, {4, 7}}; 
        int n = arr.length;

        int[][] merged = merge(arr, n); // Call the merge function

        
        for (int[] interval : merged) {
            System.out.println(Arrays.toString(interval));
        }
    }

    static int[][] merge(int[][] arr, int n) {
        // ✅ Sort intervals by start time
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> merged = new ArrayList<>();
        int[] prev = arr[0]; // first interval

        // Loop through the rest
        for (int i = 1; i < n; i++) {
            if (arr[i][0] <= prev[1]) {
                // Overlap → merge them
                prev[1] = Math.max(prev[1], arr[i][1]);
            } else {
                // No overlap → add the previous interval
                merged.add(prev);
                prev = arr[i];
            }
        }

        // Add last interval
        merged.add(prev);

        // Convert list to array
        return merged.toArray(new int[merged.size()][]);
    }
}
