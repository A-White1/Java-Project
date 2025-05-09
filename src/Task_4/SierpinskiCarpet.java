package Task_4;

public class SierpinskiCarpet {

    //Stores 2D array and Dimension Size

    public static void main(String[] args) {
        int x = 9;
        char[][] Sierpinski = new char[x][x];
        boardTable(Sierpinski, x);
        printTable(Sierpinski, x);
    }

    //Initializes the board

    public static void boardTable(char[][] board, int j){
        for (int i = 0; i < j; i++ ){
            for(int k = 0; k<j; k++){
                board[i][k] = '*';
            }
        }
    }

    //Prints the carpet

    public static void printTable(char[][] board, int j){
        for (int i = 0; i < j; i++ ){
            for(int k = 0; k<j; k++){
                System.out.print(board[i][k] + " ");
            }
            System.out.println();
        }
    }

    //Incomplete

}

