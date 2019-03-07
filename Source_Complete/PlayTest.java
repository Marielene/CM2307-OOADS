import java.io.*;
import java.util.*;

public class PlayTest{
	  // The BufferedReader used throughout
  public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

  // The random number generator used throughout
  //public static RandomInterface r=new LinearCongruentialGenerator();
  
  public static void main(String[] args) throws Exception {
    GameFactory fact=new GameFactory();
    System.out.print("Card (c) or Die (d) game? ");
    String ans=br.readLine();
    Game CurrentGame=fact.PickGame(ans);
    if(CurrentGame!=null)
      CurrentGame.playGame();
    else
      System.out.println("Invalid input.");
    }
}