import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    Gameboard mainGame = new Gameboard();
    Move Player1 = new Move();
    mainGame.setBoard();
    mainGame.toString();
    ArrayList<String> Jumps = Player1.GenerateJump(mainGame, "w");
    ArrayList<String> Moves = Player1.GenerateMove(mainGame, "w");
    System.out.println("Enter starting pos");
    String start = kb.nextLine();
    System.out.println("Enter ending pos");
    String end = kb.nextLine();
    if(Player1.checkMove(Moves, start, end)){
      Player1.ExecuteMove(mainGame.getBoard(), start, end, "w");
    }
    else{
      System.out.println("Not Valid Move");
    }
    mainGame.toString();
   

  }
}
/*
*/