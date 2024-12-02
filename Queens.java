public class Queens{
    public static void main(String[] args) 
    {
        char[][] board = new char[8][8];
        initializeBoard(board); //- set to all hyphens (-)
        placeQueens(board);
        outputBoard(board);
    }
    public static void initializeBoard(char[][] board)
    {
	for(int r =0; r < board.length; r++)
	{
//		columns[r]=0;
		for(int c =0; c < board[0].length; c++)
		{
			board[r][c]='-';
		}
	}
    }
    public static boolean isSolution(char[][]board){
        int queenRow = 1;
        int queenCol= 1;
        while (queenRow < 7 && queenCol<7){
            queenRow++;
            queenCol++;
            if(board[queenRow][queenCol]=='Q')return false;
        }
        return false;
    }
    public static void placeQueens(char[][] board)
    {
       
        boolean[] colsPicked = new boolean[8];
        while (!isSoluton(board)) {
            initializeBoard(board);
        for(int r = 0; r<8;r++){
         int ranCol = (int)(Math.random()*8);

        while (colsPicked[ranCol]==true){
            ranCol = (int)(Math.random()*8);
        }

        board[r][ranCol]='Q';
        }
    }
    }
   

    public static void outputBoard(char[][] board)
    {
	System.out.println("  0 1 2 3 4 5 6 7");
	for(int r = 0; r <board.length; r++)
	{
		System.out.print(r + " ");
		for(int c =0; c<board[0].length; c++)
		{
			System.out.print(board[r][c] + " ");
		}
		System.out.println();
	}
    }
}