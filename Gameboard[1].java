public class Gameboard{
  private String[][] board;
  // some are always null
  // w - white
  // wk - white king
  // b - black
  // bk - black king
  Gameboard(){
    board = new String[8][8]; 
  }  
  public void setBoard(){
    //First row of black pieces
    board[0][0]= "_";
    board[0][1]= "b";
    board[0][2]= "_";
    board[0][3]= "b";
    board[0][4]= "_";
    board[0][5]= "b";
    board[0][6]= "_";
    board[0][7]= "b";

    // Second row of black pieces
    board[1][0]= "b";
    board[1][1]= "_";
    board[1][2]= "b";
    board[1][3]= "_";
    board[1][4]= "b";
    board[1][5]= "_";
    board[1][6]= "b";
    board[1][7]= "b";
    //Third row of black pieces  
    board[2][0]= "_";
    board[2][1]= "b";
    board[2][2]= "_";
    board[2][3]= "b";
    board[2][4]= "_";
    board[2][5]= "b";
    board[2][6]= "_";
    board[2][7]= "b";

    //Middle 2 rows
    board[3][0]= "_";
    board[3][1]= "_";
    board[3][2]= "_";
    board[3][3]= "_";
    board[3][4]= "_";
    board[3][5]= "_";
    board[3][6]= "_";
    board[3][7]= "_";
    board[4][0]= "_";
    
    
    //-----------------------
    //the part below is to add a test black checker in from of white to see if it finds the move.
    // original board value:
    // board[4][1]= "_";

    // new, temporary board value:
    board[4][1] = "b";

    // REVERT WHEN DONE TESTING
    //-------------------------
    
    board[4][2]= "_";
    board[4][3]= "_";
    board[4][4]= "_";
    board[4][5]= "_";
    board[4][6]= "_";
    board[4][7]= "_";
    
    //First row of white pieces
    board[5][0]= "w";
    board[5][1]= "_";
    board[5][2]= "w";
    board[5][3]= "_";
    board[5][4]= "w";
    board[5][5]= "_";
    board[5][6]= "w";
    board[5][7]= "_";
    // Second row of white pieces
    board[6][0]= "_";
    board[6][1]= "w";
    board[6][2]= "_";
    board[6][3]= "w";
    board[6][4]= "_";
    board[6][5]= "w";
    board[6][6]= "_";
    board[6][7]= "w";
    //Third row of white pieces
    board[7][0]= "w";
    board[7][1]= "_";
    board[7][2]= "w";
    board[7][3]= "_";
    board[7][4]= "w";
    board[7][5]= "_";
    board[7][6]= "w";
    board[7][7]= "_";
  }
  
  public String[][] getBoard(){
    return board;
  }
  
  public String getVal(int i, int j){
    return board[i][j];
  }
  
  public void setVal(int x, int y, String piece){
    board[x][y] = piece;
  }
  
  public String toString(){
   for (String [] rows : board){
     for(String val : rows){
       System.out.print(val + " ");
     }
     System.out.println();
   }
    return "";
  }
}
/*
Create 2d array board
Setting starting positions
*/
