import java.util.ArrayList;
import java.util.List;
//printing the matrix in spital amnner
public class spiral_matrix {
    public static void main (String[] args){
         int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        List<Integer> spiral = fun(matrix);
        System.out.println(spiral); // Output: [1,2,3,6,9,8,7,4,5]
    }
    static List<Integer> fun(int[][] matrix){

        List<Integer> result = new ArrayList<>();
        
        if (matrix == null || matrix.length == 0) {
            return result;  // empty matrix
        }

        
        int top=0;
        int bottom = matrix.length-1;
        int left=0;
        int right= matrix[0].length-1;
            while (top <= bottom && left <= right) {
            // 1️⃣ Traverse top row → left to right
            for (int j = left; j <= right; j++) {
                result.add(matrix[top][j]);
            }
            top++; // shrink top boundary down

            // 2️⃣ Traverse right column → top to bottom
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
            }
            right--; // shrink right boundary left

            // 3️⃣ Traverse bottom row → right to left (if still exists)
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    result.add(matrix[bottom][j]);
                }
                bottom--; // shrink bottom boundary up
            }

            // 4️⃣ Traverse left column → bottom to top (if still exists)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(matrix[i][left]);
                }
                left++; // shrink left boundary right
            }
        }

        return result;
        
        }
        }
    
