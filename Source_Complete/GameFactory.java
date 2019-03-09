import java.io.*;
import java.util.*;
//Factory creates a game depending on the input given in PlayTest's main function
public class GameFactory{
  public Game PickGame(String ans) /*throws Exception*/ {
    // Ask whether to play a card game or a die game
    if (ans.equals("c")) {
      return new CardGame();
    }

    else if (ans.equals("d")) {
      return new DieGame();
    }
    //Return null if input doesn't match existing games, can be extended for new games as well.
    else {
      return null;
    }
  }
}