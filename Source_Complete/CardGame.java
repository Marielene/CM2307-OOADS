import java.io.*;
import java.util.*;

public class CardGame implements Game{
	  // Variable(s) used in the card game methods
  public static ArrayList<String> cardList;
  public static HashSet<String> cardsChosen=new HashSet<String>();

  public void playGame() throws Exception {
      // Play card game:
      System.out.println("You've chosen the card game.");
      // Initialise the game
      initialiseGame();
      System.out.println("Your cards have been shuffled, we're ready to begin. In order to acieve a victory,");
      System.out.println("you must draw an ace, regardless of colour, you get three shots at this, good luck.");
      // Play the main game phase
      mainGame();

      // Now see if (s)he has won!
      declareGameWinner();
      System.out.println("Thanks for playing!");
  }

  public void initialiseGame() throws Exception {
      // The initialisation phase:

      // Create a list of cards ... and shuffle them
      String cards[]={"AHrts", "2Hrts", "3Hrts", "4Hrts", "5Hrts", "6Hrts",
                      "7Hrts", "8Hrts", "9Hrts", "10Hrts", "JHrts",
                      "QHrts", "KHrts",
                      "ADmnds", "2Dmnds", "3Dmnds", "4Dmnds", "5Dmnds",
                      "6Dmnds", "7Dmnds", "8Dmnds", "9Dmnds", "10Dmnds",
                      "JDmnds", "QDmnds", "KDmnds",
                      "ASpds", "2Spds", "3Spds", "4Spds", "5Spds", "6Spds",
                      "7Spds", "8Spds", "9Spds", "10Spds", "JSpds",
                      "QSpds", "KSpds",
                      "AClbs", "2Clbs", "3Clbs", "4Clbs", "5Clbs", "6Clbs",
                      "7Clbs", "8Clbs", "9Clbs", "10Clbs", "JClbs",
                      "QClbs", "KClbs"};
      cardList=new ArrayList<String> (Arrays.asList(cards));
      // Taking advantage of "generics" to tell the compiler all the elements will be Strings

      // Shuffle them
      for (int i=0; i<100; i++) {
        // choose two random cards at random and swap them, 100 times
        int firstIndex=((int) (r.next() * 52));
        int secondIndex=((int) (r.next() * 52));
        String temp=(String) cardList.get(firstIndex);
        cardList.set(firstIndex, cardList.get(secondIndex));
        cardList.set(secondIndex, temp); 
      }

      // Print out the result
      //System.out.println(cardList);
  }

  public void mainGame() throws Exception {
      // The main game:

      // Let user select two cards from the pack
      for (int i=0; i<3; i++) {
        System.out.println("Hit <RETURN> to draw a card");
        br.readLine();

        int cardChoice=(int) (r.next() * cardList.size());
        System.out.println("You drew " + cardList.get(cardChoice));
        cardsChosen.add(cardList.remove(cardChoice));
      }

      // Display the cards chosen and remaining cards
      System.out.println("Cards drawn: " + cardsChosen);
      System.out.println("Remaining cards: " + cardList.size());

  }

  public void declareGameWinner() throws Exception {
      // Declare the winner:

      // User wins if one of them is an Ace 
      System.out.println("Cards drawn: " + cardsChosen);
      if (cardsChosen.contains("AHrts") || cardsChosen.contains("ADmnds") ||
          cardsChosen.contains("ASpds") || cardsChosen.contains("AClbs")) {
        System.out.println("You won!");
      }
      else System.out.println("You lost!");
  }



}