//Foster Stulen
//CSE 271 Java


public class Deck extends Card
{
  private int currentCout;
  private int size;
  
  
  
  public Deck()
  {
    size=52;
    currentCout=0;
    Card[] cards= Card[size];
  }
}