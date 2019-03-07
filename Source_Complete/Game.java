import java.io.*;
import java.util.*;

public  interface Game {
  // The BufferedReader used throughout
  public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

  // The random number generator used throughout
  public static RandomInterface r=new LinearCongruentialGenerator();
  
  public void playGame() throws Exception;
  public void initialiseGame() throws Exception;
  public void mainGame() throws Exception;
  public void declareGameWinner() throws Exception;

}

