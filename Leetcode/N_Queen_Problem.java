//finally today i am solving n queen problem bro
//more than happy

//okieee now i willf irst write what i learned okie
//sabse pehele to board banana hoga 
/*char[][] board = new char[n][n];
queen(0,board , result, n)

recursive fun-{
    base condition = (row==n)
    if(row==n){
    result.add(construct board)
    return }
    }

    col dekhenge
    /           /choose
                board[row][col]='Q';
                //recurse 
                solve(row+1, board,result,n);
                //unchoose
                board[roe][col]='.';

    safety conditions look safety ke liye upper col
     same column me queen nhi honi chiye niche dekhne ki jaroorat nhi
      cause niche ke rown are empty abhi 

      so hum dekehenge
      same col =
      for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;


      left upper diagonal  
      i=row-1,j=col-1 
      phir traverse kro 
      while (i >= 0 && j >= 0) {
            if (board[i][j] == 'Q')
                return false;
            i--; j--;
        }


      right upper diagonal
      i = row - 1; 
        j = col + 1;

        construct ka fun 

*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class N_Queen_Problem {
    public static void main(String[] args) {
        int n= 4;
        List<List<String>> result= new ArrayList<>();;
        char[][] board = new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(board[i],'.');
        }
        queen(0,board,result,n);    
         System.out.println(result);
    }

    static void queen(int row, char[][] board, List<List<String>> result, int n){
        //base condition
        if(row==n){
            result.add(construct(board));
            return;
        }

        for(int col=0; col< n;col++){
            if(isSafe(board,row,col,n)){
                //choose
                board[row][col]='Q';
                //recurse 
                queen(row+1, board,result,n);
                //unchoose
                board[row][col]='.';
            }
        }
    }
static boolean isSafe(char[][] board, int row, int col, int n){
        //safety check
        //same col
        for(int i=0 ; i<row ;i++){
            if(board[i][col] =='Q');
            return false;
        }

        //upper diagonal left
        int i=row-1;
        int j=col-1;
        while(i >= 0 && j >= 0){
            if(board[i][j]=='Q')
            return false;
            i--;
            j--;

        }

        //upper right diagonal
        int i=row-1;
        int j=col+1;
        while(i>=0 && j< n){
            if(board[i][j] =='Q')
                return false;
            i--;
            j++;    
            
        }
    }
    
        static List<String> construct(char[][] board) {
        List<String> temp = new ArrayList<>();
        for (char[] row : board) {
            temp.add(new String(row));
        }
        return temp;
    }
}

