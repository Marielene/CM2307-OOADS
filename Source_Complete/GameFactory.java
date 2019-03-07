import java.io.*;
import java.util.*;

public class GameFactory{
  public Game PickGame(String ans) /*throws Exception*/ {
    // Ask whether to play a card game or a die game
    if (ans.equals("c")) {
      return new CardGame();
    }

    else if (ans.equals("d")) {
      return new DieGame();
    }

    else {
      return null;
    }
  }
}