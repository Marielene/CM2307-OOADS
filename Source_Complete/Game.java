import java.io.*;
import java.util.*;
//This interface will be used as the skeleton for the games.
public  interface Game {
  // The BufferedReader used throughout
  public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

  // The random number generator used throughout
  public static RandomInterface r=new LinearCongruentialGenerator();
  //Outline the base functions used in the games
  public void playGame() throws Exception;
  public void initialiseGame() throws Exception;
  public void mainGame() throws Exception;
  public void declareGameWinner() throws Exception;

}

