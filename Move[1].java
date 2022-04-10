 import java.util.ArrayList;

public class Move {
  int colorDirection = 1;
  boolean inBounds;
  ArrayList<String> moves = new ArrayList();
  String tempMove;
  int tempRow;
  int tempColumn;

  public ArrayList<String> GenerateMove(Gameboard board, String playerTurn) {
    // either w for white or b for black
    // this code can be run for both white or black. The piece just below determens
    // what color this is checking for
    if (playerTurn.equals("w")) {
      colorDirection = -1;
    }
    for (int row = 0; row < 8; row++) {
      for (int column = 0; column < 8; column++) {
        //System.out.println("Row" + row + "Column" + column);
        if (board.getVal(row, column).substring(0, 1).contains(playerTurn)) { // if the piece is your team
          //System.out.println("Found piece");
          tempRow = row + colorDirection;
          tempColumn = column + colorDirection;
          inBounds = (tempRow >= 0 && tempRow < 8 && tempColumn > 0 && tempColumn <= 8);
          if (inBounds){
            if (board.getVal((row + colorDirection), (column + colorDirection)).equals("_")) {

              //tempMove.add(String.valueOf(row) + String.valueOf(column)); 
              
              tempMove = (String.valueOf(row) + String.valueOf(column) + String.valueOf(row + colorDirection) + String.valueOf(column + colorDirection));
              // add starting location to tempMove
              moves.add(tempMove);
              System.out.println(moves);
              tempMove = "";
              // trying to add to the first row of
              // add to list of possible moves
            }
          }
          tempRow = row + colorDirection;
          tempColumn = column - colorDirection;
          inBounds = (tempRow >= 0 && tempRow < 8 && tempColumn > 0 && tempColumn < 8);
          if (inBounds){
            System.out.println((row + colorDirection) + " " + (column - colorDirection));
            if (board.getVal((row + colorDirection), (column - colorDirection)).equals("_")) {

              tempMove = (String.valueOf(row) + String.valueOf(column) + String.valueOf(row + colorDirection) + String.valueOf(column - colorDirection));
              moves.add(tempMove);

              System.out.println(moves);
              tempMove = "";
              // trying to add to the first row of
              // add to list of possible moves
            }
          }
          if (board.getVal(row, column).contains("k")) { // If the square is a king
          tempRow = row + colorDirection;
          tempColumn = column - colorDirection;
          inBounds = (tempRow >= 0 && tempRow < 8 && tempColumn > 0 && tempColumn <= 8);
          if (inBounds){
            if (board.getVal((row - colorDirection), (column + colorDirection)).equals("_")) {
              tempMove = (String.valueOf(row) + String.valueOf(column) + String.valueOf(row - colorDirection) + String.valueOf(column + colorDirection));
              moves.add(tempMove);
              
              System.out.println(moves);
              tempMove = "";
              
              // trying to add to the first row of
              // add to list of possible moves
              }
            }
          
          tempRow = row - colorDirection;
          tempColumn = column - colorDirection;
          inBounds = (tempRow >= 0 && tempRow < 8 && tempColumn > 0 && tempColumn <= 8);
          if (inBounds){
            if (board.getVal((row - colorDirection), (column - colorDirection)).equals("_")) {
              // add ending locaiton to tempMove
              tempMove = (String.valueOf(row) + String.valueOf(column) + String.valueOf(row - colorDirection) + String.valueOf(column - colorDirection));
              moves.add(tempMove);
              
              System.out.println(moves);
              tempMove = "";
              // trying to add to the first row of
              // add to list of possible moves
            }
          }
        }
      }
    }
  }
  return moves;
}    
  
