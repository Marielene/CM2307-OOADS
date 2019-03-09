import java.io.*;
import java.util.*;

public class PlayTest{
	  // The BufferedReader used throughout
  public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
  //Main function where the magic happens
  public static void main(String[] args) throws Exception {
    //Declaring factory, so we can create games.
    GameFactory fact=new GameFactory();
    //Kept previous mold for prompt
    System.out.print("Card (c) or Die (d) game? ");
    String ans=br.readLine();
    //Create game with the use of factory
    Game CurrentGame=fact.PickGame(ans);
    //Check if game exists, if not, terminate program.
    if(CurrentGame!=null)
      CurrentGame.playGame();
    else
      System.out.println("Invalid input.");
    }
}