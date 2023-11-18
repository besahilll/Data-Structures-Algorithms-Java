//Place N queens on n*n chessboard such that no 2 queens can attack each other

class N_queens{
    public static void N_queens(char board[][], int row){
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                N_queens(board,row+1);
                board[row][j]='X';
            }
        }
        //base condition
        if(row==board.length){
            printBoard(board);
            count++;
            return;
        }
    }

    public static boolean isSafe(char board[][],int row,int col){
        //vertical up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }

        //diagonal left up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }

        //diagonal right up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }

    public static void printBoard(char board[][]){ 
        System.out.println("----------------CHESS BOARD------------------------");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count=0;

    public static void main(String args[]){
        int n=4;
        char[][] board = new char[n][n];
        //initialize
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = 'X';
            }
        }
        N_queens(board,0);
        System.out.println("Total no. of ways to solve n queens:" + count);
    }
}