  public ArrayList<String> GenerateJump(Gameboard board, String playerTurn){
    // either w for white or b for black
    if (playerTurn.equals("w")){
      colorDirection = -1;
    }
    for (int row = 0; row < 8; row++) {
      for (int column = 0; column < 8; column++) {
        if(board.getVal(row, column).substring(0, 1).contains(playerTurn)){ // if the piece is your team
          tempRow = row + 2* colorDirection;
          tempColumn = column + 2* colorDirection;
          inBounds = (tempRow >= 0 && tempRow < 8 && tempColumn > 0 && tempColumn <= 8);
          if(inBounds){
                System.out.println("row: " + row + "column: " + column);
                System.out.println("tempRow: " + tempRow + "tempColumn: " + tempColumn);
            if(!board.getVal((row+colorDirection), (column+colorDirection)).contains(playerTurn) && !board.getVal((row+colorDirection), (column+colorDirection)).contains("_") && board.getVal((row + 2* colorDirection), (column + 2* colorDirection)).equals("_")){ // if the adjacent space is the opposite team and the space after that space is empty
              System.out.println("Move is legal");

                // add to list of possible moves
              tempMove = (String.valueOf(row) + String.valueOf(column) + String.valueOf(tempRow) + String.valueOf(tempColumn)); // add starting location to tempMove
              System.out.println("Added " + tempMove);
              // add ending locaiton to tempMove

              moves.add(tempMove);
              System.out.println(moves);
              tempMove = "";
              System.out.println("row: " + row + "column: " + column);
              System.out.println("tempRow: " + tempRow + "tempColumn: " + tempColumn);
              System.out.println("P0");
              }
            System.out.println("P1");
            }
          System.out.println("P2");
          System.out.println("row: " + row + "column: " + column);
                System.out.println("tempRow: " + tempRow + "tempColumn: " + tempColumn);
          System.out.println("Got to second part of generateJump");
          
          tempRow = row + 2* colorDirection;
          tempColumn = column - 2* colorDirection;
          System.out.println("row: " + row + "column: " + column);
          System.out.println("tempRow: " + tempRow + "tempColumn: " + tempColumn);
          System.out.println("Abou tto do iNBounds");
          inBounds = (tempRow >= 0 && tempRow < 8 && tempColumn >= 0 && tempColumn < 8);
          System.out.println("row: " + row + "column: " + column);
                System.out.println("tempRow: " + tempRow + "tempColumn: " + tempColumn);
          System.out.println("inBounds? " + inBounds);
          if(inBounds){
            System.out.println("Move is legal [second part]");
            System.out.println("row: " + row + "column: " + column);
                System.out.println("tempRow: " + tempRow + "tempColumn: " + tempColumn);
              if(board.getVal(row, column).substring(0, 1).contains(playerTurn)){ // if the piece is your team
                System.out.println("row: " + row + "  column: " + column);
                System.out.println("tempRow: " + tempRow + " tempColumn: " + tempColumn);
                System.out.println(row + " " + column + " " + tempRow + " " + tempColumn);
                if(!board.getVal((row+colorDirection), (column-colorDirection)).contains(playerTurn) && !board.getVal((row+colorDirection), (column-colorDirection)).equals("_") && board.getVal((row + 2* colorDirection), (column - 2* colorDirection)).equals("_")){ // if the adjacent space is the opposite team and the space after that space is empty
                  System.out.println("Got through.");
                    // add to list of possible moves
                  tempMove = (String.valueOf(row) + String.valueOf(column) + String.valueOf(tempRow) + String.valueOf(tempColumn)); // add starting location to tempMove
                  // add ending locaiton to tempMove


                  moves.add(tempMove);
                  System.out.println(moves);
                  tempMove = "";
                  }
                }
              }
              if (board.getVal(row, column).contains("k")) { // If the square is a king
                tempRow = row - 2* colorDirection;
                tempColumn = column + 2* colorDirection;
                inBounds = (tempRow >= 0 && tempRow < 8 && tempColumn > 0 && tempColumn <= 8);
                if(inBounds){
                  if(board.getVal(row, column).substring(0, 1).contains(playerTurn)){ // if the piece is your team
                    if(!board.getVal((row+colorDirection), (column+colorDirection)).contains(playerTurn) && !board.getVal((row+colorDirection), (column+colorDirection)).contains("_") && board.getVal((tempRow), (tempColumn)).equals("_")){ // if the adjacent space is the opposite team and the space after that space is empty
                        // add to list of possible moves
                      tempMove = (String.valueOf(row) + String.valueOf(column) + String.valueOf(tempRow) + String.valueOf(tempColumn)); // add starting location to tempMove
                      // add ending locaiton to tempMove
                      
                      moves.add(tempMove);
                      System.out.println(moves);
                      tempMove = "";
                    }
                  }
                }
                tempRow = row - 2* colorDirection;
                tempColumn = column - 2* colorDirection;
                inBounds = (tempRow >= 0 && tempRow < 8 && tempColumn > 0 && tempColumn <= 8);
                if(inBounds){
                  if(board.getVal(row, column).substring(0, 1).contains(playerTurn)){ // if the piece is your team
                    if(!board.getVal((row+colorDirection), (column+colorDirection)).contains(playerTurn) && !board.getVal((row+colorDirection), (column+colorDirection)).contains("_") && board.getVal((row - 2* colorDirection), (column - 2* colorDirection)).equals("_")){ // if the adjacent space is the opposite team and the space after that space is empty
                        // add to list of possible moves
                      tempMove = (String.valueOf(row) + String.valueOf(column) + String.valueOf(tempRow) + String.valueOf(tempColumn)); // add starting location to tempMove
                      // add ending locaiton to tempMove

                      moves.add(tempMove);
                      System.out.println(moves);
                      tempMove = "";
                    }
                  }
                }
              }
            }
      }
    }
    System.out.println("returned moves above ......");
    return moves;
  }
  public void IntoKing(Gameboard board){
     for (int row = 0; row < 8; row++) {
      for (int column = 0; column < 8; column++) {
        if (row == 0){
          if (board.getVal(row,column).equals("w"))
            board.setVal(row,column,"kw");// Making king
        } 
        else if (row == 7){
          if (board.getVal(row,column).equals("b"))
            board.setVal(row,column,"kb"); // making king
        }
      }
    }
  }
  public boolean checkJumpList(ArrayList<ArrayList<String>> JumpList, String startJump, String endJump){// 
    System.out.print(JumpList.get(1).get(0));
    if(JumpList.size()>0){
      for (int i = 0; i < JumpList.size(); i++)
      {
        for (int j = 0; j < JumpList.get(i).size(); j++)
        { 
          System.out.println("9090");
          System.out.println(JumpList.get(i).get(j));
          System.out.println("opopopoo");

            if (JumpList.get(i).get(j).equals(startJump) && JumpList.get(i).get(j+1).equals(endJump)){
            return true;//Update Gameboard
          }
        } 
      }
    }
    return false;
  }
public boolean checkMove(ArrayList<String> MoveList, String startmove, String endmove){
    if(MoveList.size()>0){
      for (int i = 0; i < MoveList.size(); i++){
        if(MoveList.get(i).substring(0,2).equals(startmove)){
          if(MoveList.get(i).substring(2).equals(endmove)){
            return true;
          }
        }   
      }
    }
    return false;
 }
  public void ExecuteMove(String[][] board, String start, String end, String color ){
    String starty = start.substring(0,1);
    String startx = start.substring(1);
    String endy = end.substring(0,1);
    String endx = end.substring(1);
    

    //Trying to update jumped piece with blank
    board[Integer.parseInt(starty)][Integer.parseInt(startx)] = "_";
    board[Integer.parseInt(endy)][Integer.parseInt((endx))] = color;
    System.out.println(endx);
    System.out.println(startx);
   if((Integer.parseInt(starty) + 1) < 8 && (Integer.parseInt(startx) - 1) >-1 && Integer.parseInt(endx)>Integer.parseInt(startx)){
   board[Integer.parseInt(starty)-1][Integer.parseInt(startx) + 1] = "_";
   }
    
    System.out.println(Integer.parseInt(starty)-1);
    System.out.println(Integer.parseInt(startx) + 1);
    }
}


