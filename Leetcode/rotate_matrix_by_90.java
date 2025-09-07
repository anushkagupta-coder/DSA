//this program is ti rotate the matrix by 90 degree;
public class rotate_matrix_by_90 {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int[][] rotated = rotate(matrix);

        for(int i=0;i<rotated.length;i++){
            for(int j=0;j<rotated[i].length;j++){
                System.out.print(rotated[i][j] + " ");
            }
        }
        
    }
    static int[][] rotate(int[][] matrix){
        int n=matrix.length;
        //transpose
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //reverse
        for(int i=0;i<n;i++){
            for(int j=0;j<n/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][n-1-j];
                matrix[i][n-1-j]=temp;
            }
        } return matrix;
    }
}
