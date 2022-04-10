/*
Player class (two instances, black and white)
If any player has 0 checkers, the other player wins
Black goes first
Get list of possible moves (call move class)
Decide on move, execute and change the board
2nd player does same
Loop
*/
public class Player{

  Move mover = new Move();
  
  private int pieces;
  private int pNum;
  private String name;
  private String pColor;

  public Player(){
    pieces = 8;
    pNum = 1;
    pColor = "w";
  }
  
  public Player(int pN, String n){ // constructor start
    pieces = 8;
    pNum = pN;
    if (pNum == 1)
      pColor = "Black";
    else
      pColor = "Red";
    name = n;
  } // default constructor end
  
}