import java.util.Scanner;

public class NQueen {
    static boolean solveNQueen(int[][] board,int start,int end){
        if(start==end){
            return true;
        }
        for(int i=0;i<end;i++){
            if(isSafe(board,i,start)){
                board[i][start]=1;
                if(solveNQueen(board,start+1,end)){
                    return true;
                }
                board[i][start]=0;
            }
        }
        return false;
    }
    static boolean isSafe(int[][] board,int i,int start){
        for(int j=0;j<start;j++){
            if(board[i][j]==1){
                return false;
            }
        }
        for(int j=start-1,k=i-1;j>=0 && k>=0;j--,k--){
            if(board[k][j]==1){
                return false;
            }
        }
        for(int j=start-1,k=i+1;j>=0 && k<board.length;j--,k++){
            if(board[k][j]==1){
                return false;
            }
        }
        return true;
    }
    static void printBoard(int[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of queens: ");
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        if (solveNQueen(board, 0, n)) {
            printBoard(board);
        } else {
            System.out.println("Solution does not exist");
        }
        }
    }

