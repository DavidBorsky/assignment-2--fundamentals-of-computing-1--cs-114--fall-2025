
import java.util.Scanner;

public class OneHundredBottlesOfBeer {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter number of verses to print (1-100): ");
    if (!scanner.hasNextInt()) {
      System.out.println("Invalid input: please enter an integer.");
      scanner.close();
      return;
    }

    int verses = scanner.nextInt();
    scanner.close();

    if (verses < 1 || verses > 100) {
      System.out.println("Invalid number of verses: must be between 1 and 100.");
      return;
    }

    for (int i = 0; i < verses; i++) {
      int current = 100 - i;
      int next = current - 1;

      String curLabel = (current == 1) ? "1 bottle" : current + " bottles";
      String nextLabel = (next == 1) ? "1 bottle" : next + " bottles";

      System.out.println(curLabel + " of beer on the wall");
      System.out.println(curLabel + " of beer");
      System.out.println("If one of those bottles should happen to fall");
      System.out.println(nextLabel + " of beer on the wall");

      if (i < verses - 1) System.out.println();
    }
  }
}
