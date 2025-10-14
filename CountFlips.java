public class CountFlips {
  public static void main(String[] args) {
    Coin coin = new Coin();
    int heads = 0;
    int tails = 0;

    for (int i = 0; i < 100; i++) {
      coin.flip();                 // produce a new random face
      if (coin.isHeads()) {
        heads++;
      } else {
        tails++;
      }
    }

    System.out.println("Heads: " + heads);
    System.out.println("Tails: " + tails);
  }
}
