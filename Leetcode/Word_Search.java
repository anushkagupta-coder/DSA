public class Word_Search {
    public static void main(String[] args) {
         char[][] board = {
            {'A','B','C','E'},
            {'S','F','C','S'},
            {'A','D','E','E'}
        };

        String word = "ABCCED";
        System.out.println(exist(board, word));
    }
        static boolean exist(char[][] board, String word){
        int rows = board.length ;
        int col= board[0].length;

        for(int i =0; i<rows ;i++){
            for(int j =0; j< col;j++){
                if(dfs(board ,word ,i,j,0)){
                    return true;
                }
            }
        }
    }
    }

    static boolean dfs (char[][] board , String word , int row , int col , int index){
       //base condition
        if(index == word.length()){
            return true;
        }

        //boundary + mismatch check
        if(row <0  || col<0 || row> =board.length || col> =board[0].length || board[row][col] != word.charAt(index)){
            return false;
        }

        //marked visited 
        char temp = board[row][col];
        board[row][col] = '#';

        boolean found = 
                        dfs(board, word, row+1, col, index+1)||
                        dfs(board, word, row-1, col, index+1)||
                        dfs(board, word, row, col+1, index+1) ||
                        dfs(board, word, row, col-1, index+1) ;
        
                        board[row][col] =temp;
                        return found;
    }
}