/*
  public void dubJump(String cord){  METHOD CAN BE RUN MULTIPLE TIMES UNTIL THERE IS NO MORE DOUBLE JUMPS
    String row = cord.substring(0,3);
    String col = cord.substring(3);

    int rw = Integer.parseInt(row);
    int cl = Integer.parseInt(col);
    

    String c = board[row][col];

    if (c.equals("w")){
      if (board[rw+1][cl+1].equals("b") && board[rw+2][cl+2].equals(" ")){
          //it does something, remove jumped piece
      }
      else if (board[rw+1][cl-1].equals("b") && board[rw+2][cl-2].equals(" ")){
        //it does something else        // remove jumped piece
      }
    
    }

    else if (c.equals("b")){
      if (board[rw+1][cl+1].equals("w") && board[rw+2][cl+2].equals(" ")){
        //it makes it jump // remove jumped piece
      }
      else if (board[rw+1][cl-1].equals("w") && board[rw+2][cl-2].equals(" ")){
        //it does something else        remove jumped piece
      }
    }


    else if (c.equals("kw")){

      if (board[rw+1][cl+1].equals("b") && board[rw+2][cl+2].equals(" ")){
          //it does something    remove jumped piece
      }
      else if (board[rw+1][cl-1].equals("b") && board[rw+2][cl-2].equals(" ")){
        //it does something else       remove jumped piece 
      }
      else if (board[rw-1][cl-1].equals("b") && board[rw-2][cl-2].equals(" ")){
          //it makes it jump      remove jumped piece
      }
      else if (board[rw+1][cl-1].equals("b") && board[rw+2][cl-2].equals(" ")){
          //it makes the jump   remove jumped piece
      }

    }

    else if (c.equals("kb")){

      if (board[rw+1][cl+1].equals("w") && board[rw+2][cl+2].equals(" ")){
        //it makes it jump      remove jumped piece
      }
      else if (board[rw+1][cl-1].equals("w") && board[rw+2][cl-2].equals(" ")){
        //it does something else       remove jumped piece 
      }
      else if (board[rw-1][cl-1].equals("b") && board[rw-2][cl-2].equals(" ")){
        //it does something else       remove jumped piece 
      }
      else if (board[rw+1][cl-1].equals("b") && board[rw+2][cl-2].equals(" ")){
          //it makes the jump    remove jumped piece
    }


    else{
        System.out.println("There is no double jumps to be made")

    }
*/





/*
 * Move Class
 * GenerateMove
 * Generate possibilities
 * Look at each square
 * If correct checker is there, identify what type (king, normal), and look
 * diagonally to see if there is an open space
 * If there is an opening, it is identified as a move
 * If there is a checker in an adjacent space, but there is space beyond that
 * piece, that is identified as a jump
 * Go back through the list, and there were any jumps, delete all of the simple
 * moves //because the player is not forced to jump, and cannot make other moves
 * If no valid moves, tell them to pick another checker
 * Checks to see if there are checkers to jump, if there is space, if there are
 * forced jumps
 * Return valid moves
 * ExecuteMove // this deals with one move. If double, triple jumps, we will
 * call this
 * Check if last row, if yes then turn into king
 * multiple times
 * Refresh
 * Remove piece from starting place
 * If applicable, remove jumped piece
 * Subtract from total number of checkers
 * 
 */