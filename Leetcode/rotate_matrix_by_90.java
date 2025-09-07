//
public class rotate_matrix_by_90 {
    public static void main(String[] args) {
        
    }
    static void rotate(int[][] matrix){
        int n=matrix.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-2;i++){
                matrix[i][j]=matrix[j][i];
            }
        }

        //
    }
}
