/*
Computer class
  Call FindMove method in Move class to generate moves
  Choose random move from possible legal moves
*/
public class Computer{

  Move mover = new Move();
  
  private int pieces;
  private int pNum;
  private String name;
  private String pColor;

  public Computer(){
    pieces = 8;
    pNum = 1;
    pColor = "b";
  }
  /*
  public void Computer(int pN, String n){ // constructor start
    pieces = 8;
    pNum = pN;
    if (pNum == 1)
      pColor = "Black";
    else
      pColor = "Red";
    name = n;
  } // default constructor end
*/

  int lenghtOfOptions; // = something.lenght - 1;
  //int randomNum = 0 + (int)(Math.random() *   lenghtOfOptions);

  
  
}