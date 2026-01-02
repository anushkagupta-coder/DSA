public class Sudoku_solver {
    public static void main(String[] args) {
        solve(board);
    }

    static boolean solve(char[][] board){
        for(int row=0; row<9 ;row++){
            for(int col =0 ; col< 9;col++){
                if(board[row][col] == '.'){

                    for(char num='1';num<='9';num++){
                        if(isValid(board,row,col,num)){
                            //choose 
                            board[row][col]=num;
                            //recurse 
                            if(solve(board)){
                                return true;
                            }
                            //backtrack
                            board[row][col]='.';
                        }
                    }

                    return false;
                }
            }
        }
        return true;
    }

    static void isValid(char[][] board , int row , int col , char num){
        //no same number in row
        for(int j=0; j< 9 ; j++){
            if(board[row][j]==num){
                return false;
            }
        }

        //no same num in col
        for(int i=0; i< 9 ; i++){
            if board[i][col]==num;{
                return false;
            }
        }
        //no same num in 3*3 grid
        int boxRowStart = (row / 3) * 3;
        int boxColStart = (col / 3) * 3;

        for (int i = boxRowStart; i < boxRowStart + 3; i++) {
            for (int j = boxColStart; j < boxColStart + 3; j++) {
                if (board[i][j] == num)
                    return false;
            }
        }
        return true;
    } 
}
